package chapter8;

public class CashRegisterRunner {
    public static void main(String[] args) {
        final Coin DOLLAR = new Coin(1.00,"dollar");
        final Coin QUARTER = new Coin(0.25,"quarter");
        final Coin DIME = new Coin(0.10,"DIME");
        final Coin NICKEL = new Coin(0.05,"NICKKEL");

//        System.out.printf("\033[H\033[2J");
//        System.out.flush();

        CashRegister cashRegister = new CashRegister();
        cashRegister.receivePayment(5,DOLLAR);
        cashRegister.receivePayment(5,QUARTER);
        cashRegister.receivePayment(5,DIME);
        cashRegister.receivePayment(4,NICKEL);
        cashRegister.setPayment(500);
        cashRegister.getPayableBalance();
    }
}
