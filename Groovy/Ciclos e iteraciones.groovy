List names = ["Stiven","Valentina","Matias","Mireya","Hector","Jhohan","Willy"]
Map people = [stiven:26,valentina:26,matias:5,mireya:46,hector:47,jhohan:23,willy:2]
/*
* For maneras de escribirlo
*/
//For clasico
for (int i = 0; i < names.size(); i++){
    print names[i] + "  "
}

//Otra manera de for

for (String name in names){
    print names[i] + "  "
}

//Foreach 

for (String name : names){
    print names[i] + "  "
}


// While
int count = names.size()

while(count){
    print names[--count] + "  "
}


//Do while
int count = names.size()
do{
    print names[--count] + "  "
} while (count) 



//Con el for tambien se puede hacer iteracion de rangos

* Este for tambien se puede con rango de numeros negativos y positivos no solo de menor a mayor si no de mayor a menor
* Igualmente se puede realizar con el abecedario
* Es para rangos en general
*/
/*
for ( i in 1.. (names.size() -1 ) ) {
    print names[i] + " "
}

//vamos a iterar el mapa people
for(i in people){
    print "\n${i.key} - ${i.value}" //print interpolation
}



//each de groovy más simplificado

names.each{ print it + " " }

//tambien con mapas

people.each{ println "${it.key} - ${it.value}" }

//tambien se pueden poner variables para almacenar los datos y no utilizar it, para que el codigo sea mas entendible

people.each{ key, value -> 
    println"$key - $value"
}

//ahora con nombres

names.each { name -> print name + " " }


/*
*Tambien se puede iterar los rangos
*/

println ""
int count = names.size()
(0..count).each{ number -> print number + " "}

//ahora con letras
println ""
('a'..'z').each { letter -> print letter + " " }

println ""
//Tambien se puede utilizar en un String, para iterar cada uno de los caracteres

"Laura valentina rodriguez".each { charter -> print charter + " " } //este character es de tipo String, se puede tipar charater a char para que sea de esa clase



/*
* Step
*/

//Se compone del numero inicial o valor inicial, el valor o numero final y los saltos que da
1.step (10, 2){
    print it + " "
}
println ""

//tambien se puede realizar restando, igual se puede realizar con puntos flotantes
10.step (1, -2){
    print it + " "
}

/*
* Contador upto y downto
* Va incrementando de uno en uno
* Va decrementando de uno en uno
*/

println ""
//upto
1.upto(10){ print it + " "}
println""
//downto
10.downto(1){ print it + " "}

