package Projeto;

import java.util.Scanner;


public class Aula01 {

public static void main (String args []){

	exercicio4();
}

public static void exercicio1 () {
	Scanner numero = new Scanner(System.in);
    System.out.println("Informe o número, para saber se é par ou ímpar:");

    int num = numero.nextInt();

    if (num % 2 == 0){
        System.out.println("O número informado é par!");
    }else{
        System.out.println("O número informado é ímpar!");
    }

}


public static void exercicio2 () {
    Scanner numero = new Scanner (System.in);
   System.out.println("Informe a sua idade");

   int idade = numero.nextInt();

   if(idade<=12){
         System.out.println("Você é criança!");}

   if(idade>=13 && idade<=18 ){
         System.out.println("Você é adolescente!");}

   if(idade>=19 && idade<=64 ){
         System.out.println("Você é Adulto!");}
   else{
        System.out.println("Você é idoso!");
    }

}


public static void exercicio3 () {
    Scanner numero = new Scanner (System.in);
   System.out.println("Informe a sua nota: ");

   float nota = numero.nextFloat();

   if (nota >= 7) {
        System.out.println("Você está Aprovado!");
    } else  if (nota >= 5 && nota <= 6.9)
    {
        System.out.println("Você está de Recuperação!");
    } else if (nota < 5)
    {
        System.out.println("Você está Reprovado!");
    } else
    {
        System.out.println("Número inválido");
    }

}

public static void exercicio4 () {
    Scanner numero = new Scanner (System.in);
   System.out.println("Informe um numero: ");
    float nota = numero.nextFloat();

   System.out.println("Informe outro numero: ");
   float nota2 = numero.nextFloat();

   System.out.println("Escolha a operação desejada:");
    System.out.println("1. Adição");
    System.out.println("2. Subtração");
    System.out.println("3. Multiplicação");
    System.out.println("4. Divisão");

    System.out.print("Digite o número da operação: ");
    int escolha = numero.nextInt();

    float resultado=0;

    if(escolha == 1){
        resultado = nota+nota2;
         System.out.println("Resultado da adição: " + resultado);
    } else if (escolha == 2){
        resultado = nota-nota2;
         System.out.println("Resultado da Subtração: " + resultado);
    }else if (escolha == 3){
        resultado = nota*nota2;
         System.out.println("Resultado da Multiplicação: " + resultado);
    }else if (escolha == 4){
        resultado = nota/nota2;
         System.out.println("Resultado da Divisão: " + resultado);
    }else {

         System.out.println("Invalido");
    }
 }


}
