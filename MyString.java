public class MyString implements CharSequence{ //,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){   
    data = new char[s.length()];      //data is as long as the sequence
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);              //gets chars and puts it in data
    }
  }
  public String toString(){ 

    /*if (data.length == 0) {
      throw new NullPointerException();
    } */  

    String myStringString = "";
    for (int i = 0; i < data.length; i++){
      myStringString += "" + data[i];       //adds thing in data
    }
    return myStringString;
  }
  public int length(){
    int size = 0;           
    for (int i = 0; i < data.length; i ++){ //makes int size and adds one everytime it goes through a character
      size++;                               
    }
    return size;
  }
  public CharSequence subSequence (int start, int end){
    String a = "";                    //makes a new charsqeuence?
    for (int i = start; i < end; i ++){     //adds what is in data to the new sequence
      a = a + data[i];                       
    }
    return a;                               //returns new sequence
  }
  public char charAt (int index){
    return data[index];
  }
  
      
}
