

import java.util.Scanner;

public class ClienteCalculadoraNormal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraNormal calculadora = new CalculadoraNormal();

        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        int suma = calculadora.sumarEnteros(numero1, numero2);
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es " + suma);

        int resta = calculadora.restarEnteros(numero1, numero2);
        System.out.println("La resta de " + numero1 + " y " + numero2 + " es " + resta);

        int multiplicacion = calculadora.multiplicarEnteros(numero1, numero2);
        System.out.println("La multiplicación de " + numero1 + " y " + numero2 + " es " + multiplicacion);

        try {
            int division = calculadora.dividirEnteros(numero1, numero2);
            System.out.println("La división de " + numero1 + " entre " + numero2 + " es " + division);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            double raizCuadrada = calculadora.calcularRaizCuadrada(numero1);
            System.out.println("La raíz cuadrada de " + numero1 + " es " + raizCuadrada);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
