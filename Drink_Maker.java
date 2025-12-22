package w10;

abstract public class Drink_Maker {

    private int water;
    private int sugar;

    public Drink_Maker() {
    }

    public Drink_Maker(int water, int sugar) {
        this.water = water;
        this.sugar = sugar;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getSugar() {
        return sugar;
    }

    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    private void fillWater() {
        System.out.println("filling " + water + "ml water:");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    abstract public void addIngredients();

    private void serve() {
        System.out.println("Drink is ready");
    }

    void makeDrink() {
        fillWater();
        boilWater();
        addIngredients();
        serve();

    }
}
