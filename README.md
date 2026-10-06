# 🚢 Titanic Selenium Automation Testing

## 📌 Project Overview

This project focuses on automated testing of the **Titanic Survival Prediction** web application using **Selenium WebDriver and Java**.

The application is developed using **Python and Streamlit**. Selenium is used to test the application's pages and functionalities.

---

## 🛠️ Technologies Used

* Java 21.0.1
* Selenium WebDriver 4.49.0
* Eclipse IDE
* Google Chrome
* Python
* Streamlit
* JUnit
* Maven

---

## 🌐 Application Under Test

**Application:** Titanic Survival Prediction

**Platform:** Streamlit Cloud

**URL:**
https://titanic-survival-prediction-awqphahbpmrkn5xd2haysv.streamlit.app/

---

## 🧪 Testing Performed

* Functional Testing
* Selenium Automation Testing
* Regression Testing
* Exploratory Testing
* Test Case Execution
* Bug Identification

---

## 📋 Test Execution Summary

**Total Test Cases:** 10
**Passed:** 8
**Failed:** 2
**Pass Percentage:** 80%

| TC ID | Test Case                | Status |
| ----- | ------------------------ | ------ |
| TC01  | Home Page                | ✅ PASS |
| TC02  | Data Analysis Page       | ✅ PASS |
| TC03  | Survival Prediction Page | ✅ PASS |
| TC04  | Prediction Form          | ❌ FAIL |
| TC05  | Model Performance        | ✅ PASS |
| TC06  | About Project            | ✅ PASS |
| TC07  | Input Validation         | ✅ PASS |
| TC08  | Predict Button           | ❌ FAIL |
| TC09  | Page Navigation          | ✅ PASS |
| TC10  | Application Reload       | ✅ PASS |

---

## 🐞 Failed Test Cases

**TC04 – Prediction Form**
Expected prediction form fields could not be completely verified by the current Selenium check.

**TC08 – Predict Button**
The Predict button was present, but the defined automated verification condition was not satisfied.

> Failed automated checks require further investigation before confirming them as application defects.

---

## 📄 Testing Report

The complete testing report is available here:

[📄 View Testing Report](test-report/Titanic_Testing_Report.pdf)

---

## 🎥 Project Demonstration Videos

### 1. Selenium Test Execution in Eclipse

[▶️ Watch Video 1](https://drive.google.com/file/d/1FSMD5cB_HjqKBVhoQMZqBzKlO3qvLJZ8/view?usp=sharing)

### 2. Selenium Testing on Streamlit Application

[▶️ Watch Video 2](https://drive.google.com/file/d/1XWgLssGHmvNBqCEnRpTBaj6g24vF6g0_/view?usp=sharing)

### 3. Testing Report Demonstration

[▶️ Watch Video 3](https://drive.google.com/file/d/1SfEvdgrTLssGpRj45hwinTFceNblgoRo/view?usp=sharing))

---


---

## 🚀 How to Run

### Start Streamlit Application

```bash
streamlit run app.py --server.port 49200
```

### Run Selenium Tests

1. Open the project in Eclipse.
2. Start the Titanic application.
3. Open `TitanicFullTest.java`.
4. Select **Run As → JUnit Test**.
5. Selenium will execute the test cases.

---

---

## 🏁 Conclusion

The Titanic Survival Prediction application was tested using **Selenium WebDriver and Java**.

**10 test cases** were executed, with **8 passed and 2 failed**, resulting in an **80% pass percentage**.
