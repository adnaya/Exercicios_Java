
package exercicio.pkg02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        double nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, soma;
        
        System.out.println("Insira o primeiro nota:");
        nota1 = leia.nextInt();
        
        System.out.println("Insira o segunda nota:");
        nota2 = leia.nextInt();
        
        System.out.println("Insira o terceira nota:");
        nota3 = leia.nextInt();
        
        System.out.println("Insira o quarta nota:");
        nota4 = leia.nextInt();
        
        System.out.println("Insira o quinta nota:");
        nota5 = leia.nextInt();
        
        System.out.println("Insira o sexta nota:");
        nota6 = leia.nextInt();
        
        media1 = (nota1+nota2+nota3)/3;
        media2 = (nota4+nota5+nota6)/3;
        soma = media1+media2;
        
        System.out.println("\n-- NOTAS --\nMEDIA 1: "+conv.format(media1)+"\nMEDIA 2: "+conv.format(media2)+"\nSOMA DAS MEDIAS: "+conv.format(soma));
         
    }
    
}
