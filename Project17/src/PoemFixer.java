public class PoemFixer {

    public String[] readPoem() {
        return new String[]{
                "   Это кто там ложку «ложит»?",
                "",
                "   ",
                "Знай, такого быть не может!",
                "  Ложку мы на стол кладём,  ",
                "",
                "А тебя – к обеду ждём."
        };
    }

    public String fixPoem(String[] poem) {
        StringBuilder sb = new StringBuilder();

        for (String line : poem) {
            // Пропускаем пустые строки и строки, состоящие только из пробелов
            if (line != null && !line.isEmpty() && !line.isBlank()) {
                // Удаляем пробелы в начале и конце строки и добавляем в StringBuilder
                String trimmedLine = line.trim();
                sb.append(trimmedLine).append("\n");
            }
        }

        // Удаляем последний символ переноса строки, если он есть
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        PoemFixer poemFixer = new PoemFixer();
        String[] poem = poemFixer.readPoem();
        String poemAsString = poemFixer.fixPoem(poem);
        System.out.println(poemAsString);
    }
}