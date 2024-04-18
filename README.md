# ADP

This is a project for excercices for datastructures and algorithms.
It's managed with the Gradle build tool.

# Aufgabe 1

## Teil B.4
To create a pipeline for the output the project is compiled with gradle build first. Then change the directory to ./Aufgabe1b/build/classes/java and run the following command:
java NumberGenerator 1000 0 10| java NPlusEvenFilter | java AccumulatorClient 0 1000 10 > mean.txt