## Integración continua y cobertura.

Quería compartir un ejemplo de integración continua con cobertura para que puedan agregar al proyecto "ecommerce"

Algunos beneficios que ganamos, son reducir los riesgos y tiempos del producto, reducir procesos repetitivos y manuales, además de lograr una mayor confianza y seguridad en el equipo de desarrollo.
Quizas puede ser un poco difícil la configuración de las herramientas, pero estan bien documentadas y hay muchos ejemplos.

El proyecto esta formado por estos componentes

* maven, gestor proyecto
* github, repositorio codigo 
* travis, integración continua
* coverralls, cobertura código

Travis al igual que Coveralls, necesita autorización de tu cuenta, se ingresa a los sitios con las credenciales de github, se le otorga acceso a los proyectos y ramas.
(considerar que en cuentas no comerciales,  github, travis y coveralls  la información es pública)

El objetivo es poder tener configuradas las herramientas en el proyecto, para que valide automáticamente un Pull Request en el repositorio previo al Merge. También nos brinda una consola de lectura de resultados obtenidos, en un ambiente desacoplado, con su respectiva cobertura en caso de éxito. 

Las configuraciones  

+ Maven, Configurar archivo pom.xml con dependencias y plugins.
    - dependencias: selenium, junit
    - plugins: maven-compiler-plugin, coveralls-maven-plugin, cobertura-maven-plugin,
+ Travis, Configurar archivo .travis.xyml con dependencias y plugins.
    - lenguaje: java
    - before_script: configurar ambiente antes de correr scritps
    - script: tarea para buildear, y correr tests
    - after_success:  tarea para ejecutar cobertura
+ Coverralls
    - configurar los niveles de cobertura o otras características en plugin cobertura-maven-plugin. 
    
Saludos.

Enlaces de herramientas:

* Github: https://github.com/
* Maven: https://maven.apache.org/
* Travis CI: https://travis-ci.org/
* Coveralls: https://coveralls.io/

Enlaces de implementación:

* Github: https://github.com/nandotorterolo/TestingUCU2016
* Travis CI: https://travis-ci.org/nandotorterolo/TestingUCU2016
* Coveralls: https://coveralls.io/github/nandotorterolo/TestingUCU2016


