package ZadaniaDomowe;
class ValueSeekerFactory {
    ValueSeeker produce(ValueType valueType) {

        ValueSeeker product = null;
        if(ValueType.MAX.equals(valueType)) {
            product = new maxValueSeeker();
        }

        if (ValueType.MIN.equals(valueType)) {
            product = new minValueSeeker();
        }

        return product;

    }
}
