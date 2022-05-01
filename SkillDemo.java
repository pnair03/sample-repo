public class SkillDemo {

    public static int factorial(int x) {
        int output = 1;
        for (int i = 1; i <= x; i++) {
            output *= i;
        }
        return output;
    }
}
