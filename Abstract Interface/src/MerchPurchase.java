public class MerchPurchase extends Transaction {
    private String buyerName;
    private String shippingAddress;
    private String merchItem;

    public MerchPurchase(String transactionId, double amount, PaymentGateway paymentMethod, String buyerName, String shippingAddress, String merchItem) {
        super(transactionId, amount, paymentMethod);
        this.buyerName = buyerName;
        this.shippingAddress = shippingAddress;
        this.merchItem = merchItem;
    }

    @Override
    public void generateReceipt() {
        System.out.println("=========================================");
        System.out.println("       STRUK PEMBELIAN MERCHANDISE       ");
        System.out.println("=========================================");
        System.out.println("ID Transaksi : " + transactionId);
        System.out.println("Pembeli      : " + buyerName);
        System.out.println("Barang       : " + merchItem);
        System.out.println("Alamat       : " + shippingAddress);
        System.out.println("Total Bayar  : Rp" + amount);
        System.out.println("=========================================\n");
    }
}