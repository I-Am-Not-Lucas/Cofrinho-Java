
public class Euro extends Moeda {

	Euro(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		System.out.println("Euro -> " + valor);
		
	}

	@Override
	double converter() {
		
		double valorReal;
		
		valorReal = this.valor * 5;
		
		return valorReal;
	}
			
	@Override
	//sobrescrevendo a funcao que tem comparacao de memoria o que gera erro
	public boolean equals(Object var) {
		if(this.getClass() != var.getClass()) {
			return false;
		}
		
		Euro instanciaDeEuro = (Euro) var;
		
		if(this.valor != instanciaDeEuro.valor) {
			return false;
		}
		
		return true;
	}



}