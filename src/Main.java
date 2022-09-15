import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geef een geheel positief getal in: ");
        int number = scanner.nextInt();

        if(number<=0){
            System.out.println("Dat is geen positief getal");
        } else {
            int evenNumber = 0;
            int oddNumber = 0;
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    evenNumber += i;
                } else {
                    oddNumber += i;
                }
            }
            int difference = oddNumber - evenNumber;
            System.out.println("som van oneven getallen tot en met " + number + " is " + oddNumber);
            System.out.println("som van even getallen tot en met " + number + " is " + evenNumber);
            System.out.println("verschil tussen twee sommen is " + difference);
        }
    }
}
