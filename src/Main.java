public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("Virat Kohli", 250, 12000, 5);
        Player p2 = new Player("MS Dhoni", 300, 10500, 1);
        Player p3 = new Player("Rohit Sharma", 240, 9800, 8);

        System.out.println("Player 1 Stats:");
        p1.displayStats();
        System.out.println("Is All-Rounder: " + p1.isAllRounder());

        System.out.println("\nPlayer 2 Stats:");
        p2.displayStats();

        System.out.println("\nPlayer 3 Stats:");
        p3.displayStats();
System.out.println("\n--- End of Player Report ---");
    }
}

