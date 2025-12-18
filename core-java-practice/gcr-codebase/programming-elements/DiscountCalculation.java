public class DiscountCalculation {
    public static void main(String[] args) {
        int fee = 125000;
        int discountP = 10;
        int discount = (fee * discountP) / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}
