#set page(
  paper: "a4",
  margin: (x: 1.8cm, y: 1.5cm),
)
#set text(
  size: 13pt,
  font: "New Computer Modern"
)
#show title: set text(size: 20pt)
#show title: set align(center)
*Name*: Akshay Galipalli \
*Roll no*: 25MCCE28
#title[
  OOPS Assignment 7 \
]

1. Try out all the code demonstrated in the lectures.
#image("one.png")
2. Create a class named Employee with an integer field id. You can also have other fields of your interest. The class should have proper constructors and get/set methods.
a. Override the finalize() method in the Employee class so that it prints:
"Employee [id] is being garbage collected!". \
b. Properly override the equals() method of the Object class in the Employee class.
(1 point)\
c. Have a client class and in the main method of it, create 3 employees.\
i. Read the details of all the employees from the java command-line
arguments. (1 point)
  \1. Note: Integer.parseInt() is a built-in static method used to convert a String into a primitive int data type.\
ii. Have the necessary validations in the code. (1 point)\
d. Demonstrate one of the employees being garbage collected. (1 point)\
#image("two.png")
#image("two1.png")
// #pagebreak()
3. We are building a backend for a smart home system. You have an outer class representing a
SmartHouse and a tightly coupled inner class representing a SmartThermostat. (2 points)
a. Let SmartHouse have houseName and currentTemperature variables. Have
relevant constructors and get/set methods.
b. Create the non-static inner class SmartThermostat.
c. Write a method called adjustTemperature(int targetTemp) in the
SmartThermostat class
i. This method should directly modify the outer class's currentTemperature
variable and print out a confirmation message such as: "[houseName]
Thermostat: Changing temperature from X°C to Y°C."
d. Demonstrate all the features in the client/Main class.
#image("three.png", width: 80%)
4. You are tasked with building a control subsystem for an advanced, modern Smart Robot Device.
This device needs to handle distinct functionalities such as charging power, processing logic, and
environmental clean-up. \
a. First setup the interfaces. (1 point) \
#block(inset: (left: 2em))[
  i. Create a base interface named PowerDevice with an abstract method void
  turnOn() and a default void checkBattery() method that prints "Battery
  status: Good".\
  ii. Create another base interface named SmartDevice with an abstract
  method void connectToWiFi().\
  iii. Create a third interface named AmphibiousCleaner that extends both
  PowerDevice and SmartDevice. Add a new abstract method void
  deepClean().\
]
b. Create a concrete class named SmartRobotVacuum that implements both
PowerDevice and SmartDevice directly. (1 point)\
#block(inset: (left: 2em))[
  i. Provide concrete implementations for turnOn() and connectToWiFi() that
  print distinct status actions.\
]
c. Have a client/main class and in the main method do the following. (2 points)\
#block(inset: (left: 2em))[
  i. Create an anonymous class that implements AmphibiousCleaner.\
  1. Override the default checkBattery() method to provide custom
  behaviour. \
  ii. Instantiate the anonymous class of the AmphibiousCleaner interface on the
  fly without declaring a separate physical class file.\
  1. Implement all required inherited abstract methods inside this anonymous block.
  iii. Call all the methods (turnOn(), connectToWiFi(), deepClean(), and your
  overridden checkBattery()) to verify your architecture works.
]
#image("four.png")
