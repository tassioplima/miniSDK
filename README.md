# Automation


[![Appium CI](https://github.com/tassioplima/miniSDK/actions/workflows/browserstack.yml/badge.svg)](https://github.com/tassioplima/miniSDK/actions)
[![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)](https://tassioplima.github.io/miniSDK/)
#### Test solution: 

We can do manual and automation tests for this solution because both is a good solution to validate the feature, we can do integration tests and regression test, first of all starting doing manual tests to understand if everything is working properly in case the find some bug need to be validated with QA and Dev team, understand the cause and the solution for a future correction, after all the validation we will start with select the framework to create automation script,
in this case I used to use appium because is a flexible solution to automate Android and iOS application, as well we have other tools to help with this, GitHub Actions to create CI/CD, BrowserStack to integrate with device farms, and Allure to get report.

The test "Validate change of banner status" is not running properly because the "closeButton" for the Banner cannot be found  


Automation project with Java + Gradle using Browser Stack as a Device Farm and GitHub Action (CI) to automate the Automation App, GithubPages to deploy Allure Serve to see test result/report, PageObject/Screen and PageFactory as a structure.

### Getting Started:

#### Configuration:

- Java JDK 1.8
- Android SDK updated
- Android Emulator or physical device
- Appium Server installed 
- Browser Stack Account and Keys
- Browser Stack Account and Keys

Running: (need the appium server running):

``` sh
./gradlew test --tests "AppTest"
```

You can run with different devices like iOS and Android using properties when running this command line:

Android:

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android
```

iOS:

``` sh
./gradlew test --tests "AppTest" -DMOBILE=ios
```
We have two possibilities for execution the local one and the remote, using the property boolean false or true you can setup on cli command


true = execution using  remote.json and runs on Browser Stack using some secrets keys on github repository

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android -DEXEC=true
```

false = execution using local.json  properties locally

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android -DEXEC=false
```

### Building Allure report

To build a report, and browse it use the following command:

``` sh
./gradlew allureServe
```

Github Pages with Allure report results: [ALLURE](https://tassioplima.github.io/miniSDK/)

![img.png](img/img.png)