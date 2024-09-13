#author: Juan Sebastian Torres Rincon
#language: es

Característica: Consumo con serenity-rest el verbos PUT

  Yo como juan
  Quiero realizar consumos a un servicio de apirest de tipo put
  Para comprobar la robustes de esta y validar si actualiza los datos

  Antecedentes:
    Dado "juan" obtiene la baseurl de la api

  @Successful
  Escenario: Actualiza(put) los datos que arroje el consumo de la api
    Cuando configura la peticion a disipar
    Entonces valida los datos consultados fueron actualizados

