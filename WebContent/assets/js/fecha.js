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
            	},
            error:function(){alert('error');}
        }
    );
	
    });
$(document).ready ( function(){
	  inicializarTabla();
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
            error:function(){alert('error');}
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













