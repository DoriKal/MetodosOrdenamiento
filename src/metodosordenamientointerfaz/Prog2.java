package metodosordenamientointerfaz;

/** Mostrar en Pantalla el Indice del Dato=1 en el Arreglo {9, 20,1,0,8} */

public class Prog2{
 public String ordenar(int arreglo[],int index){
        String arr = "En el Programa2 :\n";
        for(int cont=0;cont < arreglo.length;cont++){
        	if(arreglo[cont]==index)
        	arr += "Usted busca el numero " + arreglo[cont] + " Se guarda en el indice :" + cont+"\n" ;  
                     }
        return arr;
 	}  
}