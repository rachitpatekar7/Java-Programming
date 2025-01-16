import java.util.Random;

public class DrippingText {
    
    public static void main(String[] args) {
        String text = "WRHGAWLJKFHELKQWHGWE HGKHDSLF;KHSDK GLHEWULI FSDGHFSDHF,HSDF SDF KHADAWKWASK HAWK HAWK HAWK";
        Random rand = new Random();
        
        while (true) {
            clearConsole();
            
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                
                if (rand.nextInt(5) == 0) {
                    System.out.print(currentChar + "  ");
                } else {
                    System.out.print(currentChar);
                }
            }
            
            try {
                Thread.sleep(rand.nextInt(100) + 50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
