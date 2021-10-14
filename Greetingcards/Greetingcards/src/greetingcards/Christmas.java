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
public class Christmas extends Card{

    public Christmas(String recipient,String sender){
        super(recipient,sender); //Card constructor
    }

    public void initialise(){
        String[] ChristmasSalutations = {"Hello","Hi","Merry Christmas"};
        String[] ChristmasVerses = {"We wish you happy holidays","Santa shall visit you"};
        String[] ChristmasClosings = {"Ho Ho Ho","Merry xmas"};

        this.setSalutations(ChristmasSalutations);  //card.setSalutations = this.setSalutations
        this.setVerses(ChristmasVerses); //this means .card
        this.setClosings(ChristmasClosings);
    }
}
    


