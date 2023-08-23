import java.util.Scanner;

public class cuboid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color: ");
        String color = sc.nextLine();
        
        Cuboid1 s;
        
        if (color.isEmpty()) {
            s = new Cuboid1();
        } else {
            s = new Cuboid1(color);
        }
        
        System.out.print("Enter length (or press Enter to use default value 30): ");
        int l = sc.hasNextInt() ? sc.nextInt() : 30;

        System.out.print("Enter width (or press Enter to use default value 30): ");
        int b = sc.hasNextInt() ? sc.nextInt() : 30;

        System.out.print("Enter height (or press Enter to use default value 10): ");
        int h = sc.hasNextInt() ? sc.nextInt() : 10;

        int area = s.getarea(l, b, h);
        System.out.println("Cuboid area: " + area);
        System.out.println("Color: " + s.getColor());
    }
}

class Cuboid1 {
    int length;
    int width;
    int height;
    String color;

    public Cuboid1() {
        color = "orange";
    }

    public Cuboid1(String c) {
        color = c;
    }

    public int getarea(int l, int b, int h) {
        return l * b * h;
    }

    public String getColor() {
        return color;
    }
}
