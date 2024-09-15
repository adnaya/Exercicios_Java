
package exercicio.pkg04;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        DecimalFormat conv = new DecimalFormat("0.00");
        
        double salarioMin, salarioFuncionario, qntSalario;
        
        System.out.println("Digite o valor atual do salário mínimo:");
        salarioMin = leia.nextInt();
        
        System.out.println("Digite o valor do seu salário :");
        salarioFuncionario = leia.nextInt();
        
        qntSalario = salarioFuncionario/salarioMin;
        
        System.out.println("Você recebe "+conv.format(qntSalario)+" salario(s) mínimo");
    }
    
}
