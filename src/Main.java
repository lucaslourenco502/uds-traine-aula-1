import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello Word");

        String nome = "Lucas Lourenço";
        int numero = 6;
        int idade = 18;
        boolean sexoFeminino = false;
        double peso = 58.2;
        System.out.println("Olá meu nome é " + nome + ", tenho " + idade + " anos de idade!");

        if (idade <= 18)
        {
            System.out.println("Novinho");
        }
        else if (idade > 18 && idade <= 30)
        {
            System.out.println("Tiozinho");
        }
        else {
            System.out.println("Tiozão");
        }

        switch (numero) {
            case 0:
                System.out.println("O dia da semana é Domingo");
                break;
            case 1:
                System.out.println("O dia da semana é Segunda-feira.");
                break;
            case 2:
                System.out.println("O dia da semana é Terça-feira.");
                break;
            case 3:
                System.out.println("O dia da semana é Quarta-feira.");
                break;
            case 4:
                System.out.println("O dia da semana é Quinta-feira.");
                break;
            case 5:
                System.out.println("O dia da semana é Sexta-feira.");
                break;
            case 6:
                System.out.println("O dia da semana é Sábado.");
                break;
            default:
                System.out.println("O dia da semana é inválido.");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número <1-10>:");
        int entrada = scanner.nextInt();
        System.out.println(entrada);
        System.out.println(converterInteiroParaRomano(entrada));

    }
    public static String converterInteiroParaRomano(int numero) {

        switch(numero){
            case 1:
                return"I";
            case 2:
                return"II";
            case 3:
                return"III";
            case 4:
                return"IV";
            case 5:
                return"V";
            case 6:
                return"VI";
            case 7:
                return"VII";
            case 8:
                return"VIII";
            case 9:
                return"IX";
            case 10:
                return"X";
            default:
                return"Número inválido!";

        }

    }
}
