package metodosordenamientointerfaz;
import java.util.ArrayList;
import java.util.Collections;

public class Prog4 {
  public String ordenar() {
    String arr = "En el Programa4 :\n";
    ArrayList<String> arrayList = new ArrayList<String>();
    arrayList.add("L");
    arrayList.add("O");
    arrayList.add("L");
    arrayList.add("A");
    arrayList.add("C");
    arrayList.add("A");
    arrayList.add("R");
    arrayList.add("A");
    arrayList.add("D");
    arrayList.add("E");
    arrayList.add("B");
    arrayList.add("O");
    arrayList.add("L");
    arrayList.add("A");
    
    arr += "El arreglo ordenado es: "+"[ "+arrayList+" ]"+"\n";
    Collections.reverse(arrayList);
    arr += "El arreglo a la inversa es:"+"[ "+arrayList+" ]"+"\n";
    return arr;
  }
}