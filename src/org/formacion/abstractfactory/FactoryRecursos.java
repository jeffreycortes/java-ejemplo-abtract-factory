/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.formacion.abstractfactory;

import Interfaces.*;
import repositories.*;

/**
 *
 * @author corte
 */
public class FactoryRecursos implements AbstractFactory{
    
    @Override
    public RecursosEnIdiomaEs crearRepositorioDeRecursosEnIdiomaEs() {
            return new RecursosIdiomaEs();
    }

    @Override
    public RecursosEnIdiomaEn crearRepositorioDeRecursosEnIdiomaEn() {
            return new RecursosIdiomaEn();
    }
}
