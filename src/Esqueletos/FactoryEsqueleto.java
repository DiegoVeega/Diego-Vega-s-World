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
    public Bestia getBestia(int tipo) {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto(int tipo) {
        switch (tipo) {
            case 1:
                return new Recolector_Plata();
            case 2:
                return new Recolector_Oro();
            case 3:
                return new Recolector_Diamante();
            case 4:
                return new Horda();
            case 5:
                return new EsqueletoColosal();
            case 6:
                return new VPesado_E();
            case 7:
                return new VLigero_E();
            case 8:
                return new Centro_E();
        }
        return null;
    }

    @Override
    public Humano getHumano(int tipo) {
        return null;
    }
    
}
