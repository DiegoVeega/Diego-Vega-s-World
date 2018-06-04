/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorys;

import Bestias.FactoryBestia;
import Esqueletos.FactoryEsqueleto;
import Humanos.FactoryHumano;

/**
 *
 * @author diego
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(int raza){
        //INSTRUCCIONES, QUE RAZA SELECCIONAR.
        switch(raza){
            case 1:
                return new FactoryHumano();
            case 2:
                return new FactoryEsqueleto();
            case 3:
                return new FactoryBestia();
        }
        return null;
    }
}
