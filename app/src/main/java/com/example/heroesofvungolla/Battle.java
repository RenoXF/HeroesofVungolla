public class Battle {
    /**
     * This class contains attributes of battles carried out in the game.
     */

    // Initialising private attributes of Battle class.
    private Team team1;
    private Team team2;
    private Hero whoseTurn;
    private Team winner;
    private boolean isFinished = false;
    private int turn = 0;

    // Creating constructor of Battle class
    public Battle(Team team1, Team team2){
        this.team1 = team1;
        this.team2 = team2;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Hero getWhoseTurn() {
        return whoseTurn;
    }

    public void setWhoseTurn(Hero whoseTurn) {
        this.whoseTurn = whoseTurn;
    }

    public Team getWinner() {
        return winner;
    }

    public void setWinner(Team winner) {
        this.winner = winner;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
