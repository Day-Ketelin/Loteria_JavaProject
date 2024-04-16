import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n Bem vindo(a) ao jogo LotoFacil! \n");
        int jogo = -1;
        do {
            System.out.println("Escolha qual jogo deseja jogar: ");
            System.out.println("1 - Acerte o Número de 0 a 100");
            System.out.println("2 - Acerte a Letra de A à Z");
            System.out.println("3 - Jogo Par ou Ímpar");
            System.out.print("4 - Sair do jogo \n\n");
            jogo = scanner.nextInt();
            scanner.nextLine();
            switch (jogo) {


                //Jogo Número

                case 1:
                    //Scanner scanner = new Scanner(System.in);

                    System.out.print("Digite um número de 0 a 100 para participar: ");
                    int numeroEscolhido = scanner.nextInt();
                    scanner.nextLine();
                    Random random = new Random();
                    int numeroPremiado = random.nextInt(101);

                    if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                        System.out.print("Aposta inválida, gentileza escolher um número de 0 à 100.");
                    } else if (numeroEscolhido == numeroPremiado) {
                        System.out.println("Parabéns! Você acertou o número premiado! \n\n");
                    } else {
                        System.out.println("Que pena! O número sorteado foi: " + numeroPremiado + "\n\n");
                    }

                    break;


                //Jogo Letra

                case 2:  //scanner scanner = new Scanner(System.in);
                    System.out.print("Digite uma letra de A a Z para participar: ");
                    String letraEscolhida = scanner.nextLine();
                    scanner.nextLine();
                    if (letraEscolhida.equalsIgnoreCase("D")) {
                        System.out.println("Parabéns! Você acertou a letra premiada! \n\n");
                    } else {
                        System.out.println("Que pena! A letra sorteada foi a D. \n\n");

                    }
                    break;

                //Jogo Par ou Ímpar
                case 3:  //Scanner scanner = new Scanner(System.in);

                    System.out.println("O número sorteado será Par ou Ímpar?");
                    System.out.print("Digite 1 para escolher ÍMPAR ou 2 para PAR: ");
                    int opcaoEscolhida = scanner.nextInt();
                    scanner.nextLine();
                    Random random2 = new Random();
                    int opcaoSorteada = random2.nextInt(101);

                    if (opcaoSorteada / 2 == 0 && opcaoEscolhida == 2) {
                        System.out.println("O número sorteado é PAR. Parabéns, você acertou! \n\n");
                    } else if (opcaoSorteada / 2 != 0 && opcaoEscolhida == 1) {
                        System.out.println("O número sorteado é ÍMPAR. Parabéns, você acertou! \n\n");
                    } else {
                        System.out.println("Que pena, o número sorteado foi: " + opcaoSorteada + "\n\n");
                    }


                    //Sair do Jogo
                case 4:
                    System.out.println("Obrigado por jogar no LotoFacil! \n");

                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.\n");

            }
        } while (jogo != 4);
    }
}






    /*
    public static void aposta1(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 0 a 100 para participar: ");
        int numeroEscolhido = scanner.nextInt();
        scanner.nextLine();
        Random random = new Random();
        int numeroPremiado = random.nextInt(101);

        if (numeroEscolhido < 0 || numeroEscolhido > 100) { System.out.println("Aposta inválida, gentileza escolher um número de 0 à 100."); }

        else if (numeroEscolhido == numeroPremiado) {
            System.out.println("Parabéns! Você acertou o número premiado!");}

        else {System.out.println("Que pena! O número sorteado foi: " + numeroPremiado);}
        scanner.close();
    }



    public static void aposta2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma letra de A a Z para participar: ");
        String letraEscolhida = scanner.nextLine();
        scanner.nextLine();
        if (letraEscolhida.equalsIgnoreCase("D")) {
            System.out.println("Parabéns! Você acertou a letra premiada!");
        } else {
            System.out.println("Que pena! A letra sorteada foi a D.");
            scanner.close();
        }

    }
        public static void aposta3(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("O número sorteado será Par ou Ímpar?");
            System.out.print("Digite 1 para escolher ÍMPAR ou 2 para PAR: ");
            int opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();
            Random random2 = new Random();
            int opcaoSorteada = random2.nextInt(101);

            if (opcaoSorteada /2 == 0 && opcaoEscolhida == 2) { System.out.println("O número sorteado é PAR. Parabéns, você acertou!"); }

            else if (opcaoSorteada /2 != 0 && opcaoEscolhida == 1) {
                System.out.println("O número sorteado é ÍMPAR. Parabéns, você acertou!");}

            else {System.out.println("Que pena, o número sorteado foi: " + opcaoSorteada);}
            scanner.close();
        }


    }*/