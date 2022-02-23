@groovy.transform.ToString //con esto convierte la clase en toString para que muestre los atributos
@groovy.transform.Canonical // trae varias anotaciones más
//el orden se muestra segun el orden de los atributos o propiedades.
class Person{
    String name
    int age
    
    /*
    //estos dos metodos se llaman automaticamente.
    void setName(String name){
        println "Calling setName on Person"
        this.name = name
    }
    int getAge(){
        println "calling getAge on person"
        age
    }*/
    
}
//Insertar datos

Person person = new Person([name: "Stiven", age:26]) //Declaración de el objeto Person
Person person2 = [name:"Valentina", age:26] //otra manera de declarar un objeto con las variables ya asignadas, se tiene que conocer el orden
Person person3 = ["Matias", 5] //Como si fuera una lista con la importacion de canonical tambien funciona
/*person.name = "Valentina" //Como podemos ver no hay necesidad de crear los getters and setters
se llama directamente el setter así se llame atraves de los atributos

person.setAge(26) //Setear la edad de la persona*/


//Otra forma de asignar valores con los closure
/*
person.with {
    name = "Stiven"
    age = 26
}*/


//Ahora vamos a imprimir
//println "Name: ${person.getName()} Age: ${person.getAge()}" //así se escriben los String Interpolation, para concatenar un metodo de una persona.
println person
println person2
println person3

/*
//Declaración de Mapas
Map map = [:]
println map.getClass()


//Declaracion de listas
List list = []
println list.class
*/