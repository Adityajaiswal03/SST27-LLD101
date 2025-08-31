import com.example.orders.*;
import java.util.List;

public class TryIt {
    public static void main(String[] args) {
        OrderLine l1 = new OrderLine("A", 1, 200);
        OrderLine l2 = new OrderLine("B", 3, 100);
//        Order o = new Order("o2", "a@b.com");
//        o.addLine(l1);
//        o.addLine(l2);
//        o.setDiscountPercent(10);
        OrderService os = new OrderService();
        Order o=os.createOrder("o2","a@b.com", List.of(l1,l2),10,false,null);
        System.out.println("Before: " + o.totalBeforeDiscount());
//        l1.setQuantity(999); // demonstrates mutability leak
        System.out.println("After:  " + o.totalAfterDiscount());
//        System.out.println("=> In the solution, totals remain stable due to defensive copies.");

    }
}
