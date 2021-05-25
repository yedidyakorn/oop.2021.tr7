public class Salad extends ToppingDecorator {
    public Salad(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return super.serve()+" with salad";
    }
}
