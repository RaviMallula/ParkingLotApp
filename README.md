# 🚗 Parking Lot Management Application

A command-line Java application to manage a small parking lot with different slot sizes — `SMALL`, `LARGE`, and `OVERSIZE`. Supports vehicle entry, exit, and viewing current parking status.

---

## 🧠 Features

- 🅿️ Dynamic parking lot initialization
- 🚘 Supports vehicle entry & exit by type
- 📋 CLI-based status display
- 🧠 In-memory storage (no database required)
- 🧪 Test data provided for quick validation

---

## 📂 Project Structure

![image](https://github.com/user-attachments/assets/d262a1da-e43f-47af-8566-4ad569d4206e)


---

## 🚀 Getting Started

### 🔧 Prerequisites
- Java 17 or higher
- IntelliJ IDEA or any Java IDE (optional)
- Git (optional)

### 🔨 Compile
bash
javac src/com/parkinglot/*.java

--

### 📌 Commands You Can Use
![image](https://github.com/user-attachments/assets/bde0e91e-f374-44f4-bc1b-b8fb3f356c88)


--

### 🧪 Sample Test Commands
You can test the system using the provided test-commands.txt:

bash

java -cp src com.parkinglot.Main < test-commands.txt

Contents:

enter SMALL ABC123
enter LARGE XYZ789
enter OVERSIZE TRK001
exit ABC123
status
quit

--

### 💡 Design Overview
See Presentation.md for:

Architecture & design decisions

Class responsibilities

Slot allocation logic

📄 For detailed explanation of each Java file, check ParkingLot_Code_Explanation.pdf

--

### 📘 License
This project is licensed under the MIT License — feel free to use and modify.

--

### 🤝 Contributing
Pull requests are welcome. For major changes, open an issue first to discuss what you’d like to change.

--

### 🙌 Acknowledgements
Built with 💻 Java and passion for clean code.
