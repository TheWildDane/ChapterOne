public class ExerciseEleven {

   // Population projection) The U.S. Census Bureau projects population based on the following assumptions:
    // 	One birth every 7 seconds
    // 	One death every 13 seconds
    // One new immigrant every 45 second

   // Write a program to display the population for each of the next five years.
    // Assume the current  population  is  312,032,486  and  one  year  has  365  days.
    //  Hint:  In  Java,  if  two  integers perform division, the result is an integer.
    // The fractional part is truncated.
    // For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5).
    // To get an accurate result with the fractional part,
    // one of the values involved in the division must be a number with a decimal point.
    // For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
    //

    public static void main(String[] args) {
        System.out.println("Population projection");
        System.out.println("Current population: 312032486");
        System.out.println("One birth every 7 seconds.");
        System.out.println("One death every 13 seconds.");
        System.out.println("One new immigrant every 45 seconds.");
        System.out.println("Yearly Population projection formula: ");
        System.out.println("Current population + ((births per year)");
        System.out.println("                   - (deaths per year)");
        System.out.println("                   + (new immigrants per year))");
        System.out.println("                   * year.");
        System.out.println("Year 1: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45))));
        System.out.println("Year 2: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 2);
        System.out.println("Year 3: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 3);
        System.out.println("Year 4: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 4);
        System.out.println("Year 5: ");
        System.out.println(312032486 + (((312032486 / 7)
                - (312032486 / 13)
                + (312032486 / 45)))* 5);

    }
}
