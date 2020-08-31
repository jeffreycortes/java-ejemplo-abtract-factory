/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;
import Interfaces.RecursosEnIdiomaEs;
/**
 *
 * @author corte
 */
public class RecursosIdiomaEs implements RecursosEnIdiomaEs {
    
    @Override
    public String preguntaHora()
    {
        return "¿qué hora es?";
    }
    
    @Override
    public String preguntaTiempo()
    {
        return "¿qué tiempo hace?";
    }
    @Override
    public String buenosDias() {
            return "buenos días";
    }

    @Override
    public String buenasTardes() {
            return "buenas tardes";
    }
    
}
