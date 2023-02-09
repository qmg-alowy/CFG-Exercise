package javaa;

import java.util.List;

public class Order {

    private final Policy policy;
    private final String id;

    public Order(String id, Policy policy) {
        this.id = id;
        this.policy = policy;
    }

    public Policy getPolicy() {
        return policy;
    }
    public String getid() {return id;
    }

}
