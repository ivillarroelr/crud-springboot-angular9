# Demo CRUD utilizando SpringBoot 2.2.6, Angular 9 y MySQL 5.7

La aplicación consiste en un pequeño mantenedor de personas que permite listar, agregar, editar y eliminar personas. Para facilitar la ejecución, se mantiene provisionada en una instancia serverless en Google Cloud Platform la base de datos MySQL. 

## Comenzando

Las siguientes instrucciones le permitirán copiar el proyecto y ejecutarlo en su máquina local para propósitos de testing y desarrollo. 
Favor revisar las instrucciones de despliegue para poder ejecutar una versión en vivo. 

### Prerrequisitos y dependencias

Características del sistema donde fue ejecutado el proyecto son las siguientes, se sugiere utilizar las versiones de software y dependencias indicadas. No se garantiza retrocompatibilidad. 

```
NodeJS Version: 12.16.1 (Requerido por Angular) 
Angular Version: 9.1.1
Java: 1.8.0_241; Java HotSpot(TM) 64-Bit Server VM 25.241-b07
Spring Version: 2.2.6 (Utilizando https://start.spring.io/ Spring Initializr) 
Servidor de Aplicación back-end: TomCat incluido en NetBeans IDE 11.3
Servidor Http: Versión de desarrollo de Angular para testing. 
System: Windows 10 version 10.0 running on amd64; Cp1252; es_CL (nb)
```

### Instalación 

Descargar el proyecto o clonarlo en un repositorio local. 

1) Iniciar el proyecto front-end: Para su agilidad y dado que el propósito no es un deploy productivo sino de desarrollo, se utilizará la versión de servidor incluido en Angular. Ingresar al directorio $LOCAL/crud-springboot-angular9/client y ejecutar en una consola de Windows: 
```
ng serve
```

Una vez la aplicación Angular haya compilado e indique: 

```
** Angular Live Development Server is listening on localhost:4200, open your browser on http://localhost:4200/ **
: Compiled successfully.
```

Se podrá continuar con la instalación. 


2) Iniciar el proyecto back-end: Para su agilidad se utilizará el servidor de aplicaciones TomCat que viene incluido en IDE NetBeans, para ello, importaremos el proyecto desde $LOCAL/crud-springboot-angular9/server, dado que el proyecto está empaquetado bajo Maven, puede abrirse también desde Eclipse. Ejecutar y esperar que arranque el servidor. Una vez que en la consola indique 

```
Started ServerApplication in 11.821 seconds (JVM running for 12.509)
```
Se habrá concluido la instalación y podrá ejecutarse ingresando en su browser a http://localhost:4200 



## Vistas de la aplicación funcionando 

1) Inicio 

2) Listar 

3) Editar

4) Eliminar


## Contribuciones

Todas las solicitudes de contribución serán aceptadas y siéntanse libres de clonar el repositorio y modificar el proyecto a gusto. 

## Versionamiento

Versión actual 1.0

## Autor

* **Iván Felipe Villarroel Ramírez** - *Full Stack Java Developer* - [ivanvillarroelr](https://github.com/ivanvillarroelr)

Proyecto DEMO de seguimiento en curso "Creación de CRUD con Spring y Angular"

## Licenciamiento

Este proyecto es libre y no posee licenciamiento, pueden clonar y descargar sin citar al autor. 

## Agradecimientos

Equipo J4V4N3RD$ por su apoyo en la revisión de este instructivo y reproducción

