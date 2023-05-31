package Ejercicios.pTrabajadores;

public class Jardinero extends Trabajador{
    public void regar(){
        System.out.println("Regando");
    }
    public void trabajar(){
        regar();
    }
}
