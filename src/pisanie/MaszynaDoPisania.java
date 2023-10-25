package pisanie;

public class MaszynaDoPisania implements Piszacy {

    @Override
    public void pisz() {
        System.out.println("*** Mechaniczne dzwieki ***");
    }
}
