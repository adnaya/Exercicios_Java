
import javax.swing.JOptionPane;

public class CustoPiso {
    
    private double comprimentoComodo;
    private double larguraComodo;
    private double precoPorArea;
    private double custoTotalComodo;
    private Object JOptionDialog;

    public CustoPiso() {
        this(0.0,0.0,0.0,0.0);
    }

    public CustoPiso(double comprimentoComodo, double larguraComodo, double precoPorArea, double custoTotalComodo) {
        this.comprimentoComodo = comprimentoComodo;
        this.larguraComodo = larguraComodo;
        this.precoPorArea = precoPorArea;
        this.custoTotalComodo = custoTotalComodo;
    }

    public double getComprimentoComodo() {
        return comprimentoComodo;
    }

    public void setComprimentoComodo(double comprimentoComodo) {
        this.comprimentoComodo = comprimentoComodo;
    }

    public double getLarguraComodo() {
        return larguraComodo;
    }

    public void setLarguraComodo(double larguraComodo) {
        this.larguraComodo = larguraComodo;
    }

    public double getPrecoPorArea() {
        return precoPorArea;
    }

    public void setPrecoPorArea(double precoPorArea) {
        this.precoPorArea = precoPorArea;
    }

    public double getCustoTotalComodo() {
        return custoTotalComodo;
    }

    public void setCustoTotalComodo(double custoTotalComodo) {
        this.custoTotalComodo = custoTotalComodo;
    }
    
    public void inserirValores(){
        setComprimentoComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento do cômodo:")));
        setLarguraComodo(Double.parseDouble(JOptionPane.showInputDialog("Digite a medidade de largura do cômodo:")));
    }
    
    public void calcularPrecoArea(){
        setPrecoPorArea(Double.parseDouble(JOptionPane.showInputDialog("Digite o Preço cobrado por área: ")));
        setCustoTotalComodo(getComprimentoComodo() * getLarguraComodo() * getPrecoPorArea());
    }
    
    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,"--- ORÇAMENTO ---\n"+
                "COMPRIMENTO DO CÔMODO: "+getComprimentoComodo()+"m\n"+
                "LARGURA COMODO: "+getLarguraComodo()+"m\n"+
                "PREÇO POR ÁREA: "+getPrecoPorArea()+" reais.\n"+
                "CUSTO MÃO DE OBRA: "+getCustoTotalComodo()+" reais.");  
    }
}
    