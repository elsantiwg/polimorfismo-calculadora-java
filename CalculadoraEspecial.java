import javax.swing.JOptionPane;

public class CalculadoraEspecial implements InterfazCalculadora {

    @Override
    public int sumarEnteros(int num1, int num2) {
        int resultado = num1 + num2;
        resultado /= 2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }

    @Override
    public int restarEnteros(int num1, int num2) {
        int resultado = num1 - num2;
        resultado /= 2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }

    @Override
    public int multiplicarEnteros(int num1, int num2) {
        int resultado = num1 * num2;
        resultado /= 2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }

    @Override
    public int dividirEnteros(int num1, int num2) {
        int resultado = num1 / num2;
        resultado /= 2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }

    @Override
    public double calcularRaizCuadrada(int num) {
        double resultado = Math.sqrt(num);
        resultado /= 2;
        JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);
        return resultado;
    }
}
