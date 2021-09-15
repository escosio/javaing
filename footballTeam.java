public class footballTeam {
  // intatiated variables
  double totalPlays;
  double firstDowns;
  double twentyPlus;
  double fourtyPlus;
  double touchdowns;


  // constructor
  public footballTeam(double plays, double firsts, double twenties, double fourties, double tds) {
    totalPlays = plays;
    firstDowns = firsts;
    twentyPlus = twenties;
    fourtyPlus = fourties;
    touchdowns = tds;
  }


  public double sluggingPercentage() {
    double totalOffense = firstDowns + (2 * twentyPlus) + (3 * fourtyPlus) + (4 * touchdowns);
    return totalOffense / totalPlays;
  }

  public double onBasePercentage(){
    return firstDowns / totalPlays;
  }

  public double ops() {
    double slugging = sluggingPercentage();
    double obp = onBasePercentage();
    return obp + slugging;
  }

  public void teamSummary() {
    double slg = sluggingPercentage();
    double obp = onBasePercentage();
    double ops = ops();

    System.out.println("Slugging: " + slg);
    System.out.println("On-base: " + obp);
    System.out.println("OPS: " + ops);
  }

  public static void main(String[] args) {
    // Giants
    System.out.println("Giants:");
    footballTeam giants = new footballTeam(77.0, 19.0, 3.0, 1.0, 2.0);
    giants.teamSummary();

    System.out.println("Cowboys:");
    footballTeam cowboys = new footballTeam(77.0, 30.0, 5.0, 1.0, 3.0);
    cowboys.teamSummary();

  }


}
