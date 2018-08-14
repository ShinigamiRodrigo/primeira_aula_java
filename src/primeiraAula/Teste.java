package primeiraAula;
import java.util.Scanner; //A Classe Scanner � o comando usado para entrada de dados (como teclado)
import java.util.Calendar; //A Classe Calendar inclui os termos de tempo como dias,meses,anos,etc.

public class Teste {
	
	public static void main (String args[]) {
		
		//Criando variaveis em Java:
		//int num=2, num2=5;
		int idade;
		int ano_atual;
		int ano_nascimento;
		Scanner ler = new Scanner(System.in);

		
		
		//Comandos b�sicos de entrada e saida de dados:
		
		System.out.println("Digite sua idade: "); 
        idade = ler.nextInt(); //variavel que vai guardar a idade
        
        //Criando um objeto do tipo Calendar para guardar o ano
        Calendar calendario = Calendar.getInstance();
        ano_atual=calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        
        System.out.printf("Voc� nasceu no ano de " + ano_nascimento + "\n"); // \n serve para criar outra linha.
        
        //Poderia ser feito assim
        //System.out.printf("Voc� nasceu no ano de " + (calendario.get(Calendar.YEAR) - ler.nextInt()) + "\n");
        //mas, � sempre bom deixar o c�digo organizado e de f�cil entendimento para futuras modifica��es
		
        
        //Contas b�sicas e comando para exibir
		/*System.out.println(num + num2);	
		System.out.println(num - num2);	
		System.out.println(num / num2);	
		System.out.println(num * num2);
		
		System.out.println("Texto");*/
	}

}
