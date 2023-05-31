package Teoria;

public class Persona extends Object{ //Lo hace JAVA implicitamente
    //TODAS LAS CLASES DE JAVA HEREDAS DE OBJECT
    public String nombre;
    public void soy(){
        System.out.println("Persona");
    }
    public void saludo(){
        System.out.println("Hola");
    }
    public boolean equals (Object obj){
        if(this==obj) return true;
        if (!(obj instanceof Persona)) return false; //Incluye el null
        Persona p= (Persona) obj; //Downcasting explicito
        return this.nombre.equals(p.nombre);

    }
}
