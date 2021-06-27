package at.aau.ESOP.AB10.Exercise2;

/**
 * Created by Nikita on 08.06.2021 at 21:24
 */
public class FootballMatchSportMatch {
    public static void main(String[] args) {
        FootballMatch match = new FootballMatch();
        match.setTeams("Barcelona", "Real Madrid");
        match.teamScored("Real Madrid");
        match.teamScored("Barcelona");
        match.teamScored("Real Madrid");
        System.out.println(match.getTeams());
        System.out.println(match.getScores()[0] + " - " + match.getScores()[1]);
    }

    /**
     * Ein interface SportMatch ist nützlich für die Implementierung verschiedener Sportspiele, z. B. der folgenden
     * Klasse FootballMatch. Definieren Sie das public interface SportMatch, das die class FootballMatch implementiert.
     */

    interface SportMatch{
        void setTeams(String homeTeam, String visitingTeam);
        String getTeams();
        boolean isMatchOver(double time);
        int[] getScores();
        void teamScored(String teamName);
    }


    public static class FootballMatch implements SportMatch {

        private String hTeam;
        private String vTeam;

        private int hScore;
        private int vScore;

        @Override
        public void setTeams(String homeTeam, String visitingTeam) {
            hTeam = homeTeam;
            vTeam = visitingTeam;
        }

        @Override
        public String getTeams() {
            return hTeam + " - " + vTeam;
        }

        @Override
        public boolean isMatchOver(double time) {
            return time >= 90.0;
        }

        @Override
        public int[] getScores() {
            int[] result = new int[2];
            result[0] = hScore;
            result[1] = vScore;
            return result;
        }

        @Override
        public void teamScored(String teamName) {
            if (teamName == hTeam) hScore++;
            else if (teamName == vTeam) vScore++;
        }
    }
}
