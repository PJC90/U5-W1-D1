package pierpaolo.u5w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pierpaolo.u5w1d1.entities.Pizza;
import pierpaolo.u5w1d1.entities.Topping;

@Configuration
public class BeansConfig {
    @Bean
    Pizza getPizza(){return new Pizza("Margherita");}

    @Bean
    Pizza pizzaContadina(){
        Pizza contadina = new Pizza ("Contadina");
        contadina.addTopping(new Topping("Prosciutto Cotto", 2,125));
        contadina.addTopping((new Topping("Funghi",3,25)));
        return contadina;
    }
}
