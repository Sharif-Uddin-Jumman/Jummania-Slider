plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.jummania.jummania_slider"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.jummania.jummania_slider"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.material)
    implementation(libs.coil)
    implementation(libs.coil.network.okhttp)
    implementation(project(":jSlider"))
}