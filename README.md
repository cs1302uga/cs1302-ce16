
# cs1302-ce16 Gnarly to the Max | cs1302-demo (lambdas)

![Approved for: Spring 2020](https://img.shields.io/badge/Approved%20for-Spring%202020-blue)
 ![Approved for: Live Code](https://img.shields.io/badge/Approved%20for-Live%20Code-red)

> To my mind, the life of a *lambda* is no less precious than that of a human being.
> **--Dr. Supa' Mike, trying to quote Mahatma Gandhi.**

This class exercise explores functional interfaces and lambda expressions in
conjunction with generic methods and interfaces.

## References and Prerequisites

* [`ArrayUtility` API Documentation](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/index.html)
* [Oracle: Generic Methods](https://docs.oracle.com/javase/tutorial/extra/generics/methods.html)
* [Oracle: Bounded Type Parameters](https://docs.oracle.com/javase/tutorial/java/generics/bounded.html)

## Questions

In your notes, clearly answer the following questions. These instructions assume that you are 
logged into the Nike server. 

**NOTE:** If a step requires you to enter in a command, please provide in your notes the full 
command that you typed to make the related action happen. If context is necessary (e.g., the 
command depends on your present working directory), then please note that context as well.

### Getting Started

1. Use Git to clone the repository for this exercise onto Nike into a subdirectory called `cs1302-ce16`:

   ```
   $ git clone --depth 1 https://github.com/cs1302uga/cs1302-ce16.git
   ```

1. Change into the `cs1302-ce16` directory that was just created and look around. There should be
   multiple files contained within the directory structure. To see a listing of the files needed 
   for this exercise, execute the find command on the `lib` and `src` subdirectories as follows:
   
   ```
   $ find src
   $ find lib
   ```

### Exercise Steps

1. The API documentation for the compiled code contained in the `cs1302-ce16.jar`
   file can be found [here](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/index.html).

1. Examine the [`ArrayUtility.sort(T[])`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce15-api/cs1302/util/ArrayUtility.html#sort-T:A-)
   and 
   [`ArrayUtility.max(T[])`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#max-T:A-)
   methods in the `cs1302.util.ArrayUtility` API documentation. Actually read the documentation.
   In your notes, indicate the potential type arguments (replacements) for `T` for each method.
   
1. Inspect the `Student`, `Course`, and `Driver` classes provided under the `src` directory.
   Let's try to sort and find a maximal element of the `students` and `courses` arrays 
   declared in `Driver` using the two methods you inspected in the previous step.
   But first, for each of the four possibilities in the table below, indicate
   a guess in your notes as to whether or not it will work. Then, try each possibility
   independently to confirm your guess. 
   
   * If a possiblility **does work**, then add code to the `Driver` class that demos how it 
     works in a meaningful way. What is "a meaningful way"? You need to make the code, 
     documentation, and the printout clear such that anyone who is reading it can understand 
     what is going on. Simply calling the method with no output and showing that it compiles
     is not sufficient.

   * If a possiblility **does NOT work**, then note why it doesn't work. 
   
   Here is a table to help you keep track of the different combinations.
   
   | Class     | `sort(T[])` | `max(T[])` |
   |-----------|-------------|------------|
   | `Course`  |
   | `Student` |
   
1. Stage and commit all changes you made for this checkpoint.

**CHECKPOINT**
   
1. Examine the [`ArrayUtility.sort(T[], Comparator<T>)`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#sort-T:A-java.util.Comparator-)
   and 
   [`ArrayUtility.max(T[], Comparator<T>)`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#max-T:A-java.util.Comparator-)
   methods in the `cs1302.util.ArrayUtility` API documentation. Actually read the documentation.
   In your notes, indicate the potential type arguments (replacements) for `T` for each method.

1. The methods you examined in the previous step make use of the `Comparator<T>` interface
   to facilitate internal comparisons when needed. Unlike the overloads you examined in the
   first checkpoint, these "comparator" versions are more flexible as they allow the user
   of the method to specify their preferred induced ordering on the fly __without modifying the classes__
   of the objects being sorted. Isn't that cool?
   
1. Without modifying the `Student` class, update the `Driver` class to sort the
   `students` array by each student's name. For this step, explicitly create a
   `NameComparator` class that properly implements `Comparator<Student>`. Your
   call to `sort` in the driver should use an objet of this class for its
   comparator.
   
1. Stage and commit all changes you made for this checkpoint.

**CHECKPOINT**
   
1. "Flex your lambda muscles" 💪💪💪

1. Creating a separate comparator class is definitely useful if the comparator logic is
   complicated and/or if you plan to use the comparator often. However, if the logic is
   simple, then lambda expressions are preferrable because they allow you to focus on the
   logic of the interface method itself and not all the boilerplate (i.e., the extra stuff) 
   that is required when implemeting an interface in a separate file.
   
1. Now, without modifying the `Student` class, update the `Driver` class to clearly 
   demo the following using lambda expressions (please stage and commit after each):
   1. Add references to `Course` objects to the `courses` array with different `prefix` values (i.e. 
      create new objects that have prefixes other than "CSCI" and add them to the array), then sort 
      the `courses` array by `prefix`.
   1. Take the `courses` array sorted in the previous sub-step and sort them by `number`.
   1. Find and print the max `Student` in the `students` array according to GPA.
   1. Find and print the max `Student` in the `students` array according to the second
      character in their name.
   1. Something cool / interesting that hasn't been mentioned.
   
1. Stage and commit all changes you made for this checkpoint.

**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
