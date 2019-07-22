package ZadaniaDomowe;

import java.util.Collections;
import java.util.List;

public class minValueSeeker implements ValueSeeker {

    public Integer findMin(List<Integer> valueSeeker) {


        if (valueSeeker == null || valueSeeker.size() == 0) {
            return Integer.MAX_VALUE;
        }
        return Collections.min(valueSeeker);

    }


    @Override
    public Integer find(List<Integer> values) {
        return null;
    }
}