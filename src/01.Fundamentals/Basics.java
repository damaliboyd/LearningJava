public class Basics {
  // Comments are like JS
  /* 
    Multiline comments 
  */
  public static void main(String[] args) {
    String str = "Hello World";
    int num = 626;
    float dec = .5f;
    char letter = 'F';
    final char constLetter = 'W';
    boolean truth = true;

    System.out.println(str);
    System.out.println(num);
    System.out.println(dec);
    System.out.println(letter);
    System.out.println(constLetter);
    System.out.println(truth);

    // Strings
    str = "I am testing out java's string things";

        System.out.println("str");
        System.out.println("Length of the string is: " + str.length());
        System.out.println(str.indexOf("string"));
        System.out.println(str.charAt(24));
    
    // Conditionals
    int i = 0;

    if(i > 0){
      System.out.println("Number is greater then zero.");
    }
    else if(i < 0){
      System.out.println("Number is less then zero.");
    }
    else{
      {
        System.out.println("Number is zero.");
      }
    }
    boolean anotherBool = false;
    String isFalse = (anotherBool) ? "Is true" : "Is false";
    System.out.println(isFalse);

    // Loops
    for(int j = 0; j < 5; j++){
      System.out.println(j);
    }

    String[] names = {"Jane", "Joe", "Jake", "Jacob"};

    for(String name : names){
      System.out.println(name);
    }
    System.out.println("Array length is " + names.length);

    for(int j = 0; j < 5; j++){
      if(j == 3){continue;}
      System.out.println(j);
    }

  }
}
  