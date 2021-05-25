public class FriedEgg extends ToppingDecorator {
    public FriedEgg(Hamburger h) {
        super(h);
    }

    @Override
    public String serve() {
        return super.serve() + " with fried egg";
    }
}
