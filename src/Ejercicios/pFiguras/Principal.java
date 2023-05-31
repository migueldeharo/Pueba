package Ejercicios.pFiguras;

public class Principal {
    public static void main(String[] args) {
        Circulo c= new Circulo("Rueda",25);
        System.out.println(c.toString());
        Esfera e= new Esfera("Patata",12);
        System.out.println(e.toString());
        Cuadrado r= new Cuadrado("Maquina",19);
        System.out.println(r.toString());
    }

}
