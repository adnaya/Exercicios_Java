
package exercicio.pkg04;

import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        double ladoA, ladoB, perimetro, area;
        
        System.out.println("Para descobrir a área e o primetro de um retângulo, insira os valores, em centímetros:\n Valor de um dos lados do retângulo:");
        ladoA = leia.nextDouble();
        
        System.out.println("Insira o valor do outro lado do retângulo:");
        ladoB = leia.nextDouble ();
        
        perimetro = (2*ladoA)+(2*ladoB);
        area = ladoA*ladoB;
        
        System.out.println("A área do retângulo é de "+area+"cm^2, e o seu perímetro é de "+perimetro+"cm.");
    }
    
}
