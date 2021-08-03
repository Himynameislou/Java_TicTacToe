import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TicTacToe implements ActionListener {
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    /**
     * Constructor
     */
    TicTacToe(){

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
