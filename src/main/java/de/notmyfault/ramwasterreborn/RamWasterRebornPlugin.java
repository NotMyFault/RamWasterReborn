package de.notmyfault.ramwasterreborn;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Vector;

public class RamWasterRebornPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Vector vector = new Vector<>();
        while (true) {
            byte[] bytes = new byte[1048576];
            vector.add(bytes);
            Runtime runtime = Runtime.getRuntime();
            getLogger().info("Eating ram, nom nom nom; memory left: " + runtime.freeMemory() / 1000 / 1000 + "MB");
        }
    }

}
