
alert(1)

function lview(){
	$.ajax({
		url :"http://localhost:8282/jsptest/board/list",
		success : function(re){
			console.log(re)
			let list = JSON.parse(re)
			
			let html = ""
			
			for(let  i = 0; i<list.length ; i++){
				let board = list[i]
				
				html+= '<tr class="m3">' +
							'<td>'+board.no+'</td>'+
							'<td>'+board.title+'</td>'+
							'<td>'+board.wrtier+'</td>'+
							'<td>'+board.date+'</td>'+	
						'</tr>'
			}
				console.log(html)
			document.querySelector(".list1").innerHTML += html
			
		}
		
		
		
		
	})


}