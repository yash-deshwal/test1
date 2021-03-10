package op.ac.com.cs.task1.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="quiz_question")
public class Question {
    @Id
    String id;
    String question;

    public Question(){

    }
    public Question(String id, String question) {
        this.id = id;
        this.question = question;

    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
