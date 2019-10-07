import com.company.Monnaie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonnaieTest {


    @Test
    void additionnerDeuxMontant() {
        Monnaie monnaie1 = new Monnaie(12300);
        Monnaie monnaie2 = new Monnaie(4500);
        assertEquals(16800, Monnaie.additionnerMonnaie(monnaie1, monnaie2).getMonnaie());
    }

    @Test
    void pourcentageMontant() {
        Monnaie monnaie1 = new Monnaie(12300);
        assertEquals(615, monnaie1.pourcentage(monnaie1, 5));
    }

    @Test
    void soustraireMontant() {
        Monnaie monnaie1 = new Monnaie(5600);
        assertEquals(32399, monnaie1.soustraireMontant(37999, monnaie1).getMonnaie());
    }

    @Test
    void toString1() {
        Monnaie monnaie1 = new Monnaie(89953) ;
        assertEquals("899.53", monnaie1.toString());
    }
}