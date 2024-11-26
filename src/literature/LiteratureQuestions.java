package literature;

public class LiteratureQuestions {
    int i;
    private final String question;

    static String[] Literature = {
            "Mark Twain wrote about which of these characters?",
            "This character says, \"Please, sir, I want some more.\" Who is it?",
            "Who was the main character in J.D. Salinger's \"Catcher in the Rye\"?",
            "J. R. R. Tolkien's written work includes:",
            "George R. R. Martin's game of the thrones contains the following books:",
            "Where did the story \"White Fang\" take place?",
            "Who wrote \"To Kill a Mockingbird\"?",
            "George Orwell wrote which books?",
            "Stephen King bibliography includes:",
            "This man wrote \"Carrie\" and \"Cujo\" along with many other scary novels. What is his name?"
    };

    public LiteratureQuestions(int i) {
        this.i = i;
        this.question = Literature[i];
    }

    public String getQuestion(){
        return question;
    }

}
