import java.util.List;
import java.util.*;
public class SumOfNumbers1 {
    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) {
            return null;
        }
        int total = 0;
        for (Integer n: integerList){
            if (n!= null){
                total += n;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(sum(List.of(1,2,4,6,7,3)));
    }
}

