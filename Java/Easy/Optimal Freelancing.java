import java.util.*;
// Time Complexity: O(nlog(n))
// Space Complexity: O(1)
// n is the number of jobs
// Solution: Sort Map And Get Best
class Program {
  public int optimalFreelancing(Map<String, Integer>[] jobs) {
    Arrays.sort(jobs, (job1, job2) -> Integer.compare(job2.get("payment"), job1.get("payment")));
    int profit = 0;
    boolean[] time = new boolean[7];
    for (Map<String, Integer> job : jobs) {
      int deadline = Math.min(job.get("deadline"), 7);
      int payment = job.get("payment");
      while (deadline > 0) {
        deadline--;
        if (!time[deadline]) {
          time[deadline] = true;
          profit += payment;
          break;
        }
      }
    }
    return profit;
  }
}
