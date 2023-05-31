package Ejercicios.pFiguras;

import java.util.Arrays;

public class Figuras {
    private Figura[] v;
    public Figuras (Figuras[] v){
        this.v=v;
    }
    public void getV(){
        this.v=v;
    }
    public Figuras[] setV (Figuras[] v){
        return v;
    }
    public void mostrar(){
        if (v!=null) {
            System.out.println(Arrays.toString(v));
        }
    }
    public double suma(){
        double s=0;
        if (v!=null){
            for (int i = 0; i < v.length; i++) {
                if (v[i] instanceof Circulo){
                    s+=((Circulo) v[i]).radio;
                }
                else if (v[i] instanceof Cuadrado){
                    s+=((Cuadrado) v[i]).lado;
                }
            }
        }
        return s;
    }
    public double media(){
        int c=0;
        double s=0;
        if (v!=null){
            for (int i = 0; i < v.length; i++) {
                if (v[i] instanceof Circulo){
                    s+=((Circulo) v[i]).radio;
                    c++;
                }
                else if (v[i] instanceof Cuadrado){
                    s+=((Cuadrado) v[i]).lado;
                    c++;
                }
            }
        }
        if (c==0) return 0;
        else return s/c;
    }


}
