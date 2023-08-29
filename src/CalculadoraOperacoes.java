public class CalculadoraOperacoes {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtracao(double a, double b) {
        return a - b;
    }

    public double multiplicacao(double a, double b) {
        return a * b;
    }

    public double divisao(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
    }
}
