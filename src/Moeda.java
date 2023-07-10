
abstract public class Moeda {
	
	double valor; 
	
	Moeda(double valor) {
		this.valor = valor;
	}

	abstract void info();
	
	abstract double converter();
	
}
