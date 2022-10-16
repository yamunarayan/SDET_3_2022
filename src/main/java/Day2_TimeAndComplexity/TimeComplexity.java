package Day2_TimeAndComplexity;

import org.testng.annotations.Test;

public class TimeComplexity {

    //O[1], O[1]
    private void constant(int a, int b) {
        int sum = a+b; //O[1] -> O[3] ` O[C] or O[1]
        System.out.println(sum);
    }


    private void linear(int[] input) {
        int sum = 0, loop = 0; //O[2]
        for (int i = 0; i < input.length; i++) { //O[N]
            sum += input[i];
            loop++;
        }

        // O[1] + O[N] -> O[N]
        System.out.println(loop);
    }


    private void logarithmic(int number) {
        int loop = 0;
        while (number > 0) {
            number /= 2;
            loop++;
        }
        System.out.println(loop);
    }

    private void linearLogarithmic(int[] numbers) {
        int loop = 0;
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            while (number > 0) {
                number /= 2;
                loop++;
            }
        }
        System.out.println(loop);
    }

    @Test
    public void testCase() {
//        constant(12, 22);
//        linear(new int[]{1, 3, 4, 6});
        logarithmic(44);
        linearLogarithmic(new int[]{44, 44, 44});
    }

}
