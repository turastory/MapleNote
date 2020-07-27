plugins {
    `kotlin-dsl`
    `java-gradle-plugin`
}

repositories {
    google()
    jcenter()
    maven(url = "https://plugins.gradle.org/m2/")
}

dependencies {
    implementation(gradleKotlinDsl())
    implementation(kotlin("gradle-plugin", "1.3.72"))
    implementation("com.android.tools.build:gradle:4.0.0")
}

