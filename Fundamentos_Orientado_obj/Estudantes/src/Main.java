
import java.util.Scanner;

public class Main {

    private static Scanner entrada = new Scanner(System.in);

    private static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) {



        int option = -1;

        do {
            System.out.println("escolha  a opcao");
            System.out.println("1 - banho no pet ");
            System.out.println("2 - refill water ");
            System.out.println("3 - refill shampoo ");
            System.out.println("4 - check agua ");
            System.out.println("5 - check shampoo machine ");
            System.out.println("6 - check pet no banho ");
            System.out.println("7 - coloca pet ");
            System.out.println("8 - retira pet ");
            System.out.println("9 - limpa maqui ");
            System.out.println("0 - Sair ");
            option = entrada.nextInt();

            switch (option) {
                case 1:
                    petMachine.banhopet();
                    break;
                case 2:
                    setWater();

                    break;
                case 3:
                    setShampoo();

                    break;
                case 4:
                    verifyWater();

                    break;
                case 5:
                    verifyShampoo();

                    break;
                case 6:
                    checkIfHasPetInMachine();

                    break;
                case 7:
                    setPetInMachine();

                    break;
                case 8:
                    petMachine.removePet();

                    break;
                case 9:
                    petMachine.wash();

                    break;
                case 0:
                    System.exit(0);

                    break;

                default:
                    System.out.println("opcao invalida");
                    break;
            }
        } while (true);
    }

    private static void setShampoo() {
        System.out.println("tentando colocar shampoo na maruina");
        petMachine.addShampoo();
    }

    private static void setWater() {
        System.out.println("tentando colocar agua na maruina");
        petMachine.addWater();
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.println("a maquina tem " + amount + "agua");
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.println("a maquina tem " + amount + "litro shampoo");
    }

    private static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();

        System.out.println(hasPet ? "tem pet" : "nao tem pet");
    }

    public static void setPetInMachine() {

        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("nome do animal");
            name = entrada.nextLine();
        }

        var pet = new Pet(name);

        petMachine.setPet(pet);

    }

}
