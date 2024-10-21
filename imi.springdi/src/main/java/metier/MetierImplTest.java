
package metier;

import dao.IDao;
import dao.DaoImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MetierImplTest {

   
    public void testCalcul() {
        IDao dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(); 
        double result = metier.calcul();
        Assertions.assertEquals(200.0, result, "Le résultat doit être 200.0");
    }
}
