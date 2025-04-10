class employeeData {
private double salary;
private double overTimePayment;
private double deduction;
private double totalSalary;

    public void setSalary(double Salary){
        salary = Salary;
    }

    public void setOverTimePayment(double overTime){
        overTimePayment = 50 * overTime;
    }

    public void setDeduction(double Deduction){
        deduction = Deduction;
    }

    public void setTotalSalary(){
        totalSalary = salary + overTimePayment - deduction;
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
    
    public double getTotalSalary(){
        return totalSalary;
    }

    public void EmployeesPayoutDetails(){
        System.out.println("Your salary: " + getSalary());

        System.out.println("Your overtime: " + getOverTimePayment());

        System.out.println("Your deduction: " + getDeduction());

        System.out.println("Your total salary: " + getTotalSalary());

    }
}
