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
public class MultipleChoice extends BasicQuestions {
 
    private String opt1;
    private String opt2;
    private String opt3;

    public MultipleChoice(String opt1, String opt2, String opt3, String QuestionText, String CorrectAnswer, int Mark, String Answer) {
        super(QuestionText, CorrectAnswer, Mark, Answer);
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
    }

   
    public MultipleChoice() {
        super ();
        opt1=" ";
        opt2=" ";
        opt3=" ";
          }

    public String getOpt1() {
        return opt1;
    }

    public void setOpt1(String opt1) {
        this.opt1 = opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public void setOpt2(String opt2) {
        this.opt2 = opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public void setOpt3(String opt3) {
        this.opt3 = opt3;
    }

}
