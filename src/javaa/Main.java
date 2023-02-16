package javaa;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer Juan = new Customer("Juan", "Giron");
        Customer Alex = new Customer("Alex", "Lowy");
        Customer Jeanette = new Customer("Jeanette", "Giron");

        Policy goldPolicy = new GoldPolicy();
        Policy silverPolicy = new SilverPolicy();
        Policy bronzePolicy = new BronzePolicy();

        Order gold = new Order(goldPolicy,"01", LocalDate.now());
        Order silver = new Order(silverPolicy,"02", LocalDate.now());
        Order bronze = new Order(bronzePolicy,"03", LocalDate.now());


        OrderEntry orderEntryJuan = new OrderEntry(Juan,1);
        OrderEntry orderEntryAlex = new OrderEntry(Alex,2);
        OrderEntry orderEntryJeanette = new OrderEntry(Jeanette,3);


        orderEntryJuan.addOrder(gold);
        orderEntryJuan.addOrder(bronze);
        orderEntryJuan.addOrder(bronze);
        orderEntryAlex.addOrder(bronze);
        orderEntryAlex.addOrder(gold);
        orderEntryAlex.addOrder(gold);
        orderEntryJeanette.addOrder(silver);
        orderEntryJeanette.addOrder(silver);
        orderEntryJeanette.addOrder(silver);


        printInformation(orderEntryJuan);
        printInformation(orderEntryAlex);
        printInformation(orderEntryJeanette);

    }

    private static void printInformation(OrderEntry orderEntryCustomer) {
        System.out.println("Order Entry ID:  " + orderEntryCustomer.getOrderEntryId());
        System.out.println("Quantity of Policies Purchased:  " + orderEntryCustomer.totalOfPoliciesPurchase());
        System.out.println("Order Purchased Date: " + orderEntryCustomer.getDateOrder());
        System.out.println("Policy types Purchased in this Order Entry: " + orderEntryCustomer.getTypeOrder());
        System.out.println("Total Price: " + orderEntryCustomer.getTotalCost());
        System.out.println();
    }

}
