public class EmployeeData{
private double salary;
private double overTimePayment;
private double deduction;

    public void setSalary(double Salary, double overTime){
        this.salary = Salary;
        this.overTimePayment = 50 * overTime;
    }

    public void setDeduction(double Deduction){
        this.deduction = salary - Deduction;
    }

    public double getSalary(){
        return salary;
    }

    public double getOverTimePayment(){
        return overTimePayment;
    }

    public double getDeduction(){
        return deduction;
    }

    public void EmployeesPayoutDetails(){
        System.out.println("Your salary: " + getSalary());

        System.out.println("Your overtime: " + getClass());

        if(deduction != 0){
            System.out.println("You salary is deducted by: " + getDeduction());
        }

    }
}