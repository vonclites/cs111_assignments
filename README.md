# cs111_assignments

## Download the assignments
First, press Ctrl+ALT+T to open a terminal.

In the terminal, you start in your "home" directory. Let's create a new directory to contain your code.
Type
```bash
mkdir code
```
Now, change your current directory to the new code directory by typing:
```bash
cd code
```
Within this directory, we will create another folder specifically for our lab assignments by downloading this github repository. You can also create other directories for other coding projects you may undertake.

For now, let's download the cs111_assignments repository into the code directory. This process is called "cloning."
Type
```bash
git clone http://github.com/vonclites/cs111_assignments
```
You should now have a local copy of the cs111_assignments git repository.
In the terminal, enter the cs111_assignments directory and list the contents by typing
```bash
cd cs111_assignments
ls
```
As a tip, you can press the TAB key to autocomplete certain commands.  This is particularly useful when typing filepaths, as it provides you with validation that the filepath exists if autocomplete is successful, or conversely that the filepath does not exist if autocomplete fails. For example, try typing '**cd as**' and then, without pressing Enter, hit the TAB key. If you are inside the cs111_assignments directory, the command should autocomplete to **cd assignment1**.

## Setup Eclipse for Assignment 1

Start Eclipse and set your workspace to the cs111_assignments directory.

Now we will have Eclipse create a new project based on the contents of the assignment1 folder inside the cs111_assignments directory. 

To do this, in Eclipse, click _File -> New -> Java Project_.

Enter **assignment1** as the Project name. (assignment1 must be typed exactly as is - lowercase, no spaces).
Click Finish.

In the assignment1 directory, you will find the data file for the assignment under the data/ directory, as well as further instructions and tips under the instructions/ directory. 

Under the src/ directory, in the default package, are two files.  Assignment1.java is a mostly-written main function you can use to test the modules you will be writing. ReadIntsExample.java is a file which contains useful example code for reading data from a file.

The er\_data/ directory is a "package" or collection of Java classes which work together as a library of functions.  The "modules" in this package provide a related set of utilities for accomplishing a task. The two modules are ERDataAnalyzer.java and ERDataReader.java. However, these modules are incomplete.  Your task for Assignment 1 is to complete their implementations.  See the lab_assignment\_1\_instructions.pdf for further details.




