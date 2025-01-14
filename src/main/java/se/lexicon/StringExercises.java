package se.lexicon;

public class StringExercises {

    public static void main(String[] args) {

        ex10();
        ex11();
    }

    public static void ex1(){
        String java = "Java"; // 4
        System.out.println(java.length());
        String sentence = "Long example sentence";
        System.out.println(sentence.indexOf('o')); // 2
    }

    public static void ex2(){
        String longerSentence = "Even longer example sentence";
        System.out.println(longerSentence.indexOf('o')); // 6
    }

    public static void ex3(){
        String following = "Ok this is not as long!";
        String substring = following.substring(11,22);
        System.out.println(substring); // "not as long"
    }

    public static void ex4(){
        String caps = "CAPS EQUALS SCREAMING";
        System.out.println(caps.toLowerCase());
    }

    public static void ex5(){
        String worstLang = "Java is the worst programming language!";
        worstLang = worstLang.replace("worst", "best");
        System.out.println(worstLang);
    }

    public static void ex6(){
        String weirdString = "\tJ\ta\tv\ta\t";
        System.out.println(weirdString.trim()); // J    a   v   a
    }

    public static void ex7(){
        String parseInt = "";
        parseInt = Integer.toString(20);
        parseInt += 20;
        System.out.println(parseInt);
    }

    public static void ex8(){
        String input = "Oil and Water";
        String[] oilAndWater = input.split(" ");
        String[] oilWater = {oilAndWater[0], oilAndWater[2]};
        for(String word : oilWater)
            System.out.println(word);

    }

    public static void ex9(){
        String names = "Carl,Susie,Fredrick,Bob,Erik";
        String[] namesArray = names.split(",");
        for(String name : namesArray)
            System.out.println(name);
    }

    public static void ex10(){
        String str = "ThisShouldBeConverted";
        str = str.replaceAll("(?<!^)([A-Z])", " $1"); //Adds a space before capital letters for the sake of readability
        char[] charArray = str.toCharArray();
        for(char character : charArray)
            System.out.println(character);


    }

    public static void ex11(){
        char[] charArray = {'J','a','v','a'};
        String str = new String(charArray);
        System.out.println(str);
    }
}
