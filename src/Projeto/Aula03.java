package Projeto;

import java.util.Scanner;

public class Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		exercicio3();
	}
	
	public static void exercicio1 () {
		Scanner numero = new Scanner(System.in);
	    System.out.println("Informe um número");
         int num = numero.nextInt();
         
         int i=0;

	   for(i = 0; i < num; i++) {
	   System.out.println(i);  
	   }
	}
	
	public static void exercicio2 () {
		Scanner numero = new Scanner(System.in);
	    System.out.println("Informe um valor");
         int num1 = numero.nextInt();
         
         System.out.println("Informe outro valor");
         int num2 = numero.nextInt();
         
       
        
        for(int i = 1; i <= num1 ; i++) {
        	for (int x = 1; x <= num2 ; x++) {
        System.out.printf("*");
        	}
        	System.out.println("");
      }
        
	}
	public static void exercicio3 () {
		Scanner numero = new Scanner(System.in);
	    System.out.println("Informe um número para calcular a tabuaba");
         int num1 = numero.nextInt();
         
         for(int i = 1; i <=10; i++) {
        	 System.out.println(num1 + " x " + i +"=" + (num1 * i ));
        	 
         }
         
         
      }
        
	}
	
	
	



