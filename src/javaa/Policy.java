package javaa;

import java.util.List;

public interface Policy {

    //Do Something
    int getPrice();
    String getType();
}

class GoldPolicy implements Policy {
    @Override
    public int getPrice() {
        return 300;
    }
    @Override
    public String getType() {
        return "Gold";
    }
}

class SilverPolicy implements Policy {
    @Override
    public int getPrice() {
        return 200;
    }
    @Override
    public String getType() {
        return "Silver";
    }
}

class BronzePolicy implements Policy {
    @Override
    public int getPrice() {
        return 100;
    }
    @Override
    public String getType() {
        return "Bronze";
    }
}