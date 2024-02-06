#! /bin/bash

javaac welcomeTP.java
java -cp . welcomeTP
jar cfmv welcomeTP.jar Manifest.txt welcomeTP.class
java -jar welcomeTP.jar
