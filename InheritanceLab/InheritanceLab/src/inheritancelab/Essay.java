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
public class Essay extends BasicQuestions {

    private int maxWordCount;

    public Essay(int maxWordCount, String QuestionText, String CorrectAnswer, int Mark, String Answer) {
        super(QuestionText, CorrectAnswer, Mark, Answer);
        this.maxWordCount = maxWordCount;
    }

    public Essay() {
        super();
        maxWordCount=0;
    }

    public int getMaxWordCount() {
        return maxWordCount;
    }

    public void setMaxWordCount(int maxWordCount) {
        this.maxWordCount = maxWordCount;
    }
    
    
    


}
