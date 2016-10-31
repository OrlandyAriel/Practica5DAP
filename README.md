#Practica 5
##Orlandy Ariel Sánchez Acosta

Le han contratado para realizar el desarrollo de una de las partes de un proyecto de asistencia a la conducción.
Su labor consistirá en crear una cola  encargada de gestionar los diferentes eventos que llegan.

En concreto, la cola almacenará los diferentes eventos que se vayan recibiendo, tenga en cuenta que pueden llegar varios eventos a la misma vez.  En cualquier momento, se puede solicitar mostrar los diferentes evento que tiene la cola. Por último, deberá borrar de la cola aquellos eventos que se consideran antiguos, transcurridos 10 segundos.


Para mostrar el correcto funcionamiento de su propuesta, debe crear una aplicación que genere eventos con múltiples hilos y muestre los diferentes eventos  cuando se vayan solicitando.


TIPOS DE EVENTOS: ev_colision, ev_atasco, ev_emergencia, ev_lentitud, ev_multa
Campos de Evento
idtipoevento;
fecha;

**Rúbrica:**

* Utiliza correctamente el/los patrones adecuados. 5 ptos
* Diseña interfaz. 1 ptos.
* Uso correcto de hilos 3 ptos
* Informe con todo lo solicitado 1 pto.

###Desarrollo de la práctica

**Patr�n/es utilizado/os:**
* Estrategia
* Singleton