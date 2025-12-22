package w10;

public class Coffee_Maker extends Drink_Maker {

    private int coffee;

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public void addIngredients() {
        System.out.println("Add " + getSugar() + " suger");
        System.out.println("Add " + coffee + " coffee");
    }

}
