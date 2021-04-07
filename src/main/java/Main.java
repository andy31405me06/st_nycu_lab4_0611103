import java.util.Scanner;
public class Main {
    public static void main(String[] args)throws IllegalArgumentException{
        Scanner in=new Scanner(System.in);
        Game game=new Game();
        String player1, player2;
        try{
            System.out.println("=== Welcome to Rock-Paper-Scissors game ===");
            System.out.println("Enter Player 1 choice (rock, paper or scissors):");
            player1=in.nextLine();game.check(player1);
            System.out.println("Enter Player 2 choice (rock, paper or scissors):");
            player2=in.nextLine();game.check(player2);
            System.out.println(game.play(player1,player2));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
