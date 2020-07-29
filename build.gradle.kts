import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.0.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.72")
        classpath("com.turastory:build-tools:0.0.1")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }

    tasks {
        withType<KotlinCompile> {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }
}

tasks {
    register("clean", Delete::class) {
        delete(rootProject.buildDir)
    }
}
