import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    static private int number = 0;

    public BoxOffice(){}

    public static List<Ticket> buy(Concert concert, int amount){
        List<Ticket> result = new ArrayList<>();

        for (int i = 0; i < amount; ++i){
            try {
                result.add(new Ticket(concert.getCurrent_ticket(),concert));
            } catch (InvalidTicket invalidTicket) {
                invalidTicket.printStackTrace();
            }
        }

        return result;
    }


}
