/*Tercer Video*/

def list = [] //De esta manera se define una lista, por default es un arraylist
def list2 = new Vector() //de esta manera se define como vector
def list3 = new LinkedList() // lista enlazada

/*
 Tipos de datos por default
 Un mapa es un conjunto de elementos clave/valor
 Sintaxis:
 def mapa = ["clave1":"valor1","clave2":"valor2","clave3":"valor3",...,"claveN":"valorN"]
 Ejemplo:
 def mapa = ["c1":"Victor","c2":"Julio","c3":"Elena","c4":"Patricia"]
*//*
def name = '"Developer"'
def map = [class:[name:"Valentina"]] // declaramos un mapa y le damos como valor otro mapa con la llave name y el valor valentina, la palabra reservada class se puede usar

def elements = [1,                            //java.lang.Integer
                111111111111,                 //java.lang.Long
                11111111111111111111,         //java.math.BigInteger
                0.1,                          //java.math.BigDecimal
                0..5,                         //groovy.lang.IntRange
                'x'..'p',                     //groovy.lang.ObjectRange
                "Normal String",              //java.lang.String
                'Another normal String',      //java.lang.String  
                "GString with value $name",   //groovy.lang.GString
                [],                           //java.lang.ArrayList
                ]
elements.each{ println """
$it
     -${it.class.name}

""" } //it es la variable por default que nos da todos los cloushers de java.
println map.class.name //cuando es mapa hay que declarar el getClass() no solo el class, aca muestra el valor de name en este mapa





/*Mostrar Por pantalla
println list.class.name
/*println list2.class.name
println list3.class.name*/



Closure write = {param -> 
     println param
     println param.class.name
}

//aca definimos una variable sin decirle que tipo de datos es

def something = 1

write(something)

something = 1.0

write(something)
 
something = "Matias"

write(something) // igualmente se le puede pasar el parametro directamente a el closure

//imprimimos, esto lo podemos hacer con un Closure
/*println something
println something.class.name //Integer


//cambiamos el valor de la variable


//imprimimos, esto lo podemos hacer con un Closure
println something
println something.class.name    //BigDecimal

//cambiamos el valor de la variable


//imprimimos, esto lo podemos hacer con un Closure
println something
println something.class.name //String*/