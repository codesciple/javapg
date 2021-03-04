class Mayan extends Language{

    //constructor
     Mayan(String languageName, int speakers){
   
       super(languageName, speakers, "Central America", "verb-object-subject");
       
     }
   
   @Override
   public void getInfo(){
   
       System.out.println(this.name + " is spoken by "+ this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
   
       System.out.println("The language follows the word order: " + this.wordOrder);
   }
   
   }