package Assigment.Five_Assigment5_18_June;

abstract class Banking {
    abstract void  deposit(double amount);
    abstract void withDraw(double amount);
}

class SBI extends Banking{

        double balance;
    @Override
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Amount is not negative !!");
        }
        else {
            balance += amount;
            System.out.println("After bePosit : " + amount + "\n" + "The total balance is your account : " + balance);
        }
    }

    public void withDraw(double amount){
        if (balance<amount){
            System.out.println("the balance is insufficient");
        }else {
            balance-=amount;
            System.out.println("new with draw of amount : "+amount +"\n"+"Your current balance : " + balance);
        }
    }
}

public class Banking_System {
    public static void main(String[] args) {

        Banking banking=new SBI();
        banking.deposit(8900);
        banking.withDraw(500);
    }
}
