package primeiraAula;

public class Texto {

	public static void main(String[] args) {
		String str = " Isto é uma String do Java ";
		String xyz = new String ("Isto é uma String do Java");
		
		if (str.equals(xyz)) {
			System.out.println("IGUAL");
		}
		else {
			System.out.println("DIFERENTE");
		}
		//Mostra a quantidade de caracteres
		System.out.println ("Tamanho da String: " + str.length());
		
		//Pegar a parte de uma String e mostrar os caracteres de x a y
		System.out.println ("SubString: " + str.substring(0,10));
		
		//Mostra a posição do caractere solicitado
		System.out.println ("Caracter na posição 5: " + str.charAt(5));
	
		/*String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma");*/
	
	//Confere o inicio ou o final da frase
	if (str.startsWith(" Isto") || str.endsWith("Java ")) {
		System.out.println ("Começa com Isto ou termina com Java");
		System.out.println (str);
		System.out.println (str.trim());
		System.out.println (str = str.replace('a','@'));
		
		}	
	}
}
