package thediscountsystem;
import java.util.Date;
public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("Anh");
        Visit vs = new Visit("Anty", new Date(2021,11,23));
        DiscountRate rate = new DiscountRate();
        System.out.println(customer);
        System.out.println(vs);
        System.out.println(rate.getServiceDiscount("Premium"));
        System.out.println(rate.getProductDiscount("Gold"));
    }
}
