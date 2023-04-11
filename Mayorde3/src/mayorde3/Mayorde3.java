package mayorde3;

import java.util.Scanner;

/**
 * Este programa calcula el mayor de tres números reales al tratarlos como si
 * fueran de doble precisión. La entrada se realiza desde el teclado y, para
 * realizar la selección, se comparan los pares de valores entre sí.
 *
 */
public class Mayorde3 {

    public static void main(String[] args) {

        double x, y, z;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer número real");
        x = entrada.nextDouble();
        System.out.print("Introduzca segundo número real");
        y = entrada.nextDouble();
        System.out.print("Introduzca el tercer número real");
        z = entrada.nextDouble();
        
        Condicional(x, y, z);
    }

    public static void Condicional(double x, double y, double z){
    double mayor;
        if (x > y) {
            if (x > z) {
                mayor = x;
            } else {
                mayor = z;
            }
        } else if (y > z) {
            mayor = y;
        } else {
            mayor = z;
        }
        System.out.println("El mayor es " + mayor);

    }
}
