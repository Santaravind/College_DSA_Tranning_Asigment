package Assigment.Fourth_13_to_15June;
class Account{
    long accountNumber;
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public Account(long accountNumber, double balance) {
        if (balance<0){
            System.out.println("Balance is not negative : ");
        }else{
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

    }
}
class SavingAccount extends  Account{

    double interestRate;

    public SavingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }


    double interestRate(){
        return  interestRate =  balance*10/100;
    }

    void display(){
        System.out.println("Account number : "+ accountNumber);
        System.out.println("Balance : "+ (balance+interestRate) );
    }


}
public class Account_And_SavingsAccount {
    public static void main(String[] args) {
  SavingAccount s1=new SavingAccount(453246789090L,900.0);
        System.out.println("Interest rate earning : " + s1.interestRate());

        s1.display();
    }
}
