package metodosordenamientointerfaz;

public class ListaDoblementeEnlazada {

    Object dato;
    NodoLista nodoProximo;
    NodoLista nodoAnterior;

    NodoLista(Object objeto) {
        this(objeto, null, null);
    }

    Nodo Lista(Objet objeto, Nodolista prox, NodoLista ant) {
        dato = objeto;
        nodoProximo = aprox;
        nodoAnterior = ant;
    }

    Object obtenerObjeto() {
        return dato;
    }

    NodoLista obtenerProximo() {
        return nodoProximo;
    }

    NodoLista obtenerAnterior() {
        return nodoAnterior;
    }
}

public class ExcepcionListaVacia 

    extendes RuntimeException{
	public ExceptionListaVacia(String nombre) {
        super("La lista" + nombre + "esta vacia");
    }
}

public class ListaDoblementeEnlazada {

    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombre;

    public ListaDoblementeEnlazada(String cadena) {
        nombre = cadena;
        primerNodo = ultimoNodo = null;
    }

    public ListaDoblementeEnlazada() {
        this("lista");
    }

    public synchronized void insertarDelante(ObjectelementoAInsertar) {
        if (estaVacio()) {
            primerNodo = ultimoNodo = new NodoLista(elementoAInsertar);
        } else {
            NodoLista desplazado = primerNodo;
            primerNodo = new NodoLista(elementoAInsertar, desplazado, null);
            desplazado.nodoAnterior = primerNodo;
        }
    }

    public synchronized void insertarDetras(Object elementoAInsertar) {
        if (estaVacio()) {
            primerNodo = ultimoNodo = new NodoLista(elementoAInsertar);
            {
                else{
                            NodoLista desplazado = ultimoNodo;
                            ultimoNodo = newNodoLista(elementoAInsertar, null, desplazado);
                            desplazado.nodoProximo = ultimoNodo;
                            {
                            }
    

    

    

    public synchronized Object removerDeAdelante() throws ExceptionListaVacia {
        Object elementoARemover = null;
        if (estaVacio()) {
            throw new ExceptionListaVacia(nombre);
        }
        elementoARemover = primerNodo.dato;
        if (primerNodo == ultimoNodo) {
            primernodo = ultimoNodo = null;
        } else {
            primerNodo = primerNodo.nodoProximo;
            primerNodo.nodo.Anterior = null;
        }
        return elementoARemover;
    }

    public synchronized Object removerDeDetras() throws ExceptionListaVacia {
        Object elementoARemover = null;
        if ((estaVacio)) {
            throw new ExceptionListavacia(nombre);
        }
        elementoARemover = ultimoNodo.dato;
        if (primerNodo == ultimoNodo) {
            primerNodo = ultimoNodo = null;
        } else {
            ultimoNodo = ultimoNodo.nodoAnterior;
            ultimoNodo.nodoProximo = null;
        }
        return elementoARemover;
    }

    public synchronized boolean estaVacio() {
        return primerNodo == null;
    }

    public synchronized void imprimir() {
        if (estaVacio()) {
            System.out.println("Vacio" + nombre);
        }
        System.out.print("La lista" + nombre + "es:");
        NodoListaactual = primerNodo;
        while (actual != null) {
            System.out.print(actual.dato.toString() + "");
            actual = actual.nodoProximo;
        }
        System.out.println("\n");
    }

    public synchronized void imprimirDesdeUltimo() {
        if (estaVacio()) {
            System.out.println("Vacio" + nombre);
            return;
        }
        System.out.print("La lista" + nombre + "es:");
        NodoLista actual = ultimoNodo;
        while (actual != null) {
            System.out.print(actual.dato.toString() + "");
            actual = actual.nodoAnterior;
        }
        System.out.println("\n");
    }
}
