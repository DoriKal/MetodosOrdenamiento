
package metodosordenamientointerfaz;

import java.util.Stack;

public class Pilas {
    
    Stack<Integer> pila = new Stack<>();
    
    public String ordenarA(int arreglo[]){
        for (int i = 0; i < arreglo.length; i++){
            pila.push(arreglo[i]);
        }
        return "Pila: "+pila+"\nÚltimo elemento: "+pila.peek();
    }
	
}
