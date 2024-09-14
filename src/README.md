# PhoneBook Application

This is a simple **PhoneBook** application written in Java. The application allows users to add contacts, view all saved contacts, and exit the program through a simple text-based menu.

## Features

- **Add a Contact**: Users can input a contact's name and phone number, which will be stored in an ArrayList.
- **Show All Contacts**: Displays a list of all saved contacts, showing their name and phone number.
- **Exit the Application**: Safely exits the program.

## How to Use

1. **Start the App**: When the app starts, you will be presented with 3 menu options:
    - `1`: Add a contact
    - `2`: Show all available contacts
    - `3`: Exit the app

2. **Adding a Contact**:
    - Select `1` to add a contact.
    - Enter the contact's name.
    - Enter the contact's phone number.
    - You will see a confirmation message once the contact is successfully added.

3. **Showing All Contacts**:
    - Select `2` to display all saved contacts.
    - If there are no contacts, you will see a message saying **No contacts available**.
    - Otherwise, each contact will be displayed in the format:
      ```
      -----------------------------------------
      name: [Contact Name], number: [Contact Number]
      ```

4. **Exit the App**:
    - Select `3` to safely exit the application.

## Code Structure

- **PhoneBook.java**: The main class that manages the menu, user inputs, and the array list of contacts.
- **Contact.java**: A class representing a contact, containing a name and phone number as private fields. The `toString()` method is used to return contact details in a formatted string.

## Requirements

- Java 8 or higher.
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) or simply run in the command line.

## Installation

**Clone the Repository**:

   git clone https://github.com/DariushGandomi/PhoneBook.git

**Navigate to the Directory**:


**Run the Application**:
   Compile and run the `PhoneBook.java` file.

---
## Contact
### For any inquiries, contact me at _Dariush.js77@gmail.com_

