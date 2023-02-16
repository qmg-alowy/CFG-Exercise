package javaa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class OrderEntry {
    private Customer customer;
    private int orderEntryId;
    private List<Order> orders;

    public OrderEntry(Customer customer, int orderEntryId) {
        this.customer = customer;
        this.orderEntryId = orderEntryId;
        this.orders= new ArrayList<>();
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getOrderEntryId() {
        return orderEntryId;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public double getTotalCost() {
        return orders.stream()
                .map(Order::getPolicy)
                .mapToInt(Policy::getPrice)
                .sum();
    }

    public void addOrder(Order order) {orders.add(order);}

    public Set<String> getOrderid() {
        return orders.stream()
                .map(Order::getid)
                .collect(Collectors.toSet());
    }

    public Set<String> getTypeOrder() {
        return orders.stream()
                .map(order -> order.getPolicy().getType())
                .collect(Collectors.toSet());
    }
    public Set<LocalDate> getDateOrder() {
        return orders.stream()
                .map(Order::getDate)
                .collect(Collectors.toSet());
    }

    public int totalOfPoliciesPurchase(){
        return orders.size();
    }
}
