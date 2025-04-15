import divideRoleAndImplementation.FixedDiscountPolicy;
import divideRoleAndImplementation.OrderService;
import divideRoleAndImplementation.ThirtyPercentDiscountPolicy;


public class Main {
    public static void main(String[] args) {
        OrderService orderService1 = new OrderService(new FixedDiscountPolicy());
        OrderService orderService2 = new OrderService(new ThirtyPercentDiscountPolicy());
        orderService1.order(4000);
        orderService2.order(4000);
    }
}