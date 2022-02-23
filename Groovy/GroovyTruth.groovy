//groovy Truth es como groovy ve los objetos, para groovy
/*
int valor = 0 // Un numero entero de valor 0 es falso

def validate = { value ->
    println value
        ? "El valor es verdadero"
        : "El valor es falso"
}

validate("")


    Un punto flotante 0.0 es falso
    Una lista vacia es falso
    Un mapa que esta vacio es falso
    Un bool False va a ser falso
    Una variable es null va a ser falso
    Un String viene vacio va a ser falso
    Todo lo que este vacio es falso

*/

class Person{
    String name
    int age
    
    //Se puede soobrescribir un metodo donde devuelve un boolean
    boolean asBoolean(){
        age >= 18
    }
    
    //toString, asi se escribe en una sola linea
    String toString(){ name }
}

Person person = new Person()

person.with { //Se utiliza para hacer operaciones para el objeto
    name = "Stiven"
    age = 17
}
/*
if(person) { //cuando se tiene el motodo asBoolean con solo llamar el objeto valida ese metodo y nos devuelve el resultado de la condicion
    println "Es valido y mayor de edad"
}else{
    println "No es valido o menor de edad"
}*/


//Operador Elvis

//operador ternario izquierda verdadero derecha falso
println person ? person.name : "La persona no es valida"

//operador elvis devuelve lo que esta a la izquierda del "?" y si no lo de la derecha, siempre y cuando sobrecargemos el metodo toString con 
//el atributo que queremos imprimir ejemplo:

println person ?: "La persona no es valida"

/* PowerAssert 
   Los asserts o invariant son para verificar si el código funciona. no es para el usuario si no para el programador
   
*/

//Cuando falla nos muestra en que fallo por medio de la terminal
assert person.name.contains('s') 




