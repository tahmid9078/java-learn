import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTest{
    public static void main(String[] args) {
        ArrayList<String> arr =new ArrayList<>();
        // LinkedList<Integer> link = new LinkedList<>();
        // ArrayList <Char> char = new Array <Char>();
        arr.add("Tahmid");
        arr.add("Jasarat");        
        arr.add("Ariyan");

        arr.set(1,"Raiyan");
        arr.add(1, "Raiyan");

        System.out.println(arr.get(1));
        // arr.set(4,"Ariyan");


       
        System.out.println(arr.get(0));
        // arr.remove(4);
        // System.out.println(arr.get(4));
        System.out.println(arr.size());
        System.err.println(arr);


        // ClassName objName = new ClassName();
        // Person person1 = new Person();

        // ArrayList arr = new ArrayList();




    }
}