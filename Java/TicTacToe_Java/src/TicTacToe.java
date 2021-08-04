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

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));

        for(int i = 0; i < 9; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textF);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();
    }

    //Randomly assigns first turn to user
    public void firstTurn(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (random.nextInt(2) == 0){
            player1_turn = true;
            textF.setText("X Turn");
        } else {
            player1_turn = false;
            textF.setText("O Turn");
        }
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
        for (int i=0; i<9; i++){
            if (e.getSource()==buttons[i]){
                if (player1_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(255,0,0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textF.setText("O Turn");
                        check();
                    }
                } else {
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textF.setText("X Turn");
                        check();
                    }
                }
            }
        }
    }
}
