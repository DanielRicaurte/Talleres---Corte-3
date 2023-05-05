package puntoCuatro;

public class cuatro {
	public static int num;

    int getFactorial() {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Factorial: ").append(num).append("! = ");
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            sb.append(i);
            factorial *= i;
            if (i != num) {
                sb.append(" * ");
            } else {
                sb.append(" = ");
            }
        }
        sb.append(factorial);
        return sb.toString();
    }
}
