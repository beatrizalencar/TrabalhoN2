
package trabalhon2;


public class Circulo extends FiguraGeometrica {
    private double raio;
    private double area;
    private double perimetro;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
    
    public double calcularArea() {
        this.area = 2*3.14*this.raio*this.raio;
        return this.area;
    }
    
    public double calcularPerimetro(){
        this.perimetro = 2*3.14*this.raio;
        return this.perimetro;
    }
    
    
}
