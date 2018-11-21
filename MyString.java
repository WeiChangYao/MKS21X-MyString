public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){ //gets chars and puts it in data
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }
  public String toString{ 
    String myStringString
    for (int i = 0; i < data.length; i++){
      myStringString += "" + data[i];
      if (i + 1 < data.length){
        myStringString += ", ";
      }
    }
  }
  public int length(){
    int size;
    for (int i = 0; i < data.length; i ++){ //counts number of stuff in data
      size++;
    }
    return size;
  }
  public CharSequence
}
