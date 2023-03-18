import javax.swing.JOptionPane;

public class CalculadoraNormal implements InterfazCalculadora {
    
    @Override
    public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    @Override
    public int dividirEnteros(int numero1, int numero2) {
        int resultado = 0;
        if(numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
        }
        return resultado;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        double resultado = 0;
        if(numero1 >= 0) {
            resultado = Math.sqrt(numero1);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return resultado;
    }
}
