import javax.swing.JOptionPane;

public class ClienteCalculadoraEspecial {

    public static void main(String[] args) {
        // Crear instancia de la calculadora especial
        CalculadoraEspecial calculadora = new CalculadoraEspecial();

        // Pedir los números para realizar las operaciones
        String num1String = JOptionPane.showInputDialog(null, "Ingrese el primer número:");
        String num2String = JOptionPane.showInputDialog(null, "Ingrese el segundo número:");

        // Convertir los números ingresados a enteros
        int num1 = Integer.parseInt(num1String);
        int num2 = Integer.parseInt(num2String);

        // Realizar operaciones con la calculadora especial
        int suma = calculadora.sumarEnteros(num1, num2);
        int resta = calculadora.restarEnteros(num1, num2);
        int multiplicacion = calculadora.multiplicarEnteros(num1, num2);
        int division = calculadora.dividirEnteros(num1, num2);
        double raizCuadrada = calculadora.calcularRaizCuadrada(num1);

        // Mostrar los resultados de las operaciones
        JOptionPane.showMessageDialog(null, "Resultados de la calculadora especial:\n" +
                                            "Suma: " + suma + "\n" +
                                            "Resta: " + resta + "\n" +
                                            "Multiplicación: " + multiplicacion + "\n" +
                                            "División: " + division + "\n" +
                                            "Raíz cuadrada de " + num1 + ": " + raizCuadrada/2);
    }

}
