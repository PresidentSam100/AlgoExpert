import java.util.*;
// Time Complexity: O(n)
// Space Complexity O(k)
// n is the size of competitions/results
// k is the total number of teams
// Solution: Check and Compare
class Program {

  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    Map<String, Integer> teams = new HashMap<>();
    for (int i = 0; i < results.size(); i++) {
      // Get home and away team names
      String home = competitions.get(i).get(0);
      String away = competitions.get(i).get(1);
      // Check if teams have existing records
      if (!teams.containsKey(home)) {
        teams.put(home, 0);
      }
      if (!teams.containsKey(away)) {
        teams.put(away, 0);
      }
      // Check result
      if (results.get(i) == 1) {
        // Home team wins
        teams.put(home, 3 + teams.get(home));
      } else if (results.get(i) == 0) {
        // Away team wins
        teams.put(away, 3 + teams.get(away));
      }
    }
    // Find the winning team based on highest score
    String win = "";
    int max = 0;
    for (Map.Entry<String, Integer> entry : teams.entrySet()) {
      String name = entry.getKey();
      int score = entry.getValue();
      if (score > max) {
        max = score;
        win = name;
      }
    }
    return win;
  }
}
