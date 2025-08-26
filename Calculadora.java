import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora{
    public static void main(String args[]){
        //Criar janela.
        JFrame frame = new JFrame("Calculadora");
        //Definir tamanho da janela.
        frame.setSize(350, 500);
        //Definir botão de sair da janela.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Criar visor.
        JTextField visor = new JTextField();
        //Impedir edição direta no visor.
        visor.setEditable(false);
        //Alinhar o visor à direita.
        visor.setHorizontalAlignment(JTextField.RIGHT);
        //Configurar o tamanho do visor.
        visor.setPreferredSize(new Dimension(340, 40));
        //Adicionar o visor no topo da janela.
        frame.add(visor, "North");

        //Criar painel de layout.
        JPanel painel = new JPanel(new GridLayout(5, 4, 2, 2));
        
        //Definir margens do painel.
        painel.setBorder(BorderFactory.createEmptyBorder(4, 2, 2,2));

        //Criação de botões.
        JButton buttonZero = new JButton("0");
        JButton buttonOne = new JButton("1");
        JButton buttonTwo = new JButton("2");
        JButton buttonThree = new JButton("3");
        JButton buttonFour = new JButton("4");
        JButton buttonFive = new JButton("5");    
        JButton buttonSix = new JButton("6");
        JButton buttonSeven = new JButton("7");
        JButton buttonEight = new JButton("8");
        JButton buttonNine = new JButton("9");
        JButton buttonMultiplicator = new JButton("x");
        JButton buttonDivisor = new JButton("/");
        JButton buttonMinus = new JButton("-");
        JButton buttonSum = new JButton("+");
        JButton buttonEqual = new JButton("=");
        JButton buttonClear = new JButton("C");
        JButton buttonPercentage = new JButton("%");
        JButton buttonParenthesis = new JButton("()");
        JButton buttonNegative = new JButton("+/-");
        JButton buttonDot = new JButton(".");
        
        //Criar evento de clique.
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt){
                JButton botaoClicado = (JButton) evt.getSource();
                visor.setText(visor.getText() + botaoClicado.getText());
            }
        };

        //Adicionar o evento de clique aos botões.
        buttonZero.addActionListener(al);
        buttonOne.addActionListener(al);
        buttonTwo.addActionListener(al);
        buttonThree.addActionListener(al);
        buttonFour.addActionListener(al);
        buttonFive.addActionListener(al);
        buttonSix.addActionListener(al);
        buttonSeven.addActionListener(al);
        buttonEight.addActionListener(al);
        buttonNine.addActionListener(al);

        //Personalizar fonte dos botões.
        buttonZero.setFont(new Font("arial", 1, 26));
        buttonOne.setFont(new Font("arial", 1, 26));
        buttonTwo.setFont(new Font("arial", 1, 26));
        buttonThree.setFont(new Font("arial", 1, 26));
        buttonFour.setFont(new Font("arial", 1, 26));
        buttonFive.setFont(new Font("arial", 1, 26));
        buttonSix.setFont(new Font("arial", 1, 26));
        buttonSeven.setFont(new Font("arial", 1, 26));
        buttonEight.setFont(new Font("arial", 1, 26));
        buttonNine.setFont(new Font("arial", 1, 26));
        buttonMultiplicator.setFont(new Font("arial", 1, 26));
        buttonDivisor.setFont(new Font("arial", 1, 26));
        buttonMinus.setFont(new Font("arial", 1, 26));
        buttonSum.setFont(new Font("arial", 1, 26));
        buttonClear.setFont(new Font("arial", 1, 26));
        buttonEqual.setFont(new Font("arial", 1, 26));

        //Adicionar botões no painel de layout.
        painel.add(buttonClear);
        painel.add(buttonParenthesis);
        painel.add(buttonPercentage);
        painel.add(buttonDivisor);

        painel.add(buttonSeven);
        painel.add(buttonEight);
        painel.add(buttonNine);
        painel.add(buttonMultiplicator);

        painel.add(buttonFour);
        painel.add(buttonFive);
        painel.add(buttonSix);
        painel.add(buttonMinus);

        painel.add(buttonOne);
        painel.add(buttonTwo);
        painel.add(buttonThree);
        painel.add(buttonSum);

        painel.add(buttonNegative);
        painel.add(buttonZero);
        painel.add(buttonDot);
        painel.add(buttonEqual);

        //Personalizar cor dos botões.
        buttonClear.setBackground(Color.RED);
        buttonEqual.setBackground(Color.GREEN);
        buttonSum.setBackground(Color.GRAY);
        buttonDivisor.setBackground(Color.GRAY);
        buttonMultiplicator.setBackground(Color.GRAY);
        buttonMinus.setBackground(Color.GRAY);

        //Adicionar painel na janela.
        frame.add(painel, "Center");

        //Deixar a janela visível.
        frame.setVisible(true);

    }
}