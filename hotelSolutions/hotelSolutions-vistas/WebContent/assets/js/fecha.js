/**
 * 
 */

$("#traerDias").click(function(){
	document.getElementById('mydiv').innerHTML = '<span class="prego">traido desde el javascript</span>';
	
    });

$("#buscarUsuario").click(function(){
	var nombreDeUsuario = $('#nombreDeUsuario').val();
	$.ajax
    (
        {
            url:'buscarUsuario',
            data:{"nombreDeUsuario":nombreDeUsuario},
            type:'post',
            cache:false,
            success:function(data){
            	document.getElementById('ResultadoBusquedaUsuario').innerHTML = '<i class="fa fa-check"></i>'+data;
            	$('#ResultadoBusquedaUsuario').css({ 'color': "green" });
            	},
            error:function(){
            	document.getElementById('ResultadoBusquedaUsuario').innerHTML = "Usuario inexistente";
            	$('#ResultadoBusquedaUsuario').css({ 'color': "red" });
            }
        }
    );
	
    });
$(document).ready ( function(){
});

$("#seleccionarmes li").click(function(){
	var mes = $(this).attr('data-value');
	var nombreMes = $(this).attr('data-nombre');
	document.getElementById('nombreMesSeleccionado').innerHTML = nombreMes;
	
	$.ajax
    (
        {
            url:'tablaReservas',
            data:{"mes":mes,"anio":2015},
            type:'post',
            cache:false,
            success:function(data){
            	document.getElementById('grillaReservas').innerHTML = data;
            	},
            error:function(){alert('error');}
        }
    );
	
	
});

function  msjBienvenida(name) {
	var ruta= $(location).attr('pathname');
	if(ruta.match(/index.jsp*/)){
		var unique_id = $.gritter.add({
	    // (string | mandatory) the heading of the notification
	    title: 'Bienvenido '+name+'!',
	    // (string | mandatory) the text inside the notification
	    text: 'A traves de este menu podras gestionar tu establecimiento',
	    // (string | optional) the class name you want to apply to that specific message
	    class_name: 'my-sticky-class'
		});
	}
return false;
};

$(function() {
    $('input[name="daterange"]').daterangepicker();
});

function inicializarTabla(){
	var mes = 1;
	var anio=2015;
	$.ajax
    (
        {
            url:'tablaReservas',
            data:{"mes":mes,"anio":anio},
            type:'post',
            cache:false,
            success:function(data){
            	document.getElementById('grillaReservas').innerHTML = data;
            	},
            error:function(){
            	console.log('error al inicializar la tabla de reservas');}
        }
    );
	
	
};

function cantidadDiasMes(mes, anio){	
	var cantidadDias=0;
	
	if (mes == 1){
		cantidadDias= 31;
	}
	else if (mes == 2){
		if (esBisiesto(anio)){
			cantidadDias= 29;
		}
		else cantidadDias= 28;
	}
	else if (mes == 3){
		cantidadDias= 31;
	}
	else if (mes == 4){
		cantidadDias= 30;
	}
	else if (mes == 5){
		cantidadDias= 31;
	}
	else if (mes == 6){
		cantidadDias= 30;
	}
	else if(mes == 7){
		cantidadDias= 31;
	}
	else if(mes == 8){
		cantidadDias= 31;
	}
	else if(mes == 9){
		cantidadDias= 30;
	}
	else if(mes == 10){
		cantidadDias= 31;
	}
	else if(mes == 11){
		cantidadDias= 30;
	}
	else if(mes == 12){
		cantidadDias= 31;
	}
	
	return cantidadDias;
}



function esBisiesto(anio){
	
	if (anio%4 == 0 && anio%100 != 0){
		return true;
	}
	else if(anio%100 == 0 && anio%400 == 0){
		return true;
	 }
	else{
		return false;
	}
 }













