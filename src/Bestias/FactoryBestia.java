package Bestias;

import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;
import Humanos.Humano;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class FactoryBestia implements AbstractFactory{

    @Override
    public Bestia getBestia(int tipo) {
        int tecla;
        Scanner leer=new Scanner(System.in);
        switch(tipo){
            case 1:
                System.out.println("\n\t\tQue tipo de recolector desea? ");
                System.out.println("\n\t\t1. Recolector de Luz.");
                System.out.println("\n\t\t2. Recolector de Cristales.");
                System.out.println("\n\t\t3. Recolector de Almas.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Recolector_Luz();
                    case 2:
                        return new Recolector_Cristal();
                    case 3:
                        return new Recolector_Alma();
                }
                break;
            case 2:
                System.out.println("\n\t\tA que miembro de milicia desea? ");
                System.out.println("\n\t\t1. Tribu de bestias.");
                System.out.println("\n\t\t2. Bestia Mayor.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new Tribu();
                    case 2:
                        return new BestiaMayor();
                }
                break;
            case 3:
                System.out.println("\n\t\tQue tipo de Vehiculo desea? ");
                System.out.println("\n\t\t1. Vehiculo ligero.");
                System.out.println("\n\t\t2. Vehiculo Pesado.");
                System.out.print("Tu eleccion: ");
                tecla=leer.nextInt();
                switch(tecla){
                    case 1:
                        return new VLigero_B();
                    case 2:
                        return new VPesado_B();
                }
                break;
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
