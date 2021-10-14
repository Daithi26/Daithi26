/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancelab;

/**
 *
 * @author david
 */
public class BasicQuestions {


private String QuestionText;
private String CorrectAnswer;
private int Mark;
private String Answer;

    public BasicQuestions(String QuestionText, String CorrectAnswer, int Mark, String Answer) {
        this.QuestionText = QuestionText;
        this.CorrectAnswer = CorrectAnswer;
        this.Mark = Mark;
        this.Answer = Answer;
    }

    public BasicQuestions() {
        QuestionText="";
        CorrectAnswer="";
        Mark=0;
        Answer="";
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setQuestionText(String QuestionText) {
        this.QuestionText = QuestionText;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String CorrectAnswer) {
        this.CorrectAnswer = CorrectAnswer;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int Mark) {
        this.Mark = Mark;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }
   

    }

        
  
