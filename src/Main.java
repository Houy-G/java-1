import java.util.Arrays;

public class Main {
    
    public static void wordCount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence or multiple words:");
        String input = scanner.nextLine();
        if (input.trim().isEmpty()) {
            System.out.println("You entered no words.");
        } else {
            String[] words = input.trim().split("\\s+");
            System.out.println("Word count: " + words.length);
        }}
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
        int count =  wordCount();
        System.out.println("word have : "+count);
        int[] user = {1,2,3,4,6};
        int[] sort = sort(user);
        System.out.println(Arrays.toString(sort));
    }
}
