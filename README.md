# 🏥 Hospital Management System

An object-oriented Hospital Management System built in Java, designed to model core hospital operations, people management, medical records, and billing workflows using clean OOP principles such as inheritance, composition, and interface-driven design.

---

## ✨ Key Architectural Highlights
- Inheritance Hierarchy: A base Person class serves as the parent for Doctor, Employee, and Patient, promoting code reuse and shared personal attributes.
- Composition Relationship: Doctor and Department are connected via composition, modeling structured department assignment and hospital organization.
- **Centralized Management (Hospital):** Acts as the core orchestrator responsible for managing and coordinating the system's entities and operations.
- Records & Billing with Payment Interface: Dedicated Record (records) and Bill (invoice) classes integrated with a PayPal interface to standardize payment handling.
- **Entry Point & Execution (Main):** Contains the main method to run demonstrations, display outputs, and invoke system methods.

---

## 🧩 Core Classes & Structure
- Person — Base class representing shared attributes and behaviors for individuals in the system.
- Doctor — Extends Person and maintains a composition relationship with Department.
- Department — Represents hospital departments and collaborates with Doctor.
- Employee — Extends Person to model non-physician hospital staff.
- Patient — Extends Person to represent patients receiving care and billing.
- Record — Manages medical/hospital records.
- Bill — Handles billing/invoices and interacts with the PayPal interface.
- PayPal — Interface defining payment behavior for billing transactions.
- Hospital — Central management class overseeing the system's components.
- Main — Entry point (main method) that showcases functionality and calls system methods.

---

## 🚀 How to Run

1. Clone the repository:
   `bash
   git clone [https://github.com/ramibinaffi-lgtm/Hospital-Management-system.git](https://github.com/ramibinaffi-lgtm/Hospital-Management-system.git)
   cd Hospital-Management-system

 * Compile the Java files:
   javac *.java

   (If your files are organized inside packages or a src directory, compile from the project root accordingly, e.g., javac -d out $(find src -name "*.java").)
 * Run the application:
   java Main

   (Include the package prefix if Main is inside a package, such as java com.hospital.Main.)
🛠️ Built With
 * Java (Object-Oriented Programming: Inheritance, Composition, Interfaces)
👨‍💻 Authors
 * Rami Bin Affi
 * Salem Al-Kathiri
 * Saif Al-Deen
