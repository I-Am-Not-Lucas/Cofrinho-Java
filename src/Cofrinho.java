import java.util.ArrayList;

public class Cofrinho {

	private ArrayList <Moeda> listaMoedas;
	
	public Cofrinho() {
		
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moedaNova) {
		this.listaMoedas.add(moedaNova);
		System.out.println("Moeda adicionada");
		System.out.println("");
		
	}
	
	public void remover(Moeda moedaTirar) {
		
		this.listaMoedas.remove(moedaTirar);
	}
	
	public void listagemMoedas() {
		
		// Programa que retorna que esta vazio, "tratando um possivel erro"
		if(this.listaMoedas.isEmpty()) {
			System.out.println("Cofrinho esta vazio :( ");
		}
		else {
			for(Moeda moeda : this.listaMoedas) {
				moeda.info();
			}
		}
	}
	
	public double totalConvertido() {
		if(this.listaMoedas.isEmpty()) {
			return 0;
		}else {
			// acumulador que ira receber um valor adicional em cada loop
			double acumulador = 0;
			for(Moeda moeda: this.listaMoedas) {
				acumulador = acumulador + moeda.converter();
								
			}
			return acumulador;
			
			
		}
		
	}
	
}
