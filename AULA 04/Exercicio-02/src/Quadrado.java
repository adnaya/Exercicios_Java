
import javax.swing.JOptionPane;

public class Quadrado {
    private double areaQuadrado;
    private double perimetroQuadrado;
    private double ladoA;

    public Quadrado() {
        this(0.00,0.00,0.00);
    }

    public Quadrado(double areaQuadrado, double perimetroQuadrado, double ladoA) {
        this.areaQuadrado = areaQuadrado;
        this.perimetroQuadrado = perimetroQuadrado;
        this.ladoA = ladoA;
    }

    public double getAreaQuadrado() {
        return areaQuadrado;
    }

    public void setAreaQuadrado(double areaQuadrado) {
        this.areaQuadrado = areaQuadrado;
    }

    public double getPerimetroQuadrado() {
        return perimetroQuadrado;
    }

    public void setPerimetroQuadrado(double perimetroQuadrado) {
        this.perimetroQuadrado = perimetroQuadrado;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    //
    public void calcularArea(){
        setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado A:")));
        setAreaQuadrado(Math.pow(getLadoA(),2));

    }

    public void calcularPerimetro(){
        if(getLadoA() == 0){
            setLadoA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Lado A:")));
        }else{
            JOptionPane.showMessageDialog(null,"Cálculo realizado! Selecione 3 no menu para ver o resultado.");
        }
        setPerimetroQuadrado(getLadoA()*4);
        
    }

    public void mostrarValores(){
        JOptionPane.showMessageDialog(null,"- CÁLCULOS QUADRADO -\n"+
                "ÁREA: "+getAreaQuadrado()+"\n"+
                "PERÍMETRO: "+getPerimetroQuadrado()+"\n"+
                "LADO: "+getLadoA());
    }

}