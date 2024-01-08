package pierpaolo.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Bevanda> bevandaList;
    private List<Topping> toppingList;
    public void printMenu(){
        System.out.println("   Menu   ");
        System.out.println("   Pizza   ");
        this.pizzaList.forEach(System.out::println);
        System.out.println();
        System.out.println("   Topping   ");
        this.toppingList.forEach(System.out::println);
        System.out.println();
        System.out.println("   Drink   ");
        this.bevandaList.forEach(System.out::println);

    }
}
