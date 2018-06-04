package Humanos;

import Bestias.Bestia;
import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;

/**
 *
 * @author diego
 */
public class FactoryHumano implements AbstractFactory{

    @Override
    public Bestia getBestia() {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto() {
        return null;
    }

    @Override
    public Humano getHumano() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
