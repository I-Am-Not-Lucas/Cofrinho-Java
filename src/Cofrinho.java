import java.util.ArrayList;

public class Cofrinho {

	private ArrayList <Moeda> listaMoedas;
	
	public Cofrinho() {
		
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public void adicionar(Moeda moedaNova) {
		this.listaMoedas.add(moedaNova);
		System.out.println("Moeda adicionada");
		
	}
	
	public void remover(Moeda moeda) {
		System.out.println();
		
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
	
}
