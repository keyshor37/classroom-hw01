
    import java.util.ArrayList;
import java.util.List;

    public class Positives {

        /**
         * returns only positives. zero is not positive
         * For example:
         * 1, -2, -3 => 1
         */
        public static List<Integer> analyze(List<Integer> integers) {
            List<Integer> result = new ArrayList<>();
            for (Integer n : integers) {
                if (n != null && n > 0) {   // keep only positives
                    result.add(n);
                }
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(Positives.analyze(List.of(1, -2, 3)));
        }
    }

