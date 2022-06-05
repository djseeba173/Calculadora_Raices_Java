package paquete;

import java.util.Scanner;

public class calculadora{
    public static Scanner teclado = new Scanner(System.in);
    public static double a = 0;
    public static double b = 0;
    public static double c = 0;
    public static boolean flag = false;

    public static void main(String[] args) {
        // A continuacion, solo haremos el pedido de los valores
        mensaje();
        
        while (!flag) {
            try{
                System.out.print("A: ");
                a = Double.parseDouble(teclado.nextLine());    
                System.out.print("B: ");
                b = Double.parseDouble(teclado.nextLine());
                System.out.print("C: ");
                c = Double.parseDouble(teclado.nextLine());
                flag = true;
            }catch(Exception e){
                System.err.println("Por favor, ingrese un numero valido");
            }
        }

        //Y acá está la devolucion de los valores
        Resolvente.laCuenta(a, b, c);



    }

    public static void mensaje() {
        System.out.println("**************************************************");
        System.out.println("* Bienvenido a la calculadora de Raices cuadradas*");
        System.out.println("**************************************************");
        System.out.println("Para empezar, recordemos que las ecuaciones cuadraticas son: ");
        System.out.println("Ax^2 + Bx + C");
        System.out.println("**************************************************");
        System.out.println("Ingrese por favor los valores de su ecuacion");
        
    }
}




