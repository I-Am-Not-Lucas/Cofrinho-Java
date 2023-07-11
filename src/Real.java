
public class Real extends Moeda {

	Real(double valor) {
		super(valor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		System.out.println("Real -> "+ valor);
		
	}

	@Override
	double converter() {
		// TODO Auto-generated method stub
		return valor;
	}
	
	@Override
	//sobrescrevendo a funcao que tem comparacao de memoria o que gera erro
	public boolean equals(Object var) {
		if(this.getClass() != var.getClass()) {
			return false;
		}
		
		Real instanciaDeReal = (Real) var;
		
		if(this.valor != instanciaDeReal.valor) {
			return false;
		}
		
		return true;
	}

}
