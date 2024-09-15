
package exercicio.pkg01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat conv = new DecimalFormat("0.00");
    
        int num1, num2, soma;
        Scanner lerVar= new Scanner(System.in);
        
        System.out.println("Digite o primeiro número da soma:");
        num1 = lerVar.nextInt();
        
        System.out.println("Digite o segundo numero da soma:");
        num2 = lerVar.nextInt();
        
        soma = num1+num2;
        System.out.println("O resultado da soma é "+soma);
    }
    
}
