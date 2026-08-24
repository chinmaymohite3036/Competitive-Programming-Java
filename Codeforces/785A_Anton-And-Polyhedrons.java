import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int totalFaces = 0;

        for (int i = 0; i < n; i++) {

            String shape = sc.next();

            switch (shape) {

                case "Tetrahedron":
                    totalFaces += 4;
                    break;

                case "Cube":
                    totalFaces += 6;
                    break;

                case "Octahedron":
                    totalFaces += 8;
                    break;

                case "Dodecahedron":
                    totalFaces += 12;
                    break;

                case "Icosahedron":
                    totalFaces += 20;
                    break;
            }
        }

        System.out.println(totalFaces);

        sc.close();
    }
}