import com.example.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RefereeTest {

    Referee referee = new Referee();

    @Test
    @DisplayName("両方がバーストだったらディーラーの勝ち")
    public void test01() {
        Player player = new Player("プレイヤー");
        player.hit(Card.CLUB_3);
        player.hit(Card.CLUB_9);
        player.hit(Card.CLUB_10);
        Dealer dealer = new Dealer("ディーラー");
        dealer.hit(Card.SPADE_3);
        dealer.hit(Card.SPADE_9);
        dealer.hit(Card.SPADE_10);
        Result result = referee.judge(player, dealer);
        assertEquals(Result.DEALER_WIN, result);
    }
}
