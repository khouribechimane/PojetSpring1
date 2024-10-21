package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.ConfigurableEnvironment;

@Configuration
@ComponentScan(basePackages = {"dao", "metier"})
public class Presentation2 {
    public static void main(String[] args) {
        // Créer le contexte d'application
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Presentation2.class);
        
        // Configurer l'environnement après la création du contexte
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setActiveProfiles("dev");  // Définir le profil actif ici

        // Pas besoin de rafraîchir le contexte, car il est déjà configuré
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Résultat avec le profil actif = " + metier.calcul());

        // Fermez le contexte après l'utilisation pour libérer les ressources
        context.close();  // Assurez-vous que cette ligne est propre et n'a pas de caractères cachés
    }
}
