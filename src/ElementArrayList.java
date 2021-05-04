import java.util.ArrayList;

/* 6. Write a Java program to retrieve an element (at a specified index) from a given
array list
 */
public class ElementArrayList
{
    public static void main(String[] args)
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(20);
        arrayList.add("Sneha");
        arrayList.add(48.6);
        arrayList.add(35);
        arrayList.add("Pathak");
        arrayList.add("50.5");

        //specified index values from list
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(4));
    }
}
