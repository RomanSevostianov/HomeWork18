import java.util.*;


public class Recipe {

    public String nameRecipe;
    public Map<Product, Integer> map = new HashMap<>();

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;


    }

    public String getNameRecipe() {
        return nameRecipe;
    }

    public int sizeProd (){
            return map.size();
    }



    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", map=" + map +
                '}';
    }
}
