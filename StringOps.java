public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        System.out.println("capVowlesLowRest(“Hello World”): " + capVowelsLowRest("Hello World"));
        System.out.println("capVowlesLowRest(“One two tHRee world”): " + capVowelsLowRest("One two tHRee world"));
        System.out.println("capVowlesLowRest(“vowels are fun”): " + capVowelsLowRest("vowels are fun"));
        System.out.println("capVowlesLowRest(“intro”): " + capVowelsLowRest("intro"));
        System.out.println("capVowlesLowRest(“yellow”): " + capVowelsLowRest("yellow"));
        System.out.println("camelcase(“Hello World”): " + camelCase("Hello World"));
        System.out.println("camelcase(“HELLO world”): " + camelCase("HELLO world"));
        System.out.println("camelcase(“ tWo wordS”): " + camelCase(" tWo wordS"));
        System.out.println("camelcase(“world”): " + camelCase("world"));
        System.out.println("camelcase(“ Intro to coMPUter sCIEncE ”): " + camelCase(" Intro to coMPUter sCIEncE "));
        System.out.println("allIndexOf(Hello world,'l');" + allIndexOf("Hello world",'l')[0]);
        System.out.println("allIndexOf(Hello worLd,'l');" + allIndexOf("Hello worLd",'l'));
        System.out.println("allIndexOf(Hello world,'o');" + allIndexOf("Hello world",'o'));
        System.out.println("allIndexOf(Hello world,' ');" + allIndexOf("Hello world",' '));
        System.out.println("allIndexOf(Hello world,'d');" + allIndexOf("Hello world",'d'));
        System.out.println("allIndexOf(MMMM,'M'); " + allIndexOf("MMMM",'M'));
        
    }

    public static String capVowelsLowRest (String string) {
        String str = "";

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 97 || string.charAt(i) == 101 || string.charAt(i) == 105 || string.charAt(i) == 111 || string.charAt(i) == 117) {
                str += (char) (string.charAt(i) - 32);
            } else if (string.charAt(i) == 65 || string.charAt(i) == 69 || string.charAt(i) == 73 || string.charAt(i) == 79 || string.charAt(i) == 85) { 
                str += string.charAt(i);
            } else if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                str += (char) (string.charAt(i) + 32);
            } else 
               str += string.charAt(i);
        }

        return str;
    }

    public static String camelCase (String string) {
        int[] signArr = new int[string.length()];
        int j = 0;
        while (string.charAt(j) == 32) {
            j++;
        }
        if (string.charAt(j) > 64 && string.charAt(j) < 91)
            signArr[j] = 1;

        for (int i = j + 1; i < string.length(); i++) {
            if (string.charAt(i) != 32 && string.charAt(i-1) == 32) {
                signArr[i] = 2;
            } else if(string.charAt(i) != 32) {
                   signArr[i] = 1; 
               }
        }

        String str = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 32) {
                str += "";
            } else if (signArr[i] == 1 && string.charAt(i) > 64 && string.charAt(i) < 91) {
                str += (char) (string.charAt(i) + 32);
            } else if (signArr[i] == 2 && string.charAt(i) > 96 && string.charAt(i) < 123) {
                str += (char) (string.charAt(i) - 32);
            } else 
                str += string.charAt(i);
        }
        return str;
    }

    public static int[] allIndexOf (String string, char chr) {

        int arrayLength = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                arrayLength++;
            }
        }
        int[] array = new int[arrayLength];
        int j = 0;
        for (int i = 0; i < string.length(); i++) {
            if (chr == string.charAt(i)) {
                array[j] = i;
                j++;
            }
        }
        return array;
    }
}
