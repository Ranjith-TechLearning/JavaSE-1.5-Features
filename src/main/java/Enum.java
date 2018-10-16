import java.util.concurrent.Callable;

public class Enum {
    public enum chineesMenu{
        CHICKEN_SOUP(20),
        VEG_SOUP(15),
        MUTTON_SOUP(30);

        private int price;
        private chineesMenu(int price){
            this.price=price;

        }
    }



}
