package divideRoleAndImplementation;

//클라이언트 클래스
public class OrderService {
    DiscountPolicy discountPolicy;
    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }
    public void order(int price){
        int discountedPrice = discountPolicy.discount(price);
        System.out.println("discountedPrice = " + discountedPrice);
    }
}
