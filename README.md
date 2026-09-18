# Vehicle Management System

## 1. Project Overview

The **Vehicle Management System** is a Java-based console application developed to manage vehicle records in a simple and organized manner. It allows users to add, view, search, update, and delete vehicle information.
The **Vehicle Management System** is a Java-based console application developed to manage vehicle parking activities in a simple and organized manner.

The project demonstrates core Java concepts such as **Object-Oriented Programming, ArrayList, methods, exception handling, and file handling**.
The system allows users to register vehicles, park and remove vehicles, display parking slots, view vehicle details, maintain parking history, and view parking statistics.

The project demonstrates core Java concepts including **Object-Oriented Programming, classes and objects, ArrayList, methods, loops, conditional statements, exception handling, and file handling**.

## 2. Features

* Add new vehicle details
* View all vehicles
* Search for a vehicle
* Update vehicle information
* Delete vehicle records
* Maintain vehicle history
* Handle invalid inputs
* Menu-driven console interface
The system provides the following features:

1. **Register Vehicle** – Register a vehicle with the required vehicle details.
2. **Park Vehicle** – Park a registered vehicle in an available parking slot.
3. **Remove Vehicle** – Remove a parked vehicle from the parking slot.
4. **Display Parking Slots** – View the current status of parking slots.
5. **Vehicle Details** – View the details of a registered vehicle.
6. **Parking History** – View previously recorded parking activities.
7. **Parking Statistics** – View total, occupied, and available parking slots.
8. **Exit** – Safely exit the application.

## 3. Project Structure

```text
Vehicle_Management/
│
├── Main.java
├── Vehicle.java
├── VehicleManager.java
├── ParkingHistory.java
├── vehicle_management/
│   ├── Main.java
│   ├── ParkingManager.java
│   ├── ParkingRecord.java
│   ├── ParkingSlot.java
│   ├── ParkingSystem.java
│   └── Vehicle.java
│
├── parking_history.txt
├── .gitignore
│
├── Flowchart.png
├── Class_Diagram.png
├── Use_Case_Diagram.png
│
├── Test_Results.pdf
├── Project_Report.pdf
├── Statement_File.pdf
├── Daigrams&Test
│   ├── test
│   │   └── Test Screenshots
│   │
│   └── diagrams
│       └── Project Diagrams
│
├── README.md
└── .gitignore
├── Statement.md
└── test_results.txt
```

### File Description

| File                   | Description                                    |
| ---------------------- | ---------------------------------------------- |
| `Main.java`            | Contains the main program and menu             |
| `Vehicle.java`         | Defines vehicle details and related methods    |
| `VehicleManager.java`  | Manages vehicle operations                     |
| `ParkingHistory.java`  | Handles vehicle history                        |
| `parking_history.txt`  | Stores vehicle history records                 |
| `Flowchart.png`        | Shows the program flow                         |
| `Class_Diagram.png`    | Represents the classes and their relationships |
| `Use_Case_Diagram.png` | Shows the interaction between user and system  |
| `Test_Results.pdf`     | Contains test cases and their results          |
| `Project_Report.pdf`   | Complete project documentation                 |
| `Statement_File.pdf`   | Project statement/document                     |
| `README.md`            | Project information and instructions           |
| `.gitignore`           | Specifies files ignored by Git                 |
### File and Folder Description

* **`vehicle_management/`** – Contains all 6 Java source files of the project.
* **`.gitignore`** – Contains files and folders that should not be tracked by Git.
* **`test/`** – Contains screenshots/evidence of the performed tests.
* **`diagrams/`** – Contains diagrams used in the project report.
* **`README.md`** – Provides project information, features, setup, and testing instructions.
* **`Statement.md`** – Contains the problem statement, project scope, target users, and high-level features.
* **`test_results.txt`** – Contains the detailed test cases, inputs, expected results, actual results, and status.

## 4. Technologies / Tools Used

* **Programming Language:** Java
* **Concepts:** OOP, ArrayList, Methods, Exception Handling, File Handling
* **Concepts:** Object-Oriented Programming, Classes & Objects, ArrayList, Methods, Loops, Conditional Statements, Exception Handling, File Handling
* **IDE:** Visual Studio Code
* **JDK:** 17 or above
* **JDK:** JDK 17 or above
* **Version Control:** Git & GitHub

## 5. Installation & Run

### Prerequisites

Install **JDK 17 or above**.
Install **JDK 17 or above** on your system.

Check the installation using:
Check the Java installation using:

```bash
java --version
javac --version
```

### Steps to Run

1. Clone or download the repository.
2. Open the project folder in VS Code.
3. Open the terminal in the project folder.
4. Compile the Java files:
1. Clone or download the project repository.
2. Open the repository in **Visual Studio Code**.
3. Open the `vehicle_management` folder.
4. Open the terminal inside the `vehicle_management` folder.
5. Compile the Java files:

```bash
javac *.java
```

5. Run the main program:
6. Run the main program:

```bash
java Main
```

6. Follow the options displayed in the console.
7. Select the required option from the menu displayed in the terminal.

## 6. Instructions for Testing

The application can be tested using all the available menu options:

### Test 1 – Register Vehicle

Enter valid vehicle details and verify that the vehicle is registered successfully.

### Test 2 – Park Vehicle

Enter a registered vehicle and verify that it is assigned to an available parking slot.

### Test 3 – Remove Vehicle

Enter a parked vehicle and verify that it is removed and the parking slot becomes available.

### Test 4 – Display Parking Slots

Check whether the system correctly displays occupied and available parking slots.

### Test 5 – Vehicle Details

Enter a registered vehicle number and verify that the correct vehicle details are displayed.

## 6. Testing Instructions
### Test 6 – Parking History

Test the following operations:
Check whether previous parking and removal activities are recorded and displayed correctly.

* Add a new vehicle with valid details.
* View all registered vehicles.
* Search for an existing vehicle.
* Search for a non-existing vehicle.
* Update vehicle details.
* Delete a vehicle.
* Check whether vehicle history is correctly stored in `parking_history.txt`.
* Enter invalid input and verify that the program handles it properly.
### Test 7 – Parking Statistics

Detailed test cases and results are provided in **`Test_Results.pdf`**.
Verify the total number of parking slots, occupied slots, and available slots.

## 7. Project Documentation
### Test 8 – Exit

The repository contains:
Select the Exit option and verify that the application terminates safely.

* **Diagrams** – Flowchart, Class Diagram, and Use Case Diagram
* **Test Results** – Test cases and their outputs
* **Project Report** – Complete project documentation
* **Statement File** – Required project statement/document
Detailed test cases and their results are available in **`test_results.txt`**, while screenshots of the testing process are available in the **`test`** folder.

## 8. Expected Result
## 7. Expected Result

The system should successfully manage vehicle records through a simple console-based interface. Users should be able to perform all available vehicle operations, and the vehicle history should be stored correctly in the text file.
The system should successfully perform all vehicle and parking management operations. Vehicle records should be maintained correctly, parking slots should be updated according to vehicle activity, parking history should be recorded, and parking statistics should be displayed accurately.
