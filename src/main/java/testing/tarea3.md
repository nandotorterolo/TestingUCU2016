## Integración continua y cobertura.

Dejo un ejemplo de implementacion de integración continua con cobertura para que puedan agregar al proyecto "ecommerce"

Tenemos muchos beneficios, entre ellos, reducir los riesgos y tiempos del producto, reducir procesos repetivos y manuales, además de lograr una mayor confianza y seguridad en el equipo de desarrollo. 

El proyecto tendria estos componentes, 

* maven, gestor proyecto
* github, repositorio codigo 
* travis, integración continua
* caverralls, cobertura código

Travis al igual que Coveralls, necesita autorización de tu cuenta, se ingresa a los sitio con las creedenciales de github, se le otorga acceso a los proyectos y ramas.

El objetivo es poder tener configuradas las herramientas en el proyecto, que valide un Pull Request en el repositorio previo al Merge.

Pasos:

+ Maven, Configurar archivo pom.xml con dependencias y plugins.
    - dependencias: selenium, junit
    - plugins: maven-compiler-plugin, coveralls-maven-plugin, cobertura-maven-plugin,
+ Travis, Configurar archivo .travis.xyml con dependencias y plugins.
    - lenguaje: java
    - before_script: configurar ambiente antes de correr scritps
    - script: tarea para buildear, y correr test
    - after_success:  tarea para ejecutar cobertura
+ Caverralls
    - configurar los niveles de cobertura o otras caracteristicas en plugin cobertura-maven-plugin. 





Enlaces:

* Repositorio: https://github.com/nandotorterolo/TestingUCU2016
* Maven : https://maven.apache.org/
* Travis CI: https://travis-ci.org/
* Code Coverage https://coveralls.io/repos
