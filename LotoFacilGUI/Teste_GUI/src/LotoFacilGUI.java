import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

public class LotoFacilGUI {
    private JLabel LotoFacil;
    private JPanel LotoFacilGUI;
    private JButton a1AcerteONúmeroButton;
    private JLabel titulo;
    private JTextArea escolhaQualJogoDesejaTextArea;
    private JButton a2AcerteALetraButton;
    private JButton a3JogoParOuButton;

    public LotoFacilGUI() {
        a1AcerteONúmeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // a1AcerteONúmeroButton = new JPanel();
                Scanner scanner = new Scanner(System.in);

                System.out.print("Digite um número de 0 a 100 para participar: ");
                int numeroEscolhido = scanner.nextInt();
                scanner.nextLine();
                Random random = new Random();
                int numeroPremiado = random.nextInt(101);

                if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                    System.out.println("Aposta inválida, gentileza escolher um número de 0 à 100.");
                } else if (numeroEscolhido == numeroPremiado) {
                    System.out.println("Parabéns! Você acertou o número premiado!");
                } else {
                    System.out.println("Que pena! O número sorteado foi: " + numeroPremiado);
                }
                scanner.close();
            }

        });

        a2AcerteALetraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               // a2AcerteALetraButton = new JPanel();
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
        });

    }
        a3JogoParOuButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        //  a3JogoParOuButton = new JPanel();
            Scanner scanner = new Scanner(System.in);

            System.out.println("O número sorteado será Par ou Ímpar?");
            System.out.print("Digite 1 para escolher ÍMPAR ou 2 para PAR: ");
            int opcaoEscolhida = scanner.nextInt();
            scanner.nextLine();
            Random random2 = new Random();
            int opcaoSorteada = random2.nextInt(101);

            if (opcaoSorteada / 2 == 0 && opcaoEscolhida == 2) {
                System.out.println("O número sorteado é PAR. Parabéns, você acertou!");
            } else if (opcaoSorteada / 2 != 0 && opcaoEscolhida == 1) {
                System.out.println("O número sorteado é ÍMPAR. Parabéns, você acertou!");
            } else {
                System.out.println("Que pena, o número sorteado foi: " + opcaoSorteada);
            }
            scanner.close();
                    }
                });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    }

