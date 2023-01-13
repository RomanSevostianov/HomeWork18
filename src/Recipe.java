import java.util.Objects;
import java.util.List;


public class Recipe  {

    public String lotsOfProducts;
    public double totalCost;
    public String nameRecipe;
    public List< Product > products;

    public Recipe(String nameRecipe,   String lotsOfProducts, double totalCost ) {
        this.lotsOfProducts = lotsOfProducts;
        this.totalCost = totalCost;
        this.nameRecipe = nameRecipe;

    }

    public String getLotsOfProducts() {
        return lotsOfProducts;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public String getNameRecipe() {
        return nameRecipe;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Double.compare(recipe.getTotalCost(), getTotalCost()) == 0 && Objects.equals(getLotsOfProducts(), recipe.getLotsOfProducts()) && Objects.equals(getNameRecipe(), recipe.getNameRecipe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLotsOfProducts(), getTotalCost(), getNameRecipe());
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "lotsOfProducts='" + lotsOfProducts + '\'' +
                ", totalCost=" + totalCost +
                ", nameRecipe='" + nameRecipe + '\'' +
                '}';
    }
}
