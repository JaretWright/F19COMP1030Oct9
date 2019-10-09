public class ForLoops {
    public static void main(String[] args)
    {
        System.out.printf("Displaying 2-10 in a for loop:%n");
        for (int counter=2; counter<=10; counter = counter +2)
        {
            System.out.println(counter);
        }

        System.out.printf("%nDisplay my name 5 times%n");
        for(int i =1; i<=5;i++)
            System.out.printf("Jaret%n");

        System.out.printf("%nDisplay my name 5 times with a #%n");
        for(int i =1; i<=5;i++)
            System.out.printf("%2d. Jaret%n", i);

    }


}
