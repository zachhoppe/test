import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(
                List.of(
                        "Ziv",      "Denis",
                        "Jonathan", "Neelim",
                        "Bharat",   "Brooke",
                        "Alex",     "Lua",
                        "Benton", "James",
                        "Nicolas", "Allison",
                        "Anthony", "Shaun",
                        "Caleb", "Jay"
                ));

        Collections.shuffle(names);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < names.size() / 2; i++) {
            builder.append(String.format("|Group %-7d", i + 1));
        }
        builder.append("\n");
        for (int i = 0; i < names.size() / 2; i++) {
            builder.append(String.format("|%-13s", names.get(i)));
        }
        builder.append("\n");
        for (int i = names.size() / 2; i < (names.size() / 2) * 2; i++) {
            builder.append(String.format("|%-13s", names.get(i)));
        }
        if (names.size() % 2 != 0) {
            builder.append(String.format("\n|%-13s", names.get(names.size() - 1)));
        }
        System.out.println(builder);
    }
}
