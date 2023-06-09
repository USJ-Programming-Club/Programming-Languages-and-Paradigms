### Static typing in Java:
  - Primitive types are built-in in Java (int, boolean, char...)
  - Classes, which always inherit the Object class (the superclass of all classes)
    N.B. Boxed types which are classes that represent the primitive types but with methods,
         since primitive types can't have methods (Integer, Boolean, Character...)
    Warning: String is a class!

### Syntax comparison with C++:
  - Generics, unlike C++ templates, is only about **type** parameters  
C++ has also class parameters
  - Cannot use primitive types
  - Very simple syntax  
C++ is more complex

### How do generics work?
  - Generate only one compiled version of a generic class or function  
C++ generates as many as necessary at compile-time, each with a different generic type
  - Type erasure: Type becomes Object at compile-time after type-correctness check  
=> type parameters cannot be determined at run-time, which generates problems (see code)

#### Wildcards, upper and lower bounds (*extends* and *super* keywords), for more restrictions on types;

For more, check out **covariance** and **contravariance** features.

C++ templates are way more robust and advanced. 
Check out [CppCon](https://www.youtube.com/@CppCon) on YouTube for basic and advanced features, including templates.