package Esqueletos;

import Bestias.Bestia;
import Factorys.AbstractFactory;
import Humanos.Humano;

/**
 *
 * @author diego
 */
public class FactoryEsqueleto implements AbstractFactory{

    @Override
    public Bestia getBestia() {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Humano getHumano() {
        return null;
    }
    
}
