# Warehouse Management System 🏭

This repository contains the source code for a Warehouse Management System, an Android application designed to manage and track warehouse operations. The system features data loading from JSON assets and integration with Firebase for real-time data handling.

## Features 🌟

- **Load Data Efficiently**: Load warehouse data from JSON files in the assets folder.
- **Firebase Integration**: Seamlessly upload and manage warehouse data in real-time with Firebase.
- **Error Handling**: Robust error handling for file reading and JSON processing.

## Warehouse Class 📦

The `Warehouse` class represents a warehouse entity with an ID and a description.

# Warehouse Management System 🏭

This repository contains the source code for a Warehouse Management System, an Android application designed to manage and track warehouse operations. The system features data loading from JSON assets and integration with Firebase for real-time data handling.

## Sample JSON Data 📄

The warehouse data is structured in JSON format as shown below:

```json
{
    "warehouses": [
        {"id":"1000", "description":"Εγκατάσταση Αθήνας"},
        {"id":"1005", "description":"Εγκατάσταση Καλαμάτας"},
        {"id":"1032", "description":"Εγκατάσταση Θεσσαλονίκης"},
        // ... other warehouses ...
    ]
}
```
## Dependencies
```bash
apply plugin: 'com.google.gms.google-services'
```

## Instructions 📝
- Right click on the app folder of your project
- **New** -> **Folder** -> **Assets Folder**
- Copy - Paste there your **warehouses.json** file

## Create Assets folder - Screenshot 📷
![image](https://github.com/pmoschos/UploadJSONObjectToFirebase/assets/133533759/38b118fd-e268-4220-b6a8-0dbcaee7da18)

## Paste your .json file - Screenshot 📷
![image](https://github.com/pmoschos/UploadJSONObjectToFirebase/assets/133533759/05726956-1f64-4fd0-8f8e-ed36fe2810a3)


## Getting Started 🚀

### Prerequisites

- Android Studio
- Firebase account

### Installation

1. **Clone the repository**

   ```bash
   git clone https://github.com/pmoschos/UploadJSONObjectToFirebase
   ```

## Open the project in Android Studio

### Configure Firebase

- Set up a Firebase project and connect it with the Android app.
- Update the `google-services.json` file (your firebase project).

## Usage 📱

- **Run the app** in Android Studio.
- **Navigate through the app** to load and view warehouse data.
- **Check Firebase Console** to see real-time data updates.

## Fireabase Screenshot 📷
![image](https://github.com/pmoschos/UploadJSONObjectToFirebase/assets/133533759/b03ba01b-bd7d-4ea3-96c6-600d95617ba1)

## License 📄

Distributed under the MIT License. See `LICENSE` for more information.

## Contact 📧

Panagiotis Moschos - [pan.moschos86@gmail.com](mailto:pan.moschos86@gmail.com)

Project Link: https://github.com/pmoschos/UploadJSONObjectToFirebase

<h1 align=center>Happy Coding 👨‍💻 </h1>

<p align="center">
  Made with ❤️ by Panagiotis Moschos (https://github.com/pmoschos)
</p>

