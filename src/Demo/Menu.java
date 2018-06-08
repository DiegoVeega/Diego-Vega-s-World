package Demo;

import Bestias.Bestia;
import Esqueletos.Esqueleto;
import Factorys.AbstractFactory;
import Factorys.FactoryProducer;
import Humanos.Humano;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Menu {

    private static Menu instance;

    private Menu() {
    }

    public static Menu getInstance() {
        if (instance == null) {
            instance = new Menu();
        }
        return instance;
    }
    AbstractFactory factory;
    //PROBABLEMENTE AGREGAR MENU PARA CADA RAZA ENVIANDO PARAMETROS AL MENU, PARA MAYOR COMODIDAD Y ESPECIFICACION CON LO QUE SE ESTA SELECCIONANDO.

    public void seleccionRaza(int raza) {
        if(raza==1){
            factory = FactoryProducer.getFactory(raza);
            Humano centroH=factory.getHumano(8);
            centroH.generarCH();
        }
        if(raza==2){
            factory = FactoryProducer.getFactory(raza);
            Esqueleto centroE=factory.getEsqueleto(8);
            centroE.generarCE();
        }
        if(raza==3){
            factory = FactoryProducer.getFactory(raza);
            Bestia centroB=factory.getBestia(8);
            centroB.generarCB();
        }
    }

    public void Opciones(int razavar) {
        int op = 5;
        int ops;
        Scanner text = new Scanner(System.in);

        if (razavar == 1) {
            //HUMANO
            while (op != 4) {

                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Terminar turno.");
                System.out.print("\n\t\tTu seleccion: ");
                op = text.nextInt();
                switch (op) {
                    case 1:
                        ops = 5;
                        while (ops != 4) {
                            System.out.println("\n\t\tQue tipo de recolector desea? ");
                            System.out.println("\n\t\t1. Recolector de Madera.");
                            System.out.println("\t\t2. Recolector de Piedra.");
                            System.out.println("\t\t3. Recolector de Hierro.");
                            System.out.println("\t\t4. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    ops=3;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano madera = factory.getHumano(1);
                                    while(ops!=3){
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops=text.nextInt();
                                        switch(ops){
                                            case 1:
                                                madera.E_generar();
                                                break;
                                            case 2:
                                                madera.E_recolectar();
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops=3;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano piedra = factory.getHumano(2);
                                    while(ops!=3){
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops=text.nextInt();
                                        switch(ops){
                                            case 1:
                                                piedra.E_generar();
                                                break;
                                            case 2:
                                                piedra.E_recolectar();
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    ops=3;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano hierro = factory.getHumano(3);
                                    while(ops!=3){
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops=text.nextInt();
                                        switch(ops){
                                            case 1:
                                                hierro.E_generar();
                                                break;
                                            case 2:
                                                hierro.E_recolectar();
                                                break;
                                        }
                                    }
                                    break;
                                case 4:
                                    System.out.println("\n\t\tTermino accion en: Recolectores.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener soldados.");
                            System.out.println("\t\t2. Obtener soldado especialista.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    Humano soldados = factory.getHumano(4);
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    Humano especialista = factory.getHumano(5);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accione en: Milicia");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener Tanque.");
                            System.out.println("\t\t2. Obtener moto de ataque.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    Humano tanque = factory.getHumano(6);
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    Humano moto = factory.getHumano(7);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accion en: Vehiculos.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\n\t\t:::::::::::::::::::::::::::...::...::::.......::CAMBIO::DE::TURNOS::......::::...::...::::::::::::::::::::::::::");
                        break;
                    default:
                        System.out.println("\n\t\tIngrese opcion valida, por favor.");
                        break;

                }

            }
        }

        if (razavar == 2) {
            //ESQUELETO
            while (op != 4) {

                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Terminar turno.");
                System.out.print("\n\t\tTu seleccion: ");
                op = text.nextInt();
                switch (op) {
                    case 1:
                        ops = 5;
                        while (ops != 4) {
                            System.out.println("\n\t\tQue tipo de recolector desea? ");
                            System.out.println("\t\t1. Recolector de Plata.");
                            System.out.println("\t\t2. Recolector de Oro.");
                            System.out.println("\t\t3. Recolector de Diamante.");
                            System.out.println("\t\t4. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    Esqueleto plata=factory.getEsqueleto(1);
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    Esqueleto oro=factory.getEsqueleto(2);
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    Esqueleto diamante=factory.getEsqueleto(3);
                                    break;
                                case 4:
                                    System.out.println("\n\t\tTermino accion en: Recolectores.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener Horda de esqueletos.");
                            System.out.println("\t\t2. Obtener Esqueleto colosal.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    Esqueleto horda=factory.getEsqueleto(4);
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    Esqueleto colosal=factory.getEsqueleto(5);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accione en: Milicia");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener Tanque de huesos.");
                            System.out.println("\t\t2. Obtener bici-huesos.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    Esqueleto tanqueE=factory.getEsqueleto(6);
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    Esqueleto bici = factory.getEsqueleto(7);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accion en: Vehiculos.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\n\t\t:::::::::::::::::::::::::::...::...::::.......::CAMBIO::DE::TURNOS::......::::...::...::::::::::::::::::::::::::");
                        break;
                    default:
                        System.out.println("\n\t\tIngrese opcion valida, por favor.");
                        break;

                }

            }
        }
        if (razavar == 3) {
            //BESTIA
            while (op != 4) {

                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Terminar turno.");
                System.out.print("\n\t\tTu seleccion: ");
                op = text.nextInt();
                switch (op) {
                    case 1:
                        ops = 5;
                        while (ops != 4) {
                            System.out.println("\n\t\tQue tipo de recolector desea? ");
                            System.out.println("\t\t1. Recolector de almas.");
                            System.out.println("\t\t2. Recolector de cristales.");
                            System.out.println("\t\t3. Recolector de luz.");
                            System.out.println("\t\t4. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    Bestia alma=factory.getBestia(1);
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    Bestia cristal=factory.getBestia(2);
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    Bestia luz=factory.getBestia(3);
                                    break;
                                case 4:
                                    System.out.println("\n\t\tTermino accion en: Recolectores.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 2:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener Tribu bestial.");
                            System.out.println("\t\t2. Obtener Bestia mayor.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    Bestia tribu=factory.getBestia(4);
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    Bestia Bmayor=factory.getBestia(5);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accione en: Milicia");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 3:
                        ops = 4;
                        while (ops != 3) {
                            System.out.println("\n\t\t1. Obtener Tanque-bestia.");
                            System.out.println("\t\t2. Obtener carreta-bestial.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //RECOLECTOR
                                    Bestia VPesado_B=factory.getBestia(6);
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    Bestia VLigero_B=factory.getBestia(7);
                                    break;
                                case 3:
                                    System.out.println("\n\t\tTermino accion en: Vehiculos.");
                                    break;
                                default:
                                    System.out.println("Ingrese opcion valida, por favor.");
                                    break;
                            }
                        }
                        break;
                    case 4:
                        System.out.println("\n\t\t:::::::::::::::::::::::::::...::...::::.......::CAMBIO::DE::TURNOS::......::::...::...::::::::::::::::::::::::::");
                        break;
                    default:
                        System.out.println("\n\t\tIngrese opcion valida, por favor.");
                        break;

                }

            }
        }
    }
}
