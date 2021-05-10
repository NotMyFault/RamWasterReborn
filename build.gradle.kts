import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    id("java")
    id("net.minecrell.plugin-yml.bukkit") version "0.3.0"
}

group = "de.notmyfault"
version = "1.0.0-SNAPSHOT"

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = sourceCompatibility
}


repositories {
    mavenCentral()
    maven {
        name = "PaperMC"
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
}

dependencies {
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
}

bukkit {
    name = "RamWasterReborn"
    main = "de.notmyfault.ramwasterreborn.RamWasterRebornPlugin"
    author = "NotMyFault"
    apiVersion = "1.13"
    description = "I'll eat your ram"
    version = rootProject.version.toString()
}
