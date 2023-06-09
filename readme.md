# Programming-Languages-and-Paradigms
A repository for PLP, where source codes and notes are published
<br><br>

<details>
<summary> <b> Interpreted or compiled language? </b> </summary>

Python is an <b>interpreted</b> language, which means the source code of a Python program is converted into bytecode that is then executed by the Python virtual machine, all in one go, at the execution of the program.<br>
The <b>interpreter</b> executes the source code line-by-line without compiling it into machine-readable code beforehand. As a result, interpreted code runs slower than compiled code and doesn't generate a machine code file.

Python is different from major <b>compiled</b> languages, such as C++ and Java, as Python code is not required to be built and linked like code for these languages.

A compiled language is one which source code (program) is converted to assembly language (machine code) by a <b>compiler</b> first. This makes going from writing the program to its execution in two steps: 1. Compilation, 2. Execution.<br>
Compilers play a critical role in the development process because they help catch syntax and semantic errors before we run the code, which saves time and prevents crashes. Compilers also optimize the code for efficient execution and produce faster, more compact programs.
</details>

[What is a compiler?](https://builtin.com/software-engineering-perspectives/compiler)

<br>

<details>
<summary> <b> Dynamically Typed or Statically Typed? </b> </summary>

Python is dynamically typed, which means that variable types are resolved at runtime, during execution. They are totally inferred (check out Type Inference). You can assign values of different types to the same variable without explicitly specifying the type. An example:

```python
variable = 10 
variable = "Hello, world!" #This is no problem at all
```
On the other hand, C++ is statically typed, where variable types are checked at compile time, by the compiler, way before execution. You need to declare the type of each variable explicitly and cannot change it later, otherwise it will generate a type error at compile time. Example:

```cpp
int x = 3;
string s = "Hello World";
x = "Changing type!" // Compile-time error
```
</details>

[Introduction to Data Types: Static, Dynamic, Strong & Weak](https://www.sitepoint.com/typing-versus-dynamic-typing/)

<br>

<details>
<summary> <b> Why static typing? </b> </summary>

A first advantage is <b>early error detection</b>: With static typing, type checking is performed at compile time. <br>
This means that many type-related errors, such as mismatched assignments, invalid method calls, or incompatible operations, are caught before the program is executed.<br>
This early error detection helps identify and fix issues early in the development process, reducing the likelihood of runtime errors. In other words, it provides a safety net by catching type-related errors early, reducing debugging time, and ensuring more robust code integration in large-scale development environments.

Another one is <b>improved code readability and maintainability</b>: Explicitly declaring the types of variables, function parameters, and return values in statically typed languages makes the code more self-documenting. It enhances code readability and helps other developers understand the expected data types, leading to better collaboration and maintenance.

However, you might have observed it comes with trade-off in terms of increased verbosity (specifying types again and again) and potential restrictions on flexibility, especially in scenarios where dynamic typing may be more suitable, such as rapid prototyping or certain scripting tasks. The choice between static and dynamic typing depends on the specific requirements and trade-offs of a given project.
</details>

<br>

<details>
<summary><b>Some trade-offs of compiled languages</b></summary>

Firstly, <b>compilation time</b>: Compiled languages typically require a compilation step before the code can be executed, which we discussed earlier. This compilation process can take longer, especially for large projects or complex codebases. Developers may experience increased iteration time when making changes to the code, as each modification requires recompilation.

Second, <b>platform dependencies</b>: Compiled languages often generate platform-specific machine code during the compilation process. As a result, the compiled executable or binary may not be directly compatible with different platforms or operating systems. Separate compilations or modifications may be necessary to target specific platforms. For example, a C++ code compiled on Windows won’t be compatible with Linux. To run the code on Linux, it should be recompiled adequately (by compiling it on a Linux machine or by using some tool).

</details>

<br>

<details>
<summary><b>What is Java?</b></summary>

Java is a high-level, general-purpose programming language that was originally developed by Sun Microsystems (now owned by Oracle Corporation) and released in 1995. It is designed to be platform-independent, allowing developers to write code once and run it on any platform that supports Java.
</details>

<br>

<details>
<summary><b>Java between compilation and interpretation: a hybrid language</b></summary>

A Java source code is actually compiled beforehand, like C++. But here comes a small discrepancy… we just said compiled languages usually generate platform-specific machine code, so how can it be platform-independent?

In fact, Java is a <b>hybrid language</b>, between compiled (like C++) and interpreted (like Python).

Developers write the source code in Java, which is typically saved with a .java extension.

The source code is processed and <b>compiled into bytecode</b>, a higher-level representation than assembly code representation of Java code, that is designed to be platform-independent. The compiler, typically like any compiler’s main functionalities, performs various tasks, including syntax and type checking. The bytecode is stored in .class files, which are platform-independent binary files.

At this step, a Java Virtual Machine (JVM), which is installed on the machine, is responsible for executing the bytecode. The JVM here acts as an <b>interpreter</b> or a just-in-time (JIT) compiler (check it out), depending on the JVM implementation, which is platform dependent.

The JVM abstracts the underlying hardware and operating system, providing a uniform execution environment for Java programs. Each platform (Windows, macOS, Linux, etc.) has its own implementation of the JVM, tailored for that specific platform.

That way, the compilation disadvantage of non-portability (platform dependency after compilation), is resolved! <br>
<b>Compile once, run anywhere.</b> You will find the notion of portability everywhere with Java developers!

<img src="/resources/Platform Independence in Java.jpeg" width="350" title="Platform Independence in Java" alt="Platform Independence in Java">

</details>

<br>

<details>
<summary><b>Write, compile, and execute Java code</b></summary>

First, head to the [Oracle website](https://www.oracle.com/java/technologies/downloads/#java17) to download the Java Development Kit (JDK) with regard to your operating system. Java 17 is recommended.

Tools to compile and execute are in the kit, including the JVM.
Your source code file must have a <i>.java</i> extension. The <i>javac yourFileName.java</i> command compiles <i>yourFileName.java</i> and creates the <i>yourFileName.class</i> file, which is the bytecode as mentioned earlier.
To run it, just use the command <i>java yourFileName</i> (with no extension).
Keep in mind that every change to the source code requires a new compilation before running, otherwise changes won't be integrated in the executed bytecode.

Among great Integrated Development Environments (IDEs) are [Eclipse](https://www.eclipse.org/downloads/) and [IntellijIDEA Ultimate](https://www.jetbrains.com/idea/business/) (you can get the Ultimate version by using your university mail, creating a student account at JetBrains). You could also use any editor like [VSCode](https://code.visualstudio.com/), which proposes many extensions for Java.

The commands mentioned are evidently to use in a command prompt or terminal. However, IDEs and some code editors' extensions allow you to compile and run your code in a simple click.

</details>

