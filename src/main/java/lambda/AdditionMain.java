package lambda;

import java.util.function.Function;

public class AdditionMain {

    public static void main(String[] args) {
        Addition addition = new Addition() {
            @Override
            public int add(int[] numbers) {
                int result =0;
                for(int num : numbers) {
                    result += num;
                }
                    return result;
            }
        };

        Addition addition2 = a -> {
            int result = 0;
            for(int num : a) {
                result += num;
            }
            return result;
        };

        Function<Integer[],Integer> addition3 =  nums -> {
            int result = 0;
            for (int num : nums) {
                result += num;
            }
            return result;
        };

        int result1 = addition.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과1 : " +result1);

        int result2 = addition2.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과2 : " +result2);

        int result3 = addition3.apply(new Integer[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println("결과3 : " +result2);
    }
}
