public class ToppingFactory {
    /**
     * factory for topping of hamburgers
     *
     * @param code-     code of topping. chosen by user
     * @param hamburger - the hamburger that is being toped
     * @return the hamburger with the new top
     */
    public static Hamburger createTopping(String code, Hamburger hamburger) {
        if (code == null || code.isEmpty())
            return null;
        else if (code.equals("ch"))
            return new Chips(hamburger);
        else if (code.equals("or"))
            return new OnionRings(hamburger);
        else if (code.equals("sa"))
            return new Salad(hamburger);
        else if (code.equals("fe"))
            return new FriedEgg(hamburger);
        throw new RuntimeException("wrong Topping");

    }
}
