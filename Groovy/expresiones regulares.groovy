/*
//~ este es un pattern

//==~  este operador se llama matchOperator, este se usa para que empate exactamente con la expresion regular
//=~ este es un matcher, se utiliza para encontrar si esta el valor no importa su posicion

String message = 'Este es test un para regex'
def pattern = 'test'

assert message =~ pattern */

//Vamos a crear un regex para validad que un telefono comience con tres digitos

def phoneRegex = /([\d]{3}[\s-]){2}\d{4}/

List phones = [ '311-218-2048', '302-459-9813', '315-378-9443', '322 555 8888', '325 999 55559']
/*
phones.each {phone ->
    assert phone ==~ phoneRegex
}

String message = "Este es un test"
assert message =~ /test/*/

//Ejemplo real

class Person{
    String name
    int age
    String phone
    
    void setPhone(String phone){
        if( !(phone ==~ /([\d]{3}[\s-]){2}\d{4}/) ){ //aca estoy negando el matcher
            throw new RuntimeException('Telefono invalido')
        }
        this.phone = phone
    }
    
}

Person person = new Person()
person.with{
    name = "Stiven"
    age = 26
    phone = "123-356-6359"
}

println person.phone