package metodosordenamientointerfaz;

public class Burbujasimple {
    int auxiliar;
    String arr = "El arreglo ordenado por burbuja simple es:\n";
    public String ordenar(int Arreglo[]){
    for(int i=0; i<Arreglo.length-1; i++){
                    for(int j=0; j<Arreglo.length-1; j++){
                            if(Arreglo[j]>Arreglo[j+1]){
                                    auxiliar=Arreglo[j];
                                    Arreglo[j]=Arreglo[j+1];
                                    Arreglo[j+1]=auxiliar;
                            }
                    }
            }
        for (int x=0;x < Arreglo.length;x++){
            arr += "[ "+Arreglo[x]+" ]";
        }        
        return arr; 

    }
}
    

