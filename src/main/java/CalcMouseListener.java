import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JList;

public class CalcMouseListener implements MouseListener
{
    @Override
    public void mouseClicked(MouseEvent e)
    {
        JList list = (JList)e.getSource();
        if(e.getClickCount() == 2)
        {
            if(list.getSelectedIndex() >= 0 && list.getSelectedIndex() <= 8)
            {
                Main.getNewCalc().getFormulaInput().setText(((FunctionListElement)(list.getSelectedValue())).getExpression());
                Main.getNewCalc().getFormulaInput().requestFocusInWindow();

                if (list.getSelectedIndex() <= 5) {
                    String textField = Main.getNewCalc().getFormulaInput().getText();
                    Main.getNewCalc().getFormulaInput().setCaretPosition(textField.length() - 1);
                }
            }
            else if(list.getSelectedIndex() == 9){
                Main.getNewCalc().getFormulaInput().setText(Main.getLastResult());
                Main.getNewCalc().getFormulaInput().requestFocusInWindow();
            }
        }
    }
    @Override
    public void mousePressed(MouseEvent e)
    {

    }

    @Override
    public void mouseReleased(MouseEvent e)
    {

    }

    @Override
    public void mouseEntered(MouseEvent e)
    {

    }

    @Override
    public void mouseExited(MouseEvent e)
    {

    }
}
