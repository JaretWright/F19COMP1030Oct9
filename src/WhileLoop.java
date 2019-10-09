public class WhileLoop {
    public static void main(String[] args)
    {
        System.out.printf("Counting to 10 in a while loop:%n");
        int counter = 2;

        while (counter <= 10)
        {
            System.out.println(counter);
            counter = counter + 2;
        }

        System.out.printf("Challenge 2 - display name 5 times%n");
        int counter2 = 1;

        while (counter2 <= 5)
        {
            System.out.println("Jaret");
            counter2++;
        }

        System.out.printf("%nChallenge 3 - display name 3 times with a number%n");
        counter = 1;

        while (counter <= 10)
        {
            System.out.printf("%2d. Jaret%n", counter);
            counter++;
        }
    }
}
