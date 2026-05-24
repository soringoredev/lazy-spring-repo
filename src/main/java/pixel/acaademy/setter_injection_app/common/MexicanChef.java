package pixel.acaademy.setter_injection_app.common;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class MexicanChef implements Chef {

    public MexicanChef() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyRecipe(){
        return "Prepara tacos al pastor con pina, cilentro y salsa picante!";
    }
}
