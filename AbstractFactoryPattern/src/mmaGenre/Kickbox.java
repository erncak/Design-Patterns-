package mmaGenre;

public class Kickbox implements MixedMartialArts {
    @Override
    public void show() {
        System.out.println("Kickboxer showing his kicks and combinations");
    }

    @Override
    public String figth() {
        return "Kickboxer started a sparring with his teammate";
    }
}
