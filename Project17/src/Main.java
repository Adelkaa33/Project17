public class Main {
    public static void main(String[] args) {
        FindRepeats finder = new FindRepeats();

        String text = "abaabaaba";
        String substring = "aba";

        int result = finder.numberOfRepeats(text, substring);
        System.out.println("Количество вхождений '" + substring + "' в '" + text + "': " + result);
        // Вывод: Количество вхождений 'aba' в 'abaabaaba': 3
    }
}