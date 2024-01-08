package pierpaolo.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@ToString
public class Pizza extends Prodotto{
    private List<Topping> toppings;

    public Pizza() {
        super();
        toppings = new ArrayList<>();
        addTopping(new Topping("Pomodoro", 0, 110));
        addTopping(new Topping("Mozzarella",0,230));
    }
    public void addTopping(Topping topping){
        toppings.add(topping);
        setPrezzo(getPrezzo() + topping.getPrezzoTopping());
        setCalorie(getCalorie() + topping.getCalorie());
    }
}
