import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyWindow implements WindowListener {
    //refs

    public MyWindow() {
        //inits
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
		//close operations [streams]
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
