import java.util.ArrayList;
import java.util.List;


public class Squares {
    public static List<Integer> square(List<Integer> integers){
      List <Integer> result = new ArrayList<>();
for (Integer n: integers ){
    int square = n * n;
    result.add(square);

}
        return result;
    }

    public static void main(String[] args) {
        System.out.println(square(List.of(1,2,-4,6)));
    }
}
