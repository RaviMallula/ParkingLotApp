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

ParkingLotApp/
├── src/
│ └── com/
│ └── parkinglot/
│ ├── Main.java # CLI runner
│ ├── ParkingLot.java # Core logic
│ ├── Slot.java # Slot model
│ ├── Vehicle.java # Vehicle model
│ └── VehicleType.java # Enum for types
├── test-commands.txt # Sample test commands
├── README.md # Project overview and usage
├── Presentation.md # Approach and design summary
└── ParkingLot_Code_Explanation.pdf # Line-by-line code explanation (optional)

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

📌 Commands You Can Use
Command	Description
enter SMALL ABC123	Enter a small car with plate ABC123
enter LARGE XYZ789	Enter a large vehicle
exit ABC123	Exit vehicle with plate ABC123
status	View current parking lot status
quit	Exit the CLI application

--

🧪 Sample Test Commands
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

💡 Design Overview
See Presentation.md for:

Architecture & design decisions

Class responsibilities

Slot allocation logic

📄 For detailed explanation of each Java file, check ParkingLot_Code_Explanation.pdf

--

📘 License
This project is licensed under the MIT License — feel free to use and modify.

--

🤝 Contributing
Pull requests are welcome. For major changes, open an issue first to discuss what you’d like to change.

--

🙌 Acknowledgements
Built with 💻 Java and passion for clean code.
