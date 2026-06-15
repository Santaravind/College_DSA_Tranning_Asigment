package Assigment.Fourth_13_to_15June;

class  ATM{
    private     long accountNumber;
    private     double balance;

    public long getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }



    public ATM(long accountNumber, double balance) {
        if (balance<0) {
//            System.out.println("Balance is not negative !!");
            System.out.println("Account not created with negative balance");

        }
        else {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }
    }

    public void deposit(double amount){
        if (amount<0){
            System.out.println("Amount is not negative !!");
        }
        else {
            balance += amount;
            System.out.println("After bePosit : " + amount + "\n" + "The total balance is your account : " + balance);
        }
    }

    public void withdraw(double amount){
        if (balance<amount){
            System.out.println("the balance is insufficient");
        }else {
            balance-=amount;
            System.out.println("new with draw of amount : "+amount +"\n"+"Your current balance : " + balance);
        }
    }
}
public class ATM_Account {
    public static void main(String[] args) {
         ATM at= new ATM(453343443,900);

        at.deposit(90);
        at.withdraw(10);

        System.out.println(at.getAccountNumber());
    }
}
