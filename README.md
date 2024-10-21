# Projet TP : Programmation Dynamique en Java

## Description 

Ce projet de travail pratique (TP) a pour but de démontrer l'utilisation de la programmation dynamique en Java, 
notamment par l'instanciation de classes, l'injection de dépendances et l'invocation de méthodes via la réflexion.
L'objectif est de créer une application flexible et modulaire qui peut être configurée à l'aide d'un fichier externe, éliminant ainsi la nécessité d'une configuration statique.

## Structure du Projet

Le projet est structuré en plusieurs packages :

- **Package `dao`** : 
  - Contient l'interface `IDao`, qui définit une méthode `getValue()` retournant un nombre de type `double`.
  - Implémentation : `DaoImpl`, qui retourne une valeur fixe.

- **Package `metier`** : 
  - Comprend l'interface `IMetier`, qui déclare la méthode `calcul()`.
  - Implémentation : `MetierImpl`, qui utilise une instance de `IDao` pour effectuer un calcul basé sur la valeur fournie par `IDao`.

- **Package `presentation`** : 
  - Contient la classe `Presentation2`, qui utilise la réflexion pour instancier dynamiquement les classes `DaoImpl` et `MetierImpl`.
  - Lit les noms des classes à partir d'un fichier de configuration et gère l'injection de dépendances.

## Fonctionnalités

- **Injection de dépendances** : Grâce à l'utilisation de la réflexion, le projet permet d'injecter dynamiquement les dépendances, facilitant ainsi la maintenance et l'évolution de l'application.
  
- **Flexibilité de configuration** : Le comportement de l'application peut être modifié simplement en changeant le contenu du fichier de configuration, sans avoir à toucher au code source.

- **Modularité** : La séparation des interfaces et des implémentations favorise un design modulaire, ce qui rend le système plus facile à comprendre et à tester.

## Exécution

1. Créez un fichier `config.txt` dans le répertoire racine du projet.
2. Ce fichier doit contenir les noms complets des classes `DaoImpl` et `MetierImpl`, chacun sur une ligne


## Affichage 
![image](https://github.com/user-attachments/assets/b44d5cbb-8c5a-4c59-9cf2-646b2ddd9166)


# TP 2 : Implémentation de l'Inversion de Contrôle et Injection des Dépendances avec Spring  

## Objectif

Développer une application Java utilisant le framework Spring pour mettre en œuvre l'inversion de contrôle (IoC) 
et l'injection des dépendances (DI) via des annotations. Ce projet consiste à créer une interface DAO, une interface métier, 
et à gérer l'injection des dépendances entre elles.

## Prérequis

Avant de commencer on doit installé les outils suivants :

- **Eclipse IDE for Java Developers**
- **JDK 11 ou version supérieure**
- **Maven** pour la gestion des dépendances

## Étapes du projet

1. **Création du projet Maven**
   - Créer un nouveau projet Maven avec l'archetype `quickstart`.
   - Nommer le projet `SpringDIProject` et définir le Group Id et Artifact Id.
   - Ajouter les dépendances Spring dans `pom.xml`.

2. **Création des interfaces et classes**
   - Créer l'interface `IDao` et ses implémentations (`DaoImpl`, `DaoImpl2`).
   - Créer l'interface `IMetier` et sa classe `MetierImpl`.

3. **Configuration Spring**
   - Créer la classe principale `Presentation2` pour récupérer les beans et exécuter l'application.

4. **Exécution du projet**
   - Compiler et exécuter `Presentation2` pour afficher le résultat.

  ## Affichage 
  ![image](https://github.com/user-attachments/assets/0f9b2d1b-2453-4426-86c5-94dda6df858c)


   ## Affichage de Bonus 
   ![image](https://github.com/user-attachments/assets/58902536-180b-4ea3-8288-132112a4c1a1)

