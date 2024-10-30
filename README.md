# webflux-web3

## Project Description and Purpose

This project is built using the Spring WebFlux framework and Java 8 lambda expressions. It uses Gradle for project build and Docker for containerization. The project integrates with MyBatis-Plus to store data in MySQL and uses SLF4J for logging.

The main purpose of this project is to fetch cryptocurrency prices (spot and futures) from the Binance exchange at regular intervals and store the data in a MySQL database.

## Instructions for Running the Project

1. Clone the repository:
   ```
   git clone https://github.com/BuleStar/webflux-web3.git
   ```
2. Navigate to the project directory:
   ```
   cd webflux-web3
   ```
3. Build the project using Gradle:
   ```
   ./gradlew build
   ```
4. Run the project:
   ```
   ./gradlew bootRun
   ```
5. The application will start and begin fetching cryptocurrency prices at regular intervals.

## Scheduled Task to Fetch Cryptocurrency Prices

The project includes a scheduled task that fetches cryptocurrency prices from the Binance exchange at fixed intervals. The fetched prices are logged using SLF4J and stored in a MySQL database using MyBatis-Plus.
