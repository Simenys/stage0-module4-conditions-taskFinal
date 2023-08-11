package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0 || dividend == 0) {
            System.out.println("division by zero");
            return;
        }
        int remains = dividend / divider;
        int answer = remains * divider;
        if (answer == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }
}

//print:"can be divided completely", otherwise "cannot be divided completely" or "division by zero".