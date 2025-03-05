public class App {
    public static void main(String[] args) throws Exception {

        printEmployy(new Manager());
        printEmployy(new Salesman());
    }

    public static void printEmployy(Employee employee) {

        if (employee instanceof Manager manager) {

            employee.setNama("Jones");
            manager.setLogin("1234");
            manager.setPassword("1234");

            System.out.println(employee.getNama());

            System.out.println(manager.getLogin());
            System.out.println(manager.getPassword());
        }
    }
}
