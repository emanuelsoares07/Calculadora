import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Calc {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        System.out.println("Calculadora Java");
        System.out.println("Escolha a operação");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int escolha = scan.nextInt();

        System.out.print("Digite o primeiro valor: ");
        double n1 =scan.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double n2 =scan.nextDouble();

        CalculadoraOperacoes operacoes = new CalculadoraOperacoes();

        double resultado;

        switch (escolha) {
            case 1:
                resultado = operacoes.somar(n1, n2);
                break;
            case 2:
                resultado = operacoes.subtracao(n1, n2);
                break;
            case 3:
                resultado = operacoes.multiplicacao(n1, n2);
                break;
            case 4:
                resultado = operacoes.divisao(n1, n2);
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }

        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println("Resultado: " + format.format(resultado));

        scan.close();
    }

}
