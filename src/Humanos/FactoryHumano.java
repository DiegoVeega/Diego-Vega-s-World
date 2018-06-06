package Humanos;

import Bestias.Bestia;
import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;

/**
 *
 * @author diego
 */
public class FactoryHumano implements AbstractFactory {

    @Override
    public Bestia getBestia(int tipo) {
        return null;
    }

    @Override
    public Esqueleto getEsqueleto(int tipo) {
        return null;
    }

    @Override
    public Humano getHumano(int tipo) {
        switch (tipo) {
            case 1:
                return new Recolector_Madera();
            case 2:
                return new Recolector_Piedra();
            case 3:
                return new Recolector_Hierro();
            case 4:
                return new Soldados();
            case 5:
                return new Especialista();
            case 6:
                return new VPesado_H();
            case 7:
                return new VLigero_H();
        }
        return null;
    }
}
