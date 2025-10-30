plugins {
    id("java-library")
    alias(libs.plugins.jetbrains.kotlin.jvm)
    id("java-gradle-plugin")
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
            implementationClass = "com.th.compose_lite.plugin.ComposeLitePlugin"
        }
    }
}