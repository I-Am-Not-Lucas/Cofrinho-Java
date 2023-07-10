
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

}