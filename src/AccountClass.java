import java.util.Date;

public class AccountClass {
    public static void main(String[] args) {
        Account c = new Account(001,3000,2);
        System.out.println(c.withdraw(400));
        c.deposite(4000);
        

    }
}
class Account{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance= balance;
        this.annualInterestRate = annualInterestRate;

        Date date = new Date();
    }
    public boolean withdraw(double amt){
        if (balance < amt){
            return false;
        }
        else
            return true;
    }
    public void  deposite(double amt){
        System.out.println("your old balance "+balance);
        balance += amt;
        System.out.println("Your new balance "+balance);
    }
}
