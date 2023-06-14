package ArithmeticExercises1.MathUtils;

public class MathUtils {
    public static float moneyAssignedForEachInhabitantPerMonth(int salary){
        return (float) salary / 4;
    }

    public static float leftOverMoneyAfterDistribution(int salary){
        return (float) salary % 4;
    }
}
