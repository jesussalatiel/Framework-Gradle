# Solution: Cucumber-Java-Page-Factory Template
#### with Cucumber-java, Cucumber Spring, custom annotation @PageObject, lambda expression ready, Selenium PageFactory and webdriver manager (Selenium WebDriver) for:
* ##### Chrome
* ##### Firefox
* ##### Android
* ##### RestAssured


### Prerequisites
* [Gradle for Windows](https://gradle.org/next-steps/?version=7.4.2&format=bin)
* Cucumber for Java plugin for IntelliJ
* [Healenium](https://github.com/healenium/healenium-backend)
* [Docker/Compose](https://docs.docker.com/desktop/install/windows-install/)
* [Java 11](https://www.oracle.com/mx/java/technologies/javase/jdk11-archive-downloads.html)

### Initial
* clone repository
* open build.gradle file in IDE (IntelliJ)
* import dependencies with gradle

### How to use PageFactory annotations (@FindBy etc.)
Extend page object class / classes with BasePage class and add annotation: @PageObject. Create methods with @FindBy etc. annotations.

###### Example in template:
```
@PageObject
public class ActionPageObjects extends BasePage {

    public ActionPageObjects(WebDriverManager webDriverFactory) {
        super(webDriverFactory);
    }

    @FindBy (how= How.CSS,  using=".Header-nav-item[href*=jam]")
    private WebElement menuJam;

    public void clickJamMenu() {
        menuJam.click();
    }
}
```

### Custom annotation @PageObject
Add @PageObject in page object classes instead of Spring @Component annotation

### Lambda expression ready
Steps classes implements En interface and are prepared to use code by 'lambda-way'. Example of lambda expression is used in SignUpFormPageObjects class:
```
    private void sendKeysForInputWithAttributeName(String partValueName, String keyToSend){
        webDriverFactory.getDriver().findElements(By.cssSelector(USER_INPUT))
                .stream()
                .filter(elem->elem.getAttribute(USER_INPUT_ATTRIBUTE_NAME).contains(partValueName))
                .findFirst()
                .get()
                .sendKeys(keyToSend);
    }
```

### Customise Cucumber tests
* add your .feature files with scenarios
* create custom steps class / steps classes with @Autowired annotations for page objects class / classes
* generate steps- in .feature file press 'alt+enter' shortcut and choose 'Create step definition' option, choose created steps class / steps classes to paste steps
* create custom page objects classes with methods and with @Component and @Autowired annotations for webdriver manager
* to use PageFactory, extend page object class / classes with BasePage class and add annotation: @PageObject
* create assertions classes with methods and @Component annotation
* delete example .feature files, steps classes, page objects classes and assertion classes

### How to run tests:
#### With gradle command:

###### To run Cucumber tests with custom runTests task and with default browser, type:
```
'runTests'
 ```

###### To run Cucumber tests with custom runTests task and with chosen browser, type:
```
 '-Dbrowser=chrome runTests'
 ```
 ```
 '-Dbrowser=firefox runTests'
 ```
 ```
 '-Dbrowser=chromeHeadless runTests'
 ```
 ```
 '-Dbrowser=iexplorer runTests'
 ```

###### To run Cucumber tests with default browser, type:
```
'clean test'
```

###### To run Cucumber tests with chosen browser, type:
```
'clean -Dbrowser=chrome test'
```
```
'clean -Dbrowser=firefox test'
```
```
'clean -Dbrowser=chromeHeadless test'
```
```
'clean -Dbrowser=iexplorer test'
```

#### With IDE (JUnit):
```
run CucumberRunner class
```
```
or run .feature file / directory with .feature files / scenario in .feature file
```

###### To run [Docker Compose Plugin](https://github.com/avast/gradle-docker-compose-plugin)
```
'./gradlew composeDown'
'./gradlew composeUp'
```

### Reports and screenshots
Reports are placed in 'target' directory, including screenshots of failed scenarios.
To run report in browser, open 'target\html\index.html' file and choose browser.

### Gradle custom tasks
* runTests
* deleteCucumberReports

### Common Issues

##### Password Jenkins
```
docker exec -it <container_name> bash
cat /var/jenkins_home/secrets/initialAdminPassword
```