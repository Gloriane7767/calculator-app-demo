# Calculator Application — Java Fundamentals 1 Workshop

This project is a console-based calculator application built as part of the Java Fundamentals 1 Workshop. The goal is to practice basic Java concepts, user input handling, control structures, exception handling, and Maven project structure.

🚀 Features

✅ Core Requirements

* Created as a Maven project.

* Supports basic operations:
  
  - Addition
    
  - Subtraction
    
  - Multiplication
 
  - Division

Users can:

  - Enter two (or more) numbers.

  - Choose the desired operator.

  - View the calculated result.

* The application runs in a loop until the user chooses to exit.

* After each calculation, the user is given the option to:
  
  - Perform another operation

  - Exit the program

⭐ Optional Enhancements 

* Option for addition and subtraction to handle multiple operands.

* Exception handling for:

  - Invalid number input

  - Dividing by zero

  - Invalid operator

* JUnit tests for verifying:
  
  - Addition

  - Subtraction

  - Multiplication

  - Division


* Ability to add advanced mathematical operations, such as:
  
  - Square root

  - Power (xⁿ)

  - Modulo

  - Percentage

* Build a simple GUI version using:

  - Swing, or

  - JavaFX


📂 Project Structure (Example)

```
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
```


🧮 How the Application Works

1️⃣ Start the program

The user is welcomed and prompted to enter:

* The first number

* The second number (or more numbers, if supported)

* The operator (´+`, `-`, `*`, `/`)


2️⃣ Perform the calculation

The program evaluates the operation and prints the result.


3️⃣ Continue or Exit

After showing the result, the program asks:

´´´Do you want to perform another calculation? (y/n)```

* `y` → loops back

* `n` → program ends gracefully

📦 Running the Project

## Using Maven


```sh

mvn clean install

mvn exec:java -Dexec.mainClass="com.example.calculator.Main"

```

## Using IDE

* Import project as Maven project

* Run the Main class

🧪 Testing (Optional)

JUnit tests verify each mathematical operation:


```sh

mvn test
```

🎨 GUI Version (Optional)

A simple graphical calculator can be built using:

## Swing

Buttons for digits \& operations

   - Display field for results
   
## JavaFX

  - Modern UI
  - Layouts like GridPane for button arrangement

🌱 1. Algorithm 

1. Start

2. Ask the user to enter two numbers

3. Ask the user which operation they want (´+`, `-`, `*`, `/`)

4. Perform the chosen operation

5. Display the result

6. Ask the user if they want to calculate again

7. If yes, repeat from step 2; otherwise end

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
   result ← num1 + num2

ELSE IF op = "-"

   result ← num1 - num2

ELSE IF op = "\*"

   result ← num1 \* num2

ELSE IF op = "/"

   IF num2 = 0

       DISPLAY "Cannot divide by zero"

   ELSE

       result ← num1 / num2

   ENDIF

ENDIF

DISPLAY result

END

&nbsp;	```

```

🌱 3. Flowchart

```
           ┌──────────────┐

           │    START     │

           └───────┬──────┘

                   ▼

   ┌────────────────────────────┐

    │ Input num1, num2, operator │
    └──────────────┬─────────────┘
                   ▼

        ┌──────────────────┐

        │ Check operator   │

        └───────┬──────────┘

                ▼

    ┌─────────────────────┐

   │ + → add numbers     │

    └─────────────────────┘

    ┌─────────────────────┐

    │ - → subtract        │

    └─────────────────────┘

    ┌─────────────────────┐

    │ \* → multiply        │

    └─────────────────────┘

    ┌─────────────────────┐

    │ / → divide (check 0)│

    └───────────┬─────────┘

                ▼

     ┌──────────────────────┐

     │ Display the result   │

     └───────────┬──────────┘

                 ▼

     ┌──────────────────────┐

     │ Ask if user repeats  │

     └───────┬────┬─────────┘

             │yes │no

             ▼    ▼

     (go back)   END

           ┌──────────────┐

           │    START     │

           └───────┬──────┘

                   ▼

    ┌────────────────────────────┐

    │ Input num1, num2, operator │

    └──────────────┬─────────────┘

                   ▼

       ┌──────────────────┐

        │ Check operator   │

        └───────┬──────────┘

               ▼
    ┌─────────────────────┐

    │ + → add numbers     │

    └─────────────────────┘

    ┌─────────────────────┐

    │ - → subtract        │

    └─────────────────────┘

    ┌─────────────────────┐

    │ \* → multiply        │

    └─────────────────────┘

    ┌─────────────────────┐

    │ / → divide (check 0)│

    └───────────┬─────────┘

                ▼
     ┌──────────────────────┐

     │ Display the result   │

     └───────────┬──────────┘
                 ▼

    ┌──────────────────────┐
     │ Ask if user repeats  │

     └───────┬────┬─────────┘

            │yes │no

             ▼    ▼
     (go back)   END
```



