import javax.swing.*;


// not es
// frame.pack() is used to make sure your JFrame fits its components nicely without you needing to specify an exact size manually, promoting a more flexible and responsive user interface design.
//Function: requestFocus() is a method used in graphical user interfaces (GUIs) to request that a specific component becomes the active focus component, allowing it to receive keyboard input and other events
public class Main {
    public static void main(String[] args) {
        int boardH = 640;
        int boardW = 360;
            JFrame frame = new JFrame("Flappy Bird");
            frame.setSize(boardW, boardH);
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            ImageIcon image = new ImageIcon("flappybird.png");
            frame.setIconImage(image.getImage());
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

              FlappyBird flappy=new FlappyBird();
              frame.add(flappy);
              frame.pack();
              flappy.requestFocus();
              frame.setVisible(true);

    }
}
