import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner entrada = new Scanner(System.in);
	    
	    System.out.println("Digite o valor da Laranja");
	    int Laranja=entrada.nextInt();
	    
	    System.out.println("Digite o valor da Uva");
	    int Uva=entrada.nextInt();
	    
	    System.out.println("Seu nome começa com qual letra?");
	    char nome=entrada.next().charAt(0);
	    
	    System.out.println("Quantos anos tem?");
	    int idade=entrada.nextInt();
	    
	    System.out.println("você tomou café hoje?");
	    boolean cafe=entrada.nextBoolean();
		System.out.println("O valor final é: R$"+(Laranja+Uva)+",00");
		System.out.println("Meu nome começa com a letra "+nome);
		System.out.println("eu tenho "+idade+" anos");
		System.out.println("eu tomei café da manhã hoje? "+cafe);
	}
}
