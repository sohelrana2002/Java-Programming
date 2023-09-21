 // import the ArrayList class
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
       ArrayList<String> Colors = new ArrayList<String>();

       Colors.add("Red");
       Colors.add("Green");
       Colors.add("Blue");
       Colors.add("Black");
       Colors.add("White");
        // ====RETURN LIST OF COLORS AN ARRAY========
       System.out.print("Colors Array = " + Colors);

        //=======ACCESS SPECIFIC COLOR (Black) USING get() method======
        System.out.print("\nGet 3 num index color " + Colors.get(3));

         //=======ACCESS SPECIFIC COLOR (Green) USING get() method======
        System.out.print("\nGet 1 num index color " + Colors.get(1));

        // =====To find out how many elements an ArrayList have, use the size method===
        System.out.println("\nSize of an array: " + Colors.size());

        // ===To modify an element, use the set() method and refer to the index number==
        Colors.set(2, "Pink");
        System.out.println("\nNew colors array = " + Colors);

        // ===To remove an element, use the remove() method and refer to the index number===

        Colors.remove(4);
        System.out.println("\nAfter removing colors array = " + Colors);

        

        // Loop through the elements of an ArrayList with a for loop
        for(int i = 0 ; i < Colors.size() ; i++){
            System.out.println("for loop = " + Colors.get(i));
        }

        // ==You can also loop through an ArrayList with the for-each loop
        for (String elements : Colors) {
            System.out.println("\nforEach = " + elements);
        }

        // ===To remove all the elements in the ArrayList, use the clear() method Get empty array===
        Colors.clear();
        System.out.println("\nAfter using clear() method = " + Colors);

    }
}