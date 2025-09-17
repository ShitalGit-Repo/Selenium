# 🚀 Selenium 4.x Learning Repository

This repository documents my **learning journey with Selenium 4.x** and serves as a hands-on implementation space for web automation concepts.

The content is based on **The Testing Academy (Pramod)** notes and practical assignments.

---

## 📌 Goals

* Learn Selenium 4.x fundamentals.
* Implement end-to-end test automation examples.
* Explore advanced topics like **Grid, Docker, POM, Apache POI, Shadow DOM, and Jenkins CI/CD**.
* Build a reusable framework with **Maven, TestNG, and Allure reports**.

---

## 📂 Repository Structure

```
selenium-4-learning/
│── notes/                 # Personal notes & references  
│── basics/                # First scripts, browser setup, navigation  
│── locators/              # ID, Name, CSS, XPath, etc.  
│── waits/                 # Implicit, Explicit, Fluent waits  
│── actions/               # Mouse, Keyboard, Drag & Drop, Alerts, Windows, Iframes  
│── assignments/           # Practice tasks (VWO login, etc.)  
│── pom-framework/          # Page Object Model implementation  
│── data-driven/            # Apache POI Excel data testing  
│── grid-docker/            # Selenium Grid & Docker setup  
│── reports/                # Allure / Extent reports  
│── ci-cd/                  # Jenkins pipelines & integrations  
│── README.md              # Project overview (this file)  
```

---

## ⚙️ Tech Stack

* **Java 11+**
* **Selenium 4.x**
* **Maven**
* **TestNG**
* **Allure Reports**
* **Apache POI** (for Excel-driven testing)
* **Jenkins** (CI/CD)
* **Docker + Selenium Grid**
* **BrowserStack** (Cloud testing)

---

## 🚦 Learning Path (Step-by-Step)

1. **Setup & First Script**

    * Install Java & IDE (IntelliJ/Eclipse).
    * Configure Maven project.
    * Run first Selenium test with `ChromeDriver`.

2. **Selenium Basics**

    * WebDriver architecture.
    * Navigation & browser commands.
    * Locators (ID, Name, CSS, XPath).

3. **Advanced Locators & Waits**

    * Mastering XPath & CSS Selectors.
    * Implicit, Explicit, Fluent waits.

4. **Web Interactions**

    * Dropdowns, Alerts, Checkboxes, Radio buttons.
    * Web Tables.
    * Actions class (keyboard/mouse).
    * Windows & Iframes.

5. **Framework Concepts**

    * Page Object Model (POM) vs Page Factory.
    * Data Driven Testing with Apache POI.
    * Logging (Log4j).
    * Exception handling.

6. **Execution & Scaling**

    * Selenium Grid 4.x.
    * Running on Docker.
    * Cloud testing (BrowserStack).

7. **CI/CD & Reporting**

    * Allure Reports integration.
    * Jenkins automation pipelines.
    * GitHub integration.

---

## 📊 Assignments & Projects

* ✅ Automate VWO Login Page (Valid/Invalid logins).
* ✅ Capture error messages.
* ✅ Handle dynamic dropdowns, SVG, and Shadow DOM.
* ✅ Build reusable test framework.
* ✅ Run on Selenium Grid + Docker.

---

## 📸 Reports & Screenshots

Allure and Extent reports will be stored in the `reports/` directory.
Example:

```bash
mvn clean test
allure serve reports/
```

---

## 🤝 Contributions

This repository is for personal learning. If you spot improvements or want to collaborate, feel free to open an issue or PR.

---

## 📚 References

* [Selenium Official Docs](https://www.selenium.dev/documentation/)
* [The Testing Academy](https://thetestingacademy.com/)
* [SelectorsHub](https://selectorshub.com/)
* [Apache POI](https://poi.apache.org/)

---
