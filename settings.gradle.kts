pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    val storageUrl: String = System.getenv("STORAGE_URL") ?: "https://storage.googleapis.com"
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
    repositories {
        google()
        mavenCentral()
        maven {
            url  = uri("/Users/huynq/Documents/NEVERCODE.IO/RepoduceProjects/FlutterAdd2AppAndroidNative-AS2023.1.1/flutter_module/build/host/outputs/repo")
        }
        maven {
            url = uri("$storageUrl/download.flutter.io")
        }

    }
}

rootProject.name = "FlutterAdd2App-AndroidNative"
include(":app")
