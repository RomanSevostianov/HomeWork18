import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Макароны - спиралька", 20, 1));
        list.add(new Product("Картоша", 5, 1));
        list.add(new Product("Морковь", 12, 30));
        list.add(new Product("Лук репчатый", 23, 3));
        list.add(new Product("Змея в майонезе", 2, 34));
        list.add(new Product("Макароны - спиралька", 20, 1));

        List<Recipe> listRecipe = new ArrayList<>();

        chekingNameRecipe(listRecipe);
        System.out.println();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        Iterator iterator2 = listRecipe.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        System.out.println(list.size());
        chekingTheCopy(list);
        chekingNameRecipe(listRecipe);

        //выделение первого поля
        // List<String> nameReciteList = listRecipe.stream().map(Recipe::getNameRecipe).collect(Collectors.toList());
        // nameReciteList.forEach(System.out::println);


        numSet();

    }
//----------------------------------------------------------------------------------------------------------



    public static <T> boolean chekingTheCopy(List<T> list)  // проверка на дубликаты.
    {
        T num1;
        T num2;
        for (int i = 0; i < list.size(); i++) {
            num1 = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                num2 = list.get(j);
                if (num2.equals(num1)) {
                    // throw new RuntimeException("Если дубликаты");
                }
            }
        }
        return false;
    }

    public static <T> boolean chekingNameRecipe(List<T> listRecipe) {

        T num1;
        T num2;
        // listRecipe.get(i).hashCode() ????
        for (int i = 0; i < listRecipe.size(); i++) {
            num1 = listRecipe.get(i);
            for (int j = i + 1; j < listRecipe.size(); j++) {
                num2 = listRecipe.get(j);
                if (num2.equals(num1)) {
                    //   throw new RuntimeException("Если дубликаты");
                }
            }
        }
        return false;
    }

    private static void numSet() {
        Set<Integer> num = new HashSet<>(20);
        Random random = new Random();
        while (num.size() < 20) {
            num.add(random.nextInt(1000));
        }
        System.out.println(num);
        Iterator<Integer> numberIterator = num.iterator();
        while (numberIterator.hasNext()) {
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(num);
    }

}