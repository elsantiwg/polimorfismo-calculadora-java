
public class CalculadoraNormal implements InterfazCalculadora {

    public int sumarEnteros(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int restarEnteros(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicarEnteros(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public int dividirEnteros(int numero1, int numero2) {
        if (numero2 == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return numero1 / numero2;
    }

    public double calcularRaizCuadrada(int numero1) {
        if (numero1 < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero1);
    }
}
