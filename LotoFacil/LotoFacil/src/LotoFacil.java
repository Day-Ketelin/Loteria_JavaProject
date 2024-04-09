import java.util.Random;
import java.util.Scanner;

public class LotoFacil {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo(a) ao jogo LotoFacil!");
int jogo = -1;
      do{
        System.out.println("Escolha qual jogo deseja jogar: ");
        System.out.println("1 - Acerte o Número de 0 a 100");
        System.out.println("2 - Acerte a Letra de A à Z");
        System.out.println("3 - Sair do jogo");
        jogo = scanner.nextInt();
        scanner.nextLine();
        switch (jogo) {


            //Jogo Número
            
          case 1:  System.out.println("Digite um número de 0 a 100 para participar: ");
           int numeroEscolhido = scanner.nextInt();
           scanner.nextLine();
           Random random = new Random();
           int numeroPremiado = random.nextInt(101);

             if (numeroEscolhido < 0 || numeroEscolhido > 100) { System.out.println("Aposta inválida, gentileza escolher um número de 0 à 100."); }

             else if (numeroEscolhido == numeroPremiado) {
                System.out.println("Parabéns! Você acertou o número premiado!");}

             else {System.out.println("Que pena! O número sorteado foi: " + numeroPremiado);}
             break;


            //Jogo Letra

          case 2: System.out.println("Digite uma letra de A a Z para participar: ");
            String letraEscolhida = scanner.nextLine();
            scanner.nextLine();
            if (letraEscolhida.equalsIgnoreCase("D")) {
              System.out.println("Parabéns! Você acertou a letra premiada!");
                }
            else { System.out.println("Que pena! A letra sorteada foi a D");
                 }
                  break;

                  case 3: System.out.println("Obrigado por jogar no LotoFacil!");
            scanner.close();
            break;

          default:
            System.out.println("Opção inválida. Tente novamente.");
      
      }
      } while (jogo != 4);
    } 
  
        }
  
    
  

