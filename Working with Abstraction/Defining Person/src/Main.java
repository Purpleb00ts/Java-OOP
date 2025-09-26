import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();

        while(!line.equals("End")){
            String[] tokens = line.split("\\s+");
            String type = tokens[0];

            switch(type){
                case "Citizen":
                    Birthable citizen = new Citizen(tokens[1], Integer.parseInt(tokens[2]), tokens[3], tokens[4]);
                    birthableList.add(citizen);
                    break;
                case "Robot":
                    Identifiable robot = new Robot(tokens[2], tokens[1]);
                    break;
                case "Pet":
                    Birthable pet = new Pet(tokens[1], tokens[2]);
                    birthableList.add(pet);
                    break;
            }

            line = scanner.nextLine();
        }
        String input = scanner.nextLine();

        for (Birthable birthable : birthableList) {
            String[] birthDate = birthable.getBirthDate().split("/");
            String birthYear = birthDate[2];
            if(birthYear.equals(input)){
                System.out.println(birthable.getBirthDate());
            }
        }
    }
}
