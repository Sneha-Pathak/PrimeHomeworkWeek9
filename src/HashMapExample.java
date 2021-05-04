/*
9. Create a HashMap object called people that will store String keys and Integer
values: And use for each loop to iterate the value from Map
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample
{
    public static void main(String[] args)
    {
        Map<Integer , String> people = new HashMap<>();
        people.put(1,"Rahul");
        people.put(3,"Mehul");
        people.put(4,"Parul");
        people.put(7,"Charul");

        for (int i : people.keySet())
        {
            System.out.println(i);
        }
    }
}
