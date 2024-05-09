package xyz.steffq.exampleapi.utils;

import org.bukkit.ChatColor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public static String color(@NotNull String input) {
        return ChatColor.translateAlternateColorCodes('&', input);
    }

    public static List<String> colorList(@NotNull String... input) {
        List<String> colored = new ArrayList<>();
        for (String string : input) {
            colored.add(color(string));
        }

        return colored;
    }

}