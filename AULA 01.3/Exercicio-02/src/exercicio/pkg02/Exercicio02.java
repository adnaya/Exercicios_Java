
package exercicio.pkg02;

import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        int numero, numQuadrado;
        
        System.out.println("Insira um numero para descobrir seu quadrado:");
        numero = leia.nextInt();
        
        numQuadrado = (int) Math.pow(numero,2);
        
        System.out.println("A raiz quadrada de "+numero+" é "+numQuadrado);
    }
    
}
