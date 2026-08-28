plugins {
    alias(libs.plugins.android.library)
    id("maven-publish")
}

android {
    namespace = "com.jummania"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    publishing {
        singleVariant("release") {
            withSourcesJar()
        }
    }

}

dependencies {
    implementation(libs.androidx.viewpager)
    implementation(libs.kotlin.stdlib.jdk8)
}

afterEvaluate {
    publishing {
        publications {
            register<MavenPublication>("release") {
                groupId = "com.github.Jummania"
                artifactId = "Jummania-Slider"
                version = "4.7"

                // এখন এটি সঠিকভাবে 'release' কম্পোনেন্টটি খুঁজে পাবে
                from(components["release"])
            }
        }
    }
}