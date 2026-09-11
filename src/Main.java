public class Main {
    public static void main(String[] args) {
       Car mycar = new Car("Peugeot", 200);

       System.out.println("Автомобиль марки " + mycar.getBrand() + " разгоняется до " + mycar.getSpeed());
    }
}
