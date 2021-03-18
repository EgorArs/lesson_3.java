public class Egor {
    public static void main(String[] args) {
        int a = 0;
        if (a == 0) a = 1;
        else a = 0;

        a = (a == 0 ? 1 : 0);

        String recipient = "Ivan";

        switch (recipient) {

            case " Vasya " -> System.out.println("Put this letter box # 1");
            case "Ivan" -> System.out.println("Put this letter box # 2");
            case "Vova" -> System.out.println("Put this letter box # 3");
            case "Kolya" -> System.out.println("Put this letter box # 4");
            default -> System.out.println("Nothing");

        }


    }
}
