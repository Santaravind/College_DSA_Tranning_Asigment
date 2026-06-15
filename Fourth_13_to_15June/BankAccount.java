package Assigment.Fourth_13_to_15June;



//
//Create a class BankAccount with private data members:
//        ● accountNumber
//● balance
//Implement methods:
//        ● deposit(double amount)
//● withdraw(double amount)
//● getBalance()
//Do not allow withdrawal if the balance is insufficient.
public class BankAccount {
private     int accountNumber;
private     double balance;

    public int getAccountNumber() {
        return accountNumber;
    }


    public double getBalance() {
        return balance;
    }



    public BankAccount(int accountNumber, double balance) {
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


class Bank{
    public static void main(String[] args) {
        BankAccount ba=new BankAccount(231245,17);


      ba.deposit(90);
        ba.withdraw(10);

        System.out.println(ba.getAccountNumber());

    }
}
