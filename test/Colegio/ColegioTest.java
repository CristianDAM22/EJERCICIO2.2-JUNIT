package Colegio;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ColegioTest {

    Colegio alumno;//Si nos fijamos en el contructor de colegio recibe las asignaturas,por lo que asi tambien le pasas las notas de la asignatura
    float media;
    boolean posible;

    public ColegioTest(Colegio a,float media,boolean posible) {
        alumno=a;
        this.media = media;
        this.posible=posible;
    }

    @Parameters
    
    public static Collection<Object[]> casosPrueba() {
        return Arrays.asList(
                new Object[][]{
                    {new Colegio(5f,6f,7f),6f,true},
                    {new Colegio(4f,2f,9f),5f,false},
                    {new Colegio(3f,7f,10f),6.67f,false},
                    {new Colegio(7f,7f,8f),7.3f,true}
                });
    }

    /**
     * PRUEBA NORMAL METODO CALCULAR MEDIA.
     */
    @Test
    public void testCalculoMedia() {
        System.out.println("calculoMedia");
        Colegio instance = new Colegio(4f, 6f, 7f);
        float expResult = 5.67F;
        float result = instance.calculoMedia();
        //assertEquals(String,expResult,result,delta(el desfase de decimales que permites));
        assertEquals("Media incorrecta", expResult, result, 0.01f);
    }
    
    /**
     * PRUEBA PARAMETRIZADA METODO DERECHO DE BECA.
     */
    
    @Test
    public void testDerechoBecaParametrizado() {
        System.out.println("Derecho Beca");
        boolean result = alumno.derechoBeca();
        //Esto es un añadido
        float media=alumno.calculoMedia();
        assertEquals("Calculo media",media/*LA MEDIA DE JUSTO ENCIMA*/,this.media/*LA MEDIA DE LA PROPIEDAD*/,0.01f/*MARGEN DE ERROR*/);
        assertEquals("derecho beca", result/*RESULTADO ESPERADO*/, posible/*RESULTADO QUE LE PASO*/);
    }
    
}
