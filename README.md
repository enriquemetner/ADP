# ADP

This is a project for excercices for datastructures and algorithms.
It's managed with the Gradle build tool.

# Aufgabe 1

## Teil B.4
To create a pipeline for the output the project is compiled with gradle build first. Then I change the directory to ./app/build/classes/java and run the following command:
java adp.aufgabe1.teilB.NumberGenerator | java adp.aufgabe1.teilB.NPlusEvenFilter | java adp.aufgabe1.teilB.AccumulatorClient 0 1000 10 > mean.txt
