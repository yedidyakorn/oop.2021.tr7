
public class HamburgerFactory {
    public static Hamburger createHamburger(String code){
        if (code==null||code.isEmpty())
            return null;
        if (code.equals("hm"))
            return new HomemadeHamburger();
        else if (code.equals("la"))
            return new LambHamburger();
        else if(code.equals("sp"))
            return new SpicyHamburger();
        else if(code.equals("cl"))
            return new ClassicHamburger();
        throw new RuntimeException("wrong Hamburger");
    }
}

