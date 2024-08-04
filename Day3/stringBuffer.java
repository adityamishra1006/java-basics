public class stringBuffer {

    
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Aditya Mishra");
        // Mutable
        System.out.println(sb.capacity());

        System.out.println(sb.length());

        sb.append(" CSE-IoT");
        System.out.println(sb);

        // sb.deleteCharAt(3);
        // System.out.println(sb);

        sb.insert(0, "Java ");
        System.out.println(sb);

        sb.insert(11, " Java ");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
    }
}
