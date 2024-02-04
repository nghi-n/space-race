public class Collectable{
    //Creature Features
    boolean isCollected = false;
    //For text output 
    String name;
    //To identify exact collectable
    int ID = 0; 
    int planet = 0;
}

public collectable(int category, int planet){
    //Initialize Creatures with species type and planet (int codes)
        //Category 1 - animals
        //Category 2 - objects
    this.planet = planet;   

    switch(planet){

        //Walking
        case 1:
            //Animal
            if (category == 1){
                this.name = "creature1_P1";
                ID = 1;
            }
            //Object
            else{
                this.name = "creature2_P1";
                ID = 2;
            }
            break;

        //Yoga
        case 2:
            if (category == 1){
                this.name = "creature1_P2";
                ID = 3;
            }
            else{
                this.name = "creature2_P2";
                ID = 4;
            }
            break;

        //Gym
        case 3:
            if (category == 1){
                this.name = "creature1_P3";
                ID = 5;
            }
            else{
                this.name = "creature2_P3";
                ID = 6;
            }
            break;
        }  
    }