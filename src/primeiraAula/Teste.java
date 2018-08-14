package primeiraAula;
import java.util.Scanner; //A Classe Scanner é o comando usado para entrada de dados (como teclado)
import java.util.Calendar; //A Classe Calendar inclui os termos de tempo como dias,meses,anos,etc.

public class Teste {
	
	public static void main (String args[]) {
		
		//Criando variaveis em Java:
		//int num=2, num2=5;
		int idade;
		int ano_atual;
		int ano_nascimento;
		Scanner ler = new Scanner(System.in);

		
		
		//Comandos básicos de entrada e saida de dados:
		
		System.out.println("Digite sua idade: "); 
        idade = ler.nextInt(); //variavel que vai guardar a idade
        
        //Criando um objeto do tipo Calendar para guardar o ano
        Calendar calendario = Calendar.getInstance();
        ano_atual=calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        
        System.out.printf("Você nasceu no ano de " + ano_nascimento + "\n"); // \n serve para criar outra linha.
        
        //Poderia ser feito assim
        //System.out.printf("Você nasceu no ano de " + (calendario.get(Calendar.YEAR) - ler.nextInt()) + "\n");
        //mas, é sempre bom deixar o código organizado e de fácil entendimento para futuras modificações
		
        
        //Contas básicas e comando para exibir
		/*System.out.println(num + num2);	
		System.out.println(num - num2);	
		System.out.println(num / num2);	
		System.out.println(num * num2);
		
		System.out.println("Texto");*/
	}

}
