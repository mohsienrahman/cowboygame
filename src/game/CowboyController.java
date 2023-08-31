package game;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CowboyController implements KeyListener {

    Cowboy cowboy;

    public CowboyController(Cowboy cowboy){
        this.cowboy = cowboy;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("key pressed " + e.getKeyChar());

        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            cowboy.startWalking(-4);
        } else if (code == KeyEvent.VK_D) {
            cowboy.startWalking(4);
        } else if (code == KeyEvent.VK_SPACE) {
            cowboy.jump(12);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        int code = e.getKeyCode();
        if (code == KeyEvent.VK_A) {
            cowboy.stopWalking();
        } else if (code == KeyEvent.VK_D) {
            cowboy.stopWalking();
        }

    }
}
