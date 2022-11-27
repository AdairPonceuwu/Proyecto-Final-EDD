package Spotify;

import java.util.*;

public class Reproductor {

    LinkedList<Audio> listaAudio = new LinkedList<>();
    LinkedList<Video> listaVideo = new LinkedList<>();
    ListIterator<Audio> itA = listaAudio.listIterator();
    ListIterator<Video> itV = listaVideo.listIterator();

    Audio adio;
    Video vdio;

    public Reproductor() {
    }

    public LinkedList<Audio> getListaAudio() {
        return listaAudio;
    }

    public LinkedList<Video> getListaVideo() {
        return listaVideo;
    }

    public void ingresarPistasInicio(int opcion) {
        Scanner s = new Scanner(System.in);
        if (opcion == 1) {
            System.out.println("\nDatos generales del AUDIO");
            System.out.println("Titulo: ");
            String t = s.next();
            System.out.println("Autor: ");
            String a = s.next();
            System.out.println("Duracion: ");
            int d = s.nextInt();
            adio = new Audio(a, t, d);
            listaAudio.addFirst(adio);

        } else if (opcion == 2) {
            System.out.println("\nDatos generales del VIDEO");
            System.out.println("Titulo: ");
            String t = s.next();
            System.out.println("Duracion: ");
            int d = s.nextInt();
            System.out.println("Formato: ");
            String f = s.next();
            vdio = new Video(f, t, d);
            listaVideo.addFirst(vdio);
        }
    }

    public void ingresarPistasFinal(int opcion) {
        Scanner s = new Scanner(System.in);
        if (opcion == 1) {
            System.out.println("\nDatos generales del AUDIO");
            System.out.println("Titulo: ");
            String t = s.next();
            System.out.println("Autor: ");
            String a = s.next();
            System.out.println("Duracion: ");
            int d = s.nextInt();
            adio = new Audio(a, t, d);
            listaAudio.addLast(adio);

        } else if (opcion == 2) {
            System.out.println("\nDatos generales del VIDEO");
            System.out.println("Titulo: ");
            String t = s.next();
            System.out.println("Duracion: ");
            int d = s.nextInt();
            System.out.println("Formato: ");
            String f = s.next();
            vdio = new Video(f, t, d);
            listaVideo.addLast(vdio);
        }
    }

    public void eliminarPistasInicio(int opcion) {
        if (opcion == 1) {
            listaAudio.removeFirst();
        } else if (opcion == 2) {
            listaVideo.removeFirst();
        }
    }

    public void eliminarPistasFinal(int opcion) {
        if (opcion == 1) {
            listaAudio.removeLast();
        } else if (opcion == 2) {
            listaVideo.removeLast();
        }
    }

    public void reproducirPistas() {
        System.out.println("================================================================");
        System.out.println("         Reproduciendo pistas audio en orden ascendente         ");
        System.out.println("================================================================");
        for (itA = listaAudio.listIterator(); itA.hasNext();) {
            System.out.print(itA.next());
            System.out.println("\nReproduciendo.........");
        }
        System.out.println("================================================================");
        System.out.println("         Reproduciendo pistas video en orden ascendente         ");
        System.out.println("================================================================");
        for (itV = listaVideo.listIterator(); itV.hasNext();) {
            System.out.print(itV.next());
            System.out.println("\nReproduciendo.........");
        }
    }

    public void reproducirPistaNombre(String t) {
        int posa = 0, posv = 0, banda = 0, bandv = 0;
        for (itA = listaAudio.listIterator(); itA.hasNext();) {
            if (!itA.next().getTitulo().equalsIgnoreCase(t)) {
                System.out.println("\nBuscando audio....");
            } else {
                banda = 1;
                posa = itA.previousIndex();
            }
        }
        if (banda == 1) {
            System.out.println("\nPista audio encontrada");
            System.out.print(listaAudio.get(posa).toString());
            System.out.println("\nReproduciendo audio.........");

        } else {
            System.out.println("\nPista audio no encontrada.........");
        }

        for (itV = listaVideo.listIterator(); itV.hasNext();) {
            if (!itV.next().getTitulo().equalsIgnoreCase(t)) {
                System.out.println("\nBuscando video....");
            } else {
                bandv = 1;
                posv = itV.previousIndex();
                System.out.println("\nPista video encontrada");
            }
        }
        if (bandv == 1) {
            System.out.print(listaVideo.get(posv).toString());
            System.out.println("\nReproduciendo video.........");
        } else {
            System.out.println("\nPista video no encontrada.........");
        }
    }

    public void buscarPistaNombre(String t) {
        int posa = 0, posv = 0, banda = 0, bandv = 0;
        for (itA = listaAudio.listIterator(); itA.hasNext();) {
            if (!itA.next().getTitulo().equalsIgnoreCase(t)) {
                System.out.println("\nBuscando audio....");
            } else {
                banda = 1;
                posa = itA.previousIndex();
            }
        }
        if (banda == 1) {
            System.out.println("\nPista audio encontrada,numero de pista:" + (posa + 1));
        } else {
            System.out.println("\nPista audio no encontrada");
        }

        for (itV = listaVideo.listIterator(); itV.hasNext();) {
            if (!itV.next().getTitulo().equalsIgnoreCase(t)) {
                System.out.println("\nBuscando video....");
            } else {
                bandv = 1;
                posv = itV.previousIndex();
            }
        }
        if (bandv == 1) {
            System.out.println("\nPista video encontrada,numero de pista:" + (posv + 1));
        } else {
            System.out.println("\nPista video no encontrada");
        }
    }

    public void mostrarListas() {
        System.out.println("======================");
        System.out.println("|      PISTAS AUDIO    |");
        System.out.println("======================");
        for (itA = listaAudio.listIterator(); itA.hasNext();) {
            System.out.println(itA.next());

        }
        System.out.println("======================");
        System.out.println("|      PISTAS VIDEO    |");
        System.out.println("======================");
        for (itV = listaVideo.listIterator(); itV.hasNext();) {
            System.out.println(itV.next());
        }
    }

}
