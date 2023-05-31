package Ejercicios.pFiguras;

import javax.swing.text.PlainDocument;

public class Cuadrado extends Figura{
    protected double lado;
    public Cuadrado (){
        super();
        this.lado=lado;
    }
    public Cuadrado(String nombre, double lado){
        super(nombre);
        this.nombre=nombre;
        if (lado>0) this.lado=lado;
    }

    public void setRadio(){
        this.lado=lado;
    }
    public double getRadio(){
        return lado;
    }
    public String toString (){
        return super.toString()+"Cuadrado de lado: "+lado; //Con el super accedemos al mensaje de la suoerclase
    }
    public boolean equals (Object obj){
        if (this==obj) return true;
        if (!(obj instanceof Circulo)) return false;
        Cuadrado c= (Cuadrado) obj;
        return this.nombre.equals(c.lado);
    }
}
