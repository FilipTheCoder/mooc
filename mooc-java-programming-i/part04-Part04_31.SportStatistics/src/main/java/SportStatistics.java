
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scan.nextLine();
        ArrayList<Match> matches = readMatchesFromFile(fileName);
        System.out.println("Team:");
        String teamName = scan.nextLine();
        TeamStatistics statistics = TeamStatistics.generateFromList(teamName, matches);
        System.out.println(statistics);
        
        
        
        
        
    }
    private static ArrayList<Match> readMatchesFromFile(String fileName) {
        ArrayList<Match> matches = new ArrayList();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while(fileScanner.hasNextLine()) {
                String[] lineTokens = fileScanner.nextLine().split(",");
                String homeTeam = lineTokens[0];
                String outsideTeam = lineTokens[1];
                int homeTeamScore = Integer.valueOf(lineTokens[2]);
                int outsideTeamScore = Integer.valueOf(lineTokens[3]);
                matches.add(new Match(homeTeam, outsideTeam, homeTeamScore, outsideTeamScore));
                
                
            }
        }
        catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return matches;
    }
    


}
