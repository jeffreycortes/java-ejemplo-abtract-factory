package org.formacion.abstractfactory;
import Interfaces.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestMultiIdioma {
    public TestMultiIdioma() {
    }
    
    @Test
    public void test_es() {
        RecursosEnIdiomaEs resourcesEs = new FactoryRecursos().crearRepositorioDeRecursosEnIdiomaEs();
        
        assertEquals("�Qu� hora es?", resourcesEs.preguntaHora() );
        assertEquals("�Qu� tiempo hace?", resourcesEs.preguntaTiempo() );
        assertEquals("buenos d�as", resourcesEs.buenosDias());
        assertEquals("buenas tardes", resourcesEs.buenasTardes());
        
        /*Preguntas preguntas = new PreguntasEs();

        assertEquals("¿qué hora es?", preguntas.preguntaHora() );
        assertEquals("¿qué tiempo hace?", preguntas.preguntaTiempo() );

        Saludos saludos = new SaludosEs();

        assertEquals("buenos días", saludos.buenosDias());
        assertEquals("buenas tardes", saludos.buenasTardes());*/
    }

    @Test
    public void test_en() {
        RecursosEnIdiomaEn resourcesEn = new FactoryRecursos().crearRepositorioDeRecursosEnIdiomaEn();
        
        assertEquals("what time is it?", resourcesEn.preguntaHora() );
        assertEquals("how is the weather?", resourcesEn.preguntaTiempo() );
        assertEquals("good morning", resourcesEn.buenosDias());
        assertEquals("good afternoon", resourcesEn.buenasTardes());
                
        /*Preguntas preguntas = new PreguntasEn();

        assertEquals("what time is it?", preguntas.preguntaHora() );
        assertEquals("how is the weather?", preguntas.preguntaTiempo() );

        Saludos saludos = new SaludosEn();

        assertEquals("good morning", saludos.buenosDias());
        assertEquals("good afternoon", saludos.buenasTardes());*/
    }

}
