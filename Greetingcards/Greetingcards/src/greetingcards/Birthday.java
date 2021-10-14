/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greetingcards;

/**
 *
 * @author david
 */
public class Birthday extends Card {
    
    public Birthday(String receiver, String sender) {
        super(receiver, sender);
    }
     public void initialise(){
        String[] BirthdaySalutations = {"To","Hi"};
        String[] BirthdayVerses = {"I wish you Happy Birthday","Another year older another year wiser"};
        String[] BirthdayClosings = {"From","Much Love"};

        this.setSalutations(BirthdaySalutations);  //card.setSalutations = this.setSalutations
        this.setVerses(BirthdayVerses); //this means .card
        this.setClosings(BirthdayClosings);
    }
}
