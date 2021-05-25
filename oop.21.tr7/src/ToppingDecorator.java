/**
 * abstract class for decorations of toppings for hamburgers
 */
public abstract class ToppingDecorator implements Hamburger {
    private Hamburger hamburger;

    public ToppingDecorator(Hamburger h) {
        this.hamburger = h;
    }

    @Override
    public String serve() {
        return hamburger.serve();
    }
}
