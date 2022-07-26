
public class Main {
    public static void main(String[] args) {
        int i=7;
        System.out.println("Hello World.");
        int j;
        j=19;
        System.out.println(i);
        System.out.println(j);
        long myVariable = 176L;
        long anotherVariable = 9000000000L;
        System.out.println(myVariable);
        System.out.println(anotherVariable);
        int first = 50;
        int second = 100;
        int third = first;
        System.out.println(third);
        third = first+10;
        System.out.println(third);
        first = 65;
        System.out.println(first);
        System.out.println("first * 3 = ");
        System.out.println(first *3);
        System.out.println(second / 50);
        System.out.println(second / first);
        System.out.println(first*3.1);
        double size = 17.3;
        double sizeLong = 17.3;
        float smallerSize = 17.1f;  //cannot assign a double to a float; doubles are more precise
        double largerSize = 18L;
        double extraLargeSize = 18L;

        extraLargeSize = extraLargeSize +1;
        System.out.println(extraLargeSize);
        extraLargeSize++;
        System.out.println(extraLargeSize);
        System.out.println(extraLargeSize++);  //does the ++ after
        System.out.println(extraLargeSize);
        double megaSize = ++extraLargeSize;
        System.out.println(megaSize);
        i +=5;  // -= *= /=

        // 26 divised 7 = 3r5
        int remainder = 26%7;
        System.out.println(remainder);
        System.out.println(163 % 2);

        boolean iAmHappy = true;
        boolean iAmSad = false;
        char firstInitial = 'M';
                // all the above data types start w/lower case letters
        // tomorrow we will work w/upper case types


        // ARRAYs
        int[] participantAges = {23,21,27,24,22};
        System.out.println(participantAges[0]);
        System.out.println(participantAges[4]);
        participantAges[0] = 24;
        System.out.println(participantAges[0]);

//int scores = {}


    }


}
