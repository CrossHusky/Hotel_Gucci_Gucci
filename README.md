# Hotel Gucci Gucci
## Proyecto final de la asignatura de Programación 3 de la Universidad Autónoma de Aguascalientes
### Los siguientes puntos deben ser completados:

- [ ]   #01: Pantalla de presentación con los datos de la universidad (logo uaa),   materia, profesor, fecha y datos de los programadores. Obligatorio uso de la clase Graphics en esta pantalla ( imagen(s) )

- [ ]   #02: Después aparecer otra pantalla del sistema, con el nombre del hotel, lema, logotipo, imágenes, sonido, se espera una gran pantalla de presentación del sistema.  Con la opción de login y contraseña para ingresar al sistema, debes tener una cuenta por cada miembro del equipo. Las contraseñas deben estar encriptadas en la base de datos. Obligatorio uso de la clase Graphics ( imáge(s) )

- [ ]   #03: Menu del Sistema con las opciones Registro, Salida y Consultas. En consultas mostrarme el submenu o el lugar donde acceso a las 10 consultas que pedi 

- [ ]   #04: Mostrarme en phpMyAdmin la BD y campos de sus tablas utilizadas en el sistema. Deberan contener informacion de huespedes ya registrados, espero ver al menos 10 huespedes (registros en su base de datos) que registren antes de empezar el video. Tambien los ingresos del hotel debe tener alguna cantidad  consecuencia de salidas de huespedes que ustedes hayan realizado antes de empezar el video

- [ ]   #05: Mostrarme en el codigo la linea que arma la cadena del insert into para ejecutar el alta o regisgtro de huesped en MySql

- [ ]   #06: Registren un huesped (registrar datos correctos, nombre con apellido, etc) Para el registro de un huésped, pedir nombre, tipo de habitación que desea, ciudad origen, total de personas que ocuparan la habitación (incluida la persona que se registra) y total de días que se va a quedar en el hotel. Tambien se registra la fecha de ingreso.

- [ ]   #07: De acuerdo al tipo de habitación, validar que existan habitaciones disponibles en el hotel. En caso de que si, mostrar con imagen en pantalla los números de habitación disponibles en cada piso para el huésped elija. Tu con control interno al seleccionar la que desea ya la deberás marcar como ocupada

- [ ]   #08:  De acuerdo al tipo de habitacion validar, que el total de personas que la ocuparan este autorizado con respecto a lo permitido en cada tipo de habitación (sencilla, doble o triple). En caso de querer incluir una persona más en cualquier tipo de habitación, incluye un cargo extra de $  por noche. (El $ cargo extra el equipo lo decide) Notificar  al huésped de este cargo extra por noche. Solo es posible incluir dos personas extra en cualquier tipo de habitación

- [ ]   #09: Imprimir en pantalla un  recibo o voucher del registro con los siguientes datos:   
1 Nombre y Logo del hotel
2 Lema del hotel
3  Ubicación del hotel
4 Nombre del huésped:
5 Ciudad de origen:
6 Fecha de ingreso:
7 Fecha de salida:
8 Numero de habitación:   piso: 
9 Tipo de habitación:  ( Limite  huésped)
10 Total de ocupantes de la habitación: 
                                          □1 persona extra     □ 2 personas extra
Registro completado.

- [ ]   #10: Proceder a realizar 3 registros mas, necesito registros de huespedes para cada tipo de habitacion y que alguno maneje cargo extra por incluir alguna persona mas

- [ ]   #11: Mostrarme en la tabla de phpMyAdmin que los 4  registros que me mostraron en el video se dieron de alta en la tabla

- [ ]   #12: Mostrarme en codigo que tienen la validacion de HOTEL LLENO 

- [ ]   #13: Mostrarme en el phpMyAdmin o en el archivo o como lo haya hecho donde esta guardado los ingresos del hotel hasta el momento, me interesa ver que valor tiene y despues de que el huesped pague su cuenta, esa cantidad debera actualizarse

- [ ]   #14: Salida de un huesped. Pedir numero de la su habitacion

- [ ]   #15: Mostrarme en el codigo la linea que arma la cadena del delete  para ejecutar el baja o regisgtro de huesped en MySql

- [ ]   #16: Forma de manejar los cargos extra por servicios en su sistema (servicio al cuarto, servicio bar, servicio tintoreria, servicio SPA, servicio de niñera)

- [ ]   #17: Realizar el proceso para calcular la cuenta en base al costo de la habitación, total de días que ocupo la habitación y cualquier cargo extra generado

- [ ]   #18: Generar un recibo en un archivo pdf con los siguientes datos. Se espera un pdf agradable a la vista (datos acomodados). Muestro los datos a considerar,  pero el acomodo o distribución dentro del pdf queda a consideración del buen gusto del equipo

- [ ]   #19: Llevar un control interno de los ingresos del hotel.  Me muestran como se actualizo los ingresos del hotel despues que el huesped que se fue pago su cuenta

- [ ]   #20: Liberar habitación para que sea utilizada de nuevo.

- [ ]   #21: Dar de baja 2 huesped mas …. Mostrarme en la tabla de PhpMyAdmin que se realizan las bajas bien.

- [ ]   #22: Consultar galería de fotos del hotel. Mostrar como son las habitaciones de cada tipo, mostrar diversas secciones del hotel (gimnasio, alberca, restaurante, zona de spa, etc, ). Se esperan al menos 10 imágenes, las puedes mostrar una por una o mostrar más imágenes por pantalla. Se espera alguna música de fondo mientras vez las imágenes con opción a pausar si ya no quieres escuchar. Es obligatorio el uso de rutas relativas para el manejo de imágenes o demás archivos que necesiten utilizar en su sistema

- [ ]   #23: Consultar los ingresos del hotel hasta el momento. (Es la suma de todas los check out hasta el momento, se debe ir almacenando este dato en la BD o en algún archivo de texto, no se vale que cada que corran el sistema este dato empiece en cero)

- [ ]   #24: Consultar  porcentajes de ocupación por tipo de habitación.  Mostrar estos datos en una gráfica del tipo que quieras

- [ ]   #25: Consulta para imprimir el total de habitaciones que tiene el hotel de cada uno de los tipos (sencilla, doble y triple) . Ejemplo: Sencillas 12 Dobles  10 Triples  8. Mostrar estos datos en una gráfica del tipo que quieras

- [ ]   #26: Consulta que imprime el porcentaje de ocupación del hotel hasta el momento. Ejemplo: 75% de ocupación. Mostrar este dato en una gráfica de pastel

- [ ]   #27: Consulta para imprimir los costos de las habitaciones. 

- [ ]   #28: Dado el nombre de un huésped imprimir en que piso y habitación esta. De lo contrario “huésped no registrado”. Ejemplo:  Roberto Rodríguez Salas habitación 234 Piso 2

- [ ]   #29: Dado el número de una habitación imprimir el nombre del huésped que la ocupa o bien “habitación no ocupada”

- [ ]   #30: Dado el piso (piso1 o piso2) mostrar los números de habitaciones disponibles y de qué tipo son (sencilla, dobles, triple). 

- [ ]   #31: Consultar lista de personas hospedadas en el hotel por orden alfabético y la habitación que ocupan.

- [x]   #32: Se omite para equipos de menos de 4 integrantes

- [x]   #33: Se omite para equipos de menos de 4 integrantes

- [ ]   #34: Uso de controles GUI, obligatoriamente el uso de Label, Button, RadioButton o checkList, List o ComboBox, TextField, TextArea, Spinner, JDateChooser (La captura de  fecha tendrá que ser con el control JDateChooser), uso de menús. La lista anterior es obligatoria y así se revisara en la rúbrica, pero puedes utilizar todos los controles que necesites para el buen funcionamiento del sistema

- [ ]   #35: Uso de colecciones,  mínimo uso de la Clase ArrayList que almacene objetos de alguna clase del sistema. Se revisará obligatorio que se use ArrayList y obligatorio el uso de alguna clase con sus atributos y métodos y de la cual sea el tipo de información que el ArrayList almacene,  pero puedes utilizar cualquier colección adicional que necesites incorporar para el buen funcionamiento del sistema

- [ ]   #36: Obligatorio el manejo de GITHUB para el control de versiones del proyecto. Todos los participantes del equipo deben mantener una participación frecuente, GitHub registra todo lo que hacen, fechas, horas, etc. Si algún miembro del equipo no participa no tendrá derecho a calificación del proyecto final.  Esta puntuacion la otorgo, cuando revise el documento que me van entregar con imagenes de evidencia de uso de Git por parte de todos los integrantes del equipo.  Para tener esta puntuacion deben subir documento word o pdf con portada que incluya  lo siguiente:  IMAGEN de pantalla de GitHub de la sección <code> donde se ven TODOS los commit realizados por los integrantes o colaboradores del equipo (o equivalente de acuerdo a la interfaz gráfica de Git utilizada)
IMAGEN de pantalla de GitHub o equivalente donde se vean los colaboradores o miembros del equipo. 

- [ ]   #37: Un Archivo pdf   que contenga lo siguiente:
·         Portada (incluir el nombre del sistema)
·         El link donde puedo descargar el video, el link tiene que ser de acceso publico de no ser así, penalizare con 20 pts menos sobre la calif del proyecto final, por la molestia de tener que buscarlos para que quiten el candado al acceso.  
·         El Link para descargar el proyecto de GitHub igual NO QUIERO PROBLEMAS de no tener acceso.
·         Darme todas las cuentas y contraseñas de cada uno de los miembros del equipo
·         Reporte de actividades de cada miembro del equipo (Lo que le toco hacer a cada quien) este reporte debe tener el visto bueno del jefe del equipo quien lo debe firmar,  es obligatoria la firma de visto bueno del jefe en cada reporte de integrante de equipo.
·         Conclusiones de haber realizado este proyecto, UNA CONCLUSION por cada miembro del equipo

- [ ]   #38: Archivos de respaldos de la base de datos (Habrá penalización de 20 puntos menos en su calif del proyecto si me dan una base de datos vacía )
·         Archivo de respaldo de su base datos, CON DATOS para poder hacer mis consultas y no entretenerme en registrar muchos datos. 
·         Archivo de respaldo de donde tengan almacenadas las cuentas y contraseñas encriptadas, si todo es en la misma base de datos, está bien solo suban un respaldo.

- [ ]   #39: Archivo de Excel de la rubrica DEBIDAMENTE calificada de acuerdo al video. Habrá una penalización de 20 pts menos sobre la calif del proyecto a los equipos que entreguen la rúbrica sin autocalificar o diferente a lo que estuvieron mostrando durante el video.

- [ ]   #40: El sistema funciona correctamente, no presentan errores en ningun momento, el sistema fue integrado satisfactoriamente.
