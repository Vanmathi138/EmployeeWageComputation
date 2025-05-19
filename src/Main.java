//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee" +
                "Wage Computation" +
                "Program on Master Branch");
        EmployeeWageComputation employeeWageComputation = new EmployeeWageComputation();
        employeeWageComputation.checkAttendance();

    }
}
class EmployeeWageComputation {
    public static final int is_present = 1;

    void checkAttendance(){
        double randomValue = Math.floor(Math.random()*10)%2;
        int attendance = (int) randomValue;

        if(attendance == is_present){
            System.out.println("Employee is present");
        }else {
            System.out.println("Employee is absent");
        }
    }
}