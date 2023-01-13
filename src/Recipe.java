import java.util.Objects;
import java.util.Set;
import java.util.HashSet;


public class Recipe {

    public String nameRecipe;
    public Set< Product > lotsOfProducts;

    public Recipe(String nameRecipe, Set<Product> lotsOfProducts) {
        this.nameRecipe = nameRecipe;
        this.lotsOfProducts = lotsOfProducts;
    }
    public String getNameRecipe() {
        return nameRecipe;
    }
    public Set<Product> getLotsOfProducts() {
        return lotsOfProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Recipe)) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(getNameRecipe(), recipe.getNameRecipe()) && Objects.equals(getLotsOfProducts(), recipe.getLotsOfProducts());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameRecipe(), getLotsOfProducts());
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", lotsOfProducts=" + lotsOfProducts +
                '}';
    }
}
