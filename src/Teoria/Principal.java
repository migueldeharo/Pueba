package Teoria;

import java.awt.event.ActionListener;

public class Principal {

    public static void main(String[] args) {
        //INSTANCEOF:Me permite saber si una instancia (no la variable) es de una determinada clase
        /*
        System.out.println(new Persona() instanceof Persona);
        System.out.println(new Persona() instanceof Alumno);
        System.out.println(new Alumno() instanceof  Persona);
        System.out.println(new Alumno() instanceof Alumno);

        Persona p = new Persona();
        Alumno a = new Alumno();
        System.out.println(p instanceof Persona);
        System.out.println(p instanceof Alumno);
        System.out.println(a instanceof Persona);
        System.out.println(a instanceof Alumno);
         */

        //***********************************************************************************************
        /*
        //CASTING:Adaptar un valor para tenerlo como un valor de otro tipo
        float f=7.5f;
        System.out.println((int)f);
        System.out.println(f);
        //UPCASTING:ADAPTAR una instancia para tenerla como una instancia de una SUPERCLASE
        Persona p= new Alumno();
        //Implicito
        //¿Todo alumno es persona? -> esto siempre funciona
        System.out.println(p instanceof Alumno);
        Persona p2= (Alumno) new Alumno(); //EXPLICITO

        //DOWNCASTING:ADAPTAR una instancia para tenerla como una instancia de una SUBCLASE (Lo contrario)
        //Alumno a = new Persona(); -> esto nunca funciona "Error de compliacion"
        Alumno a = (Alumno) new Persona(); //-> Error de ejecucion
         */
        //************************************************************************************************
        //CONSECUENCIAS
        /*
        Persona p=new Alumno(); //Upcasting implicito
        //System.out.println(p.nota);
        if (p instanceof Alumno){//Para mi
            //Downcasting explicito
            //A
            Alumno a=(Alumno) p;
            System.out.println(a.nota);
            //B
            System.out.println(((Alumno) p).nota);
        }
         */
        //************************************************************************************************
        //Polimorfismo
        /*
        Persona p;
        p= new Persona(); System.out.println(p instanceof Persona);
        p= new Alumno(); System.out.println(p instanceof Alumno);
        p=new Uni(); System.out.println(p instanceof Uni);
        //¿Que me ofrece?
        //ANTES: Arrays homogeneos (Todos los objetos de la misma clase)
        Persona[] v= new Persona[2];
        v[0]=new Persona();
        v[1]=new Persona();
        //¿Y si queria trabajar con alumnos?
        Alumno[] v2=new Alumno[1];
        v2[0]=new Alumno();
        //AHORA: Arrays heterogeneos (objetos de distintas clases pero de la misma familia)
        Persona[] v3= new Persona[3];
        v3[0]=new Uni();
        v3[1]=new Persona();
        v3[2]=new Alumno();
         */
        //************************************************************************************************
        //LIGADURA DINAMICA:Me permite ejecutar el metodo sibreescrito o heredado de la ultima clase que haya
        //en la instancia de memoria, aunque la variable sea de una superclase
        Persona p;
        p=new Persona(); p.soy(); p.saludo();
        p=new Alumno(); p.soy(); p.saludo();
        p=new Uni(); p.soy(); p.saludo();
        //Final
        Persona[] v= new Persona[4];
        v[0]=new Uni();
        v[1]=new Persona();
        v[2]=new Alumno();
        v[3]=new Uni();
        for (int i = 0; i < v.length; i++) {
            v[i].soy();
            v[i].saludo();
            if (v[i] instanceof Uni){
                //Down Casting
                ((Uni) v[i]).arribas();
            }
        }





    }
}
