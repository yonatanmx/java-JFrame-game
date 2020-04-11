import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class MyGame {

    public MyGame() {

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);
        Peach mag = new Peach();
        frame.addKeyListener(new KeyListener() {

                @Override
                public void keyTyped(KeyEvent e) {
                    // TODO Auto-generated method stub

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    int keyCode = e.getKeyCode();

                    switch (keyCode) {
                        case KeyEvent.VK_UP:
                            //when pressed up
                            mag.y-=1;
                            break;
                        case KeyEvent.VK_DOWN:
                            //when pressed down
                            mag.y+=1;
                            break;
                        case KeyEvent.VK_RIGHT:
                            //when pressed right
                            mag.x+=1;
                            break;
                        case KeyEvent.VK_LEFT:
                            //when pressed left
                            mag.x-=1;
                            break;
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    // TODO Auto-generated method stub

                }

            });
        while (true) {
            frame.add(mag);
            mag.repaint();
            try {
                 Thread.sleep(100);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            //mag.moveBall();
            
        
        
            
        }

        //frame.add(mag);
    }

    public static void main(String[] args) {
        
        new MyGame();
    }

}