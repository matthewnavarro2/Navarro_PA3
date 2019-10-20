import java.util.Scanner;
import java.security.SecureRandom;

public class Navarro_p1 {


    public static void percentage(int correct) {
        double percentage = (double) correct / 10 * 100;
        System.out.println("You got " + percentage + "% of the answers correct!");
        if (percentage >= 75.0) {
            System.out.println("Congratulations, you are ready to go to the next level!");
        } else if (percentage < 75.0) {
            System.out.println("Please ask your teacher for extra help.");
        }

    }

    public static int difficulty(int choice, SecureRandom rand) {
        int rand_int1 = 0;
        if (choice == 1) {

            rand_int1 = rand.nextInt(10);
        } else if (choice == 2) {

            rand_int1 = rand.nextInt(100);
        } else if (choice == 3) {

            rand_int1 = rand.nextInt(1000);
        } else if (choice == 4) {

            rand_int1 = rand.nextInt(10000);
        }
        return rand_int1;

    }

    public static void add(Scanner scnr, SecureRandom rand) {
        int counter = 0, answer = 0, num1, num2, correct = 0, add = 0, difficulty = 0;

        System.out.println("Please enter a difficulty level from 1-4.");
        difficulty = scnr.nextInt();

        while (counter < 10) {
            num1 = difficulty(difficulty, rand);
            num2 = difficulty(difficulty, rand);
            options(num1, num2, 1);
            add = num1 + num2;
            answer = scnr.nextInt();

            if (answer == add) {
                System.out.println("Very good!");
                correct++;
            } else {
                System.out.println("Wrong!");
            }
            counter++;

        }

        percentage(correct);
    }

    public static void sub(Scanner scnr, SecureRandom rand) {
        int counter = 0, answer = 0, num1, num2, correct = 0, sub = 0, difficulty = 0;

        System.out.println("Please enter a difficulty level from 1-4.");
        difficulty = scnr.nextInt();

        while (counter < 10) {
            num1 = difficulty(difficulty, rand);
            num2 = difficulty(difficulty, rand);
            options(num1, num2, 1);
            sub = num1 - num2;
            answer = scnr.nextInt();

            if (answer == sub) {
                System.out.println("Very good!");
                correct++;
            } else {
                System.out.println("Wrong!):");
            }
            counter++;

        }
        percentage(correct);
    }

    public static void mult(Scanner scnr, SecureRandom rand) {
        int counter = 0, answer = 0, num1, num2, correct = 0, mult = 0, difficulty = 0;
        System.out.println("Please enter a difficulty level from 1-4.");
        difficulty = scnr.nextInt();

        while (counter < 10) {
            num1 = difficulty(difficulty, rand);
            num2 = difficulty(difficulty, rand);
            options(num1, num2, 1);
            mult = num1 * num2;
            answer = scnr.nextInt();

            if (answer == mult) {
                System.out.println("Very good!");
                correct++;
            } else {
                System.out.println("Wrong");
            }
            counter++;

        }
        percentage(correct);
    }

    public static void div(Scanner scnr, SecureRandom rand) {
        int counter = 0, num1, num2, correct = 0, difficulty = 0;
        double div = 0, answer = 0;

        System.out.println("Please enter a difficulty level from 1-4.");
        difficulty = scnr.nextInt();


        while (counter < 10) {
            num1 = difficulty(difficulty, rand);
            num2 = difficulty(difficulty, rand);
            options(num1, num2, 1);
            div = (double) num1 / num2;
            answer = scnr.nextDouble();

            if (answer == div) {
                System.out.println("Very good!");
                correct++;
            } else {
                System.out.println("Wrong");
            }
            counter++;

        }
        percentage(correct);
    }

    public static void mix(Scanner scnr, SecureRandom rand) {
        int counter = 0, num1, num2, correct = 0, difficulty = 0, add = 0, sub = 0, mult = 0, rnd;
        double div = 0, answer = 0;

        System.out.println("Please enter a difficulty level from 1-4.");
        difficulty = scnr.nextInt();


        while (counter < 10) {
            num1 = difficulty(difficulty, rand);
            num2 = difficulty(difficulty, rand);
            rnd = rand.nextInt(4);

            if (rnd == 0) {
                options(num1, num2, 1);
                add = num1 + num2;
                answer = scnr.nextInt();
                if (answer == add) {
                    System.out.println("Very good!");
                    correct++;
                } else {
                    System.out.println("Wrong");
                }

                counter++;

            }
            if (rnd == 1) {
                options(num1, num2, 2);
                sub = num1 - num2;
                answer = scnr.nextInt();
                if (answer == sub) {
                    System.out.println("Very good!");
                    correct++;
                } else {
                    System.out.println("Wrong");
                }

                counter++;

            }
            if (rnd == 2) {
                options(num1, num2, 3);
                mult = num1 * num2;
                answer = scnr.nextInt();
                if (answer == mult) {
                    System.out.println("Very good!");
                    correct++;
                } else {
                    System.out.println("Wrong");
                }

                counter++;

            }
            if (rnd == 3) {
                options(num1, num2, 4);
                div = (double) num1 / num2;
                answer = scnr.nextDouble();
                if (answer == div) {
                    System.out.println("Very good!");
                    correct++;
                } else {
                    System.out.println("Wrong");
                }

                counter++;

            }
        }
        percentage(correct);
    }

    public static void options(int rand_int1, int rand_int2, int diff) {
        if (diff == 1) {
            System.out.println("How much is " + rand_int1 + " plus " + rand_int2);
        } else if (diff == 2) {
            System.out.println("How much is " + rand_int1 + " minus " + rand_int2);
        } else if (diff == 3) {
            System.out.println("How much is " + rand_int1 + " times " + rand_int2);
        } else if (diff == 4) {
            System.out.println("How much is " + rand_int1 + " divided by " + rand_int2);
        }
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int difficulty, options, counter = 0, correct = 0, answer, num, again = 1;
        double percentage = 0;
        SecureRandom rand = new SecureRandom();

        while (again == 1) {
            System.out.println("What options would you like? Adding(1), subtraction(2), mult(3), division(4), mix(5)");
            options = scnr.nextInt();

            if (options == 1) {
                add(scnr, rand);
            } else if (options == 2) {
                sub(scnr, rand);
            } else if (options == 3) {
                mult(scnr, rand);
            } else if (options == 4) {
                div(scnr, rand);
            } else if (options == 5) {
                mix(scnr, rand);

            }
            System.out.println("Would you like to try again? (1) yes, (2) no.");
            again = scnr.nextInt();
        }

    }
}