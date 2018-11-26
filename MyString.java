public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){       
    char[] data = new char[s.length]      //data is as long as the sequence
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);              //gets chars and puts it in data
    }
  }
  public String toString{ 
    String myStringString
    for (int i = 0; i < data.length; i++){
      myStringString += "" + data[i];       //adds thing in data
      if (i + 1 < data.length){
        myStringString += ", ";             //adds a comma as long as it's not the last character
      }
    }
  }
  public int length(){
    int size;           
    for (int i = 0; i < data.length; i ++){ //makes int size and adds one everytime it goes through a character
      size++;                               
    }
    return size;
  }
  public CharSequence
}
