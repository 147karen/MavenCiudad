import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class Pruebas {

    @Test
    public void testPrueba() throws Exception {

        Edificios edificio = new Edificios();

        edificio.setNumPisos(4);
        edificio.setEmpresa("grupo o.");
        System.out.println(edificio);
    }
}