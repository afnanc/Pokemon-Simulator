//imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// player class includes pokemon stats
public class Player{
  private String name;
  private Pokemon team1 = new Pokemon();
  private Pokemon team2 = new Pokemon();
  int pokemonteam1Health = team1.gettotalHealth();
  int pokemonteam2Health = team2.gettotalHealth();
// player includes all pokemon states and test the battle simulation
  public void Player(String pokemonTeam1, String pokemonTeam2){
    Scanner askUser = new Scanner(System.in);
    if(pokemonTeam1 == "Bulbasaur"){
      team1.Pokemon("Bulbasaur", "Grass", 40, 20, 150, 5);
    }
    else if(pokemonTeam1 == "MewTwo"){
      team1.Pokemon("MewTwo", "Phychic", 40, 20, 150, 5);
    }
    else if(pokemonTeam1 == "Electabuzz"){
      team1.Pokemon("Electabuzz", "Electric", 40, 20, 150, 5);
    }
    else{
      System.out.println("");
    }
    if(pokemonTeam2 == "Charmander"){
      team2.Pokemon("Charmander", "Fire", 40,20,150,5);
    }
    else if(pokemonTeam2 == "Pinsir"){
      team2.Pokemon("Pinsir", "Bug", 40,20,150,5);
    }
    else if(pokemonTeam2 == "Togepi"){
      team2.Pokemon("Togepi", "Fairy", 40,20,150,5);
    }
    else{
      System.out.println("");
    }
  System.out.println("");
  System.out.println(team1.getName() + " [" + team1.getType() + "] " + "Verses " + team2.getName() + " [" + team2.getType() + "] ");
  System.out.println("LETS THE GAMES BEGIN!!! ");
  System.out.println("");
  int numberTurns = 0;
  pokemonteam1Health += 150;
  pokemonteam2Health += 150;
// while loop to determine which pokemon won
  while(pokemonteam1Health >= 0 && pokemonteam2Health >= 0){
    if(pokemonteam2Health >= 0 && pokemonteam1Health >= 0){
      numberTurns += 1;
      System.out.println("TURN: " + numberTurns);
      System.out.println("PLAYER ONE PICK ONE OF THE OPTIONS");
      System.out.println("1.Attack Opponent");
      System.out.println("2.Heal Your Pokemon");
      int Choice1 = askUser.nextInt();
      System.out.println("PLAYER TWO PICK ONE OF THE OPTIONS ");
      System.out.println("1.Attack");
      System.out.println("2.Heal Current Pokemon");
// user inputs the move they want
      int Choice2 = askUser.nextInt();
// if, else if and else statements to run the moves the user picks
      if(Choice1 == 1){
        int calculateAttackDamage = (team1.getAttack() - team2.getShield());
        if(calculateAttackDamage > 0){
          pokemonteam2Health -= calculateAttackDamage;
          System.out.println("");
          System.out.println("Opponent Pokemon has Sustained Damage!");
        }
        else{
          System.out.println("Invalid Input");
        }
      }
      else if (Choice1 == 2) {
        int healthHeal1 = (team1.getHeal());
        if (pokemonteam1Health <= 150){
          pokemonteam1Health += healthHeal1;
        }
        else{
          System.out.println("Invalid Input");
        }
      }
      else{
        System.out.println("Something went wrong");
      }
      if(Choice2 == 1){
        int calculateAttackDamage1 = (team2.getAttack() - team1.getShield());
        if(calculateAttackDamage1 > 0){
          pokemonteam1Health -= calculateAttackDamage1;
        }
        else{
          System.out.println("Invalid Input");
        }
      }
      else if (Choice2 == 2){
        int healthHeal2 = (team2.getHeal());
        if(pokemonteam2Health <= 150){
          pokemonteam2Health += healthHeal2;
        }
        else{
          System.out.println("Invalid Input");
        }
      }
      else{
        System.out.println("Something went Wrong");
      }
  // move optins
      System.out.println("1.Attack");
      System.out.println("2.Heal Current Pokemon");
  System.out.println("");
  System.out.println(team1.getName() + " " + "["+team1.getType()+ "]" +pokemonteam1Health + "/" + team1.gettotalHealth() + " Health" );
  System.out.println(team2.getName() + " " + "["+team2.getType()+ "]" +pokemonteam2Health + "/" + team2.gettotalHealth() + " Health" );
// test who won
    if(pokemonteam1Health <= 0 && pokemonteam2Health <= 0){
      pokemonteam1Health = 0;
      pokemonteam2Health = 0;
      System.out.println("TIE BREAKER");
      break;
    }
    else if(pokemonteam1Health <= 0 && pokemonteam2Health > 0){
      pokemonteam1Health = 0;
      System.out.println("Team 2 Won");
      break;
    }
    else if(pokemonteam2Health <= 0 && pokemonteam2Health > 0){
      pokemonteam2Health = 0;
      System.out.print("Team 1 Won");
      break;
    }
    else if(pokemonteam2Health > pokemonteam1Health){
      System.out.println("Team 2 Won");
    }
    else if(pokemonteam1Health > pokemonteam2Health){
      System.out.println("Team 1 Won");
    }
    else{
      System.out.println("");
    }
        }
      }
    }
// to string
    public String toString(){
      return name;
    }
  }
