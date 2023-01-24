/* 5.Write a program to read data from matches.csv and find out which team had won by maximum wickets.*/

import java.io.*;
import java.util.*;
public class MaximumWickets {
    public static void main(String[] args) {
        String csvFile = "matches.csv.xls";
        String line = "";
        String csvSplitBy = ",";
        Map<String, Integer> teamWickets = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] match = line.split(csvSplitBy);
                if (!match[8].equals("")) {
                    String winner = match[10];
                    int wickets = Integer.parseInt(match[8]);
                    if (teamWickets.containsKey(winner)) {
                        teamWickets.put(winner, teamWickets.get(winner) + wickets);
                    } else {
                        teamWickets.put(winner, wickets);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String maxWicketsTeam = "";
        int maxWickets = 0;
        for (Map.Entry<String, Integer> entry : teamWickets.entrySet()) {
            if (entry.getValue() > maxWickets) {
                maxWickets = entry.getValue();
                maxWicketsTeam = entry.getKey();
            }
        }

        System.out.println("Team " + maxWicketsTeam + " won by maximum wickets: " + maxWickets);
}
}