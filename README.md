# Appium-EMI-Calculator-Automation

---
This is an EMI-Calculator app automation project. 
It uses a dataset to calculate the time period it will take to repay a loan, based on the loan amount, interest rate, EMI, and processing fee. 
The dataset includes different loan amounts with corresponding interest rates, EMIs, processing fees, and time periods.


---

#### Tools & Frameworks
|                          |                              |
|--------------------------|------------------------------|
| Programming Language     | **Java**                     |
| Web Automation Tool      | **Selenium**                 |
| App Automation Framework | **Appium**                   |
| Gui Inpector             | **Appium Inspector**         |
| Testing Framework        | **TestNG**                   |
| Build Tool               | **Gradle**                   |
| IDE                      | **IntelliJ, Android Studio** |
| Reporting Framework      | **Allure**                   |

#### Setups
* Install Android Studio
* Install Appium
* Install Appium Inspector
* Install JDK 8+
* Set the below environment variables

```shell
  * JAVA_HOME
  * GRADLE_HOME
  * ALLURE_HOME
```

#### How to run the project
* Clone the repo
* Open terminal. Start the appium server using below command.
```
appium -p 4723
```
* Open android studio
* Create a new virtual device.
* Start the emulator
* In the root folder give the following command in terminal.
```
gradle clean test
```


#### How to generate allure report
1. Open cmd in the root folder
2.  Give the following commands

```
allure generate allure-results --clean -o allure-report
```
```
allure serve allure-results
```
---


### Generated Reports
![image](https://user-images.githubusercontent.com/41513761/222879490-85fe4a30-6f29-4cd3-8d62-2eef38178270.png)
![image](https://user-images.githubusercontent.com/41513761/222879501-dfaaa167-580e-4ab5-9187-c58b71dbc098.png)
![image](https://user-images.githubusercontent.com/41513761/222879515-1865a4c6-63ca-44ab-b17b-67f38e83c2da.png)

#### Video Demonstration
https://user-images.githubusercontent.com/41513761/222880214-e0fab76b-f272-4a6c-a573-2fdb8bd25e9a.mp4


#### Feedback
If you have any feedback, please reach out to me at md.mostafa.akash@gmail.com
