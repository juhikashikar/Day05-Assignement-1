public class Vowel {
}
    public static void main(String[]args){

     System.out.println("Given a String");
     scanner sc(new) scanner (system.in);
     string str=sc.nextline();
      Char []chars=str.to CharArrays();

      int count = 0;
      for  (char c:chars) {

          switch(c){
              case 'a':
              case 'e':
              case 'i':
              case 'o':
              case 'u':
                  count++;
                  break;
          }
      }
              System.out.println(Number of vowel in a string="+count);
        }