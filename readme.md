# PulseChat

PulseChat is a full-stack real-time chat application built with a modular architecture. This repository contains the complete system including backend services, frontend client, and infrastructure configuration required to run the platform locally or deploy it in production.

## Architecture

```
pulsechat
├── backend          # Spring Boot API and WebSocket services
├── frontend         # Chat client application
├── infrastructure   # Docker, database and service configs
└── README.md
```

## Features

* User registration and login
* Secure password hashing
* Chat and message management
* Real-time communication support
* Scalable backend architecture

## Tech Stack

**Backend**

* Java
* Spring Boot
* JPA / Hibernate
* WebSockets

**Frontend**

* Angular
* AngularJS

**Infrastructure**

* Docker
* PostgreSQL
* Redis
* Kafka

## Getting Started

Clone the repository:

```
git clone https://github.com/<your-username>/pulsechat.git
cd pulsechat
```

Start infrastructure services:

```
docker compose up -d
```

Run the backend:

```
cd backend
mvn spring-boot:run
```

Run the frontend:

```
cd frontend
npm install
npm run dev
```

## Goal

PulseChat demonstrates a production-style architecture for building scalable real-time chat systems using modern backend, frontend, and infrastructure technologies.
