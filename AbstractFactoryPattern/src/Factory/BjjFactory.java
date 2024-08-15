package Factory;

import Gyms.BjjGym;
import Gyms.Gym;
import mmaGenre.Brazilianjj;
import mmaGenre.MixedMartialArts;

public class BjjFactory implements GymFactory{
    @Override
    public Gym createGym() {
        return new BjjGym();
    }

    @Override
    public MixedMartialArts createGenre() {
        return new Brazilianjj();
    }
}
