public abstract class Transaction {
    protected String transactionId;
    protected double amount;
    protected PaymentGateway paymentMethod;

    public Transaction(String transactionId, double amount, PaymentGateway paymentMethod) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public abstract void generateReceipt();

    public void executeTransaction() {
        System.out.println("\n--- Memproses Transaksi: " + transactionId + " ---");
        if (paymentMethod.processPayment(amount)) {
            System.out.println("Status: LUNAS via " + paymentMethod.getPaymentMethodName());
            generateReceipt();
        } else {
            System.out.println("Status: GAGAL!");
        }
    }
}