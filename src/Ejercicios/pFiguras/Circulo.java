package Ejercicios.pFiguras;

public class Circulo extends Figura{
    protected double radio;
    public Circulo (){
        super();
        this.radio=10;
    }
    public Circulo(String nombre, double radio){
        super(nombre);
        this.nombre=nombre;
        if (radio<0) this.radio=10;
        else this.radio=radio;
    }

    public void setRadio(){
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public String toString (){
        return super.toString()+"Circulo de radio:"+radio;
    }
    public boolean equals (Object obj){
        if (this==obj) return true;
        if (!(obj instanceof Circulo)) return false;
        Circulo c= (Circulo) obj;
        return this.nombre.equals(c.radio);
    }
}
