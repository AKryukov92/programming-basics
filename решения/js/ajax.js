function post(destination, data){
	// 1. Создаём новый объект XMLHttpRequest
	var xhr = new XMLHttpRequest();

	// 2. Конфигурируем его: POST-запрос на URL 'handler4342.php'
	xhr.open('POST', destination, false);
	// 3. Отсылаем запрос
	xhr.send(data);
	// 4. Если код ответа сервера не 200, то это ошибка
	if (xhr.status != 200) {
	  // обработать ошибку
	  return xhr.status + ': ' + xhr.statusText; // пример вывода: 404: Not Found
	} else {
	  // вывести результат
	  return xhr.responseText; // responseText -- текст ответа.
	}
}