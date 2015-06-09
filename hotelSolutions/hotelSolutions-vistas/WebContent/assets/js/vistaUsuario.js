/**
 * 
 */
$("#boton").click(function(){
	var desde = $('#desde').val();
	var hasta = $('#hasta').val();
	var tipoDeHabitacion = $('#tipoHabitacion').val();
	
	
	$.ajax
    (
        {
            url:'consultaDisponibilidad',
            data:{"desde":desde, "hasta":hasta, "tipoDeHabitacion":tipoDeHabitacion},
            type:'post',
            cache:false,
            success:function(data){
            	document.getElementById('resultadoConsulta').innerHTML = data;
            	$('#myModal').modal();
            	},
            error:function(){
            	console.log("error al consutar disponibilidad");
            }
        }
    );
	
});
