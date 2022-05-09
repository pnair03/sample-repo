public class SkillDemo {

    public static int factorial(int x) {
        int output = 1;
	//Iterates through all numbers up to x
        for (int i = 1; i <= x; i++) {
            output *= i;
        }
        return output;
    }
}
