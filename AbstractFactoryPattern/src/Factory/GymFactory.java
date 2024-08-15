package Factory;

import Gyms.Gym;
import mmaGenre.MixedMartialArts;

public interface GymFactory {
    Gym createGym();
    MixedMartialArts createGenre();
}
