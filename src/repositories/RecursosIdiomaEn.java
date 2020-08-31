/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;
import Interfaces.RecursosEnIdiomaEn;

/**
 *
 * @author corte
 */
public class RecursosIdiomaEn implements  RecursosEnIdiomaEn {
    
    @Override
    public String preguntaHora() {
            return "what time is it?";
    }

    @Override
    public String preguntaTiempo() {
            return "how is the weather?";
    }
    
    @Override
    public String buenosDias() {
            return "good morning";
    }

    @Override
    public String buenasTardes() {
            return "good afternoon";
    }
}
