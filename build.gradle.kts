<<<<<<< HEAD
=======
// Top-level build file where you can add configuration options common to all sub-projects/modules.
>>>>>>> 5ba327e968dca2ad5b51470b1a460c06c1cf7102
buildscript {
    repositories {
        mavenCentral()
    }
    dependencies {
        classpath ("io.realm:realm-gradle-plugin:10.15.1")
    }
}

plugins {
    id("com.android.application") version "8.1.3" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("io.realm.kotlin") version "1.11.0" apply false
    id("org.jetbrains.kotlin.kapt") version "1.6.20" apply false
}