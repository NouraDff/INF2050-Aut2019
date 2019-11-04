import com.company.CalculTaxes;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculTaxesTest {

    @Test
    void calculerTaxeDeVentesSansTaxe() {
        Assert.assertEquals(12300, CalculTaxes.calculerTaxeDeVentes(   12300, false,false));
    }
    @Test
    void calculerTaxeDeVentesTPS() {
        Assert.assertEquals(12915, CalculTaxes.calculerTaxeDeVentes(   12300, true,false));
    }

    @Test
    void calculerTaxeDeVentesTVQ() {
        Assert.assertEquals(13526, CalculTaxes.calculerTaxeDeVentes(   12300, false,true));
    }

    @Test
    void calculerTaxeDeVentesZero() {
        assertThrows(IllegalArgumentException.class, () -> CalculTaxes.calculerTaxeDeVentes(0, true ,true) );
    }

    @Test
    void calculerTaxeDeVentesNegatif() {
        assertThrows(IllegalArgumentException.class, () -> CalculTaxes.calculerTaxeDeVentes(-9088, true ,true) );
    }

    @Test
    void testbidon(){
        assertEquals(true, true);
    }

    @Test
    void testbidon2(){
        assertEquals(true, true);
    }

}