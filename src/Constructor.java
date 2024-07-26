import func.EmployeeList;
import func.EmployeeTerminatorController;
import func.TerminateButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Vector;

public class Constructor {
    private EmployeeTerminatorController controller;
    private JFrame frame;
    private Vector emploees = new Vector();

    public Constructor() {
        loadEmployees();
        initController();
        initFrame();
        initEmployeeList();
        initEmployeeButton();
        showFrame();
    }

    private void loadEmployees() {
        emploees.add("Robert");
        emploees.add("Bob");
        emploees.add("Martin");
    }

    private void initController() {
        controller = new EmployeeTerminatorController();
        controller.initBy(emploees);
    }

    private void initFrame(){
        frame = new JFrame("Employee Terminator");

        frame.setSize(300,600);
        frame.getContentPane().setLayout(new FlowLayout());
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                for(int i = 0; i < emploees.size(); i++) {
                    String s = (String) emploees.elementAt(i);
                    System.out.println(s);
                }
                System.exit(0);
            }
        } );
    }

    private void initEmployeeList() {
        EmployeeList employeesList = new EmployeeList(controller, frame);
        employeesList.setEmployeeList(emploees);
        frame.getContentPane().add(employeesList);
    }

    private void initEmployeeButton() {
        JButton terminateButton = new TerminateButton(controller);
        frame.getContentPane().add(terminateButton);
    }

    private void showFrame() {
        frame.pack();
        frame.getContentPane().setSize(300,600);
        frame.setBounds(500,400,300,600);
        frame.setVisible(true);
    }
}


















