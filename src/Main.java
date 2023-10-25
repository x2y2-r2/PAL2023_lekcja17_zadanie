import pisanie.Dziecko;
import pisanie.MaszynaDoPisania;
import pisanie.Pisarz;
import pisanie.Piszacy;

import java.util.List;

// !!! NIE MODYFIKUJ TEJ KLASY !!!
//
// Na konsoli ma się pojawić:

//nO pszeciesz pisze!
//*** Mechaniczne dzwieki ***
//Pisze powiesc tragiczna

public class Main {
    public static void main(String[] args) {

        List<Piszacy> piszacy = List.of(new Dziecko(), new MaszynaDoPisania(), new Pisarz());

        for (Piszacy p : piszacy) {
            p.pisz();
        }
    }
}