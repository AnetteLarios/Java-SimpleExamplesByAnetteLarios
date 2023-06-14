package ArithmeticExercises1.MathUtils;
/*
MathUtils class is an example of how functions can be separated to be used for a variety of users and applies.
@author Anette Larios
@since 14.06.2023
*/
public class MathUtils {

    /*
    moneyAssignedForEachInhabitantPerMonth divides the value received by four to obtaing the amount assigned for each
    inhabitant.
    @param salary makes reference to the salary obtain in any month
    @return is the result of the given salary divided by four. (It can be different of four, it is just an example of
    the inhabitants this employee has in his house.
    @author Anette Larios
    @since 14.06.2023
     */
    public static float moneyAssignedForEachInhabitantPerMonth(int salary){
        //converts salary to float and then divides it by four.
        return (float) salary / 4;
    }

    /*
    leftOverMoneyAfterDistribution gives the residue after dividing the money between the inhabitants
    @param salary refers to any month salary
    @return is the result of the given salary divided by four.
    @author Anette Larios
    @since 14.06.2023
     */
    public static float leftOverMoneyAfterDistribution(int salary){
        //converts salary to float and then divides it by four.
        return (float) salary % 4;
    }
}
