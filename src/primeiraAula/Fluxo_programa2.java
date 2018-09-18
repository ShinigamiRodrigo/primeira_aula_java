package primeiraAula;

public class Fluxo_programa2 {

	public static void main(String[] args) {
		int idade=61;
		if(idade <= 12) {
			System.out.println("Criança");
		}
		else if(idade <= 19) {
			System.out.println("Adolescente");
		}
		else if(idade <= 60) {
			System.out.println("Adulto");
		}
		else{
			System.out.println("Idoso");
		}
	}
}
