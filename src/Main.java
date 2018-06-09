import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float saldo = 1500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Categoria:");
        int categoria = scanner.nextInt();

        switch (categoria) {
            case 1: {
                System.out.println("Pistols");

                Scanner var = new Scanner(System.in);
                System.out.println("Produto:");
                int produtos = var.nextInt();

                switch (produtos) {
                    case 1: {
                        System.out.println("Desert Eagle");
                        saldo -= 250;
                        break;
                    }
                    case 2: {
                        System.out.println("Glock");
                        saldo -= 150;
                        break;
                    }
                    case 3: {
                        System.out.println("Revolver");
                        saldo -= 200;
                        break;
                    }
                    case 4: {
                        System.out.println("Dual Berettas");
                        saldo -= 300;
                        break;
                    }
                    case 5: {
                        System.out.println(".45");
                        saldo -= 210;
                        break;
                    }
                }
                break;
            }

            case 2: {
                System.out.println("Submachine guns");


                Scanner var2 = new Scanner(System.in);
                System.out.println("Produto:");
                int produtos = var2.nextInt();

                switch (produtos) {
                    case 1: {
                        System.out.println("P90");
                        saldo -= 500;
                        break;
                    }
                    case 2: {
                        System.out.println("UMP-45");
                        saldo -= 400;
                        break;
                    }
                    case 3: {
                        System.out.println("MAC-10");
                        saldo -= 450;
                        break;
                    }
                    case 4: {
                        System.out.println("MP7");
                        saldo -= 500;
                        break;
                    }
                    case 5: {
                        System.out.println("MP9");
                        saldo -= 475;
                        break;
                    }
                }
                break;
            }

            case 3: {
                System.out.println("Assault Rifles");

                Scanner var3 = new Scanner(System.in);
                System.out.println("Produto:");
                int produtos = var3.nextInt();

                switch (produtos) {
                    case 1: {
                        System.out.println("M4A1");
                        saldo -= 800;
                        break;
                    }
                    case 2: {
                        System.out.println("FAMAS");
                        saldo -= 900;
                        break;
                    }
                    case 3: {
                        System.out.println("SCAR-H");
                        saldo -= 1050;
                        break;
                    }
                    case 4: {
                        System.out.println("GALIL");
                        saldo -= 960;
                        break;
                    }
                    case 5: {
                        System.out.println("AK-47");
                        saldo -= 999;
                        break;
                    }
                }
                break;
            }

            case 4: {
                System.out.println("Lightmachine guns");

                Scanner var4 = new Scanner(System.in);
                System.out.println("Produto:");
                int produtos = var4.nextInt();

                switch (produtos) {
                    case 1: {
                        System.out.println("Negev");
                        saldo -= 455;
                        break;
                    }
                    case 2: {
                        System.out.println("M249");
                        saldo -= 555;
                        break;
                    }
                    case 3: {
                        System.out.println("M60");
                        saldo -= 655;
                        break;
                    }
                    case 4: {
                        System.out.println("M2");
                        saldo -= 755;
                        break;
                    }
                    case 5: {
                        System.out.println("L-SAT");
                        saldo -= 855;
                        break;
                    }
                }
                break;
            }

            case 5: {
                System.out.println("Sniper Rifles");

                Scanner var5 = new Scanner(System.in);
                System.out.println("Produto:");
                int produtos = var5.nextInt();

                switch (produtos) {
                    case 1: {
                        System.out.println("AWP");
                        saldo -= 1200;
                        break;
                    }
                    case 2: {
                        System.out.println("SSG");
                        saldo -= 1025;
                        break;
                    }
                    case 3: {
                        System.out.println("G3SG1");
                        saldo -= 1045;
                        break;
                    }
                    case 4: {
                        System.out.println("Balista");
                        saldo -= 1400;
                        break;
                    }
                    case 5: {
                        System.out.println("Kar-98");
                        saldo -= 1001;
                        break;
                    }
                }
                break;
            }
            default:
                System.out.println("Categoria inválida!!!");
                
        }
        System.out.println("O seu saldo é :" + saldo);
    }
}
















/*
        System.out.println("Hello Word");

        String nome = "Lucas Lourenço";
        int numero = 6;
        int idade = 19;
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
                System.out.println("O dia da semana é inválido.");

    Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número <1-10>:");
    int entrada = scanner.nextInt();
        System.out.println(entrada);
        System.out.println(converterInteiroParaRomano(entrada));
        for (int i = 0;i <= 10;i++){
        System.out.println(converterInteiroParaRomano(entrada));
    }
    int i = 0;
        while(i <= 10){
        System.out.println(converterInteiroParaRomano(entrada));
        i ++;
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
        }*/