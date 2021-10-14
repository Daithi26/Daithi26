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
public class Wedding extends Card {
    
    public Wedding(String receiver, String sender) {
        super(receiver, sender);
    }
   public void initialise(){
        String[] WeddingSalutations = {"Hello","Hi","Congratulations"};
        String[] WeddingVerses = {"Congratulations on your big day","Wishing you a lifetime of love and joy"};
        String[] WeddingClosings = {"With love","Best wishes"};

        this.setSalutations(WeddingSalutations);  //card.setSalutations = this.setSalutations
        this.setVerses(WeddingVerses); //this means .card
        this.setClosings(WeddingClosings);
    }  
}
