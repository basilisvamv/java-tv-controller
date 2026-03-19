📺 Java TV Controller

A simple Java-based simulation of a television system, implementing core functionalities such as power control, channel navigation, and volume adjustment.

🚀 Overview

This project demonstrates object-oriented programming principles in Java through a TV simulation.
It allows interaction with a virtual TV device by controlling:

Power ON/OFF

Channel selection (manual and navigation)

Volume increase/decrease

🧠 Features

🔌 Power control (turn TV on/off)

🔢 Channel selection via direct input

⏮️ Channel navigation (previous/next)

🔊 Volume control (increase/decrease with limits)

⚠️ Input validation (channel range: 1–100, volume range: 0–100)

🏗️ Technologies Used

Java

Object-Oriented Programming (OOP)

📂 Project Structure
java-tv-controller/
│
├── Tv.java
└── README.md
▶️ How to Run

Compile the program:

javac Tv.java

(If you add a main class later) run:

java Tv
📌 Code Highlights

Encapsulation using private fields

Getter methods for safe access

Conditional logic for realistic TV behavior

State-dependent actions (TV must be ON to work)

💡 Possible Improvements

Add a main class with user interaction (console menu)

Prevent invalid button combinations (e.g. next & previous together)

Add mute functionality

Improve method naming (e.g. setChannel, setVolume)

GUI version using JavaFX or Swing

👨‍💻 Author

[Your Name]

⭐ Notes

This project is part of my learning journey in Java and software development.
It focuses on building clean, understandable logic using core programming concepts.
