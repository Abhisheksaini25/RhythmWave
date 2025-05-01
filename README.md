# 🎵 RhythmWave

**RhythmWave** is a modern, elegant Android music player app built using **Kotlin** and **XML**, integrated with **Firebase** for 
authentication and real-time database functionality.RythmWave delivers a sleek and smooth user experience.

---

## ✨ Features

- 🎶 Play online music
- 🔐 Firebase Authentication (Email/Password)
- ☁️ Firebase Realtime Database for music metadata
- 🎨 Beautiful UI with XML layouts
- 📂 Organized song categories and playlists
- ❤️ Add to favorites

---

## 🛠️ Tech Stack

- **Language**: Kotlin
- **UI**: XML Layouts
- **Backend**: Firebase (Authentication + Realtime Database)
- **IDE**: Android Studio
- **Build Tool**: Gradle

---

## ✅ Requirements

Before installing or running RhythmWave, ensure you have the following installed:

| Tool               | Version / Requirement    |
|--------------------|--------------------------|
| JDK                | 11 or higher             |
| Kotlin             | 1.9.0+                   |
| Android Studio     | Koala (2024.1.1) or newer |
| Gradle             | 8.0 or later             |
| Firebase Account   | With a configured project |
| Android SDK        | API Level 30 or higher   |

---

## 🚀 Installation Guide

### 🔧 Step 1: Clone the Repository

```bash
git clone https://github.com/AbhishekSaini25/RhythmWave.git
cd RythmWave

### 🧑‍💻 Step 2: Open in Android Studio

Launch Android Studio.
-> Click on "Open an Existing Project".
-> Select the RhythmWave folder.
-> Let Android Studio index and sync the Gradle file

### 🔥 Step 3: Setup Firebase

-> Go to Firebase Console and create a new project.
-> Register your Android app with the project.
-> Download the google-services.json file and place it in the /app directory.
-> Enable Authentication (Email/Password) in Firebase Console.
-> Set up the Realtime Database with appropriate rules and structure

###  Step 4: Build and Run

-> Connect an Android device or start an emulator.
-> Click Run ▶️ in Android Studio.

---

## 🧱 How to Build the App

To build the APK or bundle: 

1) Ensure Firebase is configured properly (google-services.json is in place).
2) Open Android Studio and let Gradle sync.
3) Go to Build > Build Bundle(s) / APK(s).
4) Select:
-> Build APK(s) to generate a .apk file for testing.
-> Build Bundle(s) for release publishing to Play Store.
5) Once built, the output APK will be located in:

'''bash
    app/build/outputs/apk/debug/app-debug.apk

6) You can install it using:

'''bash
    adb install app/build/outputs/apk/debug/app-debug.apk

---

## 🙌 Contribution

Contributions are welcome! Feel free to fork the project and submit a pull request. Please make sure your code is well-documented
and tested.

---

## 📜 License

This project is licensed under the MIT License.