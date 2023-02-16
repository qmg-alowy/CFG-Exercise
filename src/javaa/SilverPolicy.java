package javaa;

public class SilverPolicy implements Policy{

    @Override
    public int getPrice() {
        return 200;
    }

    @Override
    public String getType() {
        return "Silver";
    }

}
