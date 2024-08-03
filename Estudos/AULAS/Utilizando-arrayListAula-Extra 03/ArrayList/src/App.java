import java.util.ArrayList;

public class App {
    /**
     * @param args
     */
    public static void main(String[] args){
       
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<String> carros = new ArrayList<>();

        numeros.add(11);
        numeros.add(12);
        numeros.add(45);

        carros.add("UNO");
        carros.add("SUV");
        carros.add("Polo");
        carros.add(0, "Argo");

        System.out.println(carros.get(0));


        /*for(int e: numeros){
            System.out.println(e);
        }

        for (String e:carros) {
            System.out.println(e);
        }*/

    }
}
