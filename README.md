
# cs1302-ce16 Gnarly to the Max

> (Sends Dancing Hot Dog Meme)
> Hotdogs are generic.
> You have: bagel dogs, brat dogs, cheese dogs, chicago dogs, chili dogs, coney dogs, corn dogs (?), etc.
> **--Dr. Supa' Mike, after a 12 hour work day.**

This class exercise continues coverage of generic methods, including some checkpoints related to
upper bounds. 
It also provides a small demonstration of branching and merging using Git.

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
   multiple Java files contained within the directory structure. To see a listing of all of the 
   files under the `src` subdirectory, use the `find` command as follows:
   
   ```
   $ find src
   ```

### Exercise Steps

1. There is a `cs1302-ce15.jar` in the `lib` subdirectory. 
   The API documentation for the compiled code contained in this
   file can be found [here](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/index.html).

1. Examine the [`ArrayUtility.sort(T[])`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce15-api/cs1302/util/ArrayUtility.html#sort-T:A-)
   and 
   [`ArrayUtility.max(T[])`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#max-T:A-)
   methods in the `cs1302.util.ArrayUtility` API documentation. Actually read the documentation.
   In your notes, indicate the potential type arguments (replacements) for `T` for each method.
   
1. Inspect the `Student`, `Course`, and `Driver` classes provided under the `src` directory.
   As written, can you sort and find a maximal element of the `students` and `courses` arrays 
   using the methods that the exercise had you inspect in the previous step?
   Try it! For each of the four possibilities, indicate
   a guess in your notes as to whether or not it will work. Then, try each possibility
   independently to confirm your guess. 
   
   * If a possiblility **does work**, then add code to the `Driver` class that demos how it 
     works in a meaningful way. 
   * If a possiblility **does NOT work**, then note why. 
   
   Here is a table to help you keep track of the
   different combinations.
   
   | Class     | `sort(T[])` | `max(T[])` |
   |-----------|-------------|------------|
   | `Course`  |
   | `Student` |
   
   **What is "a meaningful way"?** You need to make the code, documentation, and the printout clear such that 
   anyone who is reading it can understand what is going on.

1. Stage and commit all changes.

**CHECKPOINT**
   
1. Examine the [`ArrayUtility.sort(T[], Comparator<T>)`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#sort-T:A-java.util.Comparator-)
   and 
   [`ArrayUtility.max(T[], Comparator<T>)`](http://cobweb.cs.uga.edu/~mec/cs1302/cs1302-ce16-api/cs1302/util/ArrayUtility.html#max-T:A-java.util.Comparator-)
   methods in the `cs1302.util.ArrayUtility` API documentation. Actually read the documentation.
   In your notes, indicate the potential type arguments (replacements) for `T` for each method.

   
**CHECKPOINT**

<hr/>

[![License: CC BY-NC-ND 4.0](https://img.shields.io/badge/License-CC%20BY--NC--ND%204.0-lightgrey.svg)](http://creativecommons.org/licenses/by-nc-nd/4.0/)

<small>
Copyright &copy; Michael E. Cotterell, Brad Barnes, and the University of Georgia.
This work is licensed under a <a rel="license" href="http://creativecommons.org/licenses/by-nc-nd/4.0/">Creative Commons Attribution-NonCommercial-NoDerivatives 4.0 International License</a> to students and the public.
The content and opinions expressed on this Web page do not necessarily reflect the views of nor are they endorsed by the University of Georgia or the University System of Georgia.
</small>
