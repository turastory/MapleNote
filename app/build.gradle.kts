import com.turastory.androidtoolbox.build.CommonVersions
import com.turastory.androidtoolbox.build.android.configureCommons
import com.turastory.androidtoolbox.build.androidx
import com.turastory.androidtoolbox.build.junit
import com.turastory.androidtoolbox.build.kotlinJvm

plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    configureCommons(1, "1.0")

    defaultConfig {
        applicationId = "com.turastory.maplenote"
    }

    buildTypes {
        getByName("release") {
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation(kotlinJvm(CommonVersions.kotlin))
    implementation(androidx("core", "ktx", version = CommonVersions.core))
    implementation(androidx("appcompat", version = CommonVersions.appcompat))
    implementation(androidx("constraintlayout", version = CommonVersions.constraintLayout))
    testImplementation(junit(CommonVersions.junit))
    androidTestImplementation("androidx.test:runner:${CommonVersions.test}")
    androidTestImplementation("androidx.test.espresso:espresso-core:${CommonVersions.espresso}")
}