package metodosordenamientointerfaz;

/*Mostrar el Indice en el cual esta Almacenado el "*" */

public class Prog3{
	public String ordenar(){
                String index2 = "I";
                String []arreglo = {"A","E","I","O","U"};
                String array = "A,E,I,O,U";
                String arr = "En el Programa2 :\n";
                arr += "El Array es :"+"[ "+array+" ]"+"\n";
                arr += "La Vocal que se busca es :"+"[ "+index2+" ]"+"\n";
                
		for(int cont=0;cont < arreglo.length;cont++){
			if(arreglo[cont] == index2)
		arr += "Usted busca la Vocal " +"["+ arreglo[cont] +"]"+ " Se guarda en el indice : " + cont+"\n" ;
		}
                return arr;
	}
}


  
