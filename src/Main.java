public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork 10 Part 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

        System.out.println("\nPart 2");
        String smallCharsFullName = fullName;
        String highCharsFullName = smallCharsFullName.toUpperCase();
        System.out.println(highCharsFullName);

        System.out.println("\nPart 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName);
        fullName = fullName.replace("ё" , "е");
        System.out.println(fullName);
    }
}