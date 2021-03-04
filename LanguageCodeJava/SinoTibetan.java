class SinoTibetan extends Language{

    SinoTibetan(String languageName, int speakers){
    
      super(languageName, speakers, "Asia", "subject-object-verb");
    
    //checking if lang name is Chinese
      if(languageName.contains("Chinese")){
        this.wordOrder = "subject-verb-object";
      }
    
    
    }
    }