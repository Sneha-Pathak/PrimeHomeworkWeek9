//4.Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop.

import java.util.ArrayList;

public class ColourArrayList
{
    public static void main(String[] args)
    {
        //How to add value into list
        ArrayList color = new ArrayList();
        color.add("Red");
        color.add("Yellow");
        color.add("Green");
        color.add("Blue");
        color.add("Purple");
        color.add("Grey");

        //Print list using foreach loop
        for (Object value : color)
        {
            System.out.println(value);
        }
    }
}
