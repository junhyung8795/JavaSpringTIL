package divideRoleAndImplementation;

public class FixedDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(int price) {
        //무조건 고정된 가격(1000원)을 할인하고 1000원 보다 싸면 0원을 리턴
        return Math.max((price - 1000), 0);
    }
}
