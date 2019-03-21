/*Introduction
Welcome to the Intro to Java: Functional Programming, Lesson 1 problem set! These
problem sets are an opportunity for you to practice the concepts you learned in class before
moving on to the next lesson. Learning a computer programming language is similar to
learning a human language. Nobody can pick it up overnight, there’s a lot of vocabulary
and syntax to remember. Language learners often speak of the moment when they realized
they stopped translating in their head and actually started thinking in their second language.
This will happen with Java too! Eventually, you will be able to consider a task that needs
coding and immediately imagine what Java code would complete it. To get there, though,
requires practice.
That’s where the problem sets come in. They aren’t mandatory, and they aren’t graded.
They’re just extra learning materials to help you along.
Completing the Problem Sets
There isn’t a right or wrong way to work on these. Some problems require you to examine
code or do some arithmetic. You can take notes on paper, print this document and use the
space provided, or try to do it all in your head—whatever works for you. For the exercises
that require programming, we highly recommend that you pick your favorite text editor,
open a blank text file, and try writing out the code. */

Question 1
Which of the following Java variable declarations has an error?
A. int x = 5;
B. double temperature = 75.6;
C. char grade = ’A’;
D. String name = ’Adam’;
//"D"

Question 1 Solution
D. String name = ’Adam’;
When defining Strings, we need to use double quotes around the text, like this:
String name = "Adam";
Single quotes are used for defining single characters, like this:
char grade = ’A’;

---

Question 2
What value for register will be printed at the end of this block of Java code?
double register = 10.0;
register = register + 5; //Customer pays $5.
register = register - 2.5; //Customer receives $2.50 as change.
register = register + 10; //Customer pays $10.
register = register - 3; //Customer receives $3 as change.
System.out.println(register);
A. 19.0
B. 19.5
C. 22.5
D. 25.5
//"B"

Question 2 Solution
B. 19.5
The register has a starting value of 10. Then 5 is added, so the variable’s new value is 15.
Then 2.5 is subtracted, giving the variable a new value of 12.5. Next, 10 is added, bringing
the value up to 22.5. Finally, 3 is subtracted, leaving a value of 19.5.

---

Question 3
Define an integer variable called bankBalance. Initialize it to a value of 500. Then add 250
to it. Then subtract 100 from it. Finally, print the resulting value.
//MY SOLUTION:
int bankBalance = 500;
bankBalance = bankBalance + 250;
bankBalance = bankBalance - 100;
System.out.println(bankBalance);

Question 3 Solution
Example solution code:
int bankBalance = 500;
bankBalance = bankBalance + 250;
bankBalance = bankBalance - 100;
System.out.println(bankBalance);

---

Question 4
What value will be printed by this line of Java code?
System.out.println(2.0 * (5 / 2));
A. 4
B. 4.0
C. 5
D. 5.0
E. This line of code will give an error.
//"B"

Question 4 Solution
B. 4.0
When evaluating the arithmetic expression 2.0 * (5 / 2), Java will evaluate the expression inside the parentheses, 5 / 2. When dividing two integers, Java will take ignore the
remainder, so 5 / 2 evaluates to the integer 2, not the double 2.5. This process is called
truncation. The second step in evaluating the expression is evaluating 2.0 * 2. When
multiplying a double and an integer, the result is a double, so the value printed is the double
4.0.

---

Question 5
Write Java code to define an integer variable called day, and a String variable called month.
Give month and day appropriate values for your birthday.
//MY SOLUTION:
int day;
String month;
day = 1;
month = "December";

Question 5 Solution
Example solution code:
int day;
String month;
day = 1;
month = "January";
//Note that this can be compressed into two lines by defining the
//variables and giving them an initial value at the same time:
int day = 1;
String month = "January";

---

Question 6
Write Java code to create a String variable called firstName, define it to be your first name
as a String. Then define a variable called lastName and define it to be your last name as a
String. Then define a variable called fullName and set it to be your first name followed by
a space followed by your last name. Use the existing variables for your first and last name
and String concatenation to define fullName. Finally, write code to print this text:
Hello, my name is [full name].
There are [number] letters in my name.
Use String concatenation to create the first String to print using the fullName variable, and
use the .length() command on firstName and lastName to calculate the number of letters.
Note: you can concatenate an integer and a String and the integer will be converted to a
String. For example, this expression:
"There are "+ 7 + "days in a week."
will be evaluated as the String:
"There are 7 days in a week."
//MY SOLUTION:
String firstName = "Tomas";
String lastName = "Novak";
String fullName = firstName + " " + lastName;
String printName = "Hello, my name is " + fullName ".";
int letters = firstName.length() + lastName.length();
String printLength = "There are " + letters + " letters in my name.";
System.out.println(printName);
System.out.println(printLength);


Question 6 Solution
Example solution code:
String firstName = "Asser";
String lastName = "Samak";
String fullName = firstName + " " + lastName;
System.out.println("Hello, my name is " + fullName + ".");
int lettersInName = firstName.length() + lastName.length();
System.out.println("There are " + lettersInName
+ " letters in my name.");

---

Question 7
Write Java code to define a double variable called fahrenheit and set it to an initial value
between 0 and 100. Then, create a double variable called celsius, and calculate its value
based on the value of fahrenheit. (To convert from Fahrenheit to Celsius, subtract 32,
then multiply by 5, then divide by 9.) Finally, print the final value of celsius.
//SOLUTION:
double fahrenheit = 33.5;
double celsius = ((fahrenheit - 32) * 5) / 9;
System.out.println(celsius);

Question 7 Solution
Example solution code:
double fahrenheit = 68.0;
double celcius;
celcius = (fahrenheit - 32) * 5 / 9;
System.out.println(celcius);
//With fahrenheit having a value of 68.0, this would print 20.0.
