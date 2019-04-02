import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CalcKeyListener implements KeyListener
{
    public void keyTyped(KeyEvent e) {}
    public void keyPressed(KeyEvent e) {}
    public void keyReleased(KeyEvent e)
    {
        if(e.getKeyCode() == KeyEvent.VK_UP)
        {
            Main.getNewCalc().getFormulaInput().setText(Main.getLastCalculation());
        }
        if(e.getKeyCode() == KeyEvent.VK_ENTER)
        {
            Calculations.Calculate();
        }
    }
}
