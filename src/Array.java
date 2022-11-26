public class Array {

    public static void main(String[] args) {

        String[] stringArray;
        stringArray = new String[3];

        stringArray[0] = "Bagus";
        stringArray[1] = "Adji";
        stringArray[2] = "Samudra";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);

        stringArray[0] = "Dini";

        System.out.println(stringArray[0]);

        int[] arrayInt = new int[]{
                10,20,30,40
        };

        long[] arrayLong = {
                10L,30L,50L,70L
        };

        arrayLong[0] = 0;

        System.out.println(arrayLong.length);



        String[][] members = {
                {"bagus", "adji"},
                {"rahmanisa", "azahri"},
                {"rahmanisa", "azahra"}
        };

        System.out.println(members[0][1]);
        System.out.println(members[1][1]);
        System.out.println(members[2][1]);
    }
}
