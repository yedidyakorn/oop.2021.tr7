public class OnionRings extends ToppingDecorator {
    public OnionRings(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return super.serve() + " with onion rings";
    }
}
