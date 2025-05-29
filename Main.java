import java.util.Scanner;
class Main {
    public static String nicknameGenerator(String name) {
        if (name.length() < 4) {
            return "Name is short";
        }
        if ("aeiou".indexOf(Character.toLowerCase(name.charAt(2))) >= 0) {
            return name.substring(0, 4);
        } else {
            return name.substring(0, 3);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print name: ");
        String name = scanner.nextLine();
        System.out.println(nicknameGenerator(name));
    }
}
