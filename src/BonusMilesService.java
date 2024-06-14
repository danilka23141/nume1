public class BonusMilesService {

    public int calculate(int price) {
        int milesPerRubles = 20;
        int miles = price / milesPerRubles;
        return miles;
    }
}
