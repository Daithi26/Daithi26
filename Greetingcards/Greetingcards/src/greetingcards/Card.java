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
import java.util.Random;

public class Card {
    private String recipient;
    private String sender;

    private String[] salutations = {};
    private String[] verses = {};
    private String[] closings = {};

    Random randomNumberGenerator = new Random();  //random index


    public String getReceiver() {
        return recipient;
    }
    public void setReceiver(String recipient) {
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }
    public void setSender(String sender) {
        this.sender = sender;
    }

    public String[] getVerses() {
        return verses;
    }
    public void setVerses(String[] verses) {
        this.verses = verses;
    }


    public String[] getClosings() {
        return closings;
    }
    public void setClosings(String[] closings) {
        this.closings = closings;
    }

    public String[] getSalutations() {
        return salutations;
    }

    public void setSalutations(String[] salutations) {
        this.salutations = salutations;
    }


    public Card (String receiver,String sender){
        this.recipient = receiver;
        this.sender = sender;
    }


    public void salutation(){
        String[] salutationArray; //this will store the salutation array

        salutationArray = getSalutations(); //gets all the salutations

        String receipient = getReceiver(); //gets the receiver which you passed a parameter

        int randomString = randomNumberGenerator.nextInt(salutationArray.length);
        //selects a random index from salutationArray
        //salutatioArray = "Hello", "Merry Xmas" , "greetings"
        // index will be:    0         1                2
        //random string randomly choses betwee 0 1 2

        System.out.println(salutationArray[randomString]+" "+receipient);
        //                                 ^ it can be 0, 1 ,2
    }

    public void verse(){
        String[] verseArray;
        verseArray = getVerses();
        int randomString = randomNumberGenerator.nextInt(verseArray.length);
        System.out.println(verseArray[randomString]);
    }

    public void closing(){
        // code here
        String[] closingArray;
        closingArray = getClosings();
        String sender = getSender();
        int randomString = randomNumberGenerator.nextInt(closingArray.length);
        System.out.println(closingArray[randomString]+" "+sender);
    }

    public static void main(String[] args){
        Christmas card1 = new Christmas("dan","david");
        card1.initialise(); //this puts the values
        card1.salutation();
        card1.verse();
        card1.closing();
   
        Birthday card2 = new Birthday("dan","david");
        card2.initialise(); //this puts the values
        card2.salutation();
        card2.verse();
        card2.closing();
         
        Wedding card3 = new Wedding("dan","david");
        card3.initialise(); //this puts the values
        card3.salutation();
        card3.verse();
        card3.closing();
    }
}
   
    

