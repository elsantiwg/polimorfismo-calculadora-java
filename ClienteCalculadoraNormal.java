import javax.swing.JOptionPane;

public class ClienteCalculadoraNormal {

    public static void main(String[] args) {
        // Crear objeto de la calculadora normal
        CalculadoraNormal calcNormal = new CalculadoraNormal();
        
        // Solicitar al usuario los números a sumar
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a sumar:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a sumar:"));
        
        // Realizar la suma y mostrar el resultado
        int resultado = calcNormal.sumarEnteros(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + resultado);
        
        // Solicitar al usuario los números a restar
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a restar:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a restar:"));
        
        // Realizar la resta y mostrar el resultado
        resultado = calcNormal.restarEnteros(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + resultado);
        
        // Solicitar al usuario los números a multiplicar
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a multiplicar:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a multiplicar:"));
        
        // Realizar la multiplicación y mostrar el resultado
        resultado = calcNormal.multiplicarEnteros(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + resultado);
        
        // Solicitar al usuario los números a dividir
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a dividir:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a dividir:"));
        
        // Realizar la división y mostrar el resultado
        resultado = calcNormal.dividirEnteros(num1, num2);
        JOptionPane.showMessageDialog(null, "El resultado de la división es: " + resultado);
        
        // Solicitar al usuario el número para calcular su raíz cuadrada
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para calcular su raíz cuadrada:"));
        
        // Calcular la raíz cuadrada y mostrar el resultado
        double resultadoRaiz = calcNormal.calcularRaizCuadrada(num1);
        JOptionPane.showMessageDialog(null, "El resultado de la raíz cuadrada es: " + resultadoRaiz);
    }

}

