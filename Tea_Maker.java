
package w10;

public class Tea_Maker extends Drink_Maker{
    
    private int tea;

    public int getTea() {
        return tea;
    }

    public void setTea(int tea) {
        this.tea = tea;
    }
    
    public void addIngredients(){
        System.out.println("Add " + getSugar() + " suger");
        System.out.println("Add "+tea+" tea");
    }

    
    
}
