public class Chips extends ToppingDecorator {

    public Chips(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return super.serve() + " with chips";
    }
}
