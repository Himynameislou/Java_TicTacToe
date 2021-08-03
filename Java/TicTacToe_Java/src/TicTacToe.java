import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textF = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    /**
     * Constructor
     */
    TicTacToe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textF.setBackground(new Color(25,25,25));
        textF.setForeground(new Color(25,255,0));
        textF.setFont(new Font("Ink Free", Font.BOLD, 75));
        textF.setHorizontalAlignment(JLabel.CENTER);
        textF.setText("Tic-Tac-Toe");
        textF.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        title_panel.add(textF);
        frame.add(title_panel);
    }

    //Randomly assigns first turn to user
    public void firstTurn(){

    }

    //Checks for winning conditions
    public void check(){

    }

    //Scenario where X Wins
    public void xWins(int a, int b, int c){
    }

    //Scenario where O Wins
    public void oWins(int a, int b, int c){
    }



    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
