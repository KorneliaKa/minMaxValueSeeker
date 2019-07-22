package ZadaniaDomowe;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValueSeekerFactoryTest {

    @Test
    void shouldReturnMinValueSeeker() {
        final ValueType valueType = ValueType.MIN;
        final ValueSeekerFactory factory = new ValueSeekerFactory();

        ValueSeeker result = factory.produce(valueType);

        assertTrue(result instanceof ValueSeeker);
        assertTrue(result instanceof minValueSeeker);
        assertTrue(result instanceof maxValueSeeker);
    }

    @Test
    void shouldReturnMaxValueSeeker() {
        final ValueType valueType = ValueType.MAX;
        final ValueSeekerFactory factory = new ValueSeekerFactory();

        ValueSeeker result = factory.produce(valueType);

        assertTrue(result instanceof ValueSeeker);
        assertTrue(result instanceof maxValueSeeker);
        assertTrue(result instanceof minValueSeeker);
    }
}