
import javax.swing.JOptionPane;


public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Quadrado quad = new Quadrado();
        
        int op;
            
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("CALCULOS DO QUADRADO\n"+
                    "1 - Calcular área do quadrado"+
                    "\n2 - Calcular perímetro do quadrado"+
                    "\n3 - Mostrar Valores"+
                    "\n4 - Sair"));
            switch(op){
                case 1:
                    quad.calcularArea();
                    break;
                case 2:
                    quad.calcularPerimetro();
                    break;
                case 3:
                    quad.mostrarValores();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null,"Finalizando...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
            
        }while(op!=0);
    }
    
}
