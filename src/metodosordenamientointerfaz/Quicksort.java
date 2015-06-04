package metodosordenamientointerfaz;

public class Quicksort {
    String arr = "";
    public String ordenarA(int Arreglo[]){
        
        arr = "El arreglo ordenado por quicksort es:\n";
        ordenar(Arreglo,0,Arreglo.length-1);
        for (int x=0;x < Arreglo.length;x++){
            arr += "[ "+Arreglo[x]+" ]";
        }        
        return arr;         
    }	
    public static void ordenar(int Arreglo[], int izq, int der) {

            int pivote=Arreglo[izq]; 		// tomamos primer elemento como pivote
            int i=izq; 				// i realiza la búsqueda de izquierda a derecha
            int j=der; 				// j realiza la búsqueda de derecha a izquierda
            int aux;

            while(i<j){      			// mientras no se crucen las búsquedas
                    while(Arreglo[i]<=pivote && i<j) i++; 	// busca elemento mayor que pivote
                    while(Arreglo[j]>pivote) j--;         	// busca elemento menor que pivote
                    if (i<j) {                      		// si no se han cruzado                      
                            aux= Arreglo[i];                  	// los intercambia
                            Arreglo[i]=Arreglo[j];
                            Arreglo[j]=aux;
                    }
            }
            Arreglo[izq]=Arreglo[j]; 		// se coloca el pivote en su lugar de forma que tendremos
            Arreglo[j]=pivote; 			// los menores a su izquierda y los mayores a su derecha
            if(izq<j-1)
                    ordenar(Arreglo,izq,j-1);	// ordenamos subarray izquierdo
            if(j+1 <der)
                    ordenar(Arreglo,j+1,der); 	// ordenamos subarray derecho
    }
}
    

