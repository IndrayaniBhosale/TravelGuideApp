# 🌍 Travel Guide App

A modern **Jetpack Compose Android application** that helps users explore world destinations, view detailed information, and save their favorite places.  
Built using **Kotlin**, **MVVM architecture**, and **Android Jetpack Compose** for a smooth, declarative UI experience.

---

## ✨ Features

- 🏠 **Home Screen** – Browse beautiful destinations with images.  
- 📍 **Details Screen** – View information and attractions about a selected destination.  
- ⭐ **Favorites Screen** – Save and manage your favorite travel spots.  
- 🧠 **State Management** – Uses `ViewModel` and Compose state to handle favorites and destination data.  
- 🧭 **Navigation** – Smooth transitions between Home → Details → Favorites using `NavHost`.  
- 🎨 **Material 3 Design** – Clean UI following Android’s modern design system.

---

## 🗂️ Project Structure
TravelGuideApp/ ├── app/ │ ├── src/ │ │ ├── main/ │ │ │ ├── java/com/example/travelguideapp/ │ │ │ │ ├── data/ # Destination data classes │ │ │ │ ├── ui/theme/ # Theme colors & typography │ │ │ │ ├── ui/screens/ # Home, Details, Favorites screens │ │ │ │ └── viewmodel/ # TravelViewModel for app state │ │ │ ├── res/ # Drawables, mipmap icons, XML files │ │ │ └── AndroidManifest.xml │ ├── build.gradle.kts # Module-level Gradle │ └── ... ├── build.gradle.kts # Project-level Gradle └── settings.gradle.kts


---

## 🛠️ Tech Stack

| Component | Technology |
|------------|-------------|
| **Language** | Kotlin |
| **UI Framework** | Jetpack Compose |
| **Architecture** | MVVM (Model – View – ViewModel) |
| **Design System** | Material 3 |
| **Navigation** | androidx.navigation.compose |
| **IDE** | Android Studio Ladybug / Koala |
| **Build Tool** | Gradle 8.7 |

---

## 🚀 Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/<your-username>/TravelGuideApp.git
cd TravelGuideApp


 ### 2. Open in Android Studio
* Go to File → Open → TravelGuideApp
* Let Gradle sync automatically.

### 3. Build & Run
* Click ▶ Run at the top toolbar.
* Choose an emulator (e.g., Pixel 5 API 33).
* Wait for the app to launch — you’ll see destination cards appear.

## 📸 Screenshots
Home	Favorites
	


## 🧩 Future Enhancements
* Add search functionality for destinations.
* Integrate real travel APIs (Google Places / TripAdvisor).
* Use Room Database or DataStore to persist favorites.
* Add splash / intro animations.
* Implement dark mode toggle.






