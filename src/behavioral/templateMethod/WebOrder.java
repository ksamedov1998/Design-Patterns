package behavioral.templateMethod;

public class WebOrder extends OrderTemplate {
    @Override
    public void processCheckout() {
        System.out.println("Get items from cart, ");
        System.out.println("Set gift preferences, ");
        System.out.println("Set delivery address, ");
        System.out.println("Set billing address, ");
    }

    @Override
    public void processPayment() {
        System.out.println("Process payment without Card present");
    }

    @Override
    protected void processDelivery() {
        System.out.println("Ship the item to address");
    }

    @Override
    public void processReceipt() {
        System.out.println("Email receipt");
    }
}
