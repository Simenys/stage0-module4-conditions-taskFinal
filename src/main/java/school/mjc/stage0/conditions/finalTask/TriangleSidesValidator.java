package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        double a = firstSide * firstSide;
        double b = secondSide * secondSide;
        double c = thirdSide * thirdSide;
        if (a + b == c || a + c == b || b + c == a) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }

    }
}

// a2 + b2 = c2
