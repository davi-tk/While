package plp.enquanto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

interface Linguagem {
	Map<String, Integer> ambiente = new HashMap<>();
	Scanner scanner = new Scanner(System.in);

	interface Bool {
		boolean getValor();
	}

	interface Comando {
		void execute();
	}

	interface Expressao {
		int getValor();
	}

	/*
	  Comandos
	 */
	class Programa {
		private final List<Comando> comandos;
		public Programa(List<Comando> comandos) {
			this.comandos = comandos;
		}
		public void execute() {
			comandos.forEach(Comando::execute);
		}
	}

	class Repita implements Comando {
		private final Expressao expressao;
		private final Comando comando;

		public Repita(Expressao expressao, Comando comando) {
			this.expressao = expressao;
			this.comando = comando;
		}

		@Override
		public void execute() {
			for (int i = 0; i < expressao.getValor(); i++){
				comando.execute();
			}
		}
	}

	class Se implements Comando {
		private final List<Bool> condicoes;
		private final List<Comando> comandos;
		private final List<Comando> comandosSeNaoSe;

		public Se(List<Bool> condicoes, List<Comando> comandos) {
			this.condicoes = condicoes;
			this.comandos = comandos;
			
			if(condicoes.size() > 1) this.comandosSeNaoSe = comandos.subList(1, comandos.size() - 1);
			else this.comandosSeNaoSe = null;
		}

		@Override
		public void execute() {
			//se
			if (condicoes.get(0).getValor()){
				
				comandos.get(0).execute();
				condicoes.remove(0);
			} 

			//senao se
			else if (comandosSeNaoSe != null) {
				for (int i = 0; i < condicoes.size(); i++) { 
					if (condicoes.get(i).getValor()) comandosSeNaoSe.get(i).execute();
				}
			}

			//senao
			else comandos.get(comandos.size()-1).execute();

			
		}
	}

	class Quando implements Comando {
		private final List<Expressao> expressoes;
		private final List<Comando> comandos;

		public Quando (List<Expressao> expressoes, List<Comando> comandos){
			this.expressoes = expressoes;
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			Expressao expressaoBase = expressoes.get(0);
			expressoes.remove(0);

			for (int i = 0; i < expressoes.size(); i++){
				Expressao expressaoAtual = expressoes.get(i);
				if (expressaoBase.getValor() == expressaoAtual.getValor()){

					comandos.get(i).execute();
					return;
				}
			}

			comandos.get(comandos.size() - 1).execute();
		}

	}

	Skip skip = new Skip();
	class Skip implements Comando {
		@Override
		public void execute() {}
	}

	class Escreva implements Comando {
		private final Expressao exp;

		public Escreva(Expressao exp) {
			this.exp = exp;
		}

		@Override
		public void execute() {
			System.out.println(exp.getValor());
		}
	}

	class Enquanto implements Comando {
		private final Bool condicao;
		private final Comando comando;

		public Enquanto(Bool condicao, Comando comando) {
			this.condicao = condicao;
			this.comando = comando;
		}

		@Override
		public void execute() {
			while (condicao.getValor()) {
				comando.execute();
			}
		}
	}

	class Exiba implements Comando {
		private final String texto;

		public Exiba(String texto) {
			this.texto = texto;
		}

		@Override
		public void execute() {
			System.out.println(texto);
		}
	}

	class Bloco implements Comando {
		private final List<Comando> comandos;

		public Bloco(List<Comando> comandos) {
			this.comandos = comandos;
		}

		@Override
		public void execute() {
			comandos.forEach(Comando::execute);
		}
	}

	class Atribuicao implements Comando {
		private final List<String> ids;
		private final List<Expressao> expressoes;

		Atribuicao(List<String> ids, List<Expressao> expressoes) {
			this.ids = ids;
			this.expressoes = expressoes;
		}

		@Override
		public void execute() {
			for (int i = 0; i < ids.size(); i++) ambiente.put(ids.get(i), expressoes.get(i).getValor());
		}
	}

	class Para implements Comando {
		private final String id;
		private final Expressao expInicio;
		private final Expressao expFim;
		private final Comando comando;

		public Para (String id, Expressao expInicio, Expressao expFim, Comando comando){
			this.id = id;
			this.expInicio = expInicio;
			this.expFim = expFim;
			this.comando = comando;
		}

		@Override
		public void execute() {
			for (int i = expInicio.getValor(); i <= expFim.getValor(); i++) {
				ambiente.put(id, i);
				comando.execute();
			}
		}
	}

	/*
	   Expressoes
	 */

	abstract class OpBin<T>  {
		protected final T esq;
		protected final T dir;

		OpBin(T esq, T dir) {
			this.esq = esq;
			this.dir = dir;
		}
	}

	abstract class OpUnaria<T>  {
		protected final T operando;

		OpUnaria(T operando) {
			this.operando = operando;
		}
	}

	class Inteiro implements Expressao {
		private final int valor;

		Inteiro(int valor) {
			this.valor = valor;
		}

		@Override
		public int getValor() {
			return valor;
		}
	}

	class Id implements Expressao {
		private final String id;

		Id(String id) {
			this.id = id;
		}

		@Override
		public int getValor() {
			return ambiente.getOrDefault(id, 0);
		}
	}

	Leia leia = new Leia();
	class Leia implements Expressao {
		@Override
		public int getValor() {
			return scanner.nextInt();
		}
	}

	class ExpSoma extends OpBin<Expressao> implements Expressao {
		ExpSoma(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() + dir.getValor();
		}
	}

	class ExpSub extends OpBin<Expressao> implements Expressao {
		ExpSub(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() - dir.getValor();
		}
	}

	class ExpMult extends OpBin<Expressao> implements Expressao{
		ExpMult(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() * dir.getValor();
		}
	}

	class ExpDiv extends OpBin<Expressao> implements Expressao {
		ExpDiv(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return esq.getValor() / dir.getValor();
		}
	}

	class ExpPot extends OpBin<Expressao> implements Expressao {
		ExpPot(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public int getValor() {
			return (int) Math.pow(esq.getValor(), dir.getValor());
		}
	}

	class Booleano implements Bool {
		private final boolean valor;

		Booleano(boolean valor) {
			this.valor = valor;
		}

		@Override
		public boolean getValor() {
			return valor;
		}
	}

	class ExpIgual extends OpBin<Expressao> implements Bool {
		ExpIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() == dir.getValor();
		}
	}

	class ExpDiferente extends OpBin<Expressao> implements Bool {
		ExpDiferente(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() != dir.getValor();
		}
	}

	class ExpMenor extends OpBin<Expressao> implements Bool {
		ExpMenor(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() < dir.getValor();
		}
	}

	class ExpMaior extends OpBin<Expressao> implements Bool {
		ExpMaior(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() > dir.getValor();
		}
	}

	class ExpMenorIgual extends OpBin<Expressao> implements Bool{
		ExpMenorIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() <= dir.getValor();
		}
	}

	class ExpMaiorIgual extends OpBin<Expressao> implements Bool {
		ExpMaiorIgual(Expressao esq, Expressao dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() >= dir.getValor();
		}
	}

	class NaoLogico extends OpUnaria<Bool> implements Bool{
		NaoLogico(Bool operando) {
			super(operando);
		}

		@Override
		public boolean getValor() {
			return !operando.getValor();
		}
	}

	class ELogico extends OpBin<Bool> implements Bool{
		ELogico(Bool esq, Bool dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() && dir.getValor();
		}
	}

	class OrLogico extends OpBin<Bool> implements Bool {
		OrLogico(Bool esq , Bool dir) {
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() || dir.getValor();
		}
	}

	class XorLogico extends OpBin<Bool> implements Bool {
		XorLogico(Bool esq , Bool dir){
			super(esq, dir);
		}

		@Override
		public boolean getValor() {
			return esq.getValor() ^ dir.getValor();
		}
	}
}
