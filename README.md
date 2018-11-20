This is a "Turtle Run" Game demo to simulate a status of turtle run in a given matrix.

We have several conditions and rules for the design.

The world is a rectangular grid (N x M). A position is an integer couple (x,y). It is not possible to go beyond the limits of the world.

The turtle is located in this world. It can only receive 3 different commands:

Go forward 1 or more steps

Turn left

Turn right 

<h4>1. Model everything</h4>
Write a sample program that executes an hardcoded list of commands. Use a log system to track the state of the turtle.

<h4>2. World changes</h4>
Specs changes ! The world has restricted zones where the turtle cannot go. Restricted zones are a list of rectangular shapes.

<h4>3. Automation and configuration</h4>
Turtle instructions are now listed using a standard-formatted file.
Also the world must be configurable using a configuration file.

The file format is completely open as long as it is easily readable by any other program (e.g. properties, json, csv...).

Instructions
The test is simple therefore we will be very critical on the code quality (modelization, comments, reusability, ...)
Unit tests are required
Your project must have a toolchain (maven, ivy or gradle)
It is recommended to use java8 but not mandatory
You can use the internet
You can’t use 3rd party libraries except for reading/writing formatted file and unit tests