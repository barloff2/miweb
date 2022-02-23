/*
//1. Creamos un closure muy simple.
//imprime el mensaje "Hola desde un closure"
def hola={
  println("Hola desde un closure")
}

//invocar closure "hola"
hola()



//2. Ahora un closure con un parámetro.
//multiplica un número por 2

def doble = { n ->
    n*2
}

//invocar closure "doble"

def numero = doble(10)
println ("el doble de 5 es: ${numero}")



//3. Ahora un closure con dos parámetros.

def var = "Vale"
//Imprime el valor de var y el parámetro que le envie el usuario
def msg1 = { it ->
    println "${var} ${it}"
}
//invocamos el closure, debe salir el mensaje "Vale ..."
msg1("verga")



//4. Closure más complejo, recibe un método como parámetro.

//defino un closure con dos parámetros
def otro = { metodo, parametro ->
    metodo(parametro)
}

//ahora defino dos closure que reciban un solo parámetro
def inicio = { it ->
    println "Hola ${it}"
}
def fin = { it ->
    println "Adios ${it}"
}
//invoco el closure "otro"
otro(inicio, "Valentina")
otro(fin, "Stiven")



//5. Mandamos una lista a un closure.

//defino una lista

def lista = ["Andrea","Fernando", "Antonio", "Lucero", "Veronica"]
//uso el closure inicio
println "\n"
lista.each inicio

*/

//6. Ejemplo con closures y diccionarios.

//defino el diccionario
def dicc = ['Fernando':31, 'Veronica':27, 'Maria':43, 'Yezmin':26, 'Horacio':15]
def suma = 0
//defino el closure
def edadTotal = { x ->
x.each{
    suma+=it.value
}
println("Suma total de edades: "+suma)
}
//invoco el closure
edadTotal(dicc)