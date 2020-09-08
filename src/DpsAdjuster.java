public class DpsAdjuster
{
    long desiredDps;
    double multiplier;

    float cooldownifpossible(long ms)
    {
        if (ms < 1000)
        {
            double ret = 1000 - ms;

            System.out.println("delayed " + ret + " ms");
        }
    }

    double getMultiplier(long ms, double strikeDamage)
    {
        multiplier = strikeDamage / ms;
        return multiplier;
    }

    DpsAdjuster constructor = new DpsAdjuster();
}