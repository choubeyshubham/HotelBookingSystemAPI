# 🏨  Hotel Booking Application

A comprehensive full-stack hotel management and booking system built with **Spring Boot ** and **Angular**. This application provides a seamless experience for searching rooms, managing bookings, processing secure payments, and sending automated email notifications.

---

## 🚀 Key Features

* **Public Room Search:** Users can filter rooms by date range and room type directly from the homepage.
* **User Authentication:** Secure registration and login for both regular users and administrators.
* **Advanced Booking Engine:** * Real-time room availability checks.
    * Dynamic price calculation based on the duration of stay.
    * Unique booking code generation for easy tracking.
* **Payment Integration:** Supports global credit/debit card processing (MasterCard, Visa, etc.) with real-time status updates.
* **Automated Notifications:** Email confirmations sent automatically upon booking with direct links to the payment portal.
* **User Dashboard:** Manage profile details, edit information, and view personal booking history.

---

## 🛠️ Tech Stack

### Backend
* **Java 17+ / Spring Boot
* **Spring Security & JWT:** Stateless authentication for secure API endpoints.
* **Spring Data JPA:** For database interaction and ORM mapping.
* **MySQL:** Relational database for storing user, room, and booking data.
* **Lombok:** To minimize boilerplate code.
* **ModelMapper:** For clean DTO (Data Transfer Object) management.

### Frontend
* **Angular:** Modern, reactive UI components.
* **Bootstrap/CSS:** Responsive design for mobile and desktop views.
* **RxJS:** For handling asynchronous data streams.

---

## 📋 Database Architecture

The system relies on a relational schema to ensure data integrity.



* **Users:** Stores credentials, roles (USER/ADMIN), and contact info.
* **Rooms:** Details on room types, base pricing, and status.
* **Bookings:** Links users to specific rooms with