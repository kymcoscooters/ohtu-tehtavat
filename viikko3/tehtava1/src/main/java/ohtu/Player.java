
package ohtu;

public class Player {
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

    @Override
    public String toString() {
        return "Name: " + name + " Team: " + team;
    }
      
}
