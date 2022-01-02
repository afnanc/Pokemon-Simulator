// imports
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
// main class
class Main{
  public static void main(String[] args){
// introduction to game    
    System.out.println("");
    System.out.println("-------------------------------------------------------------");;
    System.out.println("                          POKEMON BATTLE");
    System.out.println("-------------------------------------------------------------");
// scanner for name   
    Scanner nameUser = new Scanner(System.in);
    System.out.println("HELLO PLAYER WHAT IS YOUR NAME?");
    String name = nameUser.nextLine();
    System.out.println("HELLO " + name);
    System.out.println("");
    System.out.println("HERE ARE SOME HELPFUL TIPS AND INFROMATION.");
    System.out.println("");
    System.out.println("1. ALL POKEMONS HAVE THE SAME HEALING VALUE. SO MAKE SURE TO HEAL WHEN NEEDED SO YOU CAN HAVE THE UPPER HAND");
    System.out.println("2. THIS GAME IS MEANT FOR TWO PEOPLE BUT CAN BE PLAYED BY ONE PLAYER, BUT IT WILL NOT BE AS ENJOYABLE");
    System.out.println("GOODLUCK :) ");
// ArrayList and arrays to hold pokemons,health,moves and names
    Scanner userAsk = new Scanner(System.in);
    ArrayList<String> pokemonTeam1 = new ArrayList<String>();
    ArrayList<String> pokemonTeam2 = new ArrayList<String>();
    ArrayList<String> pokemonUserInput1 = new ArrayList<String>();
    ArrayList<String> pokemonUserInput2 = new ArrayList<String>();
    String[] team1Array = {"Bulbasaur", "MewTwo", "Electabuzz"};
    String[] team2Array = {"Charmander", "Pinsir", "Togepi"};
// adds each pokemon arrays into the arraylist
    for(String addPokemons : team1Array){
      pokemonTeam1.add(addPokemons);
    }
    for(String addPokemons : team2Array){
      pokemonTeam2.add(addPokemons);
    }
// for loop for picking pokemon
    for (int i=0; i<3; i++){
      System.out.println("\nPLAYER ONE CHOOSE ONE OF THE FOLLOWING POKEMON TO USE FOR FIGHTING YOUR OPPONENT");
      System.out.println("");
      System.out.println("Pokemon Number One " + "Press 0." + pokemonTeam1.get(0));
      System.out.println("Pokemon Number Two " + "Press 1." + pokemonTeam1.get(1));
      System.out.println("Pokemon Number Three " + "Press 2." + pokemonTeam1.get(2));
      for(int askuserAgain= 0; askuserAgain < 1; askuserAgain++){
        int user = userAsk.nextInt();
        if(user < 3){
          System.out.println("player 1: "+ pokemonTeam1.get(user));
          pokemonUserInput1.add(pokemonTeam1.get(user));
        }
        else{
          askuserAgain--;
          System.out.println("Incorrect Input Please Try Again");
        }
        System.out.println("");
        System.out.println("PLAYER TWO CHOOSE ONE OF THE FOLLOWING POKEMON TO USE FOR FIGHTING YOUR OPPONENT");
        System.out.println("Pokemon Number One " + "Press 0." + pokemonTeam2.get(0));
        System.out.println("Pokemon Number Two " + "Press 1. " + pokemonTeam2.get(1));
        System.out.println("Pokemon Number Three " + "Press 2." + pokemonTeam2.get(2));
        int askUser2 = userAsk.nextInt();
        if(askUser2 < 3){
          System.out.println("player 2: " + pokemonTeam2.get(askUser2));
          pokemonUserInput2.add(pokemonTeam2.get(askUser2));
        }
        else{
          askuserAgain--;
          System.out.println("Incorrect Input Please Try Again");
        }
      }
// uses code above and runs it
      Player Battle = new Player();
      System.out.println("LET THE GAMES BEGIN!");
      Battle.Player(pokemonUserInput1.get(i),pokemonUserInput2.get(i));
    }
  }
}


