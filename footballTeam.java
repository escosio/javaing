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

    // System.out.println("Slugging: " + slg);
    // System.out.println("On-base: " + obp);
    System.out.println("OPS: " + ops);
  }

  public static void main(String[] args) {
    // Week 3
    // params are total plays, first downs, 20+, 40+, TDs
    System.out.println("week 8~");
    System.out.println("Ariey's Rams:");
    footballTeam duncan = new footballTeam(66.0, 26.0,2.0,2.0, 5.0);
    duncan.teamSummary();

    System.out.println("Evan's Bengals:");
    footballTeam evan = new footballTeam(54.0, 18.0,3.0,2.0, 4.0);
    evan.teamSummary();

    System.out.println("Scott's Bills");
    footballTeam scott = new footballTeam(66.0,24.0,3.0,0.0, 3.0);
    scott.teamSummary();

    System.out.println("Phil's Chiefs");
    footballTeam phil = new footballTeam(77.0, 29.0,1.0,0.0, 2.0);
    phil.teamSummary();

  }


}
