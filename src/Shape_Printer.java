import java.util.Scanner;

public class Shape_Printer {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 4){
            System.out.println("Menu: ");
            System.out.println("1. Rectangle");
            System.out.println("2. Square Triangle");
            System.out.println("3. Isosceles Triangle");
            System.out.println("4. Exit");
            System.out.println("Enter a number: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    for(int i=0 ; i<3 ; i++){
                        System.out.println("*******");
                    }
                    break;
                case 2:
                    System.out.println("Bottom left:");
                    for(int i=0 ; i<5 ; i++){
                        String x = " ";
                        for(int j=0 ; j<i+1 ; j++){
                            x += "*";
                        }
                        System.out.println(x);
                    }
                    System.out.println("Top left:");
                    for (int i=5 ; i>0 ; i--){
                        String x = " ";
                        for(int j=i ; j>0 ; j-- ){
                            x += "*";
                        }
                        System.out.println(x);
                    }
                    break;
                case 3:
                    for(int i=0 ; i<5 ; i++){
                        String x = " ";
                        for(int j=0 ; j<i+1 ; j++){
                            x += "*";
                        }
                        System.out.println(x);
                    }
                    for (int i=5 ; i>=0 ; i--){
                        String x = " ";
                        for(int j=i ; j>=0 ; j-- ){
                            x += "*";
                        }
                        System.out.println(x);
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No option chosen");


            }

        }
    }
}
