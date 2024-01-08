package pierpaolo.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Pizza extends Prodotto{
    private List<Topping> toppings;

//    public Pizza(String nome, double prezzo, int calorie) {
//        super(nome, prezzo, calorie);
//    }


    public Pizza(String nome) {
        super(nome);
        toppings = new ArrayList<>();
        addTopping(new Topping("Pomodoro", 2.5, 110));
        addTopping(new Topping("Mozzarella",2.5,230));
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
        setPrezzo(getPrezzo() + topping.getPrezzoTopping());
        setCalorie(getCalorie() + topping.getCalorie());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                "} " + super.toString();
    }
}
