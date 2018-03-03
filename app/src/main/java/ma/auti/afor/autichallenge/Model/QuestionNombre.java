package ma.auti.afor.autichallenge.Model;

/**
 * Created by DELL on 19/01/2018.
 */

public class QuestionNombre {
    private int ID;
    private String Image;
    private String AnswerA;
    private String AnswerB;
    private String AnswerC;
    private String CorrectAnswer;

    public QuestionNombre(int ID, String image, String answerA, String answerB, String answerC, String correctAnswer) {
        this.ID = ID;
        Image = image;
        AnswerA = answerA;
        AnswerB = answerB;
        AnswerC = answerC;
        CorrectAnswer = correctAnswer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }
}
