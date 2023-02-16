package javaa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Order {

    private final Policy policy;
    private final String id;
    private final LocalDate date;

    public Order(Policy policy, String id, LocalDate date) {
        this.policy = policy;
        this.id = id;
        this.date= date;
    }

    public LocalDate getDate() {
        return date;
    }
    public Policy getPolicy() {
        return policy;
    }
    public String getid() {return id;}

}
