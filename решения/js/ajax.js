function post(destination, data){
	// 1. ������ ����� ������ XMLHttpRequest
	var xhr = new XMLHttpRequest();

	// 2. ������������� ���: POST-������ �� URL 'handler4342.php'
	xhr.open('POST', destination, false);
	// 3. �������� ������
	xhr.send(data);
	// 4. ���� ��� ������ ������� �� 200, �� ��� ������
	if (xhr.status != 200) {
	  // ���������� ������
	  return xhr.status + ': ' + xhr.statusText; // ������ ������: 404: Not Found
	} else {
	  // ������� ���������
	  return xhr.responseText; // responseText -- ����� ������.
	}
}