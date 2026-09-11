class Car extends Vehicle{
    private String brand;

    public Car(String brand, int speed){
        super(speed);
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}
