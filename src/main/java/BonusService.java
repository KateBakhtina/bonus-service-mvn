public class BonusService {
    public long calculate(long amount, boolean registred){
        int persent = registred ? 3 : 1;
        long bonus = amount * persent / 100;
        long limit = 500;

        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
