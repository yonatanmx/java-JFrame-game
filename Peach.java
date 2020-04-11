import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class Peach extends JPanel {
    int x =0;
    int y =0;
    int xn = 1;
    int yn = 1;
    private void moveBall() {
    	if(x > 255 || x < 0) {
    		xn *= -1;
    	}
    	if(y > 340 || y < 0) {
    		yn *= -1;
    	}
        x+=xn;
        y+=yn;
    }

    public void paint (Graphics g) {
        super.paint(g);
        int s = 2;
        g.fillRect(x*s, y*s, 30, 30);
    }

    //public static void main(String[] args) {
        //JFrame frame = new JFrame("Animation");
        //Peach game = new Peach();
       // frame.add(game);
       // frame.setVisible(true);
       // frame.setSize(300,400);
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        
    //}
}