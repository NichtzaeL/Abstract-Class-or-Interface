public class CreditCardPayment implements PaymentGateway {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Memverifikasi kartu kredit " + cardNumber + " atas nama " + cardHolderName + "...");
        System.out.println("Pembayaran kartu kredit sebesar Rp" + amount + " berhasil disetujui.");
        return true; 
    }

    @Override
    public String getPaymentMethodName() {
        return "Kartu Kredit";
    }
}