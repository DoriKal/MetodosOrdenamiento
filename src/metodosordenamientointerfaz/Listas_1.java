package metodosordenamientointerfaz;
import java.util.*;
public class Listas_1{
	public static class ClaseListas{
		static String dato[]= new String[100];
		static int sn[]=new int[100];
		static int apui,inicio,top,fin;
			ClaseListas(){
				apui=-1;
				top=0;
				inicio=0;
				fin=0;
				System.out.println("*****Listas ligadas sencillas*****\n");
				System.out.println("apui="+apui);
				System.out.println("top="+top);
				System.out.println("MAX="+sn.length);
			}
		public static void Mostrar(){
			int i=0;
			System.out.println("\n*****Lista ligada sencilla*****");
			if(apui==-1)System.out.println("\nLa losta esta vacia\n");
			System.out.println("�Posicion\t\t�Dato\t\t�Siguiente nodo");
			for(i=inicio;i<fin;i++){
				System.out.println("�"+i+"\t\t\t�"+dato[i]+"\t\t"+sn[i]);
			}
			System.out.println("\napui="+apui);
			System.out.println("top="+top);
			System.out.println("MAX="+sn.length);
		}
		public static void Eliminarp(){
			if(apui==-1){
				System.out.println("\nLalista esta vacia\n");
			}
			else{
				System.out.println("Dato eliminado de la lista en la pocision o:"+dato[inicio]);
			inicio++;
			}
		}
		public static void Eliminaru(){
			if(apui==-1){
				System.out.println("\nLalista esta vacia");
			}
			else{
				System.out.println("Dato eliminado de la lista en la posicion"+fin+":"+dato[fin-1]);
				fin--;
			}
		}
		public static void Busqueda(){
			Scanner leer=new Scanner(System.in);
			if(apui==-1){
				System.out.println("\nLa lista esta vacia\n");
				return;
			}
			System.out.println("Ingresa el dato para buscar:");
			String buscar=leer.next();
			int fin=top;
			String V="";
			int x=0;
			for(int i=inicio;i<top;i++){
				if(buscar.equals(dato[i])){
					V=dato[i];
					x=i;
				}
			}
			if(V.equals(buscar)){
				System.out.println("�Posicion\t\t�Dato\t\t�Siguiente nodo");
				System.out.println("-------------------------------------");
				System.out.println("�"+x+"\t\t\t"+dato[x]+"\t\t"+sn[x]);
			}
			else{
				System.out.println("\nEl dato no existe en la lista");
			}
		}
		public static void Insertar(String elemento){
			int i=0, ant=0;
			if(apui==-1){
				System.out.println("**Agregado al inicio de la lista**");
				apui=top;
				dato[top]=elemento;
				sn[top]=-1;
				top++;
				fin=top;
				return;
			}
			i=apui;
			do{
				if(dato[i]==elemento){
					System.out.println("Duplicado!!!");
					return;
				}
				ant = i;
				i=sn[i];
			}
			while(apui!=-1);
			System.out.println("**Agregado al final de la lista**");
			dato[top]=elemento;
			sn[top]=-1;
			sn[ant]=top;
			top++;
			fin=top;
			return;
		}


	static ClaseListas Lista=new ClaseListas();
	public static void main(String args[]){
		int op=0;
		Scanner leer=new Scanner(System.in);
		do{
			System.out.println("\nSeleccion la accion a realizar\n1 Agregar\n2 Mostrar\n3 Eliminar primero\n4 Eliminar ultimo\n5 Buscar\n0 Salir");
			System.out.println("\n Ingresa la opcion de la selccion a realizar");
			op=leer.nextInt();
			switch(op){
				case 1:Agregar();break;
				case 2:Lista.Mostrar();break;
				case 3:Lista.Eliminarp();break;
				case 4:Lista.Eliminaru();break;
				case 5:Lista.Busqueda();break;
			}
		}
		while(op!=0);
	}
	public static void Agregar(){
		Scanner leer=new Scanner(System.in);
		String dato;
		System.out.println("\nIngresa el dato:");
		dato=leer.next();
		Lista.Insertar(dato);
	}
}}