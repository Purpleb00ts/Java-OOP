import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split(" ");
            if(line.length == 4){
                if(!checkRepeatingName(personList, line[0])) {
                    Person citizen = new Citizen(line[0], Integer.parseInt(line[1]), line[2], line[3]);
                    personList.add(citizen);
                }
            } else {
                if(!checkRepeatingName(personList, line[0])) {
                    Person rebel = new Rebel(line[0], Integer.parseInt(line[1]), line[2]);
                    personList.add(rebel);
                }
            }
        }

        String buyer = scanner.nextLine();

        int totalFood = 0;

        while(!buyer.equals("End")){
            for (Person person : personList) {
                if(person.getName().equals(buyer)) {
                    if (person instanceof Citizen) {
                        ((Citizen) person).buyFood();
                    } else if (person instanceof Rebel) {
                        ((Rebel) person).buyFood();
                    }
                }
            }
            buyer = scanner.nextLine();
        }

        for (Person person : personList) {
            if(person instanceof Citizen){
                totalFood +=((Citizen) person).getFood();
            } else if (person instanceof Rebel){
                totalFood += ((Rebel) person).getFood();
            }
        }

        System.out.println(totalFood);
    }
    public static boolean checkRepeatingName(List<Person> personList, String name){
        for (Person person : personList) {
            if(person.getName().equals(name)){
                return true;
            }
        }
        return false;
    }
}
