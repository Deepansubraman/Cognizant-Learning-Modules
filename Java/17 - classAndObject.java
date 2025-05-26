class classAndObject {
    String make;
    String model;
    int year;

    public classAndObject(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void displayDetails() {
        System.out.println(year + " " + make + " " + model);
    }

    public static void main(String[] args) {
        classAndObject car1 = new classAndObject("Toyota", "Camry", 2020);
        classAndObject car2 = new classAndObject("Honda", "Civic", 2022);
        car1.displayDetails();
        car2.displayDetails();
    }
}