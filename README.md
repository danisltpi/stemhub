# StemHub

StemHub is a music collaboration platform
for producers and artists to share, sync, and co-create music projects.

## Features

- User authentication
- Version Control for Ableton Live Projects
- Project-based collaboration with private or public visibility
- Upload and download audio stems with version history
- Real-time sync metadata and collaboration status
- Profile pages with bio, links, and project portfolio
- Basic music waveform visualization
- Comment threads per stem or project
- Notifications for new uploads and changes
- JWT-authenticated REST API

## Tech Stack

**Frontend**

- Angular 20

**Backend**

- Java 21 + Spring Boot 3
- PostgreSQL
- Spring Security + JWT
- RESTful API
- Flyway (DB Migrations)

**Infrastructure**

- Docker + Docker Compose
- GitHub Actions CI/CD
- NGINX reverse proxy
- AWS S3 for stem storage
- Terraform

## Getting Started

### Prerequisites

- Node.js 20+
- Java 24
- Docker
- PostgreSQL (local or containerized)

### Run Locally

```bash

# Start services
docker-compose up --build

# Frontend: http://localhost:4200

# Backend API: http://localhost:8080
```

### Build Frontend

```bash
cd frontend
npm install
ng build
```

### Run Backend

```bash
cd backend
./mvnw spring-boot:run
```

## Future Roadmap

- Realtime DAW plugin integration
- Discord OAuth login
- Mobile PWA version
- Native VST/AU sync agent
- Automatic key and BPM detection

## License

MIT License
