package java17features.jep_406;

public class SwitchPatternMatching {

    public static void main(String[] args) {
        Object obj = "Hello World";

        String result = switch (obj) {
            case String s when s.length() > 10 -> "Long string";
            case String s -> "Small string";
            case Integer i -> "Integer";
            case Double d ->  "Double";
            case null -> "Almost NullPointerException";
            default -> "No type found";

        };

        System.out.println(STR."The type of pattern is \{result}");
    }

}


