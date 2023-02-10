package javaa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//hi
public class Customer {
    private final String costumerName;
    private final String costumerSurname;
    private List<Order> orders;

    public Customer(String costumerName, String costumerSurname) {
        this.costumerName = costumerName;
        this.costumerSurname = costumerSurname;
        this.orders = new ArrayList<>();
    }
    public void addOrder(Order order) {orders.add(order);}

    public List<String> getOrderid() {
        return orders.stream()
                .map(Order::getid)
                .collect(Collectors.toList());
    }

    public List<String> getTypeOrder() {
        return orders.stream()
                .map(order -> order.getPolicy().getType())
                .collect(Collectors.toList());
    }
    public double getTotalCost() {
        return orders.stream()
                .map(Order::getPolicy)
                .mapToInt(Policy::getPrice)
                .sum();
    }
}


