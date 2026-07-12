# Mój Blog Osobisty

To jest nowoczesna aplikacja blogowa zbudowana w oparciu o architekturę Spring Boot. Projekt został zaprojektowany z myślą o przyszłej migracji frontendu z Thymeleaf do frameworka Angular.

## 🚀 Architektura Projektu

Projekt wykorzystuje warstwową architekturę, aby zapewnić łatwe utrzymanie kodu i czystą separację logiki biznesowej:

* **Persistence Layer (Entity/Repository):** Komunikacja z bazą danych (PostgreSQL).
* **Service Layer:** Serce aplikacji, gdzie odbywa się cała logika biznesowa i mapowanie danych.
* **Web Layer (Controller/Thymeleaf):** Obecny frontend serwujący widoki HTML.
* **API Layer (RestController):** Punkty końcowe JSON przygotowane pod przyszły frontend w Angularze.



## 🛠 Tech Stack

* **Backend:** Java 17+, Spring Boot 3.x
* **Database:** PostgreSQL (z konfiguracją H2 dla celów deweloperskich)
* **Frontend:** Thymeleaf + Bootstrap 5 (tymczasowo)
* **Build Tool:** Maven
* **Tools:** Lombok, MapStruct (opcjonalnie)

## 📂 Struktura Katalogów

```text
src/main/java/pl/szyszlak/mamarek123/
├── configuration/    # Konfiguracja (DataInitializer, Security)
├── controller/       # WebController (HTML) oraz RestController (JSON API)
├── model/            # DTOs - obiekty przesyłane do frontendu
├── persistence/      # Encje (@Entity) oraz Repozytoria
├── service/          # Logika biznesowa i mapowanie (Mapper)
