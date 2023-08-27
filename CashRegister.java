package chapter8;

public class CashRegister {
   private double payableBalance;
   private double payment;

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public CashRegister(){
       payableBalance = 0;
       payment = 0;
   }
   public void receivePayment(int coinCount, Coin coinType){
       payableBalance = payableBalance + coinCount * coinType.coinValue;
   }

    public void getPayableBalance() {
        double change = payment - payableBalance;
        System.out.println(change);
        System.out.println("Thanks for coming and see you soon again.");
    }
}
