package Ejercicios.pFiguras;

public class Figura {
    protected String nombre;
    public Figura(){
        nombre="sin nombre";
    }
    public Figura(String nombre){
        this.nombre=nombre;
    }
    public void setNombre(){
        this.nombre=nombre;
    }
    public String getNombre(String nombre){
        return nombre;
    }
    public String toString (){
        String s=new String();
        s+=nombre+": Soy una figura.";
        return s;
    }


}
