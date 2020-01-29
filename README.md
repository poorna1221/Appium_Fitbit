# Appium_Fitbit


 Introduction

This project aim is to login to the Fitbit mobile app using appium. Two login flows are automated with Appium and cucumber BDD framework. 

1) Login to Fitbit app with invalid credentials and verify if the invalid username or password prompt is displayed.
2) Login to Fitbit app with valid credentials and verify if the user is able to successfully login to the app. 

 Assumptions

I assume following software's are installed on the machine where this project will be executed.

●	Java (Respective path,classpath and home variables are configured)
●	Android Studio (Respective path, and home variables are configured)
●	Appium
●	Eclipse
●	Create a virtual device with name PoornaEmulator
●	Fitbit app is installed in emulator(Open the virtual device and drag and drop the APK file to virtual device)

Steps for Executing the program:

●	Start Android studio
●	Start the created virtual device(name=poornaEmulator)
●	Navigate to command prompt start appium server with command as appium
●	Import the project folder after downloading from git hub into eclipse
●	Open the TestRunner Class-> Right Click-> Run as -> Junit test
●	Program will be executed on virtual device
●	Refresh the project-> Open the test-output folder in the project path in eclipse and open the index.html file for output report in cucumber framework.


Issue:

Unable to open the fitbit app with apk file with error message as incorrect app package and app activity.

Note: I have also recorded one video on how to execute the project and how to view the results.

