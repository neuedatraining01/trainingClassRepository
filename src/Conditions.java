public class Conditions {

    public static void main(String[] args) {
        int testScore = 50;



        if (testScore > 50) {
            System.out.println("Congratulations - you passed the test");
        } else if (testScore == 50) {
            System.out.println("We are not sure if you passed.");
        } else {
            System.out.println("Sorry - you failed the test.");
        }
        switch (testScore) {
            case 0:
                System.out.println("Did you even take the test?");
                break;
            case 100:
                System.out.println("You've got top marks.");
                break;
            default:
                System.out.println("You didnt do anything special");
                break;
        }
        int maxScore = 100;
        if (testScore > 50 && testScore < maxScore) {
            System.out.println("You pased but didnt gert full marks");
        }

        if (testScore < 10 || testScore > 90) {
            System.out.println("You are at the boundary. ");
        }

        if (testScore != 100) {
            System.out.println("You didnt get top marks.");
        }
    }
}
