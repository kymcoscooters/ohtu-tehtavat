
package ohtu;

public class Player implements Comparable<Player> {
    private String name;
    private int goals;
    private int assists;
    private int penalties;
    private String team;
    private String nationality;
    private String birthdate;

    public Player(String name, int goals, int assists, int penalties, String team, String nationality, String birthdate) {
        this.name = name;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
        this.team = team;
        this.nationality = nationality;
        this.birthdate = birthdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getGoals() {
        return goals;
    }

    public int getAssists() {
        return assists;
    }

    public int getPenalties() {
        return penalties;
    }

    public String getTeam() {
        return team;
    }

    public String getNationality() {
        return nationality;
    }

    public String getBirthdate() {
        return birthdate;
    }
    
    private int points() {
        return goals + assists;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Team: " + team + " Points: " + points();
    }
    
    @Override
    public int compareTo(Player other) {
        return other.points() - this.points();
    } 
}
