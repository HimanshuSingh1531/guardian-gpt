# 🤖 GuardianGPT

**GuardianGPT** is a multilingual AI-powered chatbot Android application built using **Kotlin** and **Jetpack Compose**. It provides both **online replies via Firebase Firestore** and **offline fallback responses**, making it reliable even in areas with poor or no internet connectivity.

Designed especially for rural healthcare and general awareness, **GuardianGPT** supports **English**, **Hindi**, and **Hinglish** for improved accessibility and communication.

---

## 📱 Screenshots

> *(Make sure to upload your screenshots with the same file names in the repo.)*

| Chatbot UI | Offline Mode | Firestore Reply |
|------------|--------------|-----------------|
| ![Chatbot Screen](chatbot_screen.png) | ![Offline Screen](offline_mode.png) | ![Firebase Screen](firebase_reply.png) |

---

## 🚀 Features

- 🌐 Real-time online replies using Firebase Firestore
- 📴 Offline fallback system for no-internet conditions
- 🗣️ Multilingual: Hindi, English, Hinglish
- 🎨 Modern UI with Jetpack Compose
- ⚡ Lightweight & responsive performance
- 🔒 Data-friendly and privacy-respecting

---

## 🧱 Project Structure

guardian-gpt/
├── ChatbotScreen.kt # UI screen of chatbot
├── FirestoreHelper.kt # Handles Firestore operations
├── OfflineChatbot.kt # Offline fallback logic
├── MainActivity.kt # App entry point
└── ...

---

## 🛠️ Tech Stack

| Technology        | Usage                                |
|-------------------|----------------------------------------|
| Kotlin            | Main programming language              |
| Jetpack Compose   | UI toolkit                             |
| Firebase Firestore| Cloud database for chatbot responses   |
| Android Studio    | Development environment                |

---

## 🧪 How to Run the App

### 🔹 Requirements

- Android Studio (Hedgehog or latest)
- Kotlin 1.9+ with Jetpack Compose
- Firebase project setup (Firestore)

### 🔹 Steps to Run

```bash
git clone https://github.com/HimanshuSingh1531/guardian-gpt.git
