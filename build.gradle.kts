plugins {
  id("java")
  id("net.minecrell.plugin-yml.bukkit") version "0.6.0"
  id("com.github.johnrengelman.shadow") version "8.1.1"
}

group = "com.nookure.staff"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
  maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
  maven("https://oss.sonatype.org/content/repositories/snapshots")
  maven("https://oss.sonatype.org/content/repositories/central")
}

dependencies {
  compileOnly("org.spigotmc:spigot-api:1.21-R0.1-SNAPSHOT")
  implementation(libs.adventureBukkit)
  implementation(libs.miniMessage)
}

bukkit {
  main = "com.nookure.staff.NookureStaffCompatibility"
  author = "Angelillo15"
  version = rootProject.version.toString()
  description = "Just a dependency containing the compatibility layer for NookureStaff"
  loadBefore = listOf("NookureStaff")
}

tasks.shadowJar {
  archiveFileName.set("NookureStaff-Compatibility-${rootProject.version}.jar")
}