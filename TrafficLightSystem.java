import java.util.Scanner;

public class TrafficLightSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter traffic light color (Red, Yellow, Green): ");
        String color = scanner.next().toLowerCase();
        String action;
        switch (color) {
            case "red":
                action = "Stop";
                break;
            case "yellow":
                action = "Get Ready";
                break;
            case "green":
                action = "Go";
                break;
            default:
                action = "Invalid color";
                break;
        }

        System.out.println("Action: " + action);
    }
}
