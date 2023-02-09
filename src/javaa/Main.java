package javaa;

public class Main {

    public static void main(String[] args) {

        Customer Juan = new Customer("Juan", "Giron");

        Policy goldPolicy = new GoldPolicy();
        Policy silverPolicy = new SilverPolicy();
        Policy bronzePolicy = new BronzePolicy();

        Order order1 = new Order("01", goldPolicy);
        Order order2 = new Order("02", silverPolicy);
        Order order3 = new Order("03", bronzePolicy);


        Juan.addOrder(order1);
        Juan.addOrder(order2);
        Juan.addOrder(order3);

        System.out.println("Order " + Juan.getOrderid());
        System.out.println("Policy type: " + Juan.getTypeOrder());
        System.out.println("Total Price: " + Juan.getTotalCost());

    }
}
