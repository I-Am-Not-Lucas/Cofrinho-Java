
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

}
