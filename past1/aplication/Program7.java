package past1.aplication;

import java.util.Date;

import past1.entities.Orders;
import past1.entities.enums.OrderStatus;

public class Program7 {
    public static void main(String[] args) {
        Orders order = new Orders(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(order.getStatus());

    }
}
