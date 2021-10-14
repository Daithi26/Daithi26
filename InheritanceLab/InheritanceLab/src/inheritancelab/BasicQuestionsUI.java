/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancelab;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author david
 */
public class BasicQuestionsUI {
    private ArrayList <BasicQuestions> questions;
    
    public BasicQuestionsUI () {
        questions = new ArrayList<>();
    }
     public void add() {
        int type = Integer.parseInt(JOptionPane.showInputDialog(null, "Do you want to add 1. Essay or 2. Multiple Choice?"));
        if (type == 1) {
            Essay m = new Essay();
            m.setQuestionText(JOptionPane.showInputDialog(null, "Enter Question:"));
            m.setCorrectAnswer(JOptionPane.showInputDialog(null, "Enter Correct Answer:"));
            m.setAnswer(JOptionPane.showInputDialog(null, "Enter Answer:"));
            m.setMark((int) Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Mark:")));
            m.setMaxWordCount((int) Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Max Word Count:")));

            questions.add(m);

        } else if (type == 2) {
            MultipleChoice f = new MultipleChoice();
            f.setQuestionText(JOptionPane.showInputDialog(null, "Enter Question:"));
            f.setCorrectAnswer(JOptionPane.showInputDialog(null, "Enter Correct Answer:"));
            f.setAnswer(JOptionPane.showInputDialog(null, "Enter Answer:"));
            f.setMark((int) Double.parseDouble(JOptionPane.showInputDialog(null, "Enter Mark:")));
            f.setOpt1(JOptionPane.showInputDialog(null, "Enter Opt1:"));
            f.setOpt2(JOptionPane.showInputDialog(null, "Enter Opt2:"));
            f.setOpt3(JOptionPane.showInputDialog(null, "Enter Opt3:"));
            

            questions.add(f);
        }
    }

    public void print() {
        for (int i = 0; i < questions.size(); i++) {
            BasicQuestions e = questions.get(i);
            if (e instanceof Essay) {
                JOptionPane.showMessageDialog(null, "Question:" + e.getQuestionText() + "\n CorrectAnswer: " + e.getCorrectAnswer() + "\n YourAnswer: " + e.getAnswer() + "\n Mark: " + e.getMark() + "\n Max Word: " + ((Essay) e).getMaxWordCount());
                } else if (e instanceof MultipleChoice) {
                    JOptionPane.showMessageDialog(null, "Question:" + e.getQuestionText() + "\n CorrectAnswer: " + e.getCorrectAnswer() + "\n YourAnswer: " + e.getAnswer() + "\n Mark: " + e.getMark() + "\n Opt1: " + ((MultipleChoice) e).getOpt1() + "\n Opt2: " + ((MultipleChoice) e).getOpt2() + "\n Opt3: " + ((MultipleChoice) e).getOpt3());
                }
        }
    }

    public void search() {
        String searchTerm = JOptionPane.showInputDialog(null, "Please enter an ID to search for");
        for (BasicQuestions e:questions) {
            if (e.getQuestionText().equals(searchTerm)) {
                if (e instanceof Essay) {
                    JOptionPane.showMessageDialog(null, "Question:" + e.getQuestionText() + "\n CorrectAnswer: " + e.getCorrectAnswer() + "\n YourAnswer: " + e.getAnswer() + "\n Mark: " + e.getMark() + "\n Max Word: " + ((Essay) e).getMaxWordCount());
                } else if (e instanceof MultipleChoice) {
                    JOptionPane.showMessageDialog(null, "Question:" + e.getQuestionText() + "\n CorrectAnswer: " + e.getCorrectAnswer() + "\n YourAnswer: " + e.getAnswer() + "\n Mark: " + e.getMark() + "\n Opt1: " + ((MultipleChoice) e).getOpt1() + "\n Opt2: " + ((MultipleChoice) e).getOpt2() + "\n Opt3: " + ((MultipleChoice) e).getOpt3());
                }
            }
        }
    }
    
    public void delete(){
        String searchTerm = JOptionPane.showInputDialog(null,"Enter an Question to delete");
        for(BasicQuestions e:questions){
            if(e.getQuestionText().equals(searchTerm)){
               questions.remove(e);
            }
            break;
        }
    }
    
    public void menu(){
        int ans = Integer.parseInt(JOptionPane.showInputDialog(null,"Please select an option: \n 1.Add a new Question \n 2.Display all Questions \n 3.Search for a Question \n 4.Delete an Question"));
        switch (ans) {
            case 1:
                add();
                break;
            case 2:
                print();
                break;
            case 3:
                search();
                break;
            case 4:
                delete();
                break;
            default:
                break;
        }
    }
}
