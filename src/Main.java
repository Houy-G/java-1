import java.util.Arrays;

public class Main {
    public static int  wordCount(String text){
        int count = 0;
        for (int i = 0 ; i < text.length(); i++){

        }
        count +=1;
        return count;
    }
    public static int[] sort(int[] user ){
        int[] sort = new  int[user.length];
        for (int i = 0 ; i < user.length; i++){
            int a = user[(user.length - 1)- i];
            sort[i]= a;
        }
        return sort;
    }
    public static void main(String[] args) {
        System.out.println();
        int count =  wordCount("Houyin ji ko ");
        System.out.println("word have : "+count);
        int[] user = {1,2,3,4,6};
        int[] sort = sort(user);
        System.out.println(Arrays.toString(sort));
    }
}