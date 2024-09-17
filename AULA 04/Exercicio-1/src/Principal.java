
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CustoPiso custp = new CustoPiso();
        
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("CALCULO DE GASTO PISO POR ÁREA\n"+
                "1- INSERIR VALORES DIMENSÕES"+
                "\n2- CALCULAR PREÇO POR ÁREA"+
                "\n3- MOSTRAR VALORES"+
                "\n0- SAIR"));
            
            switch(op){
                case 1:
                    custp.inserirValores();
                    break;
                case 2:
                    custp.calcularPrecoArea();
                    break;
                case 3:
                    custp.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Opção Inválida");
                    break;
            
            }
        }
        while(op !=0);
    }
    
}
