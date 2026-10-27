public class EWalletPayment implements PaymentGateway {
    private String walletName;
    private String phoneNumber;

    public EWalletPayment(String walletName, String phoneNumber) {
        this.walletName = walletName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Menghubungkan ke " + walletName + "...");
        System.out.println("Saldo berhasil dipotong sebesar Rp" + amount + " dari nomor " + phoneNumber);
        return true;
    }

    @Override
    public String getPaymentMethodName() {
        return walletName + " E-Wallet";
    }
}