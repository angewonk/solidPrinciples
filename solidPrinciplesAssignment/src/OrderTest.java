public class OrderTest {

    public static void main(String[] args) {
        OrderAction order = new OrderAction();
        System.out.println();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // These methods might not be needed for all orders
        System.out.println();
        order.generateInvoice("order_123.pdf");
        order.sendEmailNotification("johndoe@example.com");
    }
}
