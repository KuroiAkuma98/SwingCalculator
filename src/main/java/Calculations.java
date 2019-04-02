import org.mariuszgromada.math.mxparser.Expression;
import java.text.MessageFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class Calculations
{
    public static void Calculate()
    {
        String lastCalculation = Main.getNewCalc().getFormulaInput().getText();
        Expression expression = new Expression(lastCalculation);
        Main.setLastCalculation(lastCalculation);

        if(expression.checkSyntax())
        {
            double calculation = expression.calculate();
            String result = MessageFormat.format("{2} = {0} \n Obliczono o godzinie {1,time}, dnia {1,date}. \n",calculation, new Date(), Main.getLastCalculation());
            Main.getNewCalc().getHistoryTextArea().append(result);
            Main.getNewCalc().getFormulaInput().setText("");
            String last_Result = "" ;
            last_Result += calculation;
            Main.setLastResult(last_Result);
        }
        else
        {
            String errorMessage = expression.getErrorMessage();
            JOptionPane.showMessageDialog(null, "Złe argumenty", "Error", JOptionPane.ERROR_MESSAGE);
            Main.getNewCalc().getFormulaInput().setText("");
        }
    }
}
