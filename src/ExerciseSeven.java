public class ExerciseSeven {
    public static void main(String[] args) {
        //     1.7    (Approximate Pi) pi can be computed using the following formula:
        // pi = 4*( 1- 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...)
        // Write a program that displays the result of
        // 4*( 1- 1/3 + 1/5 - 1/7 + 1/9 - 1/11)
        // and
        // 4*( 1- 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13)
        // Use  1.0  instead  of  1  in  your  program.



        System.out.println(4 * (1.0 - (1 / 3) + (1 / 5) - (1 / 7) + (1 / 9) - (1 / 11)));

        System.out.println(4 * (1.0 - (1/3) + (1/5) - (1/7)
                + (1 / 9) - (1/11) + (1/13)));
    }
}
