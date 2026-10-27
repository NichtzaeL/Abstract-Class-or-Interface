public class Main {
    public static void main(String[] args) {
        // 1. Membuat metode pembayaran (Polymorphism via Interface)
        PaymentGateway gopay = new EWalletPayment("GoPay", "081234567890");
        PaymentGateway cc = new CreditCardPayment("4111-2222-3333-4444", "Samatoki Aohitsugi");

        // 2. Membuat transaksi (Polymorphism via Abstract Class)
        // Kita menggunakan tipe referensi 'Transaction' untuk objek 'GachaTopUp' dan 'MerchPurchase'
        Transaction topUpGenshin = new GachaTopUp(
            "TRX-G-001", 
            159000.0, 
            gopay, 
            "Genshin Impact", 
            "800123456", 
            "Blessing of the Welkin Moon"
        );

        Transaction beliLanyard = new MerchPurchase(
            "TRX-M-001", 
            250000.0, 
            cc, 
            "Samatoki", 
            "Yokohama District", 
            "Lanyard Eksklusif Mad Trigger Crew"
        );

        // 3. Mengeksekusi transaksi 
        // Method executeTransaction() akan memanggil generateReceipt() sesuai tipe objek aslinya
        topUpGenshin.executeTransaction();
        beliLanyard.executeTransaction();
    }
}