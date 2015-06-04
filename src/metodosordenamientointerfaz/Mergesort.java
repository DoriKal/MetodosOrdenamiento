package metodosordenamientointerfaz;
public class Mergesort {     
    
    String arr = "El arreglo ordenado por mergesort es:\n";
    
    public String ordenar(int Arreglo[]){
        Mergesort.mergesort(Arreglo, 0, Arreglo.length-1);        
        
        for (int x=0;x < Arreglo.length;x++){
            arr += "[ "+Arreglo[x]+" ]";
        }        
        return arr; 
    }
    
    public static void mergesort (int Arreglo[], int primero, int ultimo){
        int central;
        if (primero<ultimo){            
            central=(primero+ultimo)/2; // pto. medio del vector 
            mergesort(Arreglo,primero,central);//ordena la primera mitad
            mergesort(Arreglo,central+1,ultimo);//ordena la segunda mitad
            mezcla(Arreglo,primero,central,ultimo);//se ordenan las secuencias y se funcionan
        }
    }
    public static void mezcla(int Arreglo[], int izq, int medio, int der){//combina los conjuntos ordenados
        int temp[]=new int[Arreglo.length];
        int i,k,z;
        i=z=izq;
        k=medio+1;

        while(i<=medio && k<=der){
            if(Arreglo[i]<=Arreglo[k]) 
                temp[z++]=Arreglo[i++];
            else 
                temp[z++]=Arreglo[k++];

        }
        while(i<=medio) temp[z++]=Arreglo[i++];
        while(k<=der) temp[z++]=Arreglo[k++];

        System.arraycopy(temp, izq, Arreglo, izq, der-izq+1);
    }
    
}


