public class Manipular {
    public static void main(String[] args) {
        String teste = " Ola mundo, novo mundo";
        System.out.println(teste.length());
        System.out.println(teste.contains("mundo"));
        System.out.println(teste.indexOf("mundo"));
        System.out.println(teste.lastIndexOf("mundo"));
        System.out.println(teste.toUpperCase());
        System.out.println(teste.toLowerCase());
        System.out.println(teste.trim());
        System.out.println(teste.substring(16));
        System.out.println(teste.equals("Opa"));
    }
}
