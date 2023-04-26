package rafaelferreros.kata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import rafaelferreros.kata.services.ChessService;
import rafaelferreros.kata.services.KataService;

@SpringBootApplication
public class ConsoleApplication implements CommandLineRunner {

    private final KataService kataService;

    private final ChessService chessService;

    @Autowired
    public ConsoleApplication(
            KataService kataService,
            ChessService chessService
    ) {
        this.kataService = kataService;
        this.chessService = chessService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsoleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        kataService.runKatas();
        chessService.execute();
    }
}