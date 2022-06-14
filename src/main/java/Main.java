import javax.swing.*;

public class Main extends JFrame {
    public static final int HEIGHT = 390 ;
    public static final int WIDTH = 370;

    public static void main(String[] args) {
        new Main();
    }
public Main(){
    TICTacToe ticTacToe = new TICTacToe(0, 0, WIDTH, HEIGHT);
    this.setResizable(false);
    this.setLayout(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    this.add(ticTacToe);
    this.setSize(WIDTH, HEIGHT);
}

}
