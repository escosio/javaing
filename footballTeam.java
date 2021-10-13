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
    System.out.println("Ariey's Rams:");
    footballTeam duncan = new footballTeam(64.0, 24.0, 3.0, 0.0, 2.0);
    duncan.teamSummary();

    System.out.println("Evan's Tompa Bays:");
    footballTeam evan = new footballTeam(74.0, 22.0, 7.0, 0.0, 1.0);
    evan.teamSummary();

    System.out.println("Scott's Chiefs");
    footballTeam scott = new footballTeam(63.0, 31.0, 3.0, 1.0, 6.0);
    scott.teamSummary();

    System.out.println("Phil's Raiders");
    footballTeam phil = new footballTeam(56.0, 13.0,2.0,2.0,2.0);
    phil.teamSummary();

  }


}
