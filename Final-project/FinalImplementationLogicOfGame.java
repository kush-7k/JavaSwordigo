import java.util.*;//UTIL LIBRARY HAS BEEN IMPORTED
import java.lang.Math;//MATH LIBRARY FROM LANG LIBRARY IS BEEN IMPORTED

//THE FINAL CLASS FROM WHERE PROGRAM EXECUTES
public class FinalImplementationLogicOfGame{

    //MAIN METHOD
    public static void main(String args[]){
        //2 ARRAYS HAS BEEN CREATED TO STORE THE ATTACKS USED BY MONSTER AND FIGHTER IN EACH FIGHT
        double monsterSelected[]=new double[7];
        int monsterSelectedAttack[]=new int[7];

        for(int i=0;i<7;i++){
            //LOOP TO DETERMINE THE ATTACK NUMBERS FROM MONSTER'S SIDE
            monsterSelected[i]=Math.random();
            if(monsterSelected[i]<=0.13){
                monsterSelectedAttack[i]=1;
            }
            //USING THE RANDOM FUNCTION TO DETERMINE THE NUMBERS
            else if(monsterSelected[i]>0.13 && monsterSelected[i]<=0.26){
                monsterSelectedAttack[i]=2;
            }
            else if(monsterSelected[i]>0.26 && monsterSelected[i]<=0.39){
                monsterSelectedAttack[i]=3;
            }
            else if(monsterSelected[i]>0.39 && monsterSelected[i]<=0.52){
                monsterSelectedAttack[i]=4;
            }
            else if(monsterSelected[i]>0.52 && monsterSelected[i]<=0.65){
                monsterSelectedAttack[i]=5;
            }
            else if(monsterSelected[i]>0.65 && monsterSelected[i]<=0.85){
                monsterSelectedAttack[i]=6;
            }
            else {
                monsterSelectedAttack[i]=7;
            }
        }

        //VARIABLES DECLARATION
        int numberSelected;//ATTACK NUMBER SELECTED BY MONSTER
        int indexOfNumberSelcted=0;//A VARIABLE TO ROTATE THE INDEX OF FIGHTER SELECTED NUMBER ARRAY
        int specialAttacksUsed=0;//COUNTS HOW MNY TIMES SPECIAL ATTACKS WERE USED
        int whoseTurn=1;//DETERMINE WHOSE TURN IT IS
        int fighterHitPoints=100;//INITIAL HITPOINTS OF FIGHTER
        int monsterHitpoints=100;//INITIAL HITPOINTS OF MONSTER
         int numberOfAttempts=7;//7 ATTEMPTS TO WIN EACH STAGE
        int countLivesOfFighter=5;//5 TIMES REVIVE POSSIBLE 
        int countMonstersdead=0;//COUNTS HOW MANY MONSTERS ARE DEAD
        String confirmationFromUser="";
 
        //SCANNER CLASS
        Scanner sc=new Scanner(System.in);
        System.out.println("Do you want to change your name? Type yes or no");
        String replyFromUser=sc.nextLine();
        String nameChange="";//CHANGE NAME STORED HERE

        if(replyFromUser.equalsIgnoreCase("YES")){
            //IF ANSWER IS YES THEN PARAMETERISED CONSTRUCTOR IS CALLED TO CHANGE NAME
            System.out.println("Enter the name:");
            nameChange=sc.nextLine();

            FighterCodeForAllAttacksAndDefense object1=new FighterCodeForAllAttacksAndDefense(nameChange);
            object1.printMsg();
            System.out.println("PRESS OK to continue");
            confirmationFromUser=sc.nextLine();        
        }

        //IF USER DON'T WANT TO CHANGE NAME
        else{
            FighterCodeForAllAttacksAndDefense object1=new FighterCodeForAllAttacksAndDefense("FIGHTER");
            object1.printMsg();
            System.out.println("PRESS OK to continue");
            confirmationFromUser=sc.nextLine();       
        }

        //CREATING ALL THE OBJECTS OF CLASSES CREATED TILL NOW
        FighterCodeForAllAttacksAndDefense object1=new FighterCodeForAllAttacksAndDefense();
        MonsterCodeForAllAttacks object2=new MonsterCodeForAllAttacks(100);
        TrainingOfFighter object3=new TrainingOfFighter();
        IntroductionToFighterArena object4=new IntroductionToFighterArena();
        
        //GAME INITIALISED FROM HERE
        System.out.println("+++++++++++++++++++THE-GAME-BEGINS++++++++++++++++++++");
        //WELCOME MESSAGE AND SCENERIO EXPLAIN AND RULES DISPLAYED
        IntroductionToFighterArena.welcomeMessage();
        object4.scenerioExplain();
        object4.rulesOfFighterArena();
        System.out.println("Press OK to continue and pursue Training");
        confirmationFromUser=sc.nextLine();

        object3.trainingInitial("Welcome");
        object3.trainingInitial();
        System.out.println("Press "+ confirmationFromUser+" to continue");
        object3.monsterAttacksList();
        System.out.println("Your training has been successfully accomplioshed so press OK to begin the fight with the Monster");
        confirmationFromUser=sc.nextLine();

        //FIGHTING WITH MONSTER STARTS FROM HERE
        System.out.println("+++++++++++++FIGHTING-STARTS++++++++++++");


          try{
            //try block has been introduced to make sure of exception handling

            
            while(numberOfAttempts>=0){
                //WHILE LOOP TO CONTINUE FIGHT FOR MORE STAGES
                //WHOSE TURN VARIABLE WILL DECIS=DE WHO WILL TAKE TURN

          if(whoseTurn%2==1){

            //FIGHTER'S TURN
            System.out.println("You have "+numberOfAttempts+" attempts left to kill a Monster");
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            object3.trainingInitial();
            System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
            System.out.println("Press a number written to a attack to use it");
            numberSelected=sc.nextInt();
            //DISPLAYS THE ATTACK LIST AND GIVES THE CHOICE TO SELECT ANY ONE OF THOSE
            whoseTurn++;//INCREMENTATIOM
            /*ACCORDING TO NUMBER SELECTED, THE PROGRAM WILL IMPLEMENT THE PARTICULAR ATTACK WITH THE HELP OF IF-ELSE LADDER
             *SO THIS IS HOW IT WORKS IS DESCRIBED IN BELOW CODE
             */
         if(numberSelected==1){
            object1.setPunchAttack(1);
           monsterHitpoints =object1.getPunchAttack();
         }
         else if(numberSelected==2){
            object1.setArrowAttack(2);
            monsterHitpoints =object1.getArrowAttack();
         }
         else if(numberSelected==3){
            object1.setKichAttack(3);
            monsterHitpoints =object1.getKickAttack();
         }
         else if(numberSelected==4){
            object1.setSphereSlamAttack(4);;
            monsterHitpoints =object1.getSphereSlamAttack();
         }
         else if(numberSelected==5  && specialAttacksUsed <3){
            object1.setIronSword(5);
            monsterHitpoints =object1.getIronSword();
            specialAttacksUsed++;
         }
         else if(numberSelected==6  && specialAttacksUsed <3){
            object1.setThunderBolt(6);
            monsterHitpoints =object1.getThunderBolt();
            specialAttacksUsed++;
         }
         else if(numberSelected==7 && specialAttacksUsed <3){
            object1.setWaterSplash(7);
            monsterHitpoints =object1.getWaterSplash();
            specialAttacksUsed++;
         }
         else if(numberSelected==8  && specialAttacksUsed <3){
            object1.setCaptianLevi(8);
            monsterHitpoints =object1.getCaptianLevi();
            specialAttacksUsed++;
         }
         else{
            System.out.println("Wrong input");
         }
         //USER CAN'T USE MORE THAN 3 SPECIAL ATTACK DUEING EACH FIGHT
        if(specialAttacksUsed>=3)
        System.out.println("Your Special attacks are completed");
        numberOfAttempts--;
       }//END OF USER'S TURN

       else{
        //MONSTER'S TURN
        indexOfNumberSelcted++;
        //HOW MONSTER WILL REACT TO FIGHTER IS DESCRIBED HERE IN THIS BELOW CODE
        if(indexOfNumberSelcted>=7)
        indexOfNumberSelcted=0;
        whoseTurn++;//INCREMENTAION
        if(monsterSelectedAttack[indexOfNumberSelcted]==1){
            object2.setThornAttack(1);
            fighterHitPoints= object2.getThornAttack();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==2){
            object2.setSlamAttack(2);
            fighterHitPoints=object2.getSlamAttack();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==3){
            object2.setDangerousPunch(3);
            fighterHitPoints=object2.getDangerousPunch();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==4){
            object2.setKnifeRain(4);
            fighterHitPoints=object2.getKnifeRain();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==5){
            object2.setSkAttack(5);
            fighterHitPoints= object2.getSkAttack();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==6){
            object2.setFireStorm(6);
            fighterHitPoints=object2.getFireStorm();
         }
         else if(monsterSelectedAttack[indexOfNumberSelcted]==7){
            object2.setTornadoAttack(7);
            fighterHitPoints=object2.getTornadoAttack();
         }

        
           //DISPLAYING THE HITPOINTS OF FIGHTER AND MONSTER AFTER EACH ATTACK USED
         if(monsterHitpoints>=0 && fighterHitPoints>=0){
            System.out.println("************************************************");
        System.out.println("Monster's HitPoints="+monsterHitpoints);
        System.out.println("Your HitPoints="+fighterHitPoints);
        System.out.println("************************************************");
         } 
         if(monsterHitpoints<=0 && fighterHitPoints>0)
         {
            System.out.println("************************************************");
        System.out.println("Monster's HitPoints=0");
        System.out.println("Your HitPoints="+fighterHitPoints);
        System.out.println("************************************************");
         } 
         if(fighterHitPoints<=0 && monsterHitpoints>0){
            System.out.println("************************************************");
        System.out.println("Monster's HitPoints="+monsterHitpoints);
        System.out.println("Your HitPoints=0");;
        System.out.println("************************************************");
        }
       }

       //USER IS DEFEATED IF HE HAS USED ALL REVIVE ATTEMPTS AND WAS NOT ABLE TO KILL MONSTER
       if(numberOfAttempts==0 && monsterHitpoints>0){
        System.out.println("YOU LOST THE STAGE and YOU ARE OUT OF GAME");
        break;
       }

        //IF MONSTER HAS KILLED , THEN ANOTHER MONSTER COMES AND COUNTMONSTERDEAD VARIABLE GETS INCREMENTED
           //IN ORDER TO REACH TO FINAL STAGE, A PLAYER NEEDS TO DEFEAT 3 MONSTER AND THE 4TH MONSER WILL BE FINAL MONSTRER
       if(monsterHitpoints<=0){
        specialAttacksUsed=0;
        countMonstersdead++;
        numberOfAttempts=7;
        object1.revive(100);
        if(countMonstersdead%2==0){
            //FINAL STAGE VICTORY MESSAGE
             if(countMonstersdead/2==4){
                System.out.println("YOU HAVE DEFEATED THE FINAL MONSTER AND YOU ARE THE SWORDIGO KING!! CONGRATULATIONS");
                    break;
             }
             //STAGE VICTORY MESSAGE DISPLAYED
            else if(countMonstersdead/2!=8)
        System.out.println("YOU WIN THE STAGE "+ countMonstersdead/2);
         
         }
        System.out.println("Press Ok to continue");
        replyFromUser=sc.nextLine();
        //SPECIAL CONDITIONS FOR FINAL STAGE DISPLAYED
        if(countMonstersdead >4){
            System.out.println("The Final Monster has hitpoints of 150 and you need to defeat it");
            System.out.println("You can use your special attacks for 4 times in final stage");
            object1.revive(150);
            specialAttacksUsed=-1;
        }
            
       }
       //CALCULATING FIGHTER HITPOINTS AND NUMBER OF ATTEMOTS LEFT TO BE REVUVED
       if(fighterHitPoints<=0 && countLivesOfFighter>=0){
        countLivesOfFighter--;
        object2.revive(100);
        System.out.println("YOU HAVE BEEN REVIVED");
       }
       //REVIVE ATTEMPS FINISHED MEANS DEFEAT
      else if(countLivesOfFighter==0){
        System.out.println("YOU LOST THE GAME: WHOLE HUMANITY IS WIPED OUT");
        break;
       }
      
    }//END OF WHILE LOOP
  }//END OF TRY BLOCK
    catch(Exception e){
        System.out.println("AN error has occured ");
    }//IF ANY EXCEPTION IS CAUSED, IT HAS BEEN HANDLED
    sc.close();
      }//END OF MAIN
    
}//END OF CLASS
