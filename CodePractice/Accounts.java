class BankAccount{
    public void withdraw(double amount){
        System.out.println("Withdrawing...");
    }

    public void Deposit(double amount){
        System.out.println("Depositing " + amount + " into bank account");
    }

    public void Deposit(double amount, String currency){
        System.out.println("Depositing " + amount + " " + currency + " into the bank account");
    }
}


class SavingsAccount extends BankAccount{
    double interestRate;

        public SavingsAccount(double interestRate){
            this.interestRate = interestRate;
        }
    
        @Override
        public void withdraw(double amount){
            System.out.println("Withdrawing " + amount + " from savings account with interest rate " + interestRate);
        }
} 


class CheckingAccount extends BankAccount{
    double overDraftLimit;

    public CheckingAccount(double overDraftLimit){
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    public void withdraw(double amount){
        System.out.println("Withdrawing " + amount + " from checking account with overdraft limit " + overDraftLimit);
    }
}

public class Accounts{
    
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();
        SavingsAccount savingsaccount = new SavingsAccount(.5);
        CheckingAccount checkingaccount = new CheckingAccount(100);

        bankaccount.withdraw(55);
        bankaccount.Deposit(20, "PHP");
        bankaccount.Deposit(20);
            System.out.println(" ");
        savingsaccount.withdraw(80);
        savingsaccount.Deposit(40, "PHP");
        savingsaccount.Deposit(40);
            System.out.println(" ");
        checkingaccount.withdraw(100);
        checkingaccount.Deposit(10, "   PHP");
        checkingaccount.Deposit(10);
    }
}
