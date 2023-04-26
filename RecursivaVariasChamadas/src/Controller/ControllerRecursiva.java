package Controller;

public class ControllerRecursiva {
public static int contarDigitos(int numero, int digito) {
        
        // Condi��o de parada: n�mero possui apenas um d�gito
        if (numero < 10) {
            if (numero == digito) {
                return 1;
            } else {
                return 0;
            }
        }
        
        // Rela��o de chamada dos passos: 
        // chama a fun��o recursiva com o n�mero sem o �ltimo d�gito e soma com a contagem do �ltimo d�gito
        int ultimoDigito = numero % 10;
        int quantidadeDeDigitos = contarDigitos(numero / 10, digito);
        
        if (ultimoDigito == digito) {
            quantidadeDeDigitos++;
        }
        
        return quantidadeDeDigitos;
    }
    
}

