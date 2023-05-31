package Ejercicios.pFiguras;

import java.lang.invoke.StringConcatFactory;

public class Cilindro extends Circulo{
    private double altura;
    public Cilindro (){
        super();
        altura=5;
        this.nombre=nombre;
    }
    public Cilindro (String nombre, double radio, double altura){
        super(nombre,radio);
        this.nombre=nombre;
        if (radio>0) this.radio=radio;
        if(altura<0) this.altura=5;
        else this.altura=altura;
    }
    public void setAltura(){
        this.altura=altura;
    }
    public double getAltura(double altura){
        return altura;
    }
    public String toString(){
        return super.toString()+"Soy un cilindro de altura: "+altura;
    }

}
