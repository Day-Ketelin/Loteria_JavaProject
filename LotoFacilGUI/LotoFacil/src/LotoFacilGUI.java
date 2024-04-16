import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LotoFacilGUI  extends JFrame {

    private JPanel jogo = new JPanel();
    private JLabel label = new JLabel("Escolha qual jogo deseja jogar:");
    private JButton jBottonJogo1 = new JButton("1 - Acerte o Número de 0 a 100");
    private JButton jButtonJogo2 = new JButton("2 - Acerte a Letra de A à Z");
    private JButton jButtonJogo3 = new JButton("3 - Jogo Par ou Ímpar");

    public LotoFacilGUI() {
        this.setTitle("| LotoFácil - Interface Gráfica |");
        this.setSize(620, 480);
        jogo.setLayout(new FlowLayout(FlowLayout.CENTER, 95, 20));
        jogo.setBackground(new Color(225, 225, 210));
        jogo.setForeground(Color.black);

        label.setForeground(Color.DARK_GRAY);
        label.setVisible(true);
        label.setFont(new Font("Serif", Font.BOLD, 21));

        jBottonJogo1.setBackground(new Color(168, 25, 85));
        jBottonJogo1.setForeground(Color.pink);
        jBottonJogo1.setFont(new Font("Serif", Font.BOLD, 18));

        jButtonJogo2.setBackground(new Color(168, 25, 85));
        jButtonJogo2.setForeground(Color.pink);
        jButtonJogo2.setFont(new Font("Serif", Font.BOLD, 18));

        jButtonJogo3.setBackground(new Color(168, 25, 85));
        jButtonJogo3.setForeground(Color.pink);
        jButtonJogo3.setFont(new Font("Serif", Font.BOLD, 18));

        jBottonJogo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo1();
            }
        });

        jButtonJogo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo2();
            }
        });

        jButtonJogo3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jogo3();
            }
        });


        jBottonJogo1.setPreferredSize(new Dimension(400, 100));
        jButtonJogo2.setPreferredSize(new Dimension(400, 100));
        jButtonJogo3.setPreferredSize(new Dimension(400, 100));

        jogo.add(label);
        jogo.add(jBottonJogo1);
        jogo.add(jButtonJogo2);
        jogo.add(jButtonJogo3);


        this.getContentPane().add(jogo);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void jogo1() {
        Object numeroEscolhido = JOptionPane.showInputDialog(null, "Digite um número de 0 a 100: ", "Jogo 1", JOptionPane.INFORMATION_MESSAGE);
        int numeroEscolhidoInt = Integer.parseInt(numeroEscolhido.toString());
        Random random = new Random();
        int numeroPremiado = random.nextInt(101);

                    /**
                   // if (numeroEscolhido < 0 || numeroEscolhido > 100) {
                     //   JOptionPane.showMessageDialog (null, "Aposta inválida, gentileza escolher um número de 0 à 100." "Jogo1", JOptionPane.INFORMATION_MESSAGE);}*/

        if (numeroEscolhidoInt == numeroPremiado) {
            JOptionPane.showMessageDialog (null, "Parabéns! Você acertou o número premiado!", "Jogo1", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! O número sorteado foi: " + numeroPremiado, "Jogo 1", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jogo2() {
        String letraEscolhida = JOptionPane.showInputDialog(null, "Digite uma letra de A a Z para participar: ", "Jogo 2", JOptionPane.INFORMATION_MESSAGE);

        if (letraEscolhida.equalsIgnoreCase("D")) {
            JOptionPane.showMessageDialog(null, "Parabéns! Você acertou a letra premiada!", "Jogo 2", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena! A letra sorteada foi a D. ", "Jogo 2", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void jogo3() {

        JOptionPane.showMessageDialog(null, "O número sorteado será Par ou Ímpar?");
        String opcaoEscolhida = JOptionPane.showInputDialog(null, "Digite 1 para escolher ÍMPAR ou 2 para PAR: ");
        int opcaoEscolhidaInt = Integer.parseInt(opcaoEscolhida);

        Random random2 = new Random();
        int opcaoSorteada = random2.nextInt(101);

        if (opcaoSorteada / 2 == 0 && opcaoEscolhidaInt == 2) {
            JOptionPane.showMessageDialog(null,"O número sorteado é PAR. Parabéns, você acertou! ", "Jogo 3", JOptionPane.INFORMATION_MESSAGE);
        } else if (opcaoSorteada / 2 != 0 && opcaoEscolhidaInt == 1) {
            JOptionPane.showMessageDialog(null,"O número sorteado é ÍMPAR. Parabéns, você acertou! ", "Jogo 3", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Que pena, o número sorteado foi: " + opcaoSorteada, "Jogo 3", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new LotoFacilGUI();
    }
}





