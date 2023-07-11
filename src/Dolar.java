
public class Dolar extends Moeda{
	
	
	Dolar(double valor){
		super(valor);
	}
	
	@Override
	void info() {
		
		System.out.println("Dolar -> " + valor);
	}
	
	@Override
	double converter() {
		
		double valorReal;
		
		valorReal = this.valor * 4;
		
		return valorReal;
				
	}
	
	@Override
	//sobrescrevendo a funcao que tem comparacao de memoria o que gera erro
	public boolean equals(Object var) {
		if(this.getClass() != var.getClass()) {
			return false;
		}
		
		Dolar instanciaDeDolar = (Dolar) var;
		
		if(this.valor != instanciaDeDolar.valor) {
			return false;
		}
		
		return true;
	}


}
