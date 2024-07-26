package func;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.util.Vector;

public class EmployeeList extends JList {
    private EmployeeTerminatorController controller;
    private JFrame frame;

    public EmployeeList(EmployeeTerminatorController controller, JFrame frame){
        this.controller = controller;
        controller.initBy(this);
        this.frame = frame;

        setName("EmployeeList");
        addListSelectionListener(
            new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent e) {
                    if (!e.getValueIsAdjusting()) {
                        controller.selectionChanged((String)getSelectedValue());
                    }
                }
            }
        );
    }

    public void setEmployeeList(Vector employees){
        setListData(employees);
        frame.pack();
        frame.getContentPane().setSize(300,600);
        frame.setBounds(500,500,300,600);
    }

    public void clearEmployeeList(){
        clearSelection();
    }

}















