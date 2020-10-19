# CSX42: Assignment 1
## Name: Melissa Jones
-----------------------------------------------------------------------
-----------------------------------------------------------------------

Following are the commands and the instructions to run ANT on your project.
#### Note: build.xml is present in wordPlay/src folder.

-----------------------------------------------------------------------
## Instruction to clean:

####Command: ant -buildfile wordPlay/src/build.xml clean

Description: It cleans up all the .class files that were generated when you
compiled your code.

-----------------------------------------------------------------------
## Instruction to compile:

####Command: ant -buildfile wordPlay/src/build.xml all

Description: Compiles your code and generates .class files inside the BUILD folder.

-----------------------------------------------------------------------
## Instruction to run:

####Command: ant -buildfile wordPlay/src/build.xml run -Darg0="input.txt" -Darg1="output.txt" -Darg2="metrics.txt"

Note: Arguments accept the absolute path of the files.
Note: File must be stored in the wordPlay folder, which holds the src folder

-----------------------------------------------------------------------
## Description:

This is a program that takes an input file, an output file, and a metric
file. The input file should contain alphanumeric characters(a-zA-Z0-9),
spaces( ), and periods(.) as inputs and endline characters(\n). Three file
names must be provided to run the program. The output file will give the
words in the sentence provided reversed but maintain the sentence order.
The metrics file will show the average of words per sentence and characters
per sentence and the most frequent word and the longest word. The averages
in the metric file will be formatted to two decimal places.
Note: The following assumptions have been made
	1. If there is a newline character between alphanumeric characters
	and no space that input is for two words.
	2. If there is a period or newline between numbers it is two words.
	3. Sentences are terminated by a period if there is a space or newline
	character after that period the input is still valid, otherwise it is
	rejected.

Data structures used:
Stack: the stack has O(n) functions in the worst case so it is implemented for
its speed.
ArrayList: the arraylist has O(n) functions in the worst case so it is
implemented for its speed.
Array: the array has O(n) functions in the worst case so it is
simplicity.

-----------------------------------------------------------------------
### Academic Honesty statement:
-----------------------------------------------------------------------

"I have done this assignment completely on my own. I have not copied
it, nor have I given my solution to anyone else. I understand that if
I am involved in plagiarism or cheating an official form will be
submitted to the Academic Honesty Committee of the Watson School to
determine the action that needs to be taken."

Date: [2/6/2020]
