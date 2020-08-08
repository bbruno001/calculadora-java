import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);
    static float num1, num2, resultado;

    public static int Menu() {
        int operacao;
        System.out.println("Calculadora \n" +
                    "Digite uma operação válida ou 0 para sair: \n" +
                    "1 : Soma \n" +
                    "2 : Subtração \n" +
                    "3 : Multiplicação \n" +
                    "4 : Divisão \n" +
                    "5 : Quadrado de um número.");
        operacao = scan.nextInt();
        return operacao;
    }

    public static class Calcula {
        public static void Soma(){
            resultado = num1 + num2;
            System.out.println("\nO resultado da Soma é : " + resultado);
        }

        public static void Subtracao(){
            resultado = num1 - num2;
            System.out.println("\nO resultado da Subtração é : " + resultado);
        }

        public static void Multiplicacao(){
            resultado = num1 * num2;
            System.out.println("\nO resultado da Multiplicação é : " + resultado);
        }

        public static void Divisao(){
            resultado = num1 / num2;
            System.out.println("\nO resultado da Divisão é : " + resultado);
        }

        public static void Quadrado(){
            resultado = num1 * num1;
            System.out.println("\nO quadrado do número é : " + resultado);
        }
    }

    public static class Calcular extends Calcula{
        public static void EntradaDeUmNumero(){
            System.out.println("Digite o valor: ");
            num1 = scan.nextFloat();
        }

        public static void EntradaDeDoisNumeros(){
            System.out.println("Digite o primeiro valor: ");
            num1 = scan.nextFloat();

            System.out.println("Digite o Segundo valor: ");
            num2 = scan.nextFloat();
        }

        public static void Calculadora (int op){
            switch (op) {
                case 1 -> {
                    EntradaDeDoisNumeros();
                    Soma();
                }

                case 2 -> {
                    EntradaDeDoisNumeros();
                    Subtracao();
                }

                case 3 -> {
                    EntradaDeDoisNumeros();
                    Multiplicacao();
                }

                case 4 -> {
                    EntradaDeDoisNumeros();
                    Divisao();
                }

                case 5 -> {
                    EntradaDeUmNumero();
                    Quadrado();
                }

                case 0 -> System.exit(0);

                default -> System.out.println("Opção inválida.");
            }
        }
    }

    public static void main(String[] args) {
        int meuMenu = -1;
        while (meuMenu != 0){
            Calcular.Calculadora(Menu());
        }
    }
}
