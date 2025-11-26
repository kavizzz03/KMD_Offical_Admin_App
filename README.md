# KMDOfficial - Admin & Management Android App

[![Android](https://img.shields.io/badge/Android-12-green)](https://developer.android.com/studio)
[![Language](https://img.shields.io/badge/Language-Java/Kotlin-blue)](https://kotlinlang.org/)

KMDOfficial is an Android application built using **Java & Kotlin**, designed to help manage administrative tasks efficiently. It supports **English & Sinhala languages** and includes **dark/light mode** for better user experience.

---

## Features

### 1. Language Selection
- On first launch, asks users to select **English** or **Sinhala**.
- Saves the preference and applies it throughout the app.

### 2. Home Dashboard
- Displays key categories:
  - Contact Messages
  - Email Subscribers
  - Products
  - Product Sales
  - Slideshow
  - Suppliers
- Quick access to **Settings**.

### 3. Products Management
- Add new products.
- View all products.
- Delete products.

### 4. Settings
- Switch between **Dark Mode** and **Light Mode**.
- Change app language anytime.

### 5. Login System
- Simple username and password authentication.

---

## Tech Stack

- **Languages:** Java & Kotlin
- **Architecture:** MVP (Model-View-Presenter)
- **UI:** Android XML layouts, RecyclerView, Material Components
- **Data Storage:** SharedPreferences (for language, theme, first launch info)

---

## Project Structure

- `MainActivity` – Launcher activity, decides whether to show **LanguageActivity** or **HomeActivity**.
- `LanguageActivity` – Lets users select preferred language.
- `HomeActivity` – Dashboard with categories and shortcuts.
- `SettingsActivity` – Manage theme and language.
- `ProductsHomeActivity` – Manage products (Add/View/Delete).
- `Adapters` – RecyclerView adapters for home categories.
- `Utils` – Helper classes like `Prefs` and `LocaleHelper`.

---

## How to Run

1. Clone the repository:

```bash
git clone https://github.com/yourusername/KMD_Offical_Admin_App.git
