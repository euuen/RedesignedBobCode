package func;

import java.util.Vector;

public class EmployeeTerminatorController {
    private String selectedEmployee;
    private Vector employees;
    private EmployeeList employeeList;
    private TerminateButton terminateButton;

    public void initBy(Vector employees) {
        this.employees = employees;
    }

    public void initBy(EmployeeList employeeList) {
        this.employeeList = employeeList;
    }

    public void initBy(TerminateButton terminateButton) {
        this.terminateButton = terminateButton;
    }

    public void selectionChanged(String employee){
        terminateButton.enableTerminate(employee != null);
        selectedEmployee = employee;
    }

    public void terminate(){
        if(selectedEmployee != null){
            employees.remove(selectedEmployee);
        }
        employeeList.setEmployeeList(employees);
        employeeList.clearSelection();
        terminateButton.enableTerminate(false);
    }

}
















