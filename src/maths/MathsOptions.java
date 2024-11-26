package maths;

public class MathsOptions {
    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;

    static String[][] Maths = {
            {"Godel's Incompleteness", "the Intermediate Value ", "Pythagorean", "Unprovability of choice"},
            {"360", "180", "90", "420"},
            {"3.14159", "3.33 repeating", "π", "0.5π"},
            {"Integrals", "Factorials", "Calculating the angle of a vector", "The order of operations"},
            {"Intersection", "Union", "Division", "Subset"},
            {"1", "-1", "0.5", "0"},
            {"0.5", "1", "0", "π"},
            {"Accute angle", "Right angle", "Reflex Angle", "Long angle"},
            {"25", "50", "25.5", "26"},
            {"5", "6", "7", "8"},
    };

    public MathsOptions(int i) {
        this.option1 = Maths[i][0];
        this.option2 = Maths[i][1];
        this.option3 = Maths[i][2];
        this.option4 = Maths[i][3];
    }

    public String getOption(int i) {
        if (i == 1) {
            return option1;
        } else if (i == 2) {
            return option2;
        } else if (i == 3) {
            return option3;
        } else {
            return option4;
        }
    }

}
