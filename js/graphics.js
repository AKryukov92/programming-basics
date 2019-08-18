function Pen(canvasBlock){
	var ctx = canvasBlock.getContext("2d");
	ctx.strokeStyle="red";
	var draw = false;
	var x = 0;
	var y = 0;
	var step = 10;
	ctx.beginPath();
	this.startLine = function(){
		draw = true;
	}
	this.endLine = function(){
		draw = false;
		ctx.stroke();
	}
	function move(){
		if (draw){
			ctx.lineTo(x, y);
		} else {
			ctx.moveTo(x, y);
		}
	}
	this.down = function(){
		y += step;
		move();
	}
	this.up = function(){
		y -= step;
		move();
	}
	this.left = function(){
		x -= step;
		move();
	}
	this.right = function(){
		x += step;
		move();
	}
}