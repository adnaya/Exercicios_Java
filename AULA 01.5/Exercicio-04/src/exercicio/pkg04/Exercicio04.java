
package exercicio.pkg04;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        String nomeProd;
        int qntdMax, qntdEstoque, qntdComprar;
        
        System.out.println("Insira o nome do produto:");
        nomeProd = leia.next();

        System.out.println("Insira quantidade máxima do produto");
        qntdMax = leia.nextInt();

        System.out.println("Informe o estoque do prodruto:");
        qntdEstoque = leia.nextInt();

        qntdComprar = qntdMax - qntdEstoque;

        System.out.println("NOME PRODUTO -------------- "+nomeProd+"\nQUANTIDADE A COMPRAR ------ "+qntdComprar);
        
    }
    
}
