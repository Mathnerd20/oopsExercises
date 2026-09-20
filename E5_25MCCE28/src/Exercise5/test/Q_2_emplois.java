package Exercise5.test;

import Exercise5.employeeClasses.employee;
import Exercise5.employeeClasses.temporaryEmployee;
import Exercise5.employeeClasses.permanentEmployee;

public class Q_2_emplois {
    public static void main(String[] args){
        employee a = new employee(100, "tri", 2000);
        employee b = new employee(102, "gru", 3000);
        var perm = new permanentEmployee(a, 25);
        System.out.println("Employee Name: " + perm.getName() + " Employee id: " + perm.getID() + "\n");
        //attributes of employee displayed by object of permanent employee
        var temp = new temporaryEmployee(b, 12, 10);
        temp.display();
        System.out.printf("\n");
        perm.display();
        System.out.printf("\n");
        System.out.println("Salary of August for " + b.getName() + " is " + temp.monthSalary(20 /* 20 working days in august */));
    }
}
