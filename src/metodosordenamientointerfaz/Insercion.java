package metodosordenamientointerfaz;

public class Insercion {
    int cont1,cont2,aux;
    String arr = "El arreglo ordenado por inserción es:\n";
    public String ordenar(int Arreglo[]){
        for(cont1 = 1; cont1<Arreglo.length;cont1++){
            aux =Arreglo[cont1];
            for (cont2=cont1-1;cont2 >=0 && Arreglo[cont2]>aux;cont2--){
            	Arreglo[cont2+1]=Arreglo[cont2];
		Arreglo[cont2]=aux;
            }
	}
        for (int x=0;x < Arreglo.length;x++){
            arr += "| "+Arreglo[x]+" |";
        }        
        return arr; 
    }
}