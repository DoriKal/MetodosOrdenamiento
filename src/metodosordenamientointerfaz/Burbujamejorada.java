package metodosordenamientointerfaz;
public class Burbujamejorada {
    
    public String ordenar (int a[]){ 
        String arr = "El arreglo ordenado por burbuja mejorada es:\n";
        for(int i=a.length-1; i>0; i--){
            for(int j=0; j<i; j++){
            	if(a[j] > a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
		}
            }
	}
	for (int x=0;x < a.length;x++){
            
            arr += "[ "+a[x]+" ]";
        }        
        return arr;        
    }    
}	
			
			

	
		
	
    

