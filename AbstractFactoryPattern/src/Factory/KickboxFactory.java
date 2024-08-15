package Factory;

import Gyms.Gym;
import Gyms.KickboxGym;
import mmaGenre.Kickbox;
import mmaGenre.MixedMartialArts;

public class KickboxFactory implements GymFactory{
    @Override
    public Gym createGym() {
        return new KickboxGym();
    }

    @Override
    public MixedMartialArts createGenre() {
        return new Kickbox();
    }
}
