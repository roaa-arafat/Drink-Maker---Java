package w10;

public class Test_Maker {

    public static void main(String[] args) {

        Tea_Maker tm = new Tea_Maker();
        tm.setWater(1);
        tm.setTea(10);
        tm.setSugar(250);
        tm.makeDrink();

        Coffee_Maker cm = new Coffee_Maker();
        cm.setWater(1);
        cm.setCoffee(500);
        cm.setSugar(250);
        cm.makeDrink();

    }
}
