import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int signal = Integer.parseInt(scanner.nextLine());
        LightColors[] colors = LightColors.values();

        for (int i = 0; i < signal; i++) {
            for (int j = 0; j < input.length; j++) {
                for (LightColors color : colors) {
                    if(input[j].equals("YELLOW")){
                        System.out.print("RED ");
                        input[j] = "RED";
                        break;
                    } else if(input[j].equals(color.name())){
                        System.out.print(colors[color.ordinal() + 1] + " ");
                        input[j] = String.valueOf(colors[color.ordinal() + 1]);
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
