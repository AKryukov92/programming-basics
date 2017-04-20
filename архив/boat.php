<?php
header('Content-type: application/json');
$situations = array(
	'145'=>'{"id":"145","left":["cabbage","wolf","peasant","goat"],"right":[]}',
	'159'=>'{"id":"159","left":["cabbage","wolf","goat"],"right":["peasant"],"status":"massacre"}',
	'535'=>'{"id":"535","left":["cabbage","goat"],"right":["peasant","wolf"],"status":"goat eat cabbage"}',
	'928'=>'{"id":"928","left":["wolf","goat"],"right":["peasant","cabbage"],"status":"wolf eat goat"}',
	'334'=>'{"id":"334","left":["wolf","cabbage"],"right":["peasant","goat"]}',
	
	'850'=>'{"id":"850","left":["cabbage","wolf","peasant"],"right":["goat"]}',
	'432'=>'{"id":"432","left":["wolf"],"right":["cabbage","peasant","goat"]}',
	'984'=>'{"id":"984","left":["cabbage","wolf","peasant","goat"],"right":[],"status":"goat eat cabbage"}',
	'328'=>'{"id":"328","left":["cabbage"],"right":["wolf","peasant","goat"]}',
	'690'=>'{"id":"690","left":["cabbage","peasant"],"right":["wolf","goat"],"status":"wolf eat goat"}',
	
	'923'=>'{"id":"923","left":["cabbage","peasant","goat"],"right":["wolf"]}',
	'115'=>'{"id":"115","left":["goat"],"right":["cabbage","wolf","peasant"]}',
	'966'=>'{"id":"966","left":["wolf","peasant","goat"],"right":["cabbage"]}',
	'211'=>'{"id":"211","left":["peasant","goat"],"right":["cabbage","wolf"]}',
	'417'=>'{"id":"417","left":[],"right":["cabbage","wolf","peasant","goat"],"status":"task complete"}'
);
if(!isset($_GET["present"])){
	echo $situations['145'];
	return;
}
$present = $_GET["present"];
if($present=="159" || $present == "535" || $present == "928" || $present == "984" || $present == "690"){
	http_response_code(501);
	return;
}
if(!isset($_GET["option"])){
	echo $situations[$present];
	return;
}
$decision = $_GET["option"];
$next = "";
if($present == "145"){
	if ($decision == "peasant"){
		$next = $situations['159'];
	} else if ($decision == "wolf"){
		$next = $situations['535'];
	} else if ($decision == "cabbage"){
		$next = $situations['928'];
	} else if ($decision == "goat"){
		$next = $situations['334'];
	}
}
if($present == "334"){
	if ($decision == "peasant"){
		$next = $situations['850'];
	} else if ($decision == "goat"){
		$next = $situations['145'];
	}
}
if($present == "850"){
	if($decision == "peasant"){
		$next = $situations['334'];
	} else if ($decision == "wolf"){
		$next = $situations['328'];
	} else if ($decision == "cabbage"){
		$next = $situations['432'];
	}
}
if($present == "432"){
	if($decision == "peasant"){
		$next = $situations['984'];
	} else if($decision == "cabbage"){
		$next = $situations['850'];
	} else if($decision == "goat"){
		$next = $situations['966'];
	}
}
if($present == "328"){
	if($decision == "peasant"){
		$next = $situations['690'];
	} else if ($decision == "wolf"){
		$next = $situations['850'];
	} else if ($decision == "goat"){
		$next = $situations['923'];
	}
}
if($present == "923"){
	if($decision == "peasant"){
		$next = $situations['535'];
	} else if ($decision == "goat"){
		$next = $situations['328'];
	} else if ($decision == "cabbage"){
		$next = $situations['115'];
	}
}
if($present == "115"){
	if($decision == "peasant"){
		$next = $situations['211'];
	} else if ($decision == "wolf"){
		$next = $situations['966'];
	} else if ($decision == "cabbage"){
		$next = $situations['923'];
	}
}
if($present == "966"){
	if($decision == "peasant"){
		$next = $situations['928'];
	} else if ($decision == "goat"){
		$next = $situations['432'];
	} else if ($decision == "wolf"){
		$next = $situations['115'];
	}
}
if($present == "211"){
	if($decision == "peasant"){
		$next = $situations['115'];
	} else if ($decision == "goat"){
		$next = $situations['417'];
	}
}
if ($next ==""){
	http_response_code(500);
	return;
}
echo $next;
?>