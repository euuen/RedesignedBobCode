package func;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerminateButton extends JButton {
    private EmployeeTerminatorController controller;

    public TerminateButton(EmployeeTerminatorController controller) {
        this.controller = controller;
        controller.initBy(this);
        setName("Terminate");
        enableTerminate(false);
        addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.terminate();
            }
        });
    }

    public void enableTerminate(boolean enable){
        setEnabled(enable);
    }

}



















