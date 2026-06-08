package Assigment.Third_5_JUNE_to_9_JUNE;

public class String17_Replace_Space_With_Specific_Character {
    public static void main(String[] args) {
        String st="Write a program to replace all   spaces in a string with a specific character such as";
       String s[]=st.split(" ");

        //using In Build Functions
        System.out.println(st.replace(" ", "-"));

        //normal method
      for (int i=0; i<s.length; i++){
          System.out.print(s[i]);
          if (i!=s.length-1){
              System.out.print("_");
          }
      }
    }
}
