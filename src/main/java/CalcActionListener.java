import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcActionListener implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals(Main.getNewCalc().getEvaluateButton().getText()))
        {
            Calculations.Calculate();
        }
    }
}
