import java.util.Scanner;

public class RemoveTags {

    public static void main(String[] args) {
        boolean flag=true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string with tags:");
        String str = scanner.nextLine();
        System.out.println("The sentence without tags is: ");
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i)=='<'){
                flag=false;
            }else if (str.charAt(i)=='>'){
                flag=true;
                continue;
            }
            if(flag==true){
                System.out.print(str.charAt(i));
            }
        }
    }
}
