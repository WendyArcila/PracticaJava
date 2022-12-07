# Taller4 Cantera2

Buenas prácticas de POO y manejo de exccepciones. 

# Componente practico

En la siguiente lista de ejercicios realice de forma individual cada uno de ellas. Cada ejercicio se debe entregar en un unico repositorio de Git, separe cada ejercicio en subcarpetas. 
1. Desarrolle una clase en Java que realice la abstracción de un sistema planetario, debiendo tener en cuenta para cada cuerpo del sistema aspectos como: masa, densidad, diámetro, distancia al sol (suponga órbitas circulares), un número de identificador único y un nombre textual. Incluya métodos que calculen la atracción gravitatoria entre dos cuerpos cualesquiera del sistema.

2. ¿Es posible ejecutar un programa en java que contenga varias clases con métodos main? En caso positivo, ¿cómo se determina el punto de entrada a un programa?
No, no es posible, el método main, es el punto de entrada a un programa Java, es el método que lanza la máquina virtual cuando se le indica que tiene que ejecutar una clase. 
3. Escriba un programa en java que genere aleatoriamente (Ayuda: Vea la clase Math para saber cómo generar números aleatorios en java) un array de números reales, y lo ordene mediante el algoritmo de la burbuja o mediante quick sort (esto deberá poder elegirlo el usuario).
4. Se quiere implementar el control de un Ferry. Para ello cree una clase Vehículo. Incluya aspectos comunes a todos los vehículos como número de pasajeros, presencia o ausencia de tripulación, número de ruedas, fecha de matriculación, medio por el que se desplaza, etc. Incluya los métodos que considere oportunos. Realice un programa capaz de leer por teclado los datos de 10 vehículos y los liste a continuación por pantalla.
5. A partir de la clase anterior, y mediante herencia cree nuevas clases que permitan diferenciar si el objeto es un coche, una moto, un camión, una bicicleta, una lancha. Incluya en cada clase algún atributo específico que la diferencie de las demás. Por ejemplo, para el coche un booleano que determine si es de tres o cinco puertas, para el camión la altura (indiferente en los otros vehículos), etc. Realice un programa como el del ejercicio anterior capaz de trabajar con los distintos tipos de vehículos.
6. Una interesante clase predefinida en el lenguaje java es la clase Vector, que implemente la abstracción "array dinámico". Revise la clase y úsela (en ficheros diferentes) para realizar un programa que lea números del teclado hasta que se introduce dos veces seguidas el mismo número. Entonces el programa muestra todos los números introducidos y termina.


## RESPUESTA EJERCICIO 2 

Sí es posible que exista un programa con varios métodos main, el punto de entrada del programa se determina según el IDE que estemos usando en IntelliJ al probar el programa, pero al compilarlo usará 
el último main usado. Sin embargo, no es una buena práctica, ya que este es el método que lanza la máquina virtual cuando se le indica que tiene que ejecutar una clase,
si existen varios métodos podrá generar confusiones en el programa.

## Tecnología
 * Java, en IntelliJ IDEA
 
## Realizado por
 [<img src="https://avatars.githubusercontent.com/u/108354837?s=400&u=ed042c73c404e96b9f572d3530fc8abf7906d867&v=4" width=115><br><sub>Wendy Arcila</sub>](https://github.com/WendyArcila)

