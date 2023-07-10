
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

}
