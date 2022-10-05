import java.util.ArrayList;

public class Variant {


    ArrayList<Question> questions;
//    Question[]questions;

    public Variant(ArrayList<Question>questions) {
        this.questions = questions;
    }


    public ArrayList<Question> getQuestions() {
        return questions;
    }

//    public void setQuestions(Question[] questions) {
//        this.questions = questions;
//    }
}

