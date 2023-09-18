# Automation

[![Appium CI](https://github.com/tassioplima/miniSDK/actions/workflows/browserstack.yml/badge.svg)](https://github.com/tassioplima/miniSDK/actions)
[![Allure Report](https://img.shields.io/badge/Allure%20Report-deployed-yellowgreen)](https://tassioplima.github.io/miniSDK/)

#### Description:

Automation project with Java + Gradle using Browser Stack as a Device Farm and GitHub Action (CI) to automate the Automation App, GithubPages to deploy Allure Serve to see test results/report, PageObject/Screen and PageFactory as a structure.

### Getting Started:

#### Configuration:

- Java JDK 1.8
- Gradle 8.3
- Android SDK updated
- Android Emulator or physical device
- iOS Simulator or physical device
- Appium Server 2.0 installed https://bitrise.io/blog/post/getting-started-with-appium-2-0-your-beginners-guide
- Browser Stack Account and Keys
- Browser Stack Account and Keys


Running: (need the Appium server running):

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

We have 3 possibilities for executing the tests locally, remotely, or via device farm, setting the variable RUN to, local, remote or farm.

local = execute locally on physical devices.
remote = run using variables from the GitHub Action, recommended for CI executions.
farm =  you can execute setting some variables on remote.json and execute from your computer to a device farm.

Running on CI:

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android -DRUN=remote
```

Running locally:

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android -DRUN=local
```

Running on device farm:

``` sh
./gradlew test --tests "AppTest" -DMOBILE=android -DRUN=farm
```

### Building Allure report

To build a report, and browse it use the following command:

``` sh
./gradlew allureServe
```

GitHub Pages with Allure report results: [ALLURE](https://tassioplima.github.io/miniSDK/)

![img.png](img/img.png)
