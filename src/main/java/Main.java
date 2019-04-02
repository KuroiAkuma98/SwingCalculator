import javax.swing.SwingUtilities;

public class Main {

    public static ScienCalc getNewCalc()
    {
        return newCalculator;
    }
    public static String getLastCalculation() {
        return lastCalculation;
    }
    public static void setLastCalculation(String lastCalculation) {
        Main.lastCalculation = lastCalculation;
    }
    public static String getLastResult() {
        return lastResult;
    }
    public static void setLastResult(String lastResult) {
        Main.lastResult = lastResult;
    }
    private static ScienCalc newCalculator;
    private static String lastCalculation = "";
    private static String lastResult;

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run()
            {
                newCalculator = new ScienCalc();
                newCalculator.getFormulaInput().addKeyListener(new CalcKeyListener());
                newCalculator.getEvaluateButton().addActionListener(new CalcActionListener());
                new FunctionList(newCalculator.getFunctionList(),newCalculator.getFormulaInput(),newCalculator.getHistoryTextArea());
            }
        });
    }
}
