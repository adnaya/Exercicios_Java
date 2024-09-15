
package exercicio.pkg02;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        String nomeProd1, nomeProd2, nomeProd3;
        double valorProd1, valor1, valorProd2, valor2, valorProd3, valor3, total;
        int qntdVend1, qntdVend2, qntdVend3;
        
        // Produto 01
        System.out.println("Insira o nome do produto:");
        nomeProd1 = leia.next();
        
        System.out.println("Insira o valor do produto:");
        valor1 = leia.nextDouble();
        
        System.out.println("Insira a quantidade do produto:");
        qntdVend1 = leia.nextInt();
        valorProd1 = valor1*qntdVend1;
        
        // Produto 02
        System.out.println("Insira o nome do produto 2:");
        nomeProd2 = leia.next();
        
        System.out.println("Insira o valor do produto 2:");
        valor2 = leia.nextDouble();
        
        System.out.println("Insira a quantidade do produto 2:");
        qntdVend2 = leia.nextInt();
        valorProd2 = valor2*qntdVend2;
            
        // Produto 03
        System.out.println("Insira o nome do produto 3:");
        nomeProd3 = leia.next();
        
        System.out.println("Insira o valor do produto 3:");
        valor3 = leia.nextDouble();
        
        System.out.println("Insira a quantidade do produto: 3");
        qntdVend3 = leia.nextInt();
        valorProd3 = valor3*qntdVend3;
        
            
        // CALCULO VALOR TOTAL
            total = valorProd1+ valorProd2+ valorProd3;
            
            System.out.println("O valor total da compra é de "+total+" reais");
    
    }
    
}
