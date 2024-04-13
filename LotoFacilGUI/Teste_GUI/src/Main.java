/*import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {


    private JPanel painel = new JPanel();
    private JButton jButtonJogar = new JButton("Jogar");
    private JTextField jTextFieldTexto;
    private JLabel jLabelMensagem = new JLabel("LotoFacil $ R $");


    public Main() {
        this.setTitle("Bem vindo(a) ao jogo LotoFacil!");
        this.setSize(400, 200);
        //escolherJogo();
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir a janela

    }


    private void escolherJogo(String[] args) {
        painel.setLayout(new GridLayout(4, 1));
        painel.add(jLabelMensagem);
        painel.add(jButtonJogar);
        this.add(painel);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(255, 255, 255));
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela

        String codigo = JOptionPane.showInputDialog("Escolha qual jogo deseja jogar:", JOptionPane.QUESTION_MESSAGE);

        if (codigo == null || !codigo.matches("[0-4]*")) return;
        JOptionPane.showMessageDialog(painel, "" + Integer.parseInt(codigo));


        if (jTextFieldTexto.getText().trim().equals("")) {

        }
    }

    private void ExemploJanela() {
        this.setTitle("Texto da Barra de Título");
        this.setSize(300, 200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 20));
        painel.setBackground(new Color(255, 255, 255));
        painel.add(jTextFieldTexto);
        painel.add(jButtonJogar);
        painel.add(jLabelMensagem);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setVisible(true); // Exibir janela

        String codigo = JOptionPane.showInputDialog(null, "Informe o código do produto",
                "Cadastro de Produtos", JOptionPane.QUESTION_MESSAGE);

        if (codigo == null || !codigo.matches("[0-9]*")) return;
        JOptionPane.showMessageDialog(painel, "" + Integer.parseInt(codigo));


        if (jTextFieldTexto.getText().trim().equals("")) {
            /*
             * No lugar do valor null no método JOptionPane.showMessageDialog(), você pode
             * passar um componente específico como o "pai" da janela de diálogo. Isso fará
             * com que a caixa de diálogo apareça no centro do componente pai, em vez de no
             * centro da tela. Além disso, você pode usar diferentes tipos de componentes
             * para personalizar a aparência da janela de diálogo.
             */

/*
            JOptionPane.showMessageDialog(null, "Falta informar o código do produto.",
                    "Cadastro de Produtos", JOptionPane.WARNING_MESSAGE);
            jTextFieldTexto.requestFocus();
        }

        if (JOptionPane.showConfirmDialog(null, "Confirmar a exclusão do produto"
                        + jTextFieldTexto.getText().trim() + "?", "Cadastro de Produtos",
                JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
            return;
        }

    }
}*/

