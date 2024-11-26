package literature;

public class LiteratureOptions {
    private final String option1;
    private final String option2;
    private final String option3;
    private final String option4;

    static String[][] Literature = {
            {"Tom Sawyer", "Red Riding Hood", "Little Boy Blue", "Dennis the Menace"},
            {"Atticus Finch", "Oliver Twist", "Darth Vader", "Pluto"},
            {"Huckleberry Finn", "Bart Simpson", "Holden Caulfield", "Clark Kent"},
            {"Song of ice and fire", "The Hobbit", "The dragon under a hill", "The Silmarillion"},
            {"A Dance with Dragons", "The Winds of Winter", "Song of dragons and fire", "The crow's ballad"},
            {"Yukon Territory", "Italy", "Antarctica", "Las Vegas"},
            {"John Lennon", "Dr. Seuss", "Harper Lee", "Ronald Reagan"},
            {"Animal farm", "Nineteen Eighty-four", "The lord of the flies", "The Road to Wigan Pier"},
            {"Roadside picnic", "It", "The Green Mile", "Doctor sleep"},
            {"Charles Dickens", "Ernest Hemingway", "William Faulkner", "Stephen King"},
    };

    public LiteratureOptions(int i) {
        this.option1 = Literature[i][0];
        this.option2 = Literature[i][1];
        this.option3 = Literature[i][2];
        this.option4 = Literature[i][3];
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
