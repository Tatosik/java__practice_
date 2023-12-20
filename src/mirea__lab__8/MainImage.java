package mirea__lab__8;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class MainImage extends JComponent implements KeyListener, ActionListener{
    Image mem = new ImageIcon("src/mirea__lab__8/meme.jpeg").getImage();

    public void paint(Graphics g){
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(mem, 0, 0, null);
    }

    public static void main(String[] args){
        MainImage t = new MainImage();
        JFrame f = new JFrame("Meme image");
        f.setSize(300, 178);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new MainImage());
        f.add(t);
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
