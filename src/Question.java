import java.util.ArrayList;
import java.util.Collections;

public class Question {
    String question;
    ArrayList<String> listOfAnswers;
    String answer;
    ArrayList<String> reverseList() {
        ArrayList<String> res = new ArrayList<>();
        for (int i = listOfAnswers.size() - 1; i >= 0; i--) {
            res.add(listOfAnswers.get(i));
        }
        return res;
    }
    public ArrayList<String> shuffleList() {
        listOfAnswers = reverseList();
        Collections.shuffle(listOfAnswers);
        return listOfAnswers;
    }
    public Question(String question,
                    ArrayList<String> listOfAnswers,
                    String answer) {
        this.question = question;
        this.listOfAnswers = listOfAnswers;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public ArrayList<String> getListOfAnswers() {
        return listOfAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "question='" + question + '\'' +
                ", listOfAnswers=" + listOfAnswers +
                ", answer='" + answer + '\'' +
                '}' + '\n' + "___________";
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setListOfAnswers(ArrayList<String> listOfAnswers) {
        this.listOfAnswers = listOfAnswers;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
