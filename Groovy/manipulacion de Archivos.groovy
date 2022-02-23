//Esta es la forma en la que se lee un archivo 
/*
File file = new File('/home/stiven/Escritorio/README')

file.eachLine { line->
    println line
}

//ahora vamos a listar los archivos que tenemos en el escritorio

File directory = new File('/home/stiven/Escritorio')

directory.eachFile {
    println it.name
}

//ahora de otra formam, aca devuelve una lista de todos los archivos

println directory.list() 

List<String> namesFiles = []
List<String> namesDirectory = []

directory.eachFile{ file
    if( file.isFile() ) {
        namesFiles << file.name
    }
}

//aca podemos restar lo que esta en directory a namesFiles
namesDirectory = directory.list() - namesFiles

println namesDirectory
println namesFiles
*/
//ahora vamos a declarar el regex para hacer las expresiones regulares


//Puede empezar en lo que sea pero tiene que terminar en .groovy
String regex = /.*\.groovy/

File files = new File('/home/stiven/Escritorio/Groovy')
List<String> namesFiles = []

//hay que poner en los parametros de el metodo "~" y el nombre de la variable donde se guardo 
//la expresion regular

files.eachFileMatch(~regex) { file ->
    namesFiles << file.name
}
println namesFiles

files.eachFile(FileType.FILES){
    namesFiles
}

