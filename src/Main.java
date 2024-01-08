import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1 - task 1");
            System.out.println("2 - task 2");
            System.out.println("3 - task 3");
            System.out.println("4 - task 4");
            System.out.println("5 - task 5");
            System.out.println("0 - break");
            System.out.println("Select an action: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    first(scanner);
                    break;
                case 2:
                    second(scanner);
                    break;
                case 3:
                    third();
                    break;
                case 4:
                    fourth();
                    break;
                case 5:
                    fifth(scanner);
                    break;
                case 0:
                    System.out.println("Program completed, goodbye!");
                    break;
                default:
                    System.out.println("Invalid Input. Try again.");
            }
        }while(choice !=0);




    }

    public static void first(Scanner scanner){
        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("even");
        }else System.out.println("odd");
    }

    public static void second(Scanner scanner){
        System.out.println("Enter temperature: ");
        int t = scanner.nextInt();
        if (-5 < t) {
            System.out.println("Warm");
        }
        else if (-5 >= t && t >-20) {
            System.out.println("Normal");
        }
        else if (-20 >= t){
            System.out.println("Cold");
        }
    }

    public static void third(){
        int res;
        for (int i = 10; i <= 20; i++){
            res = i * i;
            System.out.print(res + " ");
        }
    }

    public static void fourth(){
        int num = 7;
        while(num <= 98){

            System.out.print (num + " ");
            num += 7;
        }
        System.out.println();
    }

    public static void fifth(Scanner scanner){
        System.out.println("Enter a positive integer: ");
        if(scanner.hasNextInt()){
            int num = scanner.nextInt();
            int res = 0;
            if(num > 0){
                for (int i = 1;i<=num; i++) {
                    res +=i;

                }
                System.out.println(res);
            } else {
                System.out.println("Only positive");
            }
        } else {
            System.out.println("Only positive");
        }
    }
}

