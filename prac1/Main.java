public class Main {
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
            System.out.print(String.format("%.2f", 1.0 / i) + " ");
        System.out.println();
    }
}
