package mmaGenre;

public class Wrestler implements MixedMartialArts {
    @Override
    public void show() {
        System.out.println("Wrestler is wresting with a bear");
    }

    @Override
    public String figth() {
        return "Wrestler is started to wrestle on  a mat with partner";
    }

}
