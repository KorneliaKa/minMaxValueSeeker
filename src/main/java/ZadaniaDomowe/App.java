package ZadaniaDomowe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class App


{
   /* public static Integer findMin(List<Integer> valueSeeker) {


        if (valueSeeker == null || valueSeeker.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(valueSeeker);

    }

    public static Integer findMax(List<Integer> valueSeeker) {


        if (valueSeeker == null || valueSeeker.size() == 0) {
            return Integer.MIN_VALUE;
        }
        return Collections.max(valueSeeker);

    }*/
    public static void main( String[] args )
   /* {

        List<Integer> valueSeeker = new ArrayList<>();
        valueSeeker.add(10);
        valueSeeker.add(0);
        valueSeeker.add(22);
        valueSeeker.add(89);
        valueSeeker.add(98);
        valueSeeker.add(45);


    minValueSeeker minValueSeeker = new minValueSeeker();
    maxValueSeeker maxValueSeeker = new maxValueSeeker();

        System.out.println("Minimal value:" + minValueSeeker.findMin(valueSeeker) );
        System.out.println("Minimal value:" + maxValueSeeker.findMax(valueSeeker)); */


    {
        ValueSeekerFactory factory = new ValueSeekerFactory();
        ValueSeeker seeker = factory.produce(ValueType.MIN);

        List<Integer> elements = Arrays.asList(34, 67, 87, 99, 123, 0, 888);
        System.out.println(seeker.find(elements));
    }


}
