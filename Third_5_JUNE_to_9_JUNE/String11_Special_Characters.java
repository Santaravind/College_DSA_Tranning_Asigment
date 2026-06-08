package Assigment.Third_5_JUNE_to_9_JUNE;

public class String11_Special_Characters {
    public static void main(String[] args) {
        String st="This is cou$nt of spe#cial char@acter in string ";
       st=st.toLowerCase();
       int count=0;
       for (int i=0; i<st.length(); i++){
           if (st.charAt(i)>='a'&& st.charAt(i)<='z')continue;
           if (st.charAt(i)>='0'&&st.charAt(i)<='9') continue;
           if (st.charAt(i)==' ')continue;
           count++;
       }
        System.out.println("Number of special character :\t"+count);

    }
}
