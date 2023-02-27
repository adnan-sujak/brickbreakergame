import javax.swing.JFrame;

public class mainClass {
    public static void main(String[] args) throws Exception {
        

        JFrame obj = new JFrame();
        gamePlay gamePlay = new gamePlay();
        obj.setBounds(10,10,700,600);
        obj.setTitle("Adnan's Brick Breaker Game");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        

    }
}
