package maths;

public class MathsQuestions {
    int i;
    private final String question;

    static String[] Maths = {
            "Which well known theorem that the sum of the squares on the legs of a right triangle is equal to the square on the hypotenuse",
            "The sum of the inner angles in any triangle is equal to how many degrees",
            "180 degrees is equal to how many radians?",
            "The PEMDAS acronym is used to help with:",
            "The symbol ∩ is used to express:",
            "The square root of one is equal to:",
            "The value of cos 360° is:",
            "Angle greater than 180 degrees but less than 360 degrees are called?",
            "What is the average of the first 50 natural numbers?",
            "From the product of 9 and 10, subtract 48; then divide the result by 7. What is your final answer?"
    };

    public MathsQuestions(int i) {
        this.i = i;
        this.question = Maths[i];
    }

    public String getQuestion(){
        return question;
    }

}
