package Spotify;

class Nodoa {

    private Audio info;
    private Video infoV;
    private Nodoa izq;
    private Nodoa der;

    public Nodoa(Audio dato) {
        info = dato;
        izq = null;
        der = null;
    }

    //Sobrecarga
    public Nodoa(Video dato) {
        infoV = dato;
        izq = null;
        der = null;
    }

    public Video getDatoV() {
        return infoV;
    }

    public Audio getDato() {
        return info;
    }

    public Nodoa getIzq() {
        return izq;
    }

    public Nodoa getDer() {
        return der;
    }

    public void setDato(Audio dato) {
        info = dato;
    }

    //Sobrecarga
    public void setDato(Video dato) {
        infoV = dato;
    }

    public void setIzq(Nodoa x) {
        izq = x;
    }

    public void setDer(Nodoa x) {
        der = x;
    }

}

public class arbolbin {

    private Nodoa raiz1;

    public arbolbin() {
        raiz1 = null;
    }

    public void insertar(Audio valor) {
        Nodoa nuevonodo = new Nodoa(valor);
        Nodoa actual = raiz1;
        Nodoa anterior = null;
        if (raiz1 == null) {
            raiz1 = nuevonodo;
        } else {
            while (actual != null) {
                anterior = actual;
                if (valor.reproducciones > actual.getDato().reproducciones) {
                    actual = actual.getDer();
                } else {
                    actual = actual.getIzq();
                }
            }
            if (valor.reproducciones > anterior.getDato().reproducciones) {
                anterior.setDer(nuevonodo);
            } else {
                anterior.setIzq(nuevonodo);
            }
        }
    }
    //Sobrecarga
    public void insertar(Video valor) {
        Nodoa nuevonodo = new Nodoa(valor);
        Nodoa actual = raiz1;
        Nodoa anterior = null;
        if (raiz1 == null) {
            raiz1 = nuevonodo;
        } else {
            while (actual != null) {
                anterior = actual;
                if (valor.reproducciones > actual.getDatoV().reproducciones) {
                    actual = actual.getDer();
                } else {
                    actual = actual.getIzq();
                }
            }
            if (valor.reproducciones > anterior.getDatoV().reproducciones) {
                anterior.setDer(nuevonodo);
            } else {
                anterior.setIzq(nuevonodo);
            }
        }
    }

    public Nodoa Obten_raiz() {
        return raiz1;
    }

    public void preorden(Nodoa x) {
        if (x != null) {
            System.out.println(x.getDato());
            preorden(x.getIzq());
            preorden(x.getDer());
        }

    }

    public void estoNoEsInorden(Nodoa x) {
        if (x != null) {

            estoNoEsInorden(x.getDer());
            System.out.println(x.getDato());
            estoNoEsInorden(x.getIzq());
        }
    }

    public void postorden(Nodoa x) {
        if (x != null) {
            postorden(x.getIzq());
            postorden(x.getDer());
            System.out.println(x.getDato());
        }
    }

    public int cuentaNodos(Nodoa x) {
        if (x != null) {
            return 1 + cuentaNodos(x.getIzq())
                    + cuentaNodos(x.getDer());
        }

        return 0;
    }

    /*public static void main(String[] args) {
    arbolbin b = new arbolbin();
    b.insertar(25);
    b.insertar(20);
    b.insertar(10);
    b.insertar(6);
    b.insertar(4);
    b.insertar(7);
    b.insertar(8);
    b.insertar(22);
    b.insertar(30);
    //b.insertar(28);
    b.insertar(40);
    System.out.println("se encuentra el dato 15 " + b.buscar(15));
    System.out.println("el recorrido en preorden" + " es ");
    b.preorden(b.Obten_raiz());
    System.out.println("el recorrido en inorden es ");
    b.inorden(b.Obten_raiz());
    System.out.println("el recorrido en postorden es ");
    b.postorden(b.Obten_raiz());
    System.out.println("el total de nodos del árbol es " + b.cuentaNodos(b.Obten_raiz()));
    
    }*/
}
