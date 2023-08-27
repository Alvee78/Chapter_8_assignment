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
        int doller = (int)change;
        change = change - doller;
        double quarter = ((int)(change/0.25))*0.25;
        change = change - quarter;
        double dime = ((int)(change/0.10))*0.10;
        change = change - dime;
        double nickel = ((int)(change/0.05))*0.05;
        change = change - nickel;

        System.out.println(doller+" dollar "+(int) (quarter / 0.25)+" quarter "+(int)(dime / 0.10)+ " dime "+(int) (nickel / 0.05)+" nickel");
        System.out.println("Thanks for coming and see you soon again.");
    }
}
