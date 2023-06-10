public class _6Strings {
    public static void main(String[] args) {
        String firstName= "Pawan";
        String lastName= new String("Negi");
        StringBuffer sb= new StringBuffer("Mindset");
        System.out.println(firstName + " " + lastName); 
        System.out.println(firstName.concat("OP"));
        System.out.println(sb.append(" Is Everything"));
    }
}

// String Buffer is thread safe and String Builder is not