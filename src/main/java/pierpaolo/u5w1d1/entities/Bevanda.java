package pierpaolo.u5w1d1.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bevanda extends Prodotto{
    private String quantità;
    private String graduazione;

    public Bevanda(String nome, double prezzo, int calorie, String quantità, String graduazione) {
        super();
        setNome(nome);
        setPrezzo(prezzo);
        setCalorie(calorie);
        this.quantità = quantità;
        this.graduazione = graduazione;
    }
}
