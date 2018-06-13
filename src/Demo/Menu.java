package Demo;

import Bestias.Bestia;
import Bestias.BestiaMayor;
import Bestias.Tribu;
import Bestias.VLigero_B;
import Bestias.VPesado_B;
import Esqueletos.Esqueleto;
import Esqueletos.EsqueletoColosal;
import Esqueletos.Horda;
import Esqueletos.VLigero_E;
import Esqueletos.VPesado_E;
import Factorys.AbstractFactory;
import Factorys.FactoryProducer;
import Humanos.Especialista;
import Humanos.Humano;
import Humanos.Soldados;
import Humanos.VLigero_H;
import Humanos.VPesado_H;
import java.util.Scanner;
import java.lang.Integer;
import java.util.ArrayList;

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
    AbstractFactory factory1;
    //PROBABLEMENTE AGREGAR MENU PARA CADA RAZA ENVIANDO PARAMETROS AL MENU, PARA MAYOR COMODIDAD Y ESPECIFICACION CON LO QUE SE ESTA SELECCIONANDO.

    public ArrayList<Integer> seleccionRaza(int raza) {
        ArrayList<Integer> Centro1 = new ArrayList<>();
        if (raza == 1) {
            factory = FactoryProducer.getFactory(raza);
            Humano centroH = factory.getHumano(8);
            Centro1 = centroH.generarCH();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroH.mostrarCH(Centro);
        }
        if (raza == 2) {
            factory = FactoryProducer.getFactory(raza);
            Esqueleto centroE = factory.getEsqueleto(8);
            Centro1 = centroE.generarCE();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroE.mostrarCE(Centro);
        }
        if (raza == 3) {
            factory = FactoryProducer.getFactory(raza);
            Bestia centroB = factory.getBestia(8);
            Centro1 = centroB.generarCB();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroB.mostrarCB(Centro);
        }
        return Centro1;
    }

    public ArrayList<Integer> seleccionRaza2(int raza) {
        ArrayList<Integer> Centro2 = new ArrayList<>();
        if (raza == 1) {
            factory1 = FactoryProducer.getFactory(raza);
            Humano centroH = factory1.getHumano(8);
            Centro2 = centroH.generarCH();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroH.mostrarCH(Centro);
        }
        if (raza == 2) {
            factory1 = FactoryProducer.getFactory(raza);
            Esqueleto centroE = factory1.getEsqueleto(8);
            Centro2 = centroE.generarCE();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroE.mostrarCE(Centro);
        }
        if (raza == 3) {
            factory1 = FactoryProducer.getFactory(raza);
            Bestia centroB = factory1.getBestia(8);
            Centro2 = centroB.generarCB();
            /////////////////////////////////////////////////////////////////SECCION DE PRUEBA///////////////////////////////////////////////////////
            //centroB.mostrarCB(Centro);
        }
        return Centro2;
    }

    //OP JUGADOR1
    public void Opciones(int razavar, ArrayList<Integer> Centro1, ArrayList<Integer> Centro2) {
        int op = 6;
        int ops;
        int recolectado=0;
        Scanner text = new Scanner(System.in);

        if (razavar == 1) {
            //HUMANO
            while (op != 5) {
                Humano Centro_H = factory.getHumano(8);
                Centro_H.mostrarCH(Centro1);
                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano madera = factory.getHumano(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de madera por $300 de piedra y de hierro. ");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=madera.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    madera.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano piedra = factory.getHumano(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de piedra por $300 de madera y de hierro. ");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=piedra.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    piedra.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano hierro = factory.getHumano(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de hierro por $300 de piedra y de madera.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=hierro.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    hierro.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano soldados = factory.getHumano(4);
                                    ArrayList<Soldados> SOLDADO= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar. $400 de madera y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $200 piedra y de hierro.");
                                        System.out.println("\t\t3. Comenzar a defender. $100 hierro y madera.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.print("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                SOLDADO=soldados.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                soldados.M_atacar(SOLDADO,Centro1,Centro2);
                                                break;
                                            case 3:
                                                soldados.M_defender(SOLDADO, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano especialista = factory.getHumano(5);
                                    ArrayList<Especialista> Especial= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar. $600 de madera y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $300 piedra y de hierro.");
                                        System.out.println("\t\t3. Comenzar defenza. $200 hierro y madera.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                Especial=especialista.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                especialista.M_atacarE(Especial,Centro1,Centro2);
                                                break;
                                            case 3:
                                                especialista.M_defenderE(Especial, Centro1);
                                                break;
                                        }
                                    }
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
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano tanque = factory.getHumano(6);
                                    ArrayList<VPesado_H> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo. $50 hierro y madera.");
                                        System.out.println("\t\t2. Comenzar ataque. $100 piedra y de hierro.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=tanque.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                tanque.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano moto = factory.getHumano(7);
                                    ArrayList<VLigero_H> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo. $100 hierro y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $105 madera y piedra.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=moto.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                moto.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_H.mejorarCH(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_H.mejorarCH(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_H.mejorarCH(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
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
            while (op != 5) {
                Esqueleto Centro_E = factory.getEsqueleto(8);
                Centro_E.mostrarCE(Centro1);

                System.out.println("\n\t\t1. Crear recolectores. ");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto plata = factory.getEsqueleto(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de plata por $200 de oro y de diamante.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=plata.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    plata.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto oro = factory.getEsqueleto(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de oro por $200 de plata y de diamante.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=oro.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    oro.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto diamante = factory.getEsqueleto(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de diamante por $200 de oro y de plata.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=diamante.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    diamante.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                            System.out.println("\n\t\t1. Obtener Horda de esqueletos.");
                            System.out.println("\t\t2. Obtener Esqueleto colosal.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto horda = factory.getEsqueleto(4);
                                    ArrayList<Horda> SOLDADOSE= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                SOLDADOSE=horda.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                horda.M_atacar(SOLDADOSE, Centro1,Centro2);
                                                break;
                                            case 3:
                                                horda.M_defender(SOLDADOSE, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto colosal = factory.getEsqueleto(5);
                                    ArrayList<EsqueletoColosal> ESPECIALE= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ESPECIALE=colosal.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                colosal.M_atacarE(ESPECIALE, Centro1,Centro2);
                                                break;
                                            case 3:
                                                colosal.M_defenderE(ESPECIALE, Centro1);
                                                break;
                                        }
                                    }
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
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto tanqueE = factory.getEsqueleto(6);
                                    ArrayList<VPesado_E> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=tanqueE.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                tanqueE.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto bici = factory.getEsqueleto(7);
                                    ArrayList<VLigero_E> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=bici.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                bici.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_E.mejorarCE(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_E.mejorarCE(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_E.mejorarCE(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
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
            while (op != 5) {
                Bestia Centro_B = factory.getBestia(8);
                Centro_B.mostrarCB(Centro1);

                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia alma = factory.getBestia(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant1 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=alma.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    alma.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia cristal = factory.getBestia(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant2 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=cristal.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    cristal.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia luz = factory.getBestia(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant3 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=luz.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    luz.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                            System.out.println("\n\t\t1. Obtener Tribu bestial.");
                            System.out.println("\t\t2. Obtener Bestia mayor.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia tribu = factory.getBestia(4);
                                    ArrayList<Tribu> TRI= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                TRI=tribu.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                tribu.M_atacar(TRI, Centro1,Centro2);
                                                break;
                                            case 3:
                                                tribu.M_defender(TRI, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia Bmayor = factory.getBestia(5);
                                    ArrayList<BestiaMayor> BM= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                BM=Bmayor.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                Bmayor.M_atacarE(BM, Centro1,Centro2);
                                                break;
                                            case 3:
                                                Bmayor.M_defenderE(BM, Centro1);
                                                break;
                                        }
                                    }
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
                                    //Vehiculo
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    //factory = FactoryProducer.getFactory(3);
                                    Bestia VPesado_B = factory.getBestia(6);
                                    ArrayList<VPesado_B> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=VPesado_B.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                VPesado_B.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //Vehiculo
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia VLigero_B = factory.getBestia(7);
                                    ArrayList<VLigero_B> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=VLigero_B.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                VLigero_B.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_B.mejorarCB(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_B.mejorarCB(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_B.mejorarCB(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
                        System.out.println("\n\t\t:::::::::::::::::::::::::::...::...::::.......::CAMBIO::DE::TURNOS::......::::...::...::::::::::::::::::::::::::");
                        break;
                    default:
                        System.out.println("\n\t\tIngrese opcion valida, por favor.");
                        break;

                }

            }
        }
    }
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //OP JUGADOR 2

    public void Opciones2(int razavar, ArrayList<Integer> Centro1, ArrayList<Integer> Centro2) {
        int op = 6;
        int ops;
        int recolectado=0;
        Scanner text = new Scanner(System.in);

        if (razavar == 1) {
            //HUMANO
            while (op != 5) {
                Humano Centro_H = factory1.getHumano(8);
                Centro_H.mostrarCH(Centro1);
                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano madera = factory1.getHumano(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de madera por $300 de piedra y de hierro. ");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=madera.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    madera.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Humano piedra = factory1.getHumano(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de piedra por $300 de madera y de hierro. ");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=piedra.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    piedra.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano hierro = factory1.getHumano(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de hierro por $300 de piedra y de madera.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=hierro.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    hierro.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano soldados = factory1.getHumano(4);
                                    ArrayList<Soldados> SOLDADO= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar. $400 de madera y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $200 piedra y de hierro.");
                                        System.out.println("\t\t3. Comenzar a defender. $100 hierro y madera.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.print("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                SOLDADO=soldados.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                soldados.M_atacar(SOLDADO,Centro1,Centro2);
                                                break;
                                            case 3:
                                                soldados.M_defender(SOLDADO, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano especialista = factory1.getHumano(5);
                                    ArrayList<Especialista> Especial= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar. $600 de madera y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $300 piedra y de hierro.");
                                        System.out.println("\t\t3. Comenzar defenza. $200 hierro y madera.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                Especial=especialista.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                especialista.M_atacarE(Especial,Centro1,Centro2);
                                                break;
                                            case 3:
                                                especialista.M_defenderE(Especial, Centro1);
                                                break;
                                        }
                                    }
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
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano tanque = factory1.getHumano(6);
                                    ArrayList<VPesado_H> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo. $50 hierro y madera.");
                                        System.out.println("\t\t2. Comenzar ataque. $100 piedra y de hierro.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=tanque.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                tanque.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Humano moto = factory1.getHumano(7);
                                    ArrayList<VLigero_H> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo. $100 hierro y piedra.");
                                        System.out.println("\t\t2. Comenzar ataque. $105 madera y piedra.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=moto.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                moto.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_H.mejorarCH(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_H.mejorarCH(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_H.mejorarCH(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
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
            while (op != 5) {
                Esqueleto Centro_E = factory1.getEsqueleto(8);
                Centro_E.mostrarCE(Centro1);

                System.out.println("\n\t\t1. Crear recolectores. ");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto plata = factory1.getEsqueleto(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de plata por $200 de oro y de diamante.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=plata.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    plata.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto oro = factory1.getEsqueleto(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de oro por $200 de plata y de diamante.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=oro.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    oro.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Esqueleto diamante = factory1.getEsqueleto(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar. $600 de diamante por $200 de oro y de plata.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                recolectado=diamante.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    diamante.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                            System.out.println("\n\t\t1. Obtener Horda de esqueletos.");
                            System.out.println("\t\t2. Obtener Esqueleto colosal.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto horda = factory1.getEsqueleto(4);
                                    ArrayList<Horda> SOLDADOSE= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                SOLDADOSE=horda.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                horda.M_atacar(SOLDADOSE, Centro1,Centro2);
                                                break;
                                            case 3:
                                                horda.M_defender(SOLDADOSE, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto colosal = factory1.getEsqueleto(5);
                                    ArrayList<EsqueletoColosal> ESPECIALE= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ESPECIALE=colosal.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                colosal.M_atacarE(ESPECIALE, Centro1,Centro2);
                                                break;
                                            case 3:
                                                colosal.M_defenderE(ESPECIALE, Centro1);
                                                break;
                                        }
                                    }
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
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto tanqueE = factory1.getEsqueleto(6);
                                    ArrayList<VPesado_E> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=tanqueE.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                tanqueE.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Esqueleto bici = factory1.getEsqueleto(7);
                                    ArrayList<VLigero_E> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=bici.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                bici.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_E.mejorarCE(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_E.mejorarCE(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_E.mejorarCE(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\n\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
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
            while (op != 5) {
                Bestia Centro_B = factory1.getBestia(8);
                Centro_B.mostrarCB(Centro1);

                System.out.println("\n\t\t1. Crear recolectores.");
                System.out.println("\t\t2. Formar milicia.");
                System.out.println("\t\t3. Construir vehiculos de ataque.");
                System.out.println("\t\t4. Mejorar centro de mando.");
                System.out.println("\t\t5. Terminar turno.");
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
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia alma = factory1.getBestia(1);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant1 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=alma.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    alma.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia cristal = factory1.getBestia(2);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant2 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=cristal.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    cristal.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 3:
                                    //RECOLECTOR
                                    ops = 4;
                                    ////////////////////////////////////////////////////////////////////////////////////
                                    Bestia luz = factory1.getBestia(3);
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Comenzar a recolectar.");
                                        System.out.println("\t\t2. Obetener lo recolectado.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        //int cant3 = 0;
                                        switch (ops) {
                                            case 1:
                                                recolectado=luz.E_generar();
                                                break;
                                            case 2:
                                                if(recolectado!=0){
                                                    luz.E_recolectar(recolectado, Centro1);
                                                }
                                                else{
                                                    System.out.println("\t\tPRIMERO DEBE INICIAR A RECOLECTAR.");
                                                }
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
                            System.out.println("\n\t\t1. Obtener Tribu bestial.");
                            System.out.println("\t\t2. Obtener Bestia mayor.");
                            System.out.println("\t\t3. Terminar accion.");
                            System.out.print("\n\t\tTu seleccion: ");
                            ops = text.nextInt();
                            switch (ops) {
                                case 1:
                                    //ESCUADRON
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia tribu = factory1.getBestia(4);
                                    ArrayList<Tribu> TRI= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                TRI=tribu.M_entrenar(Centro1);
                                                break;
                                            case 2:
                                                tribu.M_atacar(TRI, Centro1,Centro2);
                                                break;
                                            case 3:
                                                tribu.M_defender(TRI, Centro1);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //ESPECIALISTA
                                    ops = 5;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia Bmayor = factory1.getBestia(5);
                                    ArrayList<BestiaMayor> BM= new ArrayList<>();
                                    while (ops != 4) {
                                        System.out.println("\n\t\t1. Comenzar a entrenar.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Comenzar defenza.");
                                        System.out.println("\t\t4. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                BM=Bmayor.M_entrenarE(Centro1);
                                                break;
                                            case 2:
                                                Bmayor.M_atacarE(BM, Centro1,Centro2);
                                                break;
                                            case 3:
                                                Bmayor.M_defenderE(BM, Centro1);
                                                break;
                                        }
                                    }
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
                                    //Vehiculo
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    //factory = FactoryProducer.getFactory(3);
                                    Bestia VPesado_B = factory1.getBestia(6);
                                    ArrayList<VPesado_B> pesado= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                pesado=VPesado_B.V_construccionP(Centro1);
                                                break;
                                            case 2:
                                                VPesado_B.V_atacarP(pesado, Centro1,Centro2);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                    //Vehiculo
                                    ops = 4;
                                    ///////////////////////////////////////////////////////////////////
                                    Bestia VLigero_B = factory1.getBestia(7);
                                    ArrayList<VLigero_B> ligero= new ArrayList<>();
                                    while (ops != 3) {
                                        System.out.println("\n\t\t1. Construir vehiculo.");
                                        System.out.println("\t\t2. Comenzar ataque.");
                                        System.out.println("\t\t3. Terminar accion.");
                                        System.out.println("\n\t\tTu eleccion: ");
                                        ops = text.nextInt();
                                        switch (ops) {
                                            case 1:
                                                ligero=VLigero_B.V_construccion(Centro1);
                                                break;
                                            case 2:
                                                VLigero_B.V_atacar(ligero, Centro1,Centro2);
                                                break;
                                        }
                                    }
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
                        int num = 3;
                        while (num != 2) {
                            System.out.println("\t\tSeguro que quiere hacer mejoras?");
                            System.out.println("\t\t1. Si");
                            System.out.println("\t\t2. No");
                            System.out.print("\n\t\tTu eleccion: ");
                            //System.out.println(Centro1.get(3));
                            num = text.nextInt();
                            switch (num) {
                                case 1:
                                    if (Centro1.get(3) == 10000) {
                                        if (Centro1.get(0) >= 1650 && Centro1.get(1) >= 1650 && Centro1.get(2) >= 1650) {
                                            Centro_B.mejorarCB(1, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 11000) {
                                        if (Centro1.get(0) >= 1895 && Centro1.get(1) >= 1895 && Centro1.get(2) >= 1895) {
                                            Centro_B.mejorarCB(2, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    if (Centro1.get(3) == 14300) {
                                        if (Centro1.get(0) >= 2274 && Centro1.get(1) >= 2274 && Centro1.get(2) >= 2274) {
                                            Centro_B.mejorarCB(3, Centro1);
                                        } else {
                                            System.out.println("\n\t\tREY, NO TIENE SUFICIENTES MATERIALES.");
                                        }
                                    }
                                    break;
                                case 2:
                                    System.out.println("\t\tAccion terminada.");
                                    break;
                            }
                        }
                        break;
                    case 5:
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
