La Asociación de Fútbol 5, necesita desarrollar un sistema para organizar y administrar los
jugadores y árbitros que componen a la asociación. Con el objetivo de tener actualizada la
información de los miembros de la asociación, es necesario guardar posición en el campo
(Arquero, defensor, mediocampista, delantero), equipo actual, goles marcados, tarjetas
(recibidas, sacadas), expulsiones, árbitro internacional (Si, No).
Se solicita diseñar e implementar un programa en Java que modele este sistema y permita
gestionar los datos antes mencionados.

======================================================

Requisitos del Sistema

1. Jugadores:
o Por cada jugador se debe conocer su
▪ Nombre
▪ Apellido
▪ Fecha de nacimiento
▪ Nacionalidad
▪ Club Actual
▪ Posición (modificables)
▪ Goles (modificables)
▪ Tarjetas Amarillas (modificables)
▪ Tarjetas Rojas

2. Árbitros
o Por cada árbitro se debe conocer su
▪ Nombre
▪ Apellido
▪ Fecha de nacimiento
▪ Nacionalidad
▪ Tarjetas Sacadas (modificables)
▪ Internacional (modificables)

3. Equipos de Fútbol:
o Todo jugador pertenece a un equipo. De cada equipo se debe conocer el nombre.
o Los equipos ya están establecidos, cantidad de equipos participantes 10,
jugadores por equipo al menos 5 máximo 7
Funcionalidades Requeridas a Entregar
1. Gestión de la Información:
o El sistema debe ser capaz de almacenar toda la información relacionada con los
jugadores, árbitros, y equipos de fútbol. Debe permitir realizar las operaciones
de: a. Carga: Agregar nuevo jugador/árbitro. b. Modificación: Editar
información existente de jugador/árbitro. c. Eliminación: Remover
jugador/árbitro.
2. Persistencia de Datos:
o Toda la información debe ser persistente, es decir, guardarse en archivos que
permitan recuperar los datos al iniciar el sistema nuevamente.

3. Consultas Específicas:
o El sistema debe permitir realizar las siguientes consultas:
1. Cantidad de jugadores por equipo.
2. Jugadores que superen una cantidad de goles dada.
3. Filtrar árbitros por si es internacional o no.
4. Jugador con más expulsiones
5. Cantidad de jugadores por posición.

4. Interfaz Gráfica:
o El sistema debe contar con una interfaz gráfica amigable y fácil de usar que
permite la interacción con el usuario. Las pantallas deben ser consistentes y
proporcionar mensajes claros para todas las acciones realizadas por el usuario.

======================================================

Implementación
1. Estructura del Proyecto:
o Debe seguir la arquitectura del Modelo Vista Controlador trabajada en la
materia.
o Para todas las clases que se desprendan de la narrativa se debe declarar la clase,
sus atributos y los métodos mínimos necesarios (getters, setters, constructores).
o Las clases relacionadas con los jugador/árbitro deben implementar los métodos
necesarios para cumplir con las operaciones de gestión y consulta descritas,
junto con todas aquellas funciones que consideren necesarias.

2. Persistencia:
o El sistema debe guardar los datos en archivos de texto (automáticamente antes
de finalizar la ejecución) que permitan la fácil lectura y recuperación de la
información. Es decir, entre una ejecución y otra debe ser posible mantener la
información.
3. Evaluación:
o Se evaluará la correcta implementación del sistema, la coherencia del diseño
orientado a objetos, el uso adecuado de la herencia y el polimorfismo, y la
calidad de la interfaz gráfica.

A tener en cuenta:
● Buenas Prácticas de Programación: Es fundamental seguir buenas prácticas de
programación, utilizando espacio de nombres, herencia, encapsulación, polimorfismo
y otros conceptos de POO.
● Manejo de Errores: El sistema debe proporcionar mensajes claros en caso de errores,
indicando qué ha sucedido y cómo resolver el problema. Considere el uso de try catch.
● Creatividad: Se valorará la inclusión de características adicionales y la creatividad en
el diseño de la interfaz gráfica, considere el uso de menú y/o submenús.
● Pre carga de Información: Es deseable que al momento de la ejecución/prueba del
sistema pueda cargarse información desde archivos (lectura/inicialización previa) para
poder probar de mejor manera el sistema.
