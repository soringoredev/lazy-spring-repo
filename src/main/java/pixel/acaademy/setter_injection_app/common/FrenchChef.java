package pixel.acaademy.setter_injection_app.common;

import org.springframework.stereotype.Component;
@Component
public class FrenchChef implements Chef{

    public FrenchChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe(){
        return "Preparez un Bouef bourguignon avec vin rouge et herbes";
    }

}
