package Controller;

public class ControllerRecursiva {
public static int contarDigitos(int numero, int digito) {
        
        // Condição de parada: número possui apenas um dígito
        if (numero < 10) {
            if (numero == digito) {
                return 1;
            } else {
                return 0;
            }
        }
        
        // Relação de chamada dos passos: 
        // chama a função recursiva com o número sem o último dígito e soma com a contagem do último dígito
        int ultimoDigito = numero % 10;
        int quantidadeDeDigitos = contarDigitos(numero / 10, digito);
        
        if (ultimoDigito == digito) {
            quantidadeDeDigitos++;
        }
        
        return quantidadeDeDigitos;
    }
    
}

