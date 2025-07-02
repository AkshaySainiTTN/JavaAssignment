package beyondjava1;

public class Ans6 {

     enum OrderStatus {
        PENDING,
        PROCESSING,
        SHIPPED,
        CANCELLED,
        REFUNDED,
        DELIVERED
    }
    public static String processOrderStatus(OrderStatus status) {
        return switch (status) {
            case PENDING -> "Order is awaiting confirmation.";
            case PROCESSING -> "Order is being prepared.";
            case SHIPPED -> "Order has been dispatched.";
            case DELIVERED -> "Order has been successfully delivered.";
            case CANCELLED -> {
                System.out.println("Logging cancellation...");
                System.out.println("problem occured ");
                yield "Order has been canceled.";
                //yeild is use to return a value
                // if we have multiple sout in a case then use yield
            }
            case REFUNDED -> "Refund has been issued for the order.";


        };
    }

    public static void main(String[] args) {
        System.out.println(processOrderStatus(OrderStatus.PENDING));
        System.out.println(processOrderStatus(OrderStatus.PROCESSING));
        System.out.println(processOrderStatus(OrderStatus.SHIPPED));
        System.out.println(processOrderStatus(OrderStatus.DELIVERED));
        System.out.println(processOrderStatus(OrderStatus.CANCELLED));
        System.out.println(processOrderStatus(OrderStatus.REFUNDED));

    }
}
