package behavioral.templateMethod;

public abstract class OrderTemplate {

    public boolean isGift;

    public abstract void processCheckout();

    public abstract void processPayment();

    protected abstract void processDelivery();

    public abstract void processReceipt();

    public final void wrapGift() {
        System.out.println("Gift wrapped");
    }
    //template method
    public final void processOrder() {
        processCheckout();
        processPayment();
        if (isGift) {
            wrapGift();
        } else {
            processReceipt();
        }
        processDelivery();
    }

}
