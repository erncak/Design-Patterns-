import Factory.BjjFactory;
import Factory.GymFactory;
import Gyms.Gym;
import Gyms.KickboxGym;
import mmaGenre.MixedMartialArts;

public class Main {
    public static void main(String[] args) {

        GymFactory gymFactory;
        gymFactory = new BjjFactory();
        Gym gym = gymFactory.createGym();
        MixedMartialArts mixedMartialArts = gymFactory.createGenre();
        System.out.println(gym.showGymInfo());
        System.out.println(mixedMartialArts.figth());

    }
}