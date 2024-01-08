package pierpaolo.u5w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
public class Topping {
    private String nome;
    private double prezzoTopping;
    private int calorie;

    @Override
    public String toString() {
        return nome;
    }
}
