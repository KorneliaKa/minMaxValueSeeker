package ZadaniaDomowe;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class maxValueSeekerTest {

    @Test
    public void shouldFind10asMaxElement() {
        final Integer expectedMax = 10;
        final List<Integer> elements = Arrays.asList(1,2,4,2,1,10,9);
        final ValueSeeker valueSeeker = new maxValueSeeker();

        //when

        Integer result = valueSeeker.find(elements);

        //then

        assertEquals(expectedMax, result);
    }

    @Test (expected = EmptyListException.class)
    public void shouldThrowExceptionWhenListIsEmpty() {
        //given

        final List<Integer> elements = new ArrayList<>();
        final ValueSeeker valueSeeker = new maxValueSeeker();

        valueSeeker.find(elements);
    }

    @Test
    public void shouldThrowExceptionWhenListNull() {
        final List<Integer> elements = null;
        final ValueSeeker valueSeeker = new maxValueSeeker();

        try {
            valueSeeker.find(elements);
            fail("Wyjątek nie został rzucony!");
        } catch (EmptyListException e) {

        }
    }

}