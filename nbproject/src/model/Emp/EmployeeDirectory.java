/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Emp;

import java.util.ArrayList;

/**
 *
 * @author dipikam
 */
public class EmployeeDirectory {
    
    ArrayList<Employee> employeeDir;

    public EmployeeDirectory() {
        this.employeeDir = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeDir() {
        return employeeDir;
    }

    public void setEmployeeDir(ArrayList<Employee> employeeDir) {
        this.employeeDir = employeeDir;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeDir.add(employee);
        return employee;
    }
    
}
