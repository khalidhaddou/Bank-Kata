
# Bank Kata

## Description

Le projet **Bank Kata** est une simulation simple d'un compte bancaire qui permet de réaliser des dépôts, des retraits, et d'imprimer un relevé bancaire. Il est conçu pour pratiquer les principes de conception d'objets et de tests d'acceptation en suivant une approche **"outside-in"**. Ce kata est particulièrement utile pour s'exercer à la **Test Driven Development (TDD)**.

## Structure du projet

Voici la structure de base du projet :

```
bank-kata/
│── src/
│   ├── AccountService.java         # Interface des services bancaires
│   ├── Account.java                # Implémentation de l'interface AccountService
│   ├── Transaction.java            # Représentation d'une transaction
│   ├── Main.java                   # Application principale pour interagir avec le compte
│   ├── AccountTest.java            # Tests unitaires pour le compte bancaire
              
```

## Fonctionnalités

Le programme offre les fonctionnalités suivantes :

- **Dépôt d'argent** : Permet d'ajouter de l'argent au compte bancaire.
- **Retrait d'argent** : Permet de retirer de l'argent du compte bancaire.
- **Relevé bancaire** : Permet d'imprimer un relevé des transactions du compte (dépôts et retraits).

## Prérequis

- **Java 11** ou version supérieure.
- **Maven** pour la gestion des dépendances et la construction du projet.
- **JUnit 5** pour les tests unitaires.

## Installation

1. Clonez ce dépôt sur votre machine locale :

    ```bash
    git clone https://github.com/khalidhaddou/Bank-Kata.git
    ```

2. Accédez au répertoire du projet :

    ```bash
    cd bank-kata
    ```



## Tests

Les tests unitaires pour les fonctionnalités principales sont définis dans le fichier **`AccountTest.java`**. Vous pouvez tester les opérations suivantes :

- Dépôt d'argent
- Retrait d'argent
- Impression du relevé bancaire

Les tests utilisent **JUnit 5** pour vérifier que le comportement du système respecte les attentes.


