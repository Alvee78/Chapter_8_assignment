public class RedesignedCashRegister {
    private double total;
    public RedesignedCashRegister(){
        total = 0;
    }
    public void receivePayment(PaymentMethod payment) {
        total += payment.getAmount();
    }
    public double getTotal() {
        return total;
    }
    public static void main(String[] args) {
        RedesignedCashRegister cashregister = new  RedesignedCashRegister();
        PaymentMethod paymentMethod = new PaymentMethod(1234);
        cashregister.receivePayment(paymentMethod);
        System.out.println(cashregister.getTotal());
        
    }
}
