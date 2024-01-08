package pierpaolo.u5w1d1.entities;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Prodotto {
    private String nome;
    private double prezzo;
    private int calorie;
}
