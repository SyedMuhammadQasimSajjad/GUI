# 🖼️ Desktop GUI Component Matrix (Java Swing & AWT)

A comprehensive, modular engineering layout showcasing fundamental interactive Graphical User Interface (GUI) design controls using native Java desktop toolkits (`javax.swing` and `java.awt`).

---

## 🛠️ Integrated Functional Modules

Every file in this framework isolates a core user interface primitive to demonstrate event handling, component registration, and layout rendering:

*   **`UserInput.java` — Core Registration Engine:** Handles the main application frames (`JFrame`), title initialization, and coordinates baseline visibility loops.
*   **`textfield.java` — Text Streams:** Manages standard data entry fields via `JTextField`, capturing user action events on console/display frames.
*   **`CheckBox.java` — State Toggles:** Implements binary state-switching selections using interactive `JCheckBox` controllers.
*   **`combo.java` — Dropdown Selection:** Models list reduction mechanics and structured option selection using array-driven `JComboBox` structures.
*   **`list.java` — Static Arrays:** Displays data lists utilizing scroll-supported `JList` frameworks for multi-row array structures.

---

## ⚙️ Key Technical Implementations

| Interface Protocol | Java Core Implementation Class | Purpose |
| :--- | :--- | :--- |
| **Window Frame** | `javax.swing.JFrame` | Establishes the parent canvas node and viewport boundaries. |
| **Data Streams** | `javax.swing.JTextField` | Captures alphanumeric user sequences. |
| **Event Listening** | `java.awt.event.ActionListener` | Fires responsive callback methods upon interactive clicks or entry submissions. |
| **List Handling** | `javax.swing.JComboBox` / `JList` | Manages single or multiple state list structures efficiently. |

---

## 🚀 Native Compilation & Verification

To test these desktop components natively via the command terminal system:

```bash
# Compile all local Java graphical frames
javac *.java

# Launch the Main User Registration UI node
java UserInput
