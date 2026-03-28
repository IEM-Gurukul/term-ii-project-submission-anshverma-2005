// This class represents a cricket player and stores statistics
class Player {
    private String name;
    private int matches;
    private int runs;
    private int wickets;

    public Player(String name, int matches, int runs, int wickets) {
        this.name = name;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
    }

    public double getBattingAverage() {
        if (matches == 0) return 0;
        return (double) runs / matches;
    }

    public void displayStats() {
        System.out.println("Name: " + name);
        System.out.println("Matches: " + matches);
        System.out.println("Runs: " + runs);
        System.out.println("Wickets: " + wickets);
        System.out.println("Average: " + getBattingAverage());
    }
  public boolean isAllRounder() {
    return runs > 3000 && wickets > 20;
    }
}
