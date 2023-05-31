package Ejercicios.pTrabajadores;

public class Peluquero extends Trabajador{
    public void peinar(){
        System.out.println("Peinando");
    }
    public void trabajar(){
        peinar();
    }
}
