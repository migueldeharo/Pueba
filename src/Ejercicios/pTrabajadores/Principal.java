package Ejercicios.pTrabajadores;

public class Principal {
    public static void main(String[] args) {
        Trabajador[] v= new Trabajador[3];
        v[0]= new Jardinero();
        v[1]= new Peluquero();
        v[2]= new Jardinero();
        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Jardinero){
                ((Jardinero) v[i]).regar();
            }
            else if (v[i] instanceof Peluquero){
                ((Peluquero) v[i]).peinar();
            }
        }
        for (int i = 0; i < v.length; i++) {
            v[i].trabajar();
        }
    }



}
