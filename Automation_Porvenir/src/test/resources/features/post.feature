#author: Juan Sebastian Torres Rincon
#language: es

Característica: Consumo con serenity-rest el verbos POST

  Yo como usuario
  Quiero realizar consumos a un servicio de apirest de tipo post
  Para comprobar la robustes de esta y validar si consulta los datos

  Antecedentes:
    Dado "Juan" obtiene la baseurl de la api

  @Successful
  Escenario: Obtener(post) los datos que arroje el consumo de la api
    Cuando realizo una solicitud POST al endpoint con los datos del usuario
    Entonces valida estado de la peticion POST