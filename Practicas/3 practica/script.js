function leerFormulario() {
    var usuario=formulario.usuario.value;
    var contra=formulario.contra.value;

    var nombre=formulario.nombre.value;
    var apellidoP=formulario.apellidoP.value;
    var apellidoM=formulario.apellidoM.value;

    var fdia = document.getElementById("dia");
    var dia = fdia.options[fdia.selectedIndex].text;
    var fmes = document.getElementById("mes");
    var mes = fmes.options[fmes.selectedIndex].text;
    var fanio = document.getElementById("anio");
    var anio = fanio.options[fanio.selectedIndex].text;

    var sexo = document.getElementsByName("genero");
    var genero;
    var b;
 
    for(var i=0; i<sexo.length; i++) {
      if(sexo[i].checked==true){
        b=sexo[i].value;
      }
    }
    if(b=="M"){
      genero="Masculino";
    }else{
      genero="Femenino";
    }

    var correo=formulario.correo.value;

    var s=usuario+","+contra+","+nombre+","+apellidoP+","+apellidoM+","+dia+","+mes+","+anio+","+genero+","+correo;

    guardarCookie(s);

}

function guardarCookie(s){
    document.cookie="datos="+s;
    alert(s);
}


function leerCookie(){
    var cookies = document.cookie;

    for(var i=0; i<cookies.length; i++){    

    }

    

}

/*
function comprobarCookie(){
    var nombreG=leerCookie();
    formulario.nombre.value=nombreG;
    document.cookie=scape("contador="+numVisitas);
}*/