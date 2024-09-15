
package exercicio.pkg01;

import java.util.Scanner;


public class Exercicio01 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        int num1,num2, dobro, triplo;
        
        System.out.println("Insira um número para calcular seu dobro:");
        num1 = leia.nextInt();
        
        System.out.println("Insira um número para descobrir seu triplo:");
        num2 = leia.nextInt();
        
        dobro = num1*2;
        triplo = num2 *3;
        
        System.out.println("O dobro de "+num1+" é "+dobro+" e o triplo de "+num2+" é "+triplo+".");
    }
    
}
