#author: Juan Sebastian Torres Rincon
#language: es

Característica: Consumo con serenity-rest el verbos GET

  Yo como usuario
  Quiero realizar consumos a un servicio de apirest de tipo get
  Para comprobar la robustes de esta y validar si consulta los datos

  Antecedentes:
    Dado "Juan" obtiene la baseurl de la api

  @Successful
  Escenario: Obtener(get) los datos que arroje el consumo de la api
    Cuando realizo una solicitud GET al endpoint
    Entonces valida estado de la peticion GET
