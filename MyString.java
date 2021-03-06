public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){   
    data = new char[s.length()];      //data is as long as the sequence
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);              //gets chars and puts it in data
    }
  }
  public String toString(){ 
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
    if (start < 0 || end < 0 || end > data.length || start > end){ //throws new index out of bounds if start or end is negative, if end is greater than length and if start is greater than end
      throw new IndexOutOfBoundsException();                       
    }                                        
    String a = "";                    //makes a new charsqeuence?
    for (int i = start; i < end; i ++){     //adds what is in data to the new sequence
      a = a + data[i];                       
    }
    return a;                               //returns new sequence
  }
  public char charAt (int index){
    if (index < 0 || index >= data.length)   //throws exception if its negative or greater or equal to length
      throw new IndexOutOfBoundsException();
     
    return data[index];                     // returns what is in data in that index
  }
  public int compareTo(CharSequence o) {  
    if (o == null) {
      throw new NullPointerException();
    }   
    
    for (int i = 0; i < this.length() && i < o.length(); i ++) {
      if (data[i] - o.charAt(i) != 0){      //compares them by subtracting the sequence1's char to the sequence2's char
        return data[i] - o.charAt(i);       //if it's not 0, return the non 0 number
      }
    }
    if (this.length() > o.length()) {     //if everything so far is ==, check if one is longer 
      return 1;
    }
    if (this.length() < o.length()) {
      return -1;                              //testing codeanywhere.com
    }
    return 0;
  }
}
