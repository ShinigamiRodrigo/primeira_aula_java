package primeiraAula;
import java.util.Scanner; //A Classe Scanner � o comando usado para entrada de dados (como teclado)
import java.util.Calendar; //A Classe Calendar inclui os termos de tempo como dias,meses,anos,etc.

public class Teste {
	
	public static void main (String args[]) {
		
		//variaveis do La�o/if
		int num=0, num2=5, total=0;
		Scanner ler = new Scanner(System.in);
		
										//=========VER O ANO EM QUE A PESSOA NASCEU=========
		/*
		int idade;
		int ano_atual;
		int ano_nascimento;
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite sua idade: "); 
        idade = ler.nextInt(); //variavel que vai guardar a idade
        
        //Criando um objeto do tipo Calendar para guardar o ano
        Calendar calendario = Calendar.getInstance();
        ano_atual=calendario.get(Calendar.YEAR);
        ano_nascimento = ano_atual - idade;
        
        System.out.printf("Voc� nasceu no ano de " + ano_nascimento + "\n"); // \n serve para criar outra linha.
        */
        
        //Poderia ser feito assim
        //System.out.printf("Voc� nasceu no ano de " + (calendario.get(Calendar.YEAR) - ler.nextInt()) + "\n");
        //mas, � sempre bom deixar o c�digo organizado e de f�cil entendimento para futuras modifica��es
        
        								//=========AULA DE LA�OS E IF=========
    	
        /* Operadores L�gicos
		 *Maior que: >
		 *Menor que: <
		 *Igual: ==
		 *Maior ou igual: >=
		 *Menor ou igual: <=
		 *Diferente: !=
		 *E: &&
		 *Ou: ||
		 * */
		//Enquanto
				/*while(i <= 10000) {
					System.out.println(i);
					i = i + 1;
				}*/
				
		
        
        do {
        System.out.println("Digite um n�mero para multiplicar por 5: "); 
        num = ler.nextInt();
        total = num * num2;
        
        if(total > 20){
        	System.out.println("O valor " + total + " � maior que 20");
        }else if(total == 20) {
        	System.out.println("O valor " + total + " � igual a 20");
        }else {
        	System.out.println("O valor " + total + " � menor que 20");
        	break;
        }
      }while(true);
	}

}
