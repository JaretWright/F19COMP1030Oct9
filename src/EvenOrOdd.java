public class EvenOrOdd {
    public static void main(String[] args)
    {
        //display the numbers 1 to 10
        for (int i=1; i<=10;i++)
        {
            //decide if the number is even or odd
            if (i % 2 == 0)
                System.out.printf("%2d. even%n", i);
            else
                System.out.printf("%2d. odd%n", i);
        }

    }
}
