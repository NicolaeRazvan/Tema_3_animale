public class AppMain {

    public static void main(String[] args) {
    Animal c1 = new Animal();
    c1.name = "Rex";
    c1.age = 4;
    c1.healthStatus = 10;
    c1.hungerLevel = 2;
    c1.spirit = 10;
    c1.favouriteFood = "RoyalKanin";
    c1.favouriteActivity = "Playing";
    c1.print();

    Adopter ad1 = new Adopter();
    ad1.name = "Aurel Nicu";
    ad1.money = 450;
    ad1.print();

    AnimalFood af1 = new AnimalFood();
    af1.name = "RoyalKanin";
    af1.price = 50.50;
    af1.quantity = 3;
    af1.isAvailable = true;
    af1.print();

    RecreationAcivity ra1 = new RecreationAcivity();
    ra1.playActivity = "Fetch";
    ra1.print();

    VeterinaryMedic vm1 = new VeterinaryMedic();
    vm1.name = "Persan Viorel";
    vm1.specialization = "PHD in Vet School";
    vm1.print();


    }
}
