import java.util.HashSet;
import java.util.Set;

public class RecipeTest {//используется для проверки того, существует ли указанный элемент в данном списке или нет.

    private Set<Recipe> recipes = new HashSet<>();
    public void addRecipe(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт есть в списке!");
        } else {
            recipes.add(recipe);
        }
        recipes.add(recipe);
    }
}
