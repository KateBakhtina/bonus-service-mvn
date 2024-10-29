public class BonusService {
    public long calculate(long amount, boolean registred){
        int Persent = registred ? 3 : 1;
        long bonus = amount * Persent / 100;
        long limit = 500;

        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
