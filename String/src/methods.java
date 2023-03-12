import java.util.Locale;

public class methods {
    public static void main(String[] args) {
        String name = "Tushar";
        //length
        int value = name.length();
        System.out.println(value);

        // lower case
        String lstring = name.toLowerCase();
        System.out.println(lstring);

        // upper case
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        // trim
        String nonTrimmedString = "   Tushar      ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);


        // index start with zero;
        // System.out.println(name.substring(3));
        // System.out.println(name.substring(1,4));
        // System.out.println(name.replace('r','s'));
        // System.out.println(name.replace("ar","u"));

        // System.out.println(name.startsWith("Tu"));
//        System.out.println(name.endsWith("ar"));

//        System.out.println(name.charAt(2));

//        System.out.println(name.indexOf("s"));
//        System.out.println(name.indexOf('r',3));

//        System.out.println(name.lastIndexOf("har"));
//        System.out.println(name.lastIndexOf("har",3));
//        System.out.println(name.equals("Tuhar"));

//        System.out.println(name.equalsIgnoreCase("TUSHAr"));

    }

}
