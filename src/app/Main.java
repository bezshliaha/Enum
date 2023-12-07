package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the traffic light color (RED, YELLOW, or GREEN): ");

        String inputColor = scanner.nextLine().toUpperCase();

        try {
            TrafficLightColor selectedColor = TrafficLightColor.valueOf(inputColor);

            switch (selectedColor) {
                case RED:
                    System.out.println("Stop!");
                    break;
                case YELLOW:
                    System.out.println("Prepare!");
                    break;
                case GREEN:
                    System.out.println("Go!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid traffic light color. Use RED, YELLOW, or GREEN.");
        }

        scanner.close();

    }
}