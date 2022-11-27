package Spotify;

import java.util.*;

public class TestReproductor {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Reproductor rpdtor = new Reproductor();
        int opcion = 0;

        do {

            System.out.println("\n================================================================");
            System.out.println("                         MENU PRINCIPAL                         ");
            System.out.println("================================================================");
            System.out.println("1.-Insertar pista al inicio\n2.-Insertar pista al final\n3.-Eliminar pista del inicio\n4.-Eliminar pista del final\n5.-Buscar por nombre\n6.-Reproducir por nombre\n7.-Reproducir en orden\n8.-Mostrar pistas\n9.-Salir");
            System.out.println("Ingresa opcion: ");
            opcion = s.nextInt();
            switch (opcion) {
                case 1://Insertar pista al inicio
                    do {
                        System.out.println("================================================================");
                        System.out.println("                     MENU INSERTA PISTA INICIO                  ");
                        System.out.println("================================================================");
                        System.out.println("Que desea ingresar?");
                        System.out.println("\n1.Pista de audio\n2.Pista de video\n3.Volver");
                        System.out.println("Ingresa opcion: ");
                        opcion = s.nextInt();

                        switch (opcion) {
                            case 1://alta audio inicio
                                rpdtor.ingresarPistasInicio(opcion);
                                break;
                            case 2://alta video inicio
                                rpdtor.ingresarPistasInicio(opcion);
                                break;
                            case 3:
                                System.out.println("Regresa a menu principal");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } while (opcion != 3);
                    break;

                case 2://Insertar pista al final
                    do {
                        System.out.println("================================================================");
                        System.out.println("                     MENU INSERTA PISTA FINAL                   ");
                        System.out.println("================================================================");
                        System.out.println("Que desea ingresar?");
                        System.out.println("\n1.Pista de audio\n2.Pista de video\n3.Volver");
                        System.out.println("Ingresa opcion: ");
                        opcion = s.nextInt();
                        switch (opcion) {
                            case 1://alta audio
                                rpdtor.ingresarPistasFinal(opcion);
                                break;
                            case 2://alta video
                                rpdtor.ingresarPistasFinal(opcion);
                                break;
                            case 3:
                                System.out.println("Regresa a menu principal");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    } while (opcion != 3);
                    break;

                case 3://Eliminar pista del inicio
                    do {
                        System.out.println("================================================================");
                        System.out.println("                     MENU ELIMINA PISTA INICIO                  ");
                        System.out.println("================================================================");
                        System.out.println("Que desea eliminar?");
                        System.out.println("\n1.Pista de audio\n2.Pista de video\n3.Volver");
                        System.out.println("Ingresa opcion: ");
                        opcion = s.nextInt();
                        switch (opcion) {
                            case 1://elimina audio
                                rpdtor.eliminarPistasInicio(opcion);
                                break;
                            case 2://elimina video
                                rpdtor.eliminarPistasInicio(opcion);
                                break;
                            case 3:
                                System.out.println("Regresa a menu principal");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }

                    } while (opcion != 3);
                    break;

                case 4://Eliminar pista del final
                    do {
                        System.out.println("================================================================");
                        System.out.println("                      MENU ELIMINA PISTA FINAL                  ");
                        System.out.println("================================================================");
                        System.out.println("Que desea eliminar?");
                        System.out.println("\n1.Pista de audio\n2.Pista de video\n3.Volver");
                        System.out.println("Ingresa opcion: ");
                        opcion = s.nextInt();
                        switch (opcion) {
                            case 1://elimina audio
                                rpdtor.eliminarPistasFinal(opcion);
                                break;
                            case 2://elimina video
                                rpdtor.eliminarPistasFinal(opcion);
                                break;
                            case 3:
                                System.out.println("Regresa a menu principal");
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    } while (opcion != 3);
                    break;
                case 5://Buscar por nombre cancion o video***********************************************
                    System.out.println("Que cancion/video desea buscar?");
                    System.out.println("Ingresa titulo: ");
                    String t = s.next();
                    rpdtor.buscarPistaNombre(t);
                    break;
                case 6://Reproducir por nombre cancion o video*******************************************
                    System.out.println("Que cancion/video desea escuchar/ver?");
                    System.out.println("Ingresa titulo: ");
                    String tn = s.next();
                    rpdtor.reproducirPistaNombre(tn);
                    break;
                case 7://Reproducir en orden
                    rpdtor.reproducirPistas();
                    break;
                case 8://Mostrar listas de reproduccion (todas las pistas)
                    rpdtor.mostrarListas();
                    break;
                case 9://Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 9);

    }
}
