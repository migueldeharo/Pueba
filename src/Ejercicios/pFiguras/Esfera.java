package Ejercicios.pFiguras;

public class Esfera extends Circulo{
    public Esfera(){

    }
    public Esfera(String nombre,double radio){
        super(nombre,radio);
        this.nombre=nombre;
        if (radio>0) this.radio=radio;
    }
    public String toString(){
        return super.toString()+" Soy una esfera";
    }

}
