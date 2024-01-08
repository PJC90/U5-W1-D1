package pierpaolo.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
@Getter
public class Pizza extends Prodotto{
    private String nome;
    private List<Topping> toppings;


    public Pizza(String nome, List<Topping> toppings) {
        super(4.99,1032);
        this.nome = nome;
        this.toppings = new ArrayList<>();
        this.calorie = setCalorie(toppings);
        this.prezzo = setPrezzo(toppings);
    }
    public int setCalorie(List<Topping> toppings){
        int tot = 1032;
        if(toppings != null){
            for(int i = 0; i< toppings.size(); i++){
                tot += toppings.get(i).getCalorie();
            }
        } else return tot;
        return tot;
    }
    public double setPrezzo(List<Topping> toppings){
        double tot = 4.99;
        if(toppings != null){
            for(int i = 0; i<toppings.size(); i++){
                tot += toppings.get(i).getCalorie();
            }
        }else return  tot;
        return tot;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", Calorie=" + calorie +
                ", Prezzo=" + prezzo +
                ", toppings=" + toppings +
                "} " ;
    }
}
