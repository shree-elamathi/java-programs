public class Animal1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Country india = new Country("India", "+91");
        Country us = new Country("United States");

        System.out.println(
                india.isValid("+919840333764"));
        System.out.println(
                us.isValid("+919840333764"));
    }
}


class Country {
    private final String name;
    private final String code;

    Country(String name, String code) {
        this.name = name;
        this.code = code;
    }

    Country(String name) {
        this.name = name;
        this.code = "+00";
    }

    public boolean isValid(String phoneNumber) {
        return phoneNumber.startsWith(code);
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}