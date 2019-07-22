package ZadaniaDomowe;

import java.util.Collections;
import java.util.List;

public class maxValueSeeker implements ValueSeeker{

    //public Integer findMax(List <Integer> valueSeeker) {


      //  if (valueSeeker == null || valueSeeker.size() == 0) {
          //  return Integer.MIN_VALUE;
     //   }
      //  return Collections.max(valueSeeker);

  //  }


    @Override
    public Integer find(List<Integer> values) {

        Integer max = Integer.MIN_VALUE;
        for(Integer value : values) {
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    private void validate(List<Integer> values) {
        if (values == null || values.isEmpty());
    }
}
