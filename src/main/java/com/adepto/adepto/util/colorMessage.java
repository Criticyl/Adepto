package com.adepto.adepto.util;


import org.bukkit.ChatColor;

public class colorMessage {
    public String convertToColor(String s) {
        return ChatColor.translateAlternateColorCodes('&', s);
    }
}
