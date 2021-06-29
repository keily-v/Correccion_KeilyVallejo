package test;

import dominio.Punto;
import java.util.Scanner;

public class PruebaPunto {

    static Scanner datos = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("PROGRAMA QUE CALCULA LA DISTANCIA DE UN PUNTO "
                + "CON MOVIMIENTOS ALEATORIOS EN UN PLANO CARTESIANO ");

        System.out.println("¿Cuántos movimientos desea que realice el punto?");
        int n = datos.nextInt();
        Punto[] puntos = new Punto[n];
        generarPuntos(puntos);
        System.out.println("Los puntos son: ");
        for (Punto p : puntos) {
            System.out.println(p);
        }

    }

    public static void generarPuntos(Punto puntos[]) {

        int x=0, y=0;

        for (int i = 0; i < puntos.length; i++) {
            int mover = ((int) (Math.random() * 4 + 1));

            System.out.println("¿Qué cantidad desea que se mueva el punto en el movimiento : " +(i + 1) + "?");
            int cantidadmovimientos = datos.nextInt();
            if (mover == 1) {
                y = y + cantidadmovimientos;
                System.out.println("El punto se movió hacia arriba");
                System.out.println("x: " + x + ",y: " + y);
            } else if (mover == 2) {
                y = y - cantidadmovimientos;
                System.out.println("El punto se movió hacia abajo");
                System.out.println("x: " + x + ",y: " + y);
            } else if (mover == 3) {
                x = x + cantidadmovimientos;
                System.out.println("El punto se movió hacia la derecha");
                System.out.println("x: " + x + ",y: " + y);
            } else if (mover == 4) {
                x = x - cantidadmovimientos;
                System.out.println("El punto se movió hacia la izquierda");
                System.out.println("x: " + x + ",y: " + y);
            } else {
                System.out.println("ERROR");
            }
            puntos[i] = new Punto(x, y);
            
            for (int j = 0; j <1; j++) {
                
                puntos[i].setCalcularDistancia(puntos[j]);
                System.out.println("La distancia es:" + puntos[i].getCalcularDistancia());
                
            }

        }
    }
}
