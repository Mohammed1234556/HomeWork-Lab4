import java.util.Scanner;
//person:- N and kskip:- K
public class josephus {
    static int jp(int person, int kskip){

        // Base condition.
        if(person==1){
            return 1;
        }
        else{
            return (jp(person-1,kskip)+kskip-1)%person+1;
        }
    }
    public  static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int person= sc.nextInt();
        int kskip=sc.nextInt();
        int answer=jp(person,kskip);
        System.out.println(answer);
    }
}
