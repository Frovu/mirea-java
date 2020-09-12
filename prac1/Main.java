import java.util.Arrays;
import java.util.Random;

public class Main {
    static void sortArray(int[] a) {
        // bubble sort
        for(int k=0; k < a.length-1; ++k) {
            for(int i=0; i < a.length-k-1; ++i) {
                if(a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Practic 1\nTask 3 (sum array)");
        int[] array = {1, 3, 13, 23, 5};
        int sum = 0;
        int i = 0;
        for(i=0; i < array.length; ++i)
            sum += array[i];
        System.out.println("sum = " + sum);

        sum = 0; i = 0;
        while(i < array.length) {
            sum += array[i];
            ++i;
        }
        System.out.println("sum = " + sum);

        sum = 0; i = 0;
        do {
            sum += array[i];
            ++i;
        } while(i < array.length);
        System.out.println("sum = " + sum);


        System.out.println("\nTask 4 (list command line args)");
        for(i=0; i < args.length; ++i)
            System.out.println(args[i]);


        System.out.println("\nTask 5 (harmonic row)");
        for (i = 1; i <= 10; ++i)
            System.out.print(String.format("%.3f  ", 1.0 / i));
        System.out.println();


        System.out.println("\nTask 6 (sort random array)");
        // fill with Math.rand
        System.out.println(" Array 1 ( Math.random )");
        for(i=0; i < array.length; ++i)
            array[i] = (int) (Math.random() * 100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));

        // fill with util.Random
        Random rand = new Random();
        System.out.println(" Array 2 ( util.Random )");
        for(i=0; i < array.length; ++i)
            array[i] = rand.nextInt(100);
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));


        System.out.println("\nTask 7 (factorial)");
        System.out.println("factorial(5) = " + fac(5));
    }

    static long fac(int num) {
        long fac = 1;
        for (int i = 1; i <= num; i++)
            fac *= i;
        return fac;
    }
}
