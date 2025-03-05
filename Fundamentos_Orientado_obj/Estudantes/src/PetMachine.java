public class PetMachine {

    private boolean clean = true;

    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void banhopet() {
        if (this.pet == null) {

            System.out.println("coloque");

            return;

        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("o pet" + pet.getName() + "limpo");

    }

    public void addWater() {
        if (water == 30) {
            System.out.println("maximo de agua");
            return;
        }
        water += 2;
    }

    public void addShampoo() {
        if (shampoo == 30) {
            System.out.println("maximo de shampoo");
            return;
        }
        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("a maquina suja");
            return;
        }
        if (hasPet()) {
            System.out.println("pet na maquina");
            return;

        }
        this.pet = pet;
        System.out.println("pet" + pet.getName() + "esta na maquina");
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("o pet " + pet.getName() + "foir tirado da maquina");
        this.pet = null;
    }

    public void wash() {
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("maquiona foi limpa");
    }
}
