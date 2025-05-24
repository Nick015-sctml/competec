//Questão 1 Enqunto

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
    	int x = 0;
    	
    	System.out.println("Digite uma palavra: ");
        String palavra = input.nextLine();
	
    	while (x < 5) {
    	    
		System.out.println(palavra);
		x++;
    	}
	}
}

// Questão 2 Soma de 1 até 100

public class Main
{
	public static void main(String[] args) {
		
		int y = 1;
		int somatotal = 0;
	
    	while (y <= 100) {
    	somatotal += y;
    	    
    	System.out.println(somatotal + " ");
	
		y++;
    	}
	}
}

//Questão 3 For Tabuada

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
    	
    	System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        
        for (int N = 1; N <=10; N++){
      
        System.out.println(N*numero + " ");
        }
	}
	
	//Questão 4 N Impares


import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
    	
    	System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        
        for (int N = 1; N < numero; N+=2){
      
        System.out.println(N + " ");
        }
	}
}
