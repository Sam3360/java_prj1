import java.util.Scanner; 

public class Passkey { 
    public static void main() { 
        Scanner scanner = new Scanner(System.in);
        
        String key = "0602";
        boolean access = false;
        
        
        while (!access) { 
            System.out.println("Enter your passkey: ");
            String input = scanner.nextLine();
            if (input.equals(key)) { 
                System.out.println("Access Granted!");
                access = true;
                break;
            } else {
                System.out.println("Wrong key! Try again.");
            }
        }
        if(access == true){
            System.out.println("Welcome Back!");
            System.out.println("HOW MANY I HELP YOU?");
            int ch = scanner.nextInt();
            switch(ch){
                case 1:
                    System.out.print("Good Weather Today!");
                    break;
                case 2:
                    System.out.print("Beautiful Day Isn't It?");
                    break;
                default:
                    System.out.print("Have A Good Day Ahead");
                    break;
            }
        }
    }
}