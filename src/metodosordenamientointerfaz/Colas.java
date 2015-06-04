package metodosordenamientointerfaz;

import java.util.LinkedList;

public class Colas {

    String arr = "";

    public String ordenarA(int Arreglo[]) {
        LinkedList<Integer> cola = new LinkedList<>();
        for (int i = 0; i < Arreglo.length; i++) {
            cola.offer(Arreglo[i]);
        }

        while (cola.peek() != null) {
            arr += "[ " + cola.poll() + " ]";
        }
        return arr;
    }

}
