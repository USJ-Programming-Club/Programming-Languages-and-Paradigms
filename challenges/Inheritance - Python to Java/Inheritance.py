class Person:
    
  def __init__(self, name, age):
    self.name = name 
    self.age = age
    self.knowledge = 100
  
  def __str__(self):
    return "Hey, I'm a simple GenericClasses.Person. My name is " + self.name + " and I'm " + str(self.age) + " years old."

'''
In JAVA:

Recreate this class, and create a class GenericClasses.Student that inherits GenericClasses.Person and has an additional int attribute "ID";
Override the __str__ method (search for its equivalent in Java!) which mentions the GenericClasses.Student status and the ID;
Create a study() method, in the GenericClasses.Student class, that increases the knowledge.

'''