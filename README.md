📘 Calculator Application — Java Fundamentals 1 Workshop



This project is a console-based calculator application built as part of the Java Fundamentals 1 Workshop. The goal is to practice basic Java concepts, user input handling, control structures, exception handling, and Maven project structure.



🚀 Features



✅ Core Requirements



* Created as a Maven project.



* Supports basic operations:



&nbsp; - Addition



&nbsp; - Subtraction



&nbsp; - Multiplication



&nbsp; - Division



Users can:

&nbsp; - Enter two (or more) numbers.



&nbsp; - Choose the desired operator.



&nbsp; - View the calculated result.



* The application runs in a loop until the user chooses to exit.



* After each calculation, the user is given the option to:



&nbsp; - Perform another operation



&nbsp; - Exit the program



⭐ Optional Enhancements (Implemented / To Implement)



* Option for addition and subtraction to handle multiple operands.



* Exception handling for:



&nbsp; - Invalid number input



&nbsp; - Dividing by zero



&nbsp; - Invalid operator



* JUnit tests for verifying:



&nbsp; - Addition



&nbsp; - Subtraction



&nbsp; - Multiplication



&nbsp; - Division



* Ability to add advanced mathematical operations, such as:



&nbsp; - Square root



&nbsp; - Power (xⁿ)



&nbsp; - Modulo



&nbsp; - Percentage



* Build a simple GUI version using:



&nbsp; - Swing, or



&nbsp; - JavaFX



📂 Project Structure (Example)



calculator-app/

│── src/

│   ├── main/

│   │   └── java/

│   │       └── com.example.calculator/

│   │           ├── Calculator.java

│   │           └── Main.java

│   └── test/

│       └── java/

│           └── com.example.calculator/

│               └── CalculatorTest.java

│── pom.xml

│── README.md





🧮 How the Application Works



1️⃣ Start the program



The user is welcomed and prompted to enter:



* The first number



* The second number (or more numbers, if supported)



* The operator (´+`, `-´, `\*´, `/`,)





2️⃣ Perform the calculation



The program evaluates the operation and prints the result.





3️⃣ Continue or Exit



After showing the result, the program asks:





´´´Do you want to perform another calculation? (y/n)```



* `y´ → loops back



* `n` → program ends gracefully





📦 Running the Project



\## Using Maven



```sh

mvn clean install



mvn exec:java -Dexec.mainClass="com.example.calculator.Main"



```



\## Using IDE



* Import project as Maven project



* Run the Main class



🧪 Testing (Optional)



JUnit tests verify each mathematical operation:



```sh

mvn test



```



🎨 GUI Version (Optional)



A simple graphical calculator can be built using:



\## Swing



&nbsp; - Buttons for digits \& operations



&nbsp; - Display field for results



\## JavaFX



&nbsp; - Modern UI



&nbsp; - Layouts like GridPane for button arrangement





🌱 1. Algorithm 



1. Start



2\. Ask the user to enter two numbers



3\. Ask the user which operation they want (+, -, \*, /)



4\. Perform the chosen operation



5\. Display the result



6\. Ask the user if they want to calculate again



7\. If yes, repeat from step 2; otherwise end







🌱 2. Pseudocode 



```sql



```BEGIN



DISPLAY "Enter first number"

READ num1



DISPLAY "Enter second number"

READ num2



DISPLAY "Enter operator (´+`, `-´, `\\\*´, `/`,))"

READ op



IF op = "+"

&nbsp;   result ← num1 + num2

ELSE IF op = "-"

&nbsp;   result ← num1 - num2

ELSE IF op = "\*"

&nbsp;   result ← num1 \* num2

ELSE IF op = "/"

&nbsp;   IF num2 = 0

&nbsp;       DISPLAY "Cannot divide by zero"

&nbsp;   ELSE

&nbsp;       result ← num1 / num2

&nbsp;   ENDIF

ENDIF



DISPLAY result



END



&nbsp;	```

```





🌱 3. Flowchart



&nbsp;           ┌──────────────┐

&nbsp;           │    START     │

&nbsp;           └───────┬──────┘

&nbsp;                   ▼

&nbsp;    ┌────────────────────────────┐

&nbsp;    │ Input num1, num2, operator │

&nbsp;    └──────────────┬─────────────┘

&nbsp;                   ▼

&nbsp;        ┌──────────────────┐

&nbsp;        │ Check operator   │

&nbsp;        └───────┬──────────┘

&nbsp;                ▼

&nbsp;    ┌─────────────────────┐

&nbsp;    │ + → add numbers     │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ - → subtract        │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ \* → multiply        │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ / → divide (check 0)│

&nbsp;    └───────────┬─────────┘

&nbsp;                ▼

&nbsp;     ┌──────────────────────┐

&nbsp;     │ Display the result   │

&nbsp;     └───────────┬──────────┘

&nbsp;                 ▼

&nbsp;     ┌──────────────────────┐

&nbsp;     │ Ask if user repeats  │

&nbsp;     └───────┬────┬─────────┘

&nbsp;             │yes │no

&nbsp;             ▼    ▼

&nbsp;     (go back)   END

&nbsp;           ┌──────────────┐

&nbsp;           │    START     │

&nbsp;           └───────┬──────┘

&nbsp;                   ▼

&nbsp;    ┌────────────────────────────┐

&nbsp;    │ Input num1, num2, operator │

&nbsp;    └──────────────┬─────────────┘

&nbsp;                   ▼

&nbsp;        ┌──────────────────┐

&nbsp;        │ Check operator   │

&nbsp;        └───────┬──────────┘

&nbsp;                ▼

&nbsp;    ┌─────────────────────┐

&nbsp;    │ + → add numbers     │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ - → subtract        │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ \* → multiply        │

&nbsp;    └─────────────────────┘

&nbsp;    ┌─────────────────────┐

&nbsp;    │ / → divide (check 0)│

&nbsp;    └───────────┬─────────┘

&nbsp;                ▼

&nbsp;     ┌──────────────────────┐

&nbsp;     │ Display the result   │

&nbsp;     └───────────┬──────────┘

&nbsp;                 ▼

&nbsp;     ┌──────────────────────┐

&nbsp;     │ Ask if user repeats  │

&nbsp;     └───────┬────┬─────────┘

&nbsp;             │yes │no

&nbsp;             ▼    ▼

&nbsp;     (go back)   END



