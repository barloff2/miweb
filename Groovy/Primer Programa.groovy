/* groovylint-disable CompileStatic */
@groovy.transform.ToString //con esto convierte la clase en toString para que muestre los atributos
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

Person person = new Person() //Declaraci�n de el objeto Person
person.name = 'Valentina' //Como podemos ver no hay necesidad de crear los getters and setters
//se llama directamente el setter as� se llame atraves de los atributos
person.age(26) //Setear la edad de la persona

println person
//Otra forma de asignar valores con los closure

person.with {
    name = 'Stiven'
    age = 26
}

//Ahora vamos a imprimir
//println "Name: ${person.getName()} Age: ${person.getAge()}" //as� se escriben los String Interpolation, 
//para concatenar un metodo de una persona.
println person

