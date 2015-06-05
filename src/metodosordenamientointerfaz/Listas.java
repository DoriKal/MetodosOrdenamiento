package metodosordenamientointerfaz;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Listas extends ArrayList{

    // Declaración el ArrayList
    ArrayList<Integer> nombreArrayList = new ArrayList<>();
    String elemento = "";

    public String ordenarA(int arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            nombreArrayList.add(arreglo[i]);
        }
        // Declaramos el Iterador e imprimimos los Elementos del ArrayList
        Iterator<Integer> nombreIterator = nombreArrayList.iterator();
        while (nombreIterator.hasNext()) {
            elemento += "[ " + nombreIterator.next() + " ]";
        }
        return elemento;
    }

}
