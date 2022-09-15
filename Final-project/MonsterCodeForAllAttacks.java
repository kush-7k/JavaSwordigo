public class MonsterCodeForAllAttacks {
    //THIS CLASS IS THE BRAIN OF THE MONSTER ATTACKS EVERYTHING OF MONSTER IS BEING HANDLED FROM HERE
    public int fighterHitPoints;//VARIABLE FOR HITPOINTS OF FIGHTER
    //PARAMETERISED CONSTRUCTOR
    public MonsterCodeForAllAttacks(int health){
        fighterHitPoints=health;
    }
    //VOID METHOD
    public void revive(int health){
        fighterHitPoints=100;
    }
    //SETTER FOR ATTACK1
    public void setThornAttack(int attackUsedByMonster){
        fighterHitPoints-=10;
        System.out.println("Monster used the attack number :"+attackUsedByMonster);
        System.out.println("Thorn attack in progress.");
    }
    //GETTER FOR ATTACK1
    public int getThornAttack(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK2
    public void setSlamAttack(int attackUsedByMonster){
        fighterHitPoints-=10;
        System.out.println("Monster used the attack number :"+attackUsedByMonster);
        System.out.println("Slam attack in progress.");
    }
    //GETTER FOR ATTACK2
    public int getSlamAttack(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK3
    public void setDangerousPunch(int attackUsedByMonster){
        fighterHitPoints-=15;
        System.out.println("Monster used the attack number :"+attackUsedByMonster);
        System.out.println("Dangerous Punch in progress.");
    }
    //GETTER FOR ATTACK3
    public int getDangerousPunch(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK4
    public void setKnifeRain(int attackUsedByMonster){
        fighterHitPoints-=20;
        System.out.println("Monster used the attack number :"+attackUsedByMonster);
        System.out.println("Knife Rain in progress.");
    }
    //GETTER FOR ATTACK4
    public int getKnifeRain(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK5
    public void setSkAttack(int attackUsedByMonster){
        fighterHitPoints-=5;
        System.out.println("Monster used the attack number :"+attackUsedByMonster);
        System.out.println("SK attack in progress.");
    }
    //GETTER FOR ATTACK5
    public int getSkAttack(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK6
    public void setFireStorm(int attackUsedByMonster){
        fighterHitPoints-=25;
        System.out.println("Monster used the special attack :"+attackUsedByMonster);
        System.out.println("Special attack Fire storm in progress");
    }
    //GETTER FOR ATTACK6
    public int getFireStorm(){
        return fighterHitPoints;
    }
     //SETTER FOR ATTACK7
    public void setTornadoAttack(int attackUsedByMonster){
        fighterHitPoints-=30;
        System.out.println("Monster used the special attack :"+attackUsedByMonster);
        System.out.println("Special attack Tornado in progress");
    }
    //GETTER FOR ATTACK7
    public int getTornadoAttack(){
        return fighterHitPoints;
    }
    public void healingPotionUsed(){
       fighterHitPoints=100;
    }
}
