import javax.swing.*;

public class FunctionList extends JList
        {
            public FunctionList(JList<FunctionListElement> list, JTextField textField, JTextArea textArea)
            {
                FunctionListElement sinusFun = new FunctionListElement("Sinus", "sin()");
                FunctionListElement cosinusFun = new FunctionListElement("Cosinus", "cos()");
                FunctionListElement tangensFun = new FunctionListElement("Tangens", "tan()");
                FunctionListElement logarithmFun = new FunctionListElement("Logaithm","log()");
                FunctionListElement moduloFun = new FunctionListElement("Modulo","mod()");
                FunctionListElement worpitzkyNumberFun = new FunctionListElement("Worpitzky Number","Worp()");
                FunctionListElement piFun = new FunctionListElement("PI","pi");
                FunctionListElement eulerNumberFun = new FunctionListElement("Euler's number","e");
                FunctionListElement catalanConstantFun = new FunctionListElement("Catalan's constant","[Kat]");
                FunctionListElement lastResultFun = new FunctionListElement("Last result","last_result");

                DefaultListModel<FunctionListElement> listModel = new DefaultListModel<>();
                listModel.addElement(sinusFun);
                listModel.addElement(cosinusFun);
                listModel.addElement(tangensFun);
                listModel.addElement(logarithmFun);
                listModel.addElement(moduloFun);
                listModel.addElement(worpitzkyNumberFun);
                listModel.addElement(piFun);
                listModel.addElement(eulerNumberFun);
                listModel.addElement(catalanConstantFun);
                listModel.addElement(lastResultFun);

                list.setModel(listModel);
                list.addMouseListener(new CalcMouseListener());

            }

        }
