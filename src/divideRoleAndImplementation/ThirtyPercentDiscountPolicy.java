package divideRoleAndImplementation;

public class ThirtyPercentDiscountPolicy implements DiscountPolicy {
    @Override
    public int discount(int price) {
        //원가의 30퍼센트로 감소된 가격을 리턴
        return price * 30 / 100;
    }
}
