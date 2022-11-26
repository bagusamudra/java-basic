public class ForEach {
    public static void main(String[] args) {

        String[] names = {
                "Bagus", "Adji", "Samudra",
                "Programmer", "Zaman", "Now"
        };

        for (var i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("For Each");

//        For Each Looping
        for (String name : names){
            System.out.println(name);
        }
    }
}
