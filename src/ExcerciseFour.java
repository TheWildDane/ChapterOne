

public class ExcerciseFour {
    public static void main(String[] args) {
        // (Print a table) Write a program that displays the following table:
        // a      a^2    a^3    a^41
        // 1      1      1      1
        // 2      4      8      16
        // 3      9      27     81
        // 4      16     64     256

        System.out.println("a   a^2 a^3 a^4");
        System.out.println("1   1   1   1");
        System.out.println("2   4   8   16");
        System.out.println("3   9   27  81");
        System.out.println("4   16  64  256\nk");

        // kan også løses med et string array



        final Object[][] table = new String[5][];
        table[0] = new String[] {"a", "a^2", "a^3", "a^4"};
        table[1] = new String[] {"1", "1", "1", "1"};
        table[2] = new String[] {"2", "4", "8", "16"};
        table[3] = new String[] {"3", "9", "27", "81"};
        table[4] = new String[] {"4", "16", "64", "256"};

        for (final Object[] row: table)
        {
            System.out.format("%15s%15s%15s%15s\n", row);
        }
    }
}
