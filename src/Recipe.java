import java.util.*;


public class Recipe {

    public String nameRecipe;
    public Map<Product, Integer> map =new HashMap<>();

    public Recipe(String nameRecipe) {
        this.nameRecipe = nameRecipe;



    }
    public String getNameRecipe() {
        return nameRecipe;
    }

    public void getN (String get){
        if (getNameRecipe()==null){

        }
    }

    public void testRecipe (String nameRecipe){


    }

    @Override
    public String toString() {
        return "Recipe{" +
                "nameRecipe='" + nameRecipe + '\'' +
                ", map=" + map +
                '}';
    }
}
