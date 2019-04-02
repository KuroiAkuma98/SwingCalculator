import javax.swing.*;
import java.awt.event.ActionEvent;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ScienCalc {
    private JTextArea History_text_area;
    private JScrollPane scrollContainerPanel;
    private JPanel mainPanel;
    private JTextField formulaInput;
    private JList<FunctionListElement> functionList;
    private JButton evalButton;

    public JTextArea getHistoryTextArea() {
        return History_text_area;
    }

    public JTextField getFormulaInput() {
        return formulaInput;
    }

    public JList getFunctionList(){
        return functionList;
    }

    public JButton getEvaluateButton() {
        return evalButton;
    }



    private void createUIComponents() {


        // TODO: place custom component creation code here
        mainPanel = new JPanel();

        JFrame jframe = new JFrame();
        jframe.setTitle("Kalkulator");
        jframe.setSize(500,400);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);

        JMenuBar jmenubar = new JMenuBar();
        JMenu jmenu = new JMenu("Options");
        jframe.setJMenuBar(jmenubar);
        jmenubar.setVisible(true);



        mainPanel.setVisible(true);

        JMenuItem reset = jmenu.add(new AbstractAction("Reset") {
            public void actionPerformed(ActionEvent e) {
                History_text_area.setText("");
                formulaInput.setText("");
            }
        });
        JMenuItem exit = jmenu.add(new AbstractAction("Exit") {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jmenu.add(reset);
        jmenu.add(exit);
        jmenubar.add(jmenu);

        jframe.setContentPane(mainPanel);

    }
}
