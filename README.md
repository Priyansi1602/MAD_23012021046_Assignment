📱 Mobile Trip Capture App
📖 Overview

This project is a demo mobile application built for the Mobile Application Development (MAD) course.
It simulates a system inspired by NATPAC (National Transportation Planning and Research Centre) that captures a user's travel details such as:

->Origin & destination
->Mode of travel
->Trip purpose
->Cost, companions, and duration
->Viewing past trips
->The goal is to show how a mobile app can help collect transportation data digitally instead of manual surveys.

Project Objective

The main objective of this assignment is to design a UI-only Android application that demonstrates:

✔ A simple travel tracking flow
✔ Data entry screens for trip details
✔ Viewing travel history
✔ Basic navigation between screens
✔ User-friendly UI design

Real-World Context (Why This App?)

Organizations like NATPAC collect transport data from people to help government bodies:
Build better roads, metro lines
Improve bus routes
Reduce traffic
Understand travel behavior
Since manual surveys are slow and inaccurate, this project demonstrates how a mobile app can capture trips smartly, making data:

✔ Faster
✔ More accurate
✔ Easier to collect
✔ Less manual

App Flow (Screens)
1️⃣ Intro Screen (TravelExploreActivity)
Shows project title
Button to go to Sign In screen

2️⃣ Sign In & Create Account
Simple UI for login
Navigate to home screen

3️⃣ Home Screen (MainActivity)
Contains 3 main options:
Start Trip
View Trips
Summary (UI Only Toast)

4️⃣ Start Trip Screen
Start time shown (dummy)
End time shown when ended
After ending, user goes to Trip Details

5️⃣ Trip Details Screen
User can fill in:
Mode of travel
Purpose
Number of companions
Cost (₹)
Save button → Goes to View Trips

6️⃣ View Trips Screen
Shows a list of sample/dummy trips
RecyclerView implementation

✨ Features (UI Only)
📍 Trip Capture
Start/End buttons
Displays dummy time and locations

📝 Trip Details Form
Modes: Bus, Car, Bike, Walk, Train
Purpose: Work, Education, Shopping, Leisure, Other
Cost and companions input

📋 View All Trips
Dummy trip history list
Card-based layout

👤 Simple User Onboarding
Sign In
Create Account

🖼 Clean Material Modern UI
Material Cards
ConstraintLayouts
CardView for trip items

🛠️ Technologies Used
Language: Kotlin
Framework: Android SDK
UI: XML layouts
RecyclerView for list
Material Components

Project Structure
/app/src/main/java/com.example.mad_assignment
│── MainActivity.kt
│── StartTripActivity.kt
│── TripDetailsActivity.kt
│── ViewTripsActivity.kt
│── SignInActivity.kt
│── CreateAccountActivity.kt
│── TravelExploreActivity.kt

/app/src/main/res/layout
│── activity_main.xml
│── activity_start_trip.xml
│── activity_trip_details.xml
│── activity_view_trips.xml
│── sign_in.xml
│── create_account.xml
│── travel.xml
│── item_trip.xml

Challenges Faced
Designing proper navigation between multiple screens
Handling RecyclerView for static trip list
Maintaining consistent UI across different layouts
Creating a realistic dummy flow without backend or GPS
Organizing multiple XML files cleanly

📌 What This Project Represents
This is a prototype demo application to show how mobile-based trip recording works for transportation studies like those done by NATPAC.
The final output is a UI demonstration, not a fully functional tracking app.

OUTPUT:
<img width="444" height="805" alt="Screenshot 2025-11-18 212013" src="https://github.com/user-attachments/assets/339e7475-539e-4a02-a7f5-342e56b854ae" />
<img width="434" height="793" alt="Screenshot 2025-11-18 212039" src="https://github.com/user-attachments/assets/0070bb15-2434-4360-a547-0b2f01cb1c6e" />
<img width="441" height="790" alt="Screenshot 2025-11-18 212053" src="https://github.com/user-attachments/assets/ff1c3e7e-0fc8-4564-a8e2-9a7755aa3a61" />
<img width="457" height="820" alt="Screenshot 2025-11-18 212315" src="https://github.com/user-attachments/assets/762ed997-ed54-490a-a748-42d5b85645be" />
<img width="450" height="793" alt="Screenshot 2025-11-18 212140" src="https://github.com/user-attachments/assets/f29669ac-67da-42e4-ab01-757efc420c57" />
<img width="435" height="763" alt="Screenshot 2025-11-18 212151" src="https://github.com/user-attachments/assets/cd8f5a80-a217-47a6-9070-cc571e59cb0e" />


Submitted By
Priyansi Prajapati
Roll No: 23012021046
Subject: Mobile Application Development (MAD)
