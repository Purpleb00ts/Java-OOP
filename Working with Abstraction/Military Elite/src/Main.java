import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Private> privateList = new ArrayList<>();

        String line = scanner.nextLine();

        while(!line.equals("End")){
            String[] tokens = line.split("\\s+");
            String soldierType = tokens[0];

            switch(tokens[0]){
                case "Private":
                    Private privateSoldier = new PrivateImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    privateList.add(privateSoldier);
                    System.out.println(privateSoldier);
                    break;
                case "LieutenantGeneral":
                    LieutenantGeneral lieutenantGeneral = new LieutenantGeneralImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]));
                    System.out.println(lieutenantGeneral);
                    for (int i = 5; i < tokens.length; i++) {
                        for (Private aPrivate : privateList) {
                            if(aPrivate.getId() == Integer.parseInt(tokens[i])){
                                lieutenantGeneral.addPrivate(aPrivate);
                            }
                        }
                    }
                    List<Private> sortedPrivates = lieutenantGeneral.getPrivateList().stream().sorted((a, b) -> Integer.compare(b.getId(), a.getId())).collect(Collectors.toList());
                    for (Private aPrivate : sortedPrivates) {
                        System.out.println("  " + aPrivate);
                    }
                    break;
                case "Spy":
                    Spy spy = new SpyImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], tokens[4]);
                    System.out.println(spy);
                    break;
                case "Commando":
                    Commando commando;
                    Mission mission;
                    try {
                        commando = new CommandoImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]), tokens[5]);
                    } catch (IllegalArgumentException e){
                        break;
                    }
                    for (int i = 6; i < tokens.length; i+=2) {
                        try {
                            mission = new Mission(tokens[i], tokens[i + 1]);
                        } catch (IllegalArgumentException e){
                            continue;
                        }
                        commando.addMission(mission);
                    }
                    System.out.println(commando);
                    for (Mission mission1 : commando.getMissionList()) {
                        System.out.println(mission1);
                    }
                    break;
                case "Engineer":
                    Engineer engineer;
                    Repair repair;
                    try {
                        engineer = new EngineerImpl(Integer.parseInt(tokens[1]), tokens[2], tokens[3], Double.parseDouble(tokens[4]), tokens[5]);
                    } catch (IllegalArgumentException e){
                        break;
                    }
                    for (int i = 6; i < tokens.length; i+=2) {
                        repair = new Repair(tokens[i], Integer.parseInt(tokens[i + 1]));
                        engineer.addRepair(repair);
                    }
                    System.out.println(engineer);
                    for (Repair engineerRepair : engineer.getRepairs()) {
                        System.out.println(engineerRepair);
                    }
                    break;
            }

            line = scanner.nextLine();
        }
    }
}
