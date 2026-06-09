package Assigment.Third_5_JUNE_to_9_JUNE.StringQuestion;

public class String20_Compare_two_strings_and_determine {

    public static String compareString(String s,String s2){
        int n=(s.length()<s2.length())?s.length():s2.length();
        for (int i=0; i<n; i++ ){
            if ((s.charAt(i)-'a')==(s2.charAt(i)-'a')){
                continue;
            }else if ((s.charAt(i)-'a')<(s2.charAt(i)-'a')) return s;
        }

        return  s2;
    }

    public static void main(String[] args) {
//        String st="coe";
//        String st2="coa";
        String st=" determine ";

        String st2=" strings";
        st=st.toLowerCase();
        st2=st2.toLowerCase();

        System.out.println("String comes first\n" +
                "alphabetically :\t"+compareString(st,st2));

    }
}
