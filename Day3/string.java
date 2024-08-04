public class string {
    public static void main(String[] args) {
        // Strings have to put in double quotes ("String")
        // String name = "Aditya Mishra";

        String name = new String("Aditya");
        System.out.println(name);
        System.out.println(name.hashCode());

        System.out.println("Hello, " + name);

        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Mishra"));

        name = name + " Mishra";
        System.out.println(name);
    }
}
