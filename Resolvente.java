package paquete;

public class Resolvente {
    public static double miRaiz(double a, double b, double c) {
        double resultado = 0;

        //realizo la raiz en otro lado por una cuestion de prolijidad
        resultado = (b*b) - 4*(a*c);
        resultado = Math.sqrt(resultado);

        return resultado;
    }

    public static void laCuenta(double a, double b, double c) {
        double sqrt = miRaiz(a, b, c);
        double resultado1 = 0;
        double resultado2 = 0;
        double resultado3 = 0;
        double resultado4 = 0;

        //hacemos el chequeo de ambos valores
        if(sqrt != 0 && a !=0){
            //hacemos dos cuentas distintas para la prolijidad de la ecuacion resolvente

            //suma
            resultado1 = -b + sqrt;
            resultado2 = resultado1 / (2*a);
            //resta
            resultado3 = -b - sqrt;
            resultado4 = resultado3 / (2*a);

            //por ultimo solo queda la devolucion de los datos
            System.out.println("x1 = " + resultado2);
			System.out.println("********************");
			System.out.println("x2 = " + resultado4);
        }else{
            //si son 0, quiere decir que no hay raices
            System.err.println("La ecuacion no tiene raices");
        }
        
    }
}
