public class Player {
  // intatiated variables
  String playerName;
  String teamName;
  double atBats;
  double hits;
  double doubleH;
  double triple;
  double homerun;
  double bb;
  double hbp;
  double sacFly;

  // constructor
  public Player(String name, String team, double abs, double baseHits, double doubles, double triples, double homeruns, double walks, double hitByPitch, double sacrificeFly) {
    playerName = name;
    teamName = team;
    atBats = abs;
    hits = baseHits;
    // called doubleH to avoid conflict with the type double
    doubleH = doubles;
    triple = triples;
    homerun = homeruns;
    walks = bb;
    hbp = hitByPitch;
    sacFly = sacrificeFly;
  }

  public double getSingles() {
    double singles = hits - (doubleH + triple + homerun);
    return singles;
  }

  public double sluggingPercentage() {
    double singles = getSingles();
    double totalBases = singles + (2 * doubleH) + (3 * triple) + (4 * homerun);
    // System.out.println("Total bases equals " + totalBases + " and at bats is " + atBats);
    return (totalBases / atBats);
  }

  public double onBasePercentage(){
    return (hits + bb + hbp) / (atBats + bb + sacFly + hbp);
  }

  public double ops() {
    double slugging = sluggingPercentage();
    double obp = onBasePercentage();
    return obp + slugging;
  }

  public void playerSummary() {
    double slg = sluggingPercentage();
    double obp = onBasePercentage();
    double ops = ops();

    System.out.println(playerName + " played for the " + teamName + " and ended his career with " + hits + " hits.");
    System.out.println("He had a " + slg + " slugging percentage, " + obp + "on-base percentage and a career OPS of " + ops + "." );
  }

  public static void main(String[] args) {
    Player derekJeter = new Player("Derek Jeter", "Yankees", 11195.0, 3465.0, 544.0, 66.0, 260.0, 1082.0, 170.0, 58.0);
    derekJeter.playerSummary();
  }


}
