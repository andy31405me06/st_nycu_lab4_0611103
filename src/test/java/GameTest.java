import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game test;
    @BeforeEach
    void setUp() {
        test=new Game();
    }
    @Test
    void play(){
        String result="Draw!";
        assertEquals(result, test.play("rock", "rock"));
        assertEquals(result, test.play("paper", "paper"));
        assertEquals(result, test.play("scissors", "scissors"));

        result="Player 1 win!";
        assertEquals(result, test.play("rock", "scissors"));
        assertEquals(result, test.play("paper", "rock"));
        assertEquals(result, test.play("scissors", "paper"));

        result="Player 2 win!";
        assertEquals(result, test.play("rock", "paper"));
        assertEquals(result, test.play("paper", "scissors"));
        assertEquals(result, test.play("scissors", "rock"));
    }
    @Test
    void check(){
        assertDoesNotThrow(()->{
            test.check("rock");
        });
        assertDoesNotThrow(()->{
            test.check("paper");
        });
        assertDoesNotThrow(()->{
            test.check("scissors");
        });
        assertThrows(IllegalArgumentException.class, ()->{
            test.check("peko");
        });
    }
}