/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Exercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        
        int idade, dias;
        
        System.out.println("DESCUBRA QUANTOS DIAS DE VIDA VOCÊ TEM!");
        System.out.println("Digite sua idade:");
        idade = leia.nextInt();
        
        dias = idade*365;
        
        System.out.println("Você possui "+dias+" dias de vida!");
    }
}
