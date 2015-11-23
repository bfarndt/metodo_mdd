function popup(url) {
	popup(url,300,300);
}

function popup(url,width,height) {
	var left = (screen.width - width) / 2;
	var top = (screen.height - height) / 2;
	var params = 'width=' + width + ', height=' + height;
	params += ', top=' + top + ', left=' + left;
	/*
	 * params += ', directories=no'; params += ', location=no'; params += ',
	 * menubar=no'; params += ', resizable=no'; params += ', scrollbars=no';
	 * params += ', status=no'; params += ', toolbar=no';
	 */
	newwin = window.open(url, 'popupwindow', params);
	if (window.focus) {
		newwin.focus()
	}
}

function reloadImage(imageId) {
	var now = new Date();
	document.getElementById(imageId).src = document.getElementById(imageId).src
			+ "&time=" + now.getTime();
}

function encodeForURL(clearString) {
	return escape(clearString);
}