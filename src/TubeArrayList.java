import java.util.ArrayList;

/*  7. Write a Java program to test an array list is empty or not. Define array list with
underground tube names
 */
public class TubeArrayList
{
    public static void main(String[] args)
    {
        ArrayList tubeList = new ArrayList();
        tubeList.add("Piccadilly");
        tubeList.add("Metropolitan");
        tubeList.add("District");
        tubeList.add("Hammersmith & City");
        tubeList.add("Jubilee");
        tubeList.add("Circle");
        tubeList.add("Central line");
        tubeList.add("Northern");
        tubeList.add("Victoria");

        if (tubeList.isEmpty())
        {
            System.out.println("ArrayList is Empty");
        }
        else
        {
            System.out.println("Tube line list");
            System.out.println(tubeList);
        }
    }
}
