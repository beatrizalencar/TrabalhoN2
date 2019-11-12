
package trabalhon2;


public class Retangulo extends FiguraGeometrica {
    private double altura;
    private double perimetro;
    private double base;
    private double area;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public double calcularArea(){
        this.area = this.getAltura() * this.getBase();
        return this.area;
        
    }
    @Override 
    public double calcularPerimetro(){
        this.perimetro = this.getAltura() *2+ this.getBase();
        return this.perimetro;
    }
    
    
    
}
