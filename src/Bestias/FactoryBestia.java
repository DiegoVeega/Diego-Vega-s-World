package Bestias;

import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;
import Humanos.Humano;

/**
 *
 * @author diego
 */
public class FactoryBestia implements AbstractFactory{

    @Override
    public Bestia getBestia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Esqueleto getEsqueleto() {
        return null;
    }

    @Override
    public Humano getHumano() {
        return null;
    }
    
}
