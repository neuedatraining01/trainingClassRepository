

public class Loops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        for(int j=50; j<=55; j++) {
            System.out.println(j * 3);
        }

        int[] numbers = {12,16,9,4,22,66,8,222};
        for(int i =0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        int counter = 0;
        while (counter++ < 10){
            System.out.println("HELLO!!");
        }
        System.out.println("finished");

       // int[] sampleArray = new int[50]
        int[] arrCnt = {10,9,8,7,6,5,4,3,2,1};
        for (int i=0;i<7;i++) {
            System.out.println(arrCnt[i]);
        }

        int counter2 = 0;
        System.out.println("Starting line 32");
        while(arrCnt[counter2] < 7) {
            System.out.println(arrCnt[counter2++]);
        }
        System.out.println("Starting line 35");
        int myAge = 26;
        while (myAge++ < 20) {
            System.out.println("You are young");
        }
//        System.out.println(MyAge);
    }
//    do {
//        System.out.println(myAge);
//    } while (myAge < 20);

}
