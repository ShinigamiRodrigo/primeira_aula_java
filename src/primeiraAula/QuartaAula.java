package primeiraAula;
import java.util.Scanner;

public class QuartaAula {

	public static void main(String[] args) {
		System.out.println (soma(15,20));
		System.out.println (mult(2.5,25));
		System.out.println (div(50,2));
		System.out.println (exp(2,3));

	}
	
	public static int soma(int n1,int n2) {
		int total = n1 + n2;
		return total;		
	}
	
	public static double mult(double n1, int n2) {
		double total = n1* n2;
		return total;
		
	}
	
	public static double div(int n1, int n2) {
		double total = n1 / n2;
		return total;
	}
	
	public static double exp(int n1, int n2) {
		double total = Math.pow(n1, n2);  
		return total;
	}
	
	public static int operacoes(int n1, int n2, int escolha) {
	    Scannerler = new Scanner
		System.out.println("Digite 1-Soma, 2-Subtração, 3-Divisão, 4-Multiplicação"); 
        escolha = ler.nextInt();
      
	}
	

}
