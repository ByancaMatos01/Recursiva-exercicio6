package View;

import java.util.Scanner;

import Controller.ControllerRecursiva;

public class Principal {

	public static void main(String[] args) {
		        
		        Scanner input = new Scanner(System.in);
		        
		        // entrada do número inteiro entre 10 e 999999
		        System.out.print("Digite um número inteiro entre 10 e 999999: ");
		        int numero = input.nextInt();
		        
		        // validação da entrada do número
		        while (numero < 10 || numero > 999999) {
		            System.out.println("Número inválido! Digite um número inteiro entre 10 e 999999:");
		            numero = input.nextInt();
		        }
		        
		        // entrada do número inteiro entre 0 e 9
		        System.out.print("Digite um número inteiro entre 0 e 9: ");
		        int digito = input.nextInt();
		        
		        // validação da entrada do dígito
		        while (digito < 0 || digito > 9) {
		            System.out.println("Número inválido! Digite um número inteiro entre 0 e 9:");
		            digito = input.nextInt();
		        }
		        
		        input.close();
		        
		        // chamada da função recursiva e exibição do resultado
		        int resultado = ControllerRecursiva.contarDigitos(numero, digito);
		        System.out.println("O dígito " + digito + " aparece " + resultado + " vezes no número " + numero);
		    }	

}
