package divideRoleAndImplementation;

public interface DiscountPolicy {
    //금액을 넣으면 discount된 가격이 return되는 메서드
    int discount(int price);
}