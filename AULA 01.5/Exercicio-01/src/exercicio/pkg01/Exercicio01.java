
package exercicio.pkg01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        double area, raio;
        
        System.out.println("Isira o valor do raio desse circulo em cm:");
        raio = leia.nextDouble();
        
        area = 3.14 *(raio*raio);
        
        System.out.println("A área desse círculo é: "+area+" cm²");
    }
    
}
