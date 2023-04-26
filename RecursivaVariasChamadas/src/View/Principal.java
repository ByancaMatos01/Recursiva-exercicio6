package View;

import java.util.Scanner;

import Controller.ControllerRecursiva;

public class Principal {

	public static void main(String[] args) {
		        
		        Scanner input = new Scanner(System.in);
		        
		        // entrada do n�mero inteiro entre 10 e 999999
		        System.out.print("Digite um n�mero inteiro entre 10 e 999999: ");
		        int numero = input.nextInt();
		        
		        // valida��o da entrada do n�mero
		        while (numero < 10 || numero > 999999) {
		            System.out.println("N�mero inv�lido! Digite um n�mero inteiro entre 10 e 999999:");
		            numero = input.nextInt();
		        }
		        
		        // entrada do n�mero inteiro entre 0 e 9
		        System.out.print("Digite um n�mero inteiro entre 0 e 9: ");
		        int digito = input.nextInt();
		        
		        // valida��o da entrada do d�gito
		        while (digito < 0 || digito > 9) {
		            System.out.println("N�mero inv�lido! Digite um n�mero inteiro entre 0 e 9:");
		            digito = input.nextInt();
		        }
		        
		        input.close();
		        
		        // chamada da fun��o recursiva e exibi��o do resultado
		        int resultado = ControllerRecursiva.contarDigitos(numero, digito);
		        System.out.println("O d�gito " + digito + " aparece " + resultado + " vezes no n�mero " + numero);
		    }	

}
