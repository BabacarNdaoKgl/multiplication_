# Utilisation de l'image de base Java 17
FROM openjdk:17-jdk-slim

# Copie le fichier JAR dans le conteneur
COPY target/multiplication-1.0-SNAPSHOT.jar /app/multiplication.jar

# Définit le répertoire de travail
WORKDIR /app

# Expose le port de l'application
EXPOSE 8080

# Commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "multiplication.jar"]
             