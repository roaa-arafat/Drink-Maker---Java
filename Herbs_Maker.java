package w10;

public class Herbs_Maker extends Drink_Maker {

    private String herb;

    public Herbs_Maker() {
    }

    public Herbs_Maker(String herb) {
        this.herb = herb;
    }

    public Herbs_Maker(String herb, int water, int sugar) {
        super(water, sugar);
        this.herb = herb;
    }

    public String getHerb() {
        return herb;
    }

    public void setHerb(String herb) {
        this.herb = herb;
    }

    @Override
    public String toString() {
        return "Herbs_Maker{" + "herb=" + herb + '}';
    }

    public void addIngredients() {
        System.out.println("Add " + getSugar() + " suger");
        System.out.println("Add " + herb);
    }

}
