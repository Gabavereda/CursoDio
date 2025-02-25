import java.util.Scanner;

public class App {
    private final static Scanner entrda = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        int opt = -1;
        GeoForm geoForm = null;
        while (true) {
            System.out.println(" escolha");
            System.out.println("1 quadrado");
            System.out.println("2 retangulo");
            System.out.println("3 circulo");
            System.out.println("4 out");
            opt = entrda.nextInt();

            if (opt == 1) {
                geoForm = createSquare();
            } else if (opt == 2) {
                geoForm = createRectangle();
            } else if (opt == 3) {
                geoForm = createCircle();
            } else if (opt == 4) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida, tente novamente.");
                continue;
            }
            System.out.println(geoForm.getArea());

        }
    }

    private static GeoForm createSquare() {
        System.out.println("lados do quadrado ");
        double side = entrda.nextDouble();

        return new Square(side);
    }

    private static GeoForm createRectangle() {
        System.out.println("base ");
        double base = entrda.nextDouble();
        System.out.println("altura ");
        double altura = entrda.nextDouble();

        return new Rectangle(altura, base);
    }

    private static GeoForm createCircle() {
        System.out.println("raio ");
        double radius = entrda.nextDouble();

        return new Square(radius);
    }

    // List<User> users = List.of(new User("Maria", 32));

    // printStringValue(Record::toString, users);

    // // // lambda
    // // users.forEach(user -> System.out.println(user));
    // }

    // private static void printStringValue(Function<User, String> callback,
    // List<User> users) {

    // users.forEach(u -> System.out.println(callback.apply(u)));
    // }

}
