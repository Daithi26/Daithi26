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
public class BasicQuestionsApp {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BasicQuestions basic1 = new BasicQuestions();
        basic1.setQuestionText("whats 9 + 10");
        basic1.setCorrectAnswer("19");
        basic1.setMark(5);
        basic1.setAnswer("21");
        System.out.println(basic1.getQuestionText()+" "+basic1.getCorrectAnswer()+" "+ basic1.getMark()+" "+ basic1.getAnswer());
  
    
    MultipleChoice basic2 = new MultipleChoice();
        basic2.setOpt1("44");
        basic2.setOpt2("19");
        basic2.setOpt3("69");     
        basic2.setQuestionText("whats 9 + 10");
        basic2.setCorrectAnswer("19");
        basic2.setMark(3);
        basic2.setAnswer("21");
        System.out.println(basic2.getQuestionText()+" "+basic2.getCorrectAnswer()+" "+ basic2.getMark()+" "+ basic2.getAnswer()+" "+basic2.getOpt1()+" "+ basic2.getOpt2()+" "+ basic2.getOpt3());
        
        Essay basic3 = new Essay();
        basic3.setQuestionText("Tell me why");
        basic3.setCorrectAnswer("Aint nothing but a heart ache");
        basic3.setMark(10);
        basic3.setAnswer("Aint nothing but a mistake");
        basic3.setMaxWordCount(50);
        System.out.println(basic3.getQuestionText()+" "+basic3.getCorrectAnswer()+" "+ basic3.getMark()+" "+ basic3.getAnswer()+" "+basic3.getMaxWordCount());
   
    }
}
