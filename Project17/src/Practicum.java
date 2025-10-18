public class Practicum {
    public static void main(String[] args) {

        String start = "Привет! Меня зовут ";

        StringBuilder hello = new StringBuilder(start); // создайте StringBuilder с началом start
        hello.append("Александр"); // добавьте подстроку "<ваше имя>"
        hello.append(". Я из города "); // добавьте подстроку ". Я из города "
        hello.append("Москва."); // добавьте подстроку "<ваш город>."

        String asString = hello.toString();
        System.out.println(asString);
    }
}