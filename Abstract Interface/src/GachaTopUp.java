public class GachaTopUp extends Transaction {
    private String gameName;
    private String uid;
    private String itemName;

    public GachaTopUp(String transactionId, double amount, PaymentGateway paymentMethod, String gameName, String uid, String itemName) {
        super(transactionId, amount, paymentMethod);
        this.gameName = gameName;
        this.uid = uid;
        this.itemName = itemName;
    }

    @Override
    public void generateReceipt() {
        System.out.println("=========================================");
        System.out.println("          STRUK TOP-UP GAME              ");
        System.out.println("=========================================");
        System.out.println("ID Transaksi : " + transactionId);
        System.out.println("Game         : " + gameName);
        System.out.println("UID Player   : " + uid);
        System.out.println("Item         : " + itemName);
        System.out.println("Total Bayar  : Rp" + amount);
        System.out.println("=========================================\n");
    }
}