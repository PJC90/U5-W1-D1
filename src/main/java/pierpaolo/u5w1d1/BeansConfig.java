package pierpaolo.u5w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import pierpaolo.u5w1d1.entities.Bevanda;
import pierpaolo.u5w1d1.entities.Pizza;
import pierpaolo.u5w1d1.entities.Topping;

@Configuration
public class BeansConfig {
    @Bean
    Pizza getPizza(){return new Pizza("Margherita");}

    @Bean
    @Scope("prototype")
        //SINGLETON ritorna lo stesso oggetto ---> DEFAULT
        //PROTOTYPE ritorna un nuovo oggetto
    Pizza pizzaContadina(){
        Pizza contadina = new Pizza ("Contadina");
        contadina.addTopping(new Topping("Prosciutto Cotto", 2,125));
        contadina.addTopping((new Topping("Funghi",3,25)));
        return contadina;
    }
    @Bean
    Topping tartufo(){return new Topping("Tartufo",10,31);}

    @Bean
    Bevanda baladin(){return new Bevanda("Baladin",9,651,"330 cl","5.5 %");}
}
