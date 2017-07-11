
var in9279 = ["ab","bc","ac","cde","a"];
for (var i = 0; i < in9279.length; i++){
	var out = document.getElementById("9279t" + i);
	try {
		out.innerHTML = task9279(in9279[i]);
	} catch(e){
		out.innerHTML = e.message;
	}
}