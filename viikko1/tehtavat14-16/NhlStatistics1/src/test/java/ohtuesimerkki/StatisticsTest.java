package ohtuesimerkki;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class StatisticsTest {
    
    Reader readerStub = new Reader() {
        public List<Player> getPlayers() {
            ArrayList<Player> players = new ArrayList<>();
            
            players.add(new Player("Semenko", "EDM", 4, 12));
            players.add(new Player("Lemieux", "PIT", 45, 54));
            players.add(new Player("Kurri",   "EDM", 37, 53));
            players.add(new Player("Yzerman", "DET", 42, 56));
            players.add(new Player("Gretzky", "EDM", 35, 89));
            
            return players;
        }
    };
    
    Statistics stats;
    
    @Before
    public void setUp() {
        stats = new Statistics(readerStub);
    }
    
    @Test
    public void searchingForPlayerReturnsPlayer() {
        assertNotNull(stats.search("Semenko"));
    }
    
    @Test
    public void searchingForNonExistentPlayerReturnsNull() {
        assertNull(stats.search("Laine"));
    }
    
    @Test
    public void teamReturnsAllTeamPlayers() {
        assertEquals(3, stats.team("EDM").size());
    }
    
    @Test
    public void topScorersReturnRightAmountOfPlayers() {
        assertEquals(4, stats.topScorers(4).size());
    }
    
    @Test
    public void topScorerIsCorrect() {
        assertEquals("Gretzky", stats.topScorers(1).get(0).getName());
    }
}
