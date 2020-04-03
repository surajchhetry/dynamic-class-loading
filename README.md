# dynamic-class-loading
Example of how to load classes( from different module) dynamically.

- app : uses different implementation . In order to change implementation update pom.xml
        It contains main runnable method which will load module based on provided class name.
- api : exposes API and provides a class to register different implementation.
- impl-a, impl-b : Implementation of api  