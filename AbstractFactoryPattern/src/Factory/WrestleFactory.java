package Factory;

import Gyms.Gym;
import Gyms.WrestleGym;
import mmaGenre.MixedMartialArts;
import mmaGenre.Wrestler;

public class WrestleFactory implements GymFactory{
    @Override
    public Gym createGym() {
        return new WrestleGym();
    }

    @Override
    public MixedMartialArts createGenre() {
        return new Wrestler();
    }
}
