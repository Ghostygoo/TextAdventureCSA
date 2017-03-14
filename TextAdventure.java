
/**
 * Write a description of class TextAdventure here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;
public class TextAdventure
{
   Scanner in = new Scanner(System.in);
    public void main(){
     
        TextAdventure call = new TextAdventure();
        
        
        System.out.println("Welcome to a relatively simple text adventure");
        System.out.println("  ");
        System.out.println("You are returning from high school and you are at a crossroad,");
        System.out.println("which way will you go?(Forwards, left, right)");
        String statement = in.nextLine();
        statement = statement.toLowerCase();
     
        if (statement.contains("forwards")){
            System.out.println("  ");
            forwardsAtStart();

        }
        else if (statement.contains("left")){
            System.out.println("You are at a dead end");
            System.out.println("You go back where you started.");
            System.out.println("Which direction to you go in? ('forwards' or 'right')");
            
            String statementseventhree = in.nextLine();
            statementseventhree = statementseventhree.toLowerCase();
            
            if (statementseventhree.contains("forwards")){
                System.out.println("  ");
                forwardsAtStart();
            }
            else if (statementseventhree.contains("right")){
                System.out.println("  ");
                rightAtStart();
            }
        }
        else if (statement.contains("right")){
            System.out.println("This ");
        }    
        else{
            System.out.println("sorry, that is not an option.");
            main();
        }   


            /*else if (call.equals("officer")){
                System.out.println("You get carried out on a strecher;");
                System.out.println("then you get brought to the hospital,");
                System.out.println("and given surgery, and then you're brought home to recover.");
            }
            */
            /*
         if (call.equals("tell one of the units")){
                    System.out.println("The police units in the area are sent after the runner but,there are no medical");
                    System.out.println(" units near you so you die from blood loss and you are honored,");
                    System.out.println(" by the local police force and you are put on several news channels for your choice.");
            }
            */

                   /*if(avoid.contains("avoid")){
                       System.out.println("You get taken hostage by the initials robber wingman,");
                       System.out.println("and now you have been tied up and put up with the other captives,");
                       System.out.println("what do you do?(roll over and help the others, help yourself, do nothing)");       
                       

                       if (roll.contains("roll over")){
                           System.out.println("The second theif returns and on the hostages,");
                           System.out.println("(including you)and only sees you, so he kills you.");
                           System.out.println("Thanks to you the hostages escaped.");
                           
      
                           if (nothing.contains("do nothing")){
                       System.out.println("The second robber returns and on the hostages,");
                       System.out.println("an he sees you and the hostages so he kills you and them.");
                       

                       if(yourself.contains("help yourself")){
                           System.out.println("You escape but get shot once in the back of the knee,");
                           System.out.println("during a firefight, while the rest of the hostages died");
                           System.out.println("when the second robber return to check on them.");
                           
                       
         if (back1.contains("go back")){
        System.out.println("You go back to where you started."); 




        if (direction.contains("left")){
      System.out.println("You are at a dead end, you go back to where you started.");
    
    
      
      
        if (direction.contains("right")){
        System.out.println("You go to an alley way, you could either go back to where you started,");
        System.out.println("or continue forwards, which do you choose?(Go back, continue forwards)");
        
                       
          if (back2.contains("go back")){
        System.out.println("You go back to where you started.(Forwards, left, right)");  
        
                      
        if (confor.contains("continue forwards")){
        System.out.println("You reach the other side of the alley way,");
        System.out.println("and then you see group of people trying to kidnap someone,");
        System.out.println("what do you do?(Help the kidnappers, help the kidnapped, avoid the situation)");
        
             
        
            if (kidnapped.contains("help the kidnapped")){
        System.out.println("you get kidnapped as well. Then after 30 minutes you hear the car shut off,");
        System.out.println("and then you start feeling the car move forwards and a sudden splashing sound.");
        System.out.println("Then you notice water seeping into the car about five seconds later.");
        System.out.println("The other person in the car trunk next to youstarts to panic.");
        System.out.println("You tell them to calm down but they don't don't listen, about a minite later,");
        System.out.println("both of you are on the brink of drowning, then the car hits the lake's floor, ");
        System.out.println("and then you both drown knowing your bodies will never be found.");
        
        
        if (kidnappers.contains("help the kidnappers")){
         System.out.println("They spare you and ask if you want to join their gang,");
         System.out.println("what do you do?(Accept offer, decline offer)");
         

            if (accept1.contains("accept offer")){
         System.out.println("They spare you and ask you if you want to join their gang,");
         System.out.println("what do you do?(accept second offer, decline second offer)");
         

            if (accept2.contains("accept second offer")){
         System.out.println("They take you home and did so relatively safely");
         

            if (decline1.contains("decline offer")){
                    System.out.println("They kill you on the spot thinking you tried to deceive them.");
         

            if (decline1.contains("decline second offer")){
                    System.out.println("They drive off and leave you there then you wait for a few hours,");
                    System.out.println("what do you do? (cross the road, wait for some more time)");
         

            if (cross.contains("cross the road")){
                System.out.println("You get run over by a cop trying to catch some robbers with stolen bags of cash,");
                System.out.println("that was stolen from a bank earlier that day.");
         

            if (wait.contains("wait for some more time")){
                System.out.println("You died from malnutrition/starvation.");}
            
            }
        }
      } */

   }

   public void attackBankRobber(){
       System.out.println("You get shot in the chest and start to bleed,");
       System.out.println("and you are paralized from the neck down,");
       System.out.println("but the robber has been distracted long enough to be arrested,");
       System.out.println("yet his wingman has gotten away with the cash while the police didn't notice");
       System.out.println("what do you do?(Call for an officer to help you,");
       System.out.println("tell one of the units of the remaining theif on the run)");
    }
    public void avoidSituation(){
       System.out.println("You get taken hostage by the initials robber wingman,");
       System.out.println("and now you have been tied up and put up with the other captives,");
       System.out.println("what do you do?(roll over and help the others, help yourself, do nothing)");           
    }
    public void forwardsAtStart(){
        System.out.println("You reach a crime scene and you see a high grade bank being robbed,");
        System.out.println("what do you do?('attack' armed robber, 'avoid' situation)");
            
        String statement1 = in.nextLine();
        statement1 = statement1.toLowerCase();
        if (statement1.contains("attack")){
            System.out.println("  ");
            attackBankRobber();
        }
        if (statement1.contains("avoid")){
           System.out.println("  ");
           avoidSituation();
        }
    }
    public void rightAtStart(){
        System.out.println("You go to an alley way, you could either go back to where you started,");
        System.out.println("or continue forwards, which do you choose?(Go 'back', 'continue' forwards)");
        
        String statementseventy = in.nextLine();
        statementseventy = statementseventy.toLowerCase();
        
        if (statementseventy.contains("back")){
            main();
        }
        if (statementseventy.contains("continue")){
            System.out.println("  ");
            System.out.println("You reach the other side of the alley way,");
            System.out.println("and then you see group of people trying to kidnap someone,");
            System.out.println("what do you do?(help the 'kidnappers', help the 'kidnapped', 'avoid' the situation)");
            
            String statementeight = in.nextLine();
            statementeight = statementeight.toLowerCase();
            
            if (statementeight.contains("kidnappers")){
                helpKidnappers();
            }
            if (statementeight.contains("kidnapped")){
                helpKidnapped();
            }
            if (statementeight.contains("avoid")){
                avoidingKidnap();
            }
        }
        
    }
    public void helpKidnappers(){
        
    }
    public void helpKidnapped(){
        
    }
    public void avoidingKidnap(){
        
    }
    
}

