import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.*;
/**
 * Lambda Stream for printing sorted doubles, and String values
 * 
 * @author Justin Viola 
 * 
 */

 public class SortedDoubles {

    public static void main(String[] args) {
        double[] d = {1.56, 6.68, 7.98, 9.89, 2.23};
        String[] strings = {"Apple", "Banana", "Clementine", 
            "Date", "Eggplant", "Fennel", "Burrito, Cranberry"};
        //Sort the doubles that are greater than 5 and print
       Arrays.stream(d).filter(x -> x > 5.0).forEach(System.out::println);

       //Sort the array and print in uppercase
       System.out.printf("Sorted uppercase: %s\n",
                Arrays.stream(strings)
                      .map(String::toUpperCase)
                      .sorted()
                      .distinct()
                      .collect(Collectors.toList()));

 }
}

