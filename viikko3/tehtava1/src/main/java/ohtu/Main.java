package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import org.apache.http.client.fluent.Request;

public class Main {
    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        System.out.println("json-muotoinen data:");
        System.out.println( bodyText );
        System.out.println("\n---------\n");

        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        
        ArrayList<Player> finnishPlayers = new ArrayList<>();
        
        for (Player player : players) {
            if (player.getNationality().equals("FIN")) {
                finnishPlayers.add(player);
            }
        }
        
        Collections.sort(finnishPlayers);
        
        System.out.println("Suomen pelaajat pistejärjestyksessä:\n");
        for (Player player : finnishPlayers) {
            System.out.println(player);
        }
    }
  
}
