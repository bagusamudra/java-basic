public class MethodParameter {
    public static void main(String[] args) {

        sayHello("Bagus", "Samudra");
        sayHello("Dini", "Septiani");

    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
