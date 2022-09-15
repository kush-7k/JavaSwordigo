public class FighterCodeForAllAttacksAndDefense {
    //THIS CLASS IS THE BRAIN OF THE MONSTER ATTACKS EVERYTHING OF FIGHTER IS BEING HANDLED FROM HERE
    private String nameOfFighter="FIGHTER";//DEFAULT NAME SET
    private int monsterHitpoints=100;//HITPOINTS OF MONSTER VARIABLE
    public FighterCodeForAllAttacksAndDefense(String nameSetByUser){
        //PARAMETERISED CONSTRUCTOR FOR NAME SET
        nameOfFighter=nameSetByUser;
        System.out.println("The name has been successfully changed to :"+nameOfFighter);
    }
    //DEFAULT CONSTRUCTOR AND COMSTRUCTOR OVERLOADING IS DONE

    public FighterCodeForAllAttacksAndDefense(){
    //THIS IS DEFAULT CONSTRUCTOR
    }

    //REVIVE METHOD TO MAKE HITPOINTS 100
    public void revive(int health){
        monsterHitpoints=health;
    }

    //PRINTING MESSAGE OF WELCOME
    public void printMsg(){
        System.out.println("Welcome!!");
    }

    //SETTER FOR ATTACK-1
    public void setPunchAttack(int attackUsedByUser){
        System.out.println("You used the attack number :"+attackUsedByUser);
        System.out.println("Punch attack in Progress");
        monsterHitpoints-=5;
    }
    //GETTER FOR ATTACK-1
    public int getPunchAttack(){
        return monsterHitpoints;
    }

    //SETTER FOR ATTACK-2
    public void setArrowAttack(int attackUsedByUser){
        System.out.println("You used the attack number :"+attackUsedByUser);
        System.out.println("Arrow attack in Progress");
        monsterHitpoints-=10;
    }
    //GETTER FOR ATTACK-2
    public int getArrowAttack(){
        return monsterHitpoints;
    }

    //SETTER FOR ATTACK-3
    public void setKichAttack(int attackUsedByUser){
        System.out.println("You used the attack number :"+attackUsedByUser);
        System.out.println("Kick attack in Progress");
        monsterHitpoints-=10;
    }
    //GETTER FOR ATTACK-3
    public int getKickAttack(){
        return monsterHitpoints;
    } 

    //SETTER FOR ATTACK-4
    public void setSphereSlamAttack(int attackUsedByUser){
        System.out.println("You used the attack number :"+attackUsedByUser);
        System.out.println("SphereSlam attack in Progress");
        monsterHitpoints-=15;
    }
    //GETTER FOR ATTACK-4
    public int getSphereSlamAttack(){
        return monsterHitpoints;
    }
    
        //SETTER FOR ATTACK-5
    public void setCaptianLevi(int attackUsedByUser){
        System.out.println("You used the special attack number :"+attackUsedByUser);
        System.out.println("CaptianLevi's Sword attack in Progress");
        monsterHitpoints-=30;
    }
    //GETTER FOR ATTACK-5
    public int getCaptianLevi(){
        return monsterHitpoints;
    }

        //SETTER FOR ATTACK-6
    public void setIronSword(int attackUsedByUser){
        System.out.println("You used the special attack number :"+attackUsedByUser);
        System.out.println("CaptianLevi's Sword attack in Progress");
        monsterHitpoints-=20;
    }
    //GETTER FOR ATTACK-6
    public int getIronSword(){
        return monsterHitpoints;
    }

        //SETTER FOR ATTACK-7
    public void setThunderBolt(int attackUsedByUser){
        System.out.println("You used the special attack number :"+attackUsedByUser);
        System.out.println("ThunderBolt attack in Progress");
        monsterHitpoints-=20;
    }
    //GETTER FOR ATTACK-7
    public int getThunderBolt(){
        return monsterHitpoints;
    }

        //SETTER FOR ATTACK-8
    public void setWaterSplash(int attackUsedByUser){
        System.out.println("You used the special attack number :"+attackUsedByUser);
        System.out.println("WaterSplash attack in Progress");
        monsterHitpoints-=25;
    }
    //GETTER FOR ATTACK-8
    public int getWaterSplash(){
        return monsterHitpoints;
    }
}
