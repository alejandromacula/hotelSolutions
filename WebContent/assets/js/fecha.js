/**
 * 
 */

$("#traerDias").click(function(){
	document.getElementById('mydiv').innerHTML = '<span class="prego">traido desde el javascript</span>';

    });

$("#seleccionarmes li").click(function(){
	var mes = $(this).attr('data-value');
	generarGrilla(mes, 2015);
	
});

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













