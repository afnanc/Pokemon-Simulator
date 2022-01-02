//Pokemon Class
public class Pokemon{

    // Attributes within the pokemon class
      private String name;
      private String type;
      private int shield;
      private int heal;
      private int totalHealth;
      private int attack;
    
    // Contructor for the pokemon class containing the Attributes
      public void Pokemon(String nm, String tp, int atk, int hl, int th, int shld){
        this.name = nm;
        this.shield = shld;
        this.heal = hl;
        this.type = tp;
        this.attack = atk;
        this.totalHealth = th;
      }
    // get name of pokemon
      public String getName(){
        return this.name;
      }
    // get attack/damage
      public int getAttack(){
        return this.attack;
      }
    // get type of pokemon
      public String getType(){
        return this.type;
      }
    // total health of the pokemon
      public int gettotalHealth(){
        return this.totalHealth;
      }
    // used for one of the moves to heal current pokemon
      public int getHeal(){
        return this.heal;
      }
    // shield of the pokemon
      public int getShield(){
        return this.shield;
      }
    // to string
      public String toString(){
        return name + type + "";
      }
    
    
    }