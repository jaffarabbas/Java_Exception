/**
 * task
 */


class check{
         public void one(int age){
              if(age < 18){             
                  throw new ArithmeticException("hello");
              }
         else{
             System.out.println("no");
         }
           }
         void m(){
           one(15);
        }
}

public class task{
    public static void main(String[] args) {
        check obj = new check();
        obj.m();
    }
}