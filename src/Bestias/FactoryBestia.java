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
    public Bestia getBestia(int tipo) {
        switch (tipo) {
            case 1:
                return new Recolector_Alma();
            case 2:
                return new Recolector_Cristal();
            case 3:
                return new Recolector_Luz();
            case 4:
                return new Tribu();
            case 5:
                return new BestiaMayor();
            case 6:
                return new VPesado_B();
            case 7:
                return new VLigero_B();
            case 8:
                return new Centro_B();
        }
        return null;
    }

    @Override
    public Esqueleto getEsqueleto(int tipo) {
        return null;
    }

    @Override
    public Humano getHumano(int tipo) {
        return null;
    }
    
}
