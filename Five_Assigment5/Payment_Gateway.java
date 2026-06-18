package Assigment.Five_Assigment5;
interface  Payment{
    void pay();
}
class CreditCardPayment implements Payment{

    @Override
    public void pay() {
        System.out.println("Payment done using Credit Card .");
    }
}
class UPIPayment implements Payment{
    public void pay(){
        System.out.println("Payment done using UPI");
    }
}

class NetBankingPayment implements Payment{
    public  void pay(){
        System.out.println("Payment done using Net Banking.");
    }
}

public class Payment_Gateway {
    public static void main(String[] args) {
    Payment pt=new CreditCardPayment();
    Payment upi=new UPIPayment();
    Payment net=new NetBankingPayment();

    pt.pay();
    upi.pay();
    net.pay();
    Payment pay[]=new Payment[3];
    pay[0]=pt;
    pay[1]=upi;
    pay[2]=net;
        System.out.println(pay[0]);
        System.out.println(pay[1]);
        System.out.println(pay[2]);
    }
}
