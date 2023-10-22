# Case Study Projekt - Einsatzgebiete von automatisierten Code-Refactorings zur effizienteren Weiterentwicklung von Software

Dieses Projekt beinhaltet ein Beispielprojekt, an dem verschiedene automatisierte Refactorings aus der oben genannten Arbeit durchgeführt werden.

Folgende Szenarien liegen vor:

- Framework-Update von Spring Boot 3.0 auf 3.1

- Programmiersprachen-Update von Java 11 auf 17

- Dependency Update von Apache Commons IO 2.5 auf 2.6

Programmiersprachen Update Java 11 auf 17:
`mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.migrate.UpgradeToJava17`

Framework-Update von Spring Boot 3.0 auf 3.1
`mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-spring:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.spring.boot3.UpgradeSpringBoot_3_1`

Statische Code-Analyse Optionals
`mvn -U org.openrewrite.maven:rewrite-maven-plugin:run -Drewrite.recipeArtifactCoordinates=org.openrewrite.recipe:rewrite-migrate-java:RELEASE -Drewrite.activeRecipes=org.openrewrite.java.migrate.util.OptionalNotPresentToIsEmpty`

Szenario Dependency-Update mit API Change
