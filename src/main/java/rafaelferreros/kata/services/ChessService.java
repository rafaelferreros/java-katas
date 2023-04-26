package rafaelferreros.kata.services;

import org.springframework.stereotype.Service;
import rafaelferreros.kata.entity.Player;

@Service
public class ChessService {
    public void execute() {

        Player p1 = new Player(1, "RAFA", "Black");
        Player p2 = new Player(1, "RAFA", "Black");

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.name());

    }
}
