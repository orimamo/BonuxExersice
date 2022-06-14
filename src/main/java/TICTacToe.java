import javax.swing.*;
import java.awt.*;

public class TICTacToe extends JPanel {
//    private ImageIcon board;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private int player;
    private int score1,score2;


    public TICTacToe(int x,int y,int width,int height) {
        this.setBounds(x, y, width, height);
        this.setDoubleBuffered(true);
        this.setLayout(null);
        this.setRequestFocusEnabled(true);
        boolean isRunning = true;
//        this.board=new ImageIcon("tictactao.png");
        b1 = new JButton();
        b1.setBounds(0, 0, 110, 110);
        this.add(b1);
        b2 = new JButton();
        b2.setBounds(b1.getWidth() + 10, 0, 110, 110);
        this.add(b2);
        b3 = new JButton();
        b3.setBounds(b2.getX() + b2.getWidth() + 10, 0, 110, 110);
        this.add(b3);
        b4 = new JButton();
        b4.setBounds(0, b1.getHeight() + 10, 110, 110);
        this.add(b4);
        b5 = new JButton();
        b5.setBounds(b1.getWidth() + 10, b1.getHeight() + 10, 110, 110);
        this.add(b5);
        b6 = new JButton();
        b6.setBounds(b2.getX() + b2.getWidth() + 10, b1.getHeight() + 10, 110, 110);
        this.add(b6);
        b7 = new JButton();
        b7.setBounds(0, b4.getHeight() + b4.getY() + 10, 110, 110);
        this.add(b7);
        b8 = new JButton();
        b8.setBounds(b1.getWidth() + 10, b4.getHeight() + b4.getY() + 10, 110, 110);
        this.add(b8);
        b9 = new JButton();
        b9.setBounds(b2.getX() + b2.getWidth() + 10, b4.getHeight() + b4.getY() + 10, 110, 110);
        this.add(b9);
        player = 0;
//        boolean winner=checkWinner();
//        while (isRunning){

        b1.addActionListener((event) -> {
            if (b1.getText().equals("")) {
                if (player % 2 == 0) {
                    b1.setText("O");
                    player++;
                } else {
                    b1.setText("X");
                    player++;
                }
            }
        });
        b2.addActionListener((event) -> {
            if (b2.getText().equals("")) {
                if (player % 2 == 0) {
                    b2.setText("O");
                    player++;
                } else {
                    b2.setText("X");
                    player++;
                }
            }
        });
        b3.addActionListener((event) -> {
            if (b3.getText().equals("")) {
                if (player % 2 == 0) {
                    b3.setText("O");
                    player++;
                } else {
                    b3.setText("X");
                    player++;
                }
            }
        });
        b4.addActionListener((event) -> {
            if (b4.getText().equals("")) {
                if (player % 2 == 0) {
                    b4.setText("O");
                    player++;
                } else {
                    b4.setText("X");
                    player++;
                }
            }
        });
        b5.addActionListener((event) -> {
            if (b5.getText().equals("")) {
                if (player % 2 == 0) {
                    b5.setText("O");
                    player++;
                } else {
                    b5.setText("X");
                    player++;
                }
            }
        });
        b6.addActionListener((event) -> {
            if (b6.getText().equals("")) {
                if (player % 2 == 0) {
                    b6.setText("O");
                    player++;
                } else {
                    b6.setText("X");
                    player++;
                }
            }
        });
        b7.addActionListener((event) -> {
            if (b7.getText().equals("")) {
                if (player % 2 == 0) {
                    b7.setText("O");
                    player++;
                } else {
                    b7.setText("X");
                    player++;
                }
            }
        });
        b8.addActionListener((event) -> {
            if (b8.getText().equals("")) {
                if (player % 2 == 0) {
                    b8.setText("O");
                    player++;
                } else {
                    b8.setText("X");
                    player++;
                }
            }
        });
        b9.addActionListener((event) -> {
            if (b9.getText().equals("")) {
                if (player % 2 == 0) {
                    b9.setText("O");
                    player++;
                } else {
                    b9.setText("X");
                    player++;
                }
            }
        });

        }





    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
    }
    public boolean checkWinner(){
        boolean over=false;
        while (player!=9){
            if(b1.getText().equals("0")&&b2.getText().equals("0")&&b3.getText().equals("0")||b1.getText().equals("X")&&b2.getText().equals("X")&&b3.getText().equals("X")){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b1.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b1.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b4.getText().equals("0")&&b5.getText().equals("0")&&b6.getText().equals("0")||b4.getText().equals("X")&&b5.getText().equals("X")&&b6.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b4.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b4.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b7.getText().equals("0")&&b8.getText().equals("0")&&b9.getText().equals("0")||b7.getText().equals("X")&&b8.getText().equals("X")&&b9.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b7.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b7.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b4.getText().equals("0")&&b1.getText().equals("0")&&b7.getText().equals("0")||b4.getText().equals("X")&&b1.getText().equals("X")&&b7.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b4.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b4.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b2.getText().equals("0")&&b5.getText().equals("0")&&b8.getText().equals("0")||b2.getText().equals("X")&&b5.getText().equals("X")&&b8.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b2.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b2.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b3.getText().equals("0")&&b6.getText().equals("0")&&b9.getText().equals("0")||b3.getText().equals("X")&&b6.getText().equals("X")&&b9.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b3.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b3.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b1.getText().equals("0")&&b5.getText().equals("0")&&b9.getText().equals("0")||b1.getText().equals("X")&&b5.getText().equals("X")&&b9.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b1.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b1.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else if ((b3.getText().equals("0")&&b5.getText().equals("0")&&b7.getText().equals("0")||b3.getText().equals("X")&&b5.getText().equals("X")&&b7.getText().equals("X"))){
                JOptionPane.showMessageDialog(null,
                        "the winner is" + b3.getText(),
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                if (b3.getText().equals("O")){
                    score1++;
                    score2--;
                }
                else {
                    score1--;
                    score2++;
                }
                over=true;
                break;
            }
            else {
                JOptionPane.showMessageDialog(null,
                        "there is no winner ,its pair",
                        "the winner",
                        JOptionPane.ERROR_MESSAGE);
                over=true;
                break;
            }
        }
return over;
    }


}
