import java.util.Scanner;
import java.util.Random;
public class Ssp {
    public static void main(String[] args){
        Scanner scanit=new Scanner(System.in);
        System.out.println("This is a Stone, Paper and Scissors game");
        System.out.println("Moves-- Stone, Paper and Scissors");
        System.out.println("Win most rounds to be a champion");
        System.out.println("");
        String [] moves=new String[]{"Scissors","Stone","Paper"}; 
        Random random_selector = new Random();
        int player_score=0;
        for(int i=1;i<=5;i++){
            int computer_move= random_selector.nextInt(3);
            System.out.print("Play your move : ");
            String player_move= scanit.nextLine();
            System.out.println("Computer >> "+moves[computer_move]);
            System.out.println("Player >> "+player_move);
            System.out.println("........");
          
            if(moves[computer_move]=="Scissors" && player_move.equals("Stone")) 
                player_score++;
            if(moves[computer_move]=="Paper" && player_move.equals("Scissors")) 
                player_score++;
            if(moves[computer_move]=="Stone" && player_move.equals("Paper")) 
                player_score++;
        }
        scanit.close();
        if(player_score>2) System.out.println("You WON");
        if(player_score==2) System.out.println("It's a TIE");
        if(player_score<2) System.out.println("Computer WON");
        System.out.println("Your score : "+player_score);
        
    }
}
