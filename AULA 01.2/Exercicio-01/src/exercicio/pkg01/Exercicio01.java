
package exercicio.pkg01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        float salarioAtual, novoSalario, percentual;
        
        System.out.println("Insira o valor do seu salário: ");
        salarioAtual = leia.nextFloat();
        
        System.out.println("Insira o percentual de reajuste: ");
        percentual = leia.nextFloat();
        
        novoSalario = salarioAtual+(salarioAtual*(percentual/100));
        
        System.out.println("O salario com o reajuste é de: "+novoSalario+" reais.");
    }
    
}
