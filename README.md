# AppMeteo :cloud:

AppMeteo is our first application create for university project.

## Description

The application uses the OpenWetherMap API to retrieve the weather for the next few days. Depending on the weather and the current season, we propose dishes to be made. :bread:

## Application

Application build with 3 Activity :
  * `MainActivity` Contains a recyclerview with weather data
  * `MeteoInformationActivity` Contains more information about the weather selected in the recyclerview
  * `DishGeneratorActivity` Activity to request a starter, a dish, a desert to be made

## Libraries use

* **Volley** is an HTTP library  
* **Gson** convert json to object or object to json  
* **Recyclerview** is the ViewGroup that contains the views corresponding to your data  
