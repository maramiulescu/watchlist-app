# Watchlist
Watchlist is a full-stack web application for keeping track of which movies you want to watch. Log in, add titles to your list, mark them as watched ( :heavy_check_mark: ) or liked ( :heart: ), or remove titles from your list.

## Implementation
This application was created using
- Java with Spring Boot for the backend, 
- MongoDB for storing the watchlist items,
- Javascript with Vue.js and Nuxt.js for the frontend,
- Docker to containerize each of the above components.

## Installation 
Before running the application, first a Docker image for the frontend and one for the backend must be built. This can be done by running the following commands in the root project folder:
```
docker build --file=frontend/frontend.dockerfile  -t watchlist-web-frontend .
docker build --file=backend/backend.dockerfile  -t watchlist-web-backend .
```
Then the application can be started by running the following command in the root directory:
```
docker-compose -f docker-compose.yml up
```
Finally, navigate to ```localhost:3000``` to start using Watchlist! See example screenshots below.

### Landing page
![Alt text](/screenshots/landing.png?raw=true)
### Main page
![Alt text](/screenshots/main.png?raw=true)
