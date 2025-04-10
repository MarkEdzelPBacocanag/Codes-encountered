import java.util.*;

public class TestEmployeeData {


    public static void main(String[] args) {
        employeeData employees = new employeeData();

    Scanner scan;
            scan = new Scanner (System.in);

    System.out.println("Please Enter your Salary: ");
            String s = scan.nextLine();
        employees.setSalary(Double.parseDouble(s));
        
    System.out.println("Enter deduction: ");
            String deductionInput = scan.nextLine();
            if(!deductionInput.isEmpty()){
                double deduction = Double.parseDouble(deductionInput);
                employees.setDeduction(deduction);
            }else{
                employees.setDeduction(0);
            }
        

    System.out.println("Enter OverTime (Only if you have OT): ");
            double overTime = Double.parseDouble(scan.nextLine());
        employees.setOverTimePayment(overTime);

        employees.setTotalSalary();
        scan.close();
        employees.EmployeesPayoutDetails();
    }
    
}

