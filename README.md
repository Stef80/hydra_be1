# hydra_be

Configurazione per l'avvio dell'app

aggiungera a Run Configurations->Spring boot app -> Arugments -> VM Arguments le seguenti stringhe.
-javaagent:.m2\repository\org\springframework\spring-instrument\4.2.5.RELEASE\spring-instrument-4.2.5.RELEASE.jar
-javaagent:.m2\repository\org\aspectj\aspectjweaver\1.9.6\aspectjweaver-1.9.6.jar

