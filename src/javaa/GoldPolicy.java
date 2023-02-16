package javaa;

public class GoldPolicy implements Policy{

        @Override
        public int getPrice() {
            return 300;
        }

        @Override
        public String getType() {
            return "Gold";
        }

}
