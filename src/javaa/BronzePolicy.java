package javaa;

public class BronzePolicy implements Policy{

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getType() {
        return "Bronze";
    }

}
