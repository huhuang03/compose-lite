plugins {
    id("org.jetbrains.kotlin.jvm") version ("2.0.21")
    id("java-gradle-plugin")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin-api:2.0.21")
}

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

kotlin {
    compilerOptions {
        jvmTarget = org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11
    }
}


gradlePlugin {
    plugins {
        create("compose-lite-plugin") {
            id = "com.th.compose_lite.plugin"
            implementationClass = "com.th.compose_lite.plugin.ComposeLitePlugin"
        }
    }
}