import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GFG {
	public static void main(String[] args)
    {
        // creating a Stream of strings
        Stream<String> s = Stream.of("2", "3", "4", "5");
  
        // using Collectors maxBy(Comparator comparator)
        // and finding the maximum element
        // in reverse order
        Optional<String> obj = s
                                   .collect(Collectors
                                                .maxBy(Comparator
                                                           .reverseOrder()));
  
        // if present, print the element
        // else print the message
        if (obj.isPresent()) {
            System.out.println(obj.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
