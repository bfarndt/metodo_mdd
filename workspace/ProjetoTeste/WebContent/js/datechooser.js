/*
DateChooser 2.0
March 23, 2007
For usage details see http://yellow5.us/projects/datechooser/

Creative Commons Attribution 2.0 License
http://creativecommons.org/licenses/by/2.0/
*/

if (typeof(objPHPDate) == 'undefined')
{
	var objPHPDate =
	{
		aDay: ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday'],
		aShortDay: ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat'],
		aLetterDay: ['S', 'M', 'T', 'W', 'T', 'F', 'S'],
		aMonth: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
		aShortMonth: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'],
		aSuffix: ['th', 'st', 'nd', 'rd', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'st', 'nd', 'rd', 'th', 'th', 'th', 'th', 'th', 'th', 'th', 'st'],
		sTimezoneOffset: '',

		GetTimezoneOffset: function()
		{
			var objLocal = new Date();
			objLocal.setHours(0);
			objLocal.setMinutes(0);
			objLocal.setSeconds(0);
			objLocal.setMilliseconds(0);

			var objUTC = new Date();
			objUTC.setFullYear(objLocal.getUTCFullYear());
			objUTC.setMonth(objLocal.getUTCMonth());
			objUTC.setDate(objLocal.getUTCDate());
			objUTC.setHours(objLocal.getUTCHours());
			objUTC.setMinutes(objLocal.getUTCMinutes());
			objUTC.setSeconds(objLocal.getUTCSeconds());
			objUTC.setMilliseconds(objLocal.getUTCMilliseconds());

			this.sTimezoneOffset = ((objLocal.getTime() - objUTC.getTime()) / (1000 * 3600));
			var bNegative = (this.sTimezoneOffset < 0);
			objLocal = null;
			objUTC = null;

			this.sTimezoneOffset  = bNegative ? (this.sTimezoneOffset + '').substring(1) : this.sTimezoneOffset + '';
			this.sTimezoneOffset  = this.sTimezoneOffset.replace(/\.5/, (parseInt('$1', 10) * 60) + '');
			this.sTimezoneOffset += (this.sTimezoneOffset.substring(this.sTimezoneOffset.length - 3) != ':30') ? ':00' : '';
			this.sTimezoneOffset  = (this.sTimezoneOffset.substr(0, this.sTimezoneOffset.indexOf(':')).length == 1) ? '0' + this.sTimezoneOffset : this.sTimezoneOffset;
			this.sTimezoneOffset  = bNegative ? '-' + this.sTimezoneOffset : '+' + this.sTimezoneOffset;

			return true;
		},

		PHPDate: function()
		{
			var sFormat = (arguments.length > 0) ? arguments[0] : '';

			var nYear = this.getFullYear();
			var sYear = nYear + '';

			var nMonth = this.getMonth();
			var sMonth = (nMonth + 1) + '';
			var sPaddedMonth = (sMonth.length == 1) ? '0' + sMonth : sMonth;

			var nDate = this.getDate();
			var sDate = nDate + '';
			var sPaddedDate = (sDate.length == 1) ? '0' + sDate : sDate;

			var nDay = this.getDay();
			var sDay = nDay + '';

			var nHours = this.getHours();

			var sHour12 = (nHours % 12) + '';
			if (sHour12 == '0') sHour12 = '12';
			var sPaddedHour12 = (sHour12.length == 1) ? '0' + sHour12 : sHour12;

			var sHour24 = nHours + '';
			var sPaddedHour24 = (sHour24.length == 1) ? '0' + sHour24 : sHour24;

			var sMinutes = this.getMinutes() + '';
			if (sMinutes.length == 1) sMinutes = '0' + sMinutes;

			var sSeconds = this.getMinutes() + '';
			if (sSeconds.length == 1) sSeconds = '0' + sSeconds;

			var sMeridiem = (this.getHours() < 12) ? 'am' : 'pm';

			sFormat = sFormat.replace(/([AacDdFGgHhijLlMmNnrSsUwYy])/g, 'y5-cal-regexp:$1');
			sFormat = sFormat.replace(/y5-cal-regexp:A/, sMeridiem.toUpperCase());
			sFormat = sFormat.replace(/y5-cal-regexp:a/, sMeridiem);
			sFormat = sFormat.replace(/y5-cal-regexp:c/, sYear + '-' + sPaddedMonth + '-' + sPaddedDate + 'T00:00:00' + objPHPDate.sTimezoneOffset);
			sFormat = sFormat.replace(/y5-cal-regexp:D/, objPHPDate.aShortDay[nDay]);
			sFormat = sFormat.replace(/y5-cal-regexp:d/, sPaddedDate);
			sFormat = sFormat.replace(/y5-cal-regexp:F/, objPHPDate.aMonth[nMonth]);
			sFormat = sFormat.replace(/y5-cal-regexp:G/, sHour24);
			sFormat = sFormat.replace(/y5-cal-regexp:g/, sHour12);
			sFormat = sFormat.replace(/y5-cal-regexp:H/, sPaddedHour24);
			sFormat = sFormat.replace(/y5-cal-regexp:h/, sPaddedHour12);
			sFormat = sFormat.replace(/y5-cal-regexp:i/, sMinutes);
			sFormat = sFormat.replace(/y5-cal-regexp:j/, nDate);
			sFormat = sFormat.replace(/y5-cal-regexp:L/, objPHPDate.aLetterDay[nDay]);
			sFormat = sFormat.replace(/y5-cal-regexp:l/, objPHPDate.aDay[nDay]);
			sFormat = sFormat.replace(/y5-cal-regexp:M/, objPHPDate.aShortMonth[nMonth]);
			sFormat = sFormat.replace(/y5-cal-regexp:m/, sPaddedMonth);
			sFormat = sFormat.replace(/y5-cal-regexp:N/, (nDay == 0) ? 7 : nDay);
			sFormat = sFormat.replace(/y5-cal-regexp:n/, sMonth);
			sFormat = sFormat.replace(/y5-cal-regexp:r/, objPHPDate.aShortDay[nDay] + ', ' + sPaddedDate + ' ' + objPHPDate.aShortMonth[nMonth] + ' ' + sYear + ' 00:00:00 ' + objPHPDate.sTimezoneOffset.replace(/:/, ''));
			sFormat = sFormat.replace(/y5-cal-regexp:S/, objPHPDate.aSuffix[nDate]);
			sFormat = sFormat.replace(/y5-cal-regexp:s/, sSeconds);
			sFormat = sFormat.replace(/y5-cal-regexp:U/, parseInt((this.getTime() / 1000), 10));
			sFormat = sFormat.replace(/y5-cal-regexp:w/, nDay);
			sFormat = sFormat.replace(/y5-cal-regexp:Y/, sYear);
			sFormat = sFormat.replace(/y5-cal-regexp:y/, sYear.substring(2));

			return sFormat;
		}
	};

	objPHPDate.GetTimezoneOffset();
	Date.prototype.getPHPDate = objPHPDate.PHPDate;
}

function DateChooser()
{
	/* These values are defaults. Please feel free to modify them as needed. */

	var nWeekStartDay = 0; // On which day does your calendar week start? 0 = Sunday, 1 = Monday, etc.
	var nXOffset = 0; // In pixels, how far to the left or right of the mouse click do you want DateChooser to appear? Use negative values to place it to the left.
	var nYOffset = 0; // In pixels, how far above or below the mouse click do you want the DateChooser to appear? Use negative values to place it higher.
	var nTimeout = 0; // In milliseconds, how long should the DateChooser be visible after the user's mouse leaves its boundary? 0 = Until the mouse is clicked.
	var objAllowedDays = {'0':true, '1':true, '2':true, '3':true, '4':true, '5':true, '6':true}; // Are there any days of the week that should not be allowed as a choice? 0 = Sunday, 1 = Monday, etc.
	var fnUpdate = null; // What function, if any, do you wish to call after a new date has been chosen?
	var sDefaultIcon = false; // What image file do you want to use as the clickable DateChooser icon? If none, use boolean false.
	var objUpdateFields = {}; // {'monthselectex4':'n', 'dayselectex4':'j', 'yearselectex4':'Y'}
	var objEarliestDate = null;
	var objLatestDate = null;

	/* End user-editable values */

	if (!arguments || !document.getElementById || !document.getElementsByTagName) return null;
	var ndBodyElement = document.getElementsByTagName('body').length ? document.getElementsByTagName('body')[0] : document;
	var objTimeout = null;
	var ndFrame = null;

	/*@cc_on@*/
	/*@if(@_jscript_version < 6)
		if (document.getElementById('iframehack'))
		{
			ndFrame = document.getElementById('iframehack');
		}
		else
		{
			ndFrame = xb.createElement('iframe');
			ndFrame.id = 'iframehack';
			ndFrame.src = 'javascript:null;';
			ndFrame.scrolling = 'no';
			ndFrame.frameBorder = 0;
			ndFrame.style.border = '0';
			ndFrame.style.padding = 0;
			ndFrame.style.display = 'none';
			ndFrame.style.position = 'absolute';
			ndFrame.style.zIndex = '5000';

			ndBodyElement.appendChild(ndFrame);
		}
	/*@end@*/

	var nDateChooserID = 0;
	while (document.getElementById('calendar' + nDateChooserID)) ++nDateChooserID;
	var sDateChooserID = 'calendar' + nDateChooserID;

	var objSelectedDate = null;

	var objStartDate = new Date();
	objStartDate.setHours(0);
	objStartDate.setMinutes(0);
	objStartDate.setSeconds(0);
	objStartDate.setMilliseconds(0);

	var objMonthYear = new Date(objStartDate);
	objMonthYear.setDate(1);

	var ndDateChooser = xb.createElement('div');
	ndDateChooser.id = sDateChooserID;
	ndDateChooser.className = 'calendar';
	ndDateChooser.style.visibility = 'hidden';
	ndDateChooser.style.position = 'absolute';
	ndDateChooser.style.zIndex = '5001';
	ndDateChooser.style.top = '0';
	ndDateChooser.style.left = '0';
	ndBodyElement.appendChild(ndDateChooser);

	var AddClickEvents = function()
	{
		var aNavLinks = ndDateChooser.getElementsByTagName('thead')[0].getElementsByTagName('a');
		for (var nNavLink = 0; nNavLink < aNavLinks.length; ++nNavLink)
		{
			events.add(aNavLinks[nNavLink], 'click', function(e)
			{
				e = e || window.event;
				var ndClicked = e.target || e.srcElement;
				if (ndClicked.nodeName == '#text') ndClicked = ndClicked.parentNode;

				var sClass = ndClicked.className;

				if (sClass == 'previousyear')
				{
					objMonthYear.setFullYear(objMonthYear.getFullYear() - 1);
					if (objEarliestDate && objEarliestDate.getTime() > objMonthYear.getTime())
					{
						objMonthYear.setFullYear(objEarliestDate.getFullYear());
						objMonthYear.setMonth(objEarliestDate.getMonth());
					}
				}
				else if (sClass == 'previousmonth')
				{
					objMonthYear.setMonth(objMonthYear.getMonth() - 1);
					if (objEarliestDate && objEarliestDate.getTime() > objMonthYear.getTime())
					{
						objMonthYear.setFullYear(objEarliestDate.getFullYear());
						objMonthYear.setMonth(objEarliestDate.getMonth());
					}
				}
				else if (sClass == 'currentdate')
				{
					objMonthYear.setFullYear(objStartDate.getFullYear());
					objMonthYear.setMonth(objStartDate.getMonth());
				}
				else if (sClass == 'nextmonth')
				{
					objMonthYear.setMonth(objMonthYear.getMonth() + 1);
					if (objLatestDate && objLatestDate.getTime() < objMonthYear.getTime())
					{
						objMonthYear.setFullYear(objLatestDate.getFullYear());
						objMonthYear.setMonth(objLatestDate.getMonth());
					}
				}
				else if (sClass == 'nextyear')
				{
					objMonthYear.setFullYear(objMonthYear.getFullYear() + 1);
					if (objLatestDate && objLatestDate.getTime() < objMonthYear.getTime())
					{
						objMonthYear.setFullYear(objLatestDate.getFullYear());
						objMonthYear.setMonth(objLatestDate.getMonth());
					}
				}

				RefreshDisplay();
				return false;
			});
		}

		var aDateLinks = ndDateChooser.getElementsByTagName('tbody')[0].getElementsByTagName('a');
		for (var nDateLink = 0; nDateLink < aDateLinks.length; ++nDateLink)
		{
			events.add(aDateLinks[nDateLink], 'click', function(e)
			{
				e = e || window.event;
				var ndClicked = e.target || e.srcElement;
				if (ndClicked.nodeName == '#text') ndClicked = ndClicked.parentNode;

				for (var nLink = 0; nLink < aDateLinks.length; ++nLink)
				{
					if (aDateLinks[nLink].className == 'selecteddate') aDateLinks[nLink].removeAttribute('class');
				}

				var objTempDate = new Date(objMonthYear);
				objTempDate.setDate(parseInt(ndClicked.childNodes[0].nodeValue, 10));

				var nTime = objTempDate.getTime();
				var sWeekday = objTempDate.getPHPDate('w');
				objTempDate = null;

				if (objEarliestDate && objEarliestDate.getTime() > nTime) return false;
				if (objLatestDate && objLatestDate.getTime() < nTime) return false;
				if (!objAllowedDays[sWeekday]) return false;

				objMonthYear.setTime(nTime);
				objMonthYear.setDate(1);
				if (!objSelectedDate) objSelectedDate = new Date(nTime);
				objSelectedDate.setTime(nTime);
				ndClicked.className = 'selecteddate';

				if (ndFrame) ndFrame.style.display = 'none';
				ndDateChooser.style.visibility = 'hidden';

				if (objTimeout) clearTimeout(objTimeout);

				UpdateFields();

				if (fnUpdate) fnUpdate(objSelectedDate);
				return false;
			});
		}

		return true;
	};

	var UpdateFields = function()
	{
		if (!objSelectedDate) return true;

		for (var sFieldName in objUpdateFields)
		{
			var ndField = document.getElementById(sFieldName);
			if (ndField) ndField.value = objSelectedDate.getPHPDate(objUpdateFields[sFieldName]);
		}

		return true;
	};

	var RefreshDisplay = function()
	{
		var ndTable, ndTHead, ndTR, ndTH, ndA, ndTBody, ndTD, nTime, sWeekday;
		var sClass = '';

		var objTempDate = new Date(objMonthYear);

		var objToday = new Date();
		objToday.setHours(0);
		objToday.setMinutes(0);
		objToday.setSeconds(0);
		objToday.setMilliseconds(0);

		ndTable = xb.createElement('table');
		ndTable.setAttribute('summary', 'DateChooser');

		ndTHead = xb.createElement('thead');
		ndTable.appendChild(ndTHead);

		ndTR = xb.createElement('tr');
		ndTHead.appendChild(ndTR);

		ndTH = xb.createElement('th');
		ndTR.appendChild(ndTH);
		ndA = xb.createElement('a');
		ndA.className = 'previousyear';
		ndA.setAttribute('href', '#');
		ndA.setAttribute('title', 'Previous Year');
		ndTH.appendChild(ndA);
		ndA.appendChild(document.createTextNode(String.fromCharCode(171)));

		ndTH = xb.createElement('th');
		ndTR.appendChild(ndTH);
		ndA = xb.createElement('a');
		ndA.className = 'previousmonth';
		ndA.setAttribute('href', '#');
		ndA.setAttribute('title', 'Previous Month');
		ndTH.appendChild(ndA);
		ndA.appendChild(document.createTextNode(String.fromCharCode(60)));

		ndTH = xb.createElement('th');
		ndTH.setAttribute('colspan', '3');
		/*@cc_on@*/
		/*@if(@_jscript_version < 6)
			ndTH.colSpan = '3';
		/*@end@*/
		ndTR.appendChild(ndTH);
		ndA = xb.createElement('a');
		ndA.className = 'currentdate';
		ndA.setAttribute('href', '#');
		ndA.setAttribute('title', 'Current Date');
		ndTH.appendChild(ndA);
		ndA.appendChild(document.createTextNode(objMonthYear.getPHPDate("M Y")));

		ndTH = xb.createElement('th');
		ndTR.appendChild(ndTH);
		ndA = xb.createElement('a');
		ndA.className = 'nextmonth';
		ndA.setAttribute('href', '#');
		ndA.setAttribute('title', 'Next Month');
		ndTH.appendChild(ndA);
		ndA.appendChild(document.createTextNode(String.fromCharCode(62)));

		ndTH = xb.createElement('th');
		ndTR.appendChild(ndTH);
		ndA = xb.createElement('a');
		ndA.className = 'nextyear';
		ndA.setAttribute('href', '#');
		ndA.setAttribute('title', 'Next Year');
		ndTH.appendChild(ndA);
		ndA.appendChild(document.createTextNode(String.fromCharCode(187)));

		ndTR = xb.createElement('tr');
		ndTHead.appendChild(ndTR);

		for (var nDay = 0; nDay < objPHPDate.aLetterDay.length; ++nDay)
		{
			ndTD = xb.createElement('td');
			ndTR.appendChild(ndTD);
			ndTD.appendChild(document.createTextNode(objPHPDate.aLetterDay[(nWeekStartDay + nDay) % objPHPDate.aLetterDay.length]));
		}

		ndTBody = xb.createElement('tbody');
		ndTable.appendChild(ndTBody);

		while (objTempDate.getMonth() == objMonthYear.getMonth())
		{
			ndTR = xb.createElement('tr');
			ndTBody.appendChild(ndTR);

			for (nDay = 0; nDay < 7; ++nDay)
			{
				var nWeek = (nWeekStartDay + nDay) % objPHPDate.aLetterDay.length;
				if ((objTempDate.getDay() == nWeek) && (objTempDate.getMonth() == objMonthYear.getMonth()))
				{
					nTime = objTempDate.getTime();
					sWeekday = objTempDate.getPHPDate('w');

					sClass  = (objSelectedDate && (objTempDate.getTime() == objSelectedDate.getTime())) ? 'selectedday' : '';
					sClass += (objTempDate.getTime() == objToday.getTime()) ? ' today' : '';
					sClass  = ((sClass.length > 0) && (sClass[1] == ' ')) ? sClass.substr(1, sClass.length - 1) : sClass;

					ndTD = xb.createElement('td');
					if ((objEarliestDate && objEarliestDate.getTime() > nTime) || (objLatestDate && objLatestDate.getTime() < nTime) || !objAllowedDays[sWeekday]) ndTD.className = 'invalidday';
					ndTR.appendChild(ndTD);

					ndA = xb.createElement('a');
					if (sClass.length > 0) ndA.className = sClass;
					ndA.setAttribute('href', '#');
					ndTD.appendChild(ndA);
					ndA.appendChild(document.createTextNode(objTempDate.getDate()));

					objTempDate.setDate(objTempDate.getDate() + 1);
				}
				else
				{
					ndTD = xb.createElement('td');
					ndTR.appendChild(ndTD);
				}
			}
		}

		while (ndDateChooser.hasChildNodes()) ndDateChooser.removeChild(ndDateChooser.firstChild);
		ndDateChooser.appendChild(ndTable);

		if (ndFrame)
		{
			ndFrame.style.display = 'block';
			ndFrame.style.top = ndDateChooser.style.top;
			ndFrame.style.left = ndDateChooser.style.left;
			ndFrame.style.width = (ndTable.clientWidth + 2) + 'px';
			ndFrame.style.height = (ndTable.clientHeight + 4) + 'px';
		}

		objTempDate = null;
		objToday = null;

		AddClickEvents();

		return true;
	};

	var DisplayDateChooser = function()
	{
		var sPositionX = (arguments.length > 0) ? arguments[0] : 'auto';
		var sPositionY = (arguments.length > 1) ? arguments[1] : 'auto';

		var ndStyle = ndDateChooser.style;
		ndStyle.top = sPositionY + '';
		ndStyle.left = sPositionX + '';

		ndDateChooser.style.visibility = 'visible';
		if (objTimeout) clearTimeout(objTimeout);

		if (objSelectedDate)
		{
			objMonthYear.setTime(objSelectedDate.getTime());
		}
		else
		{
			objMonthYear.setTime(objStartDate.getTime());
		}

		objMonthYear.setHours(0);
		objMonthYear.setMinutes(0);
		objMonthYear.setSeconds(0);
		objMonthYear.setMilliseconds(0);
		objMonthYear.setDate(1);

		return RefreshDisplay();
	};

	var GetPosition = function(ndNode)
	{
		var nTop = 0, nLeft = 0;
		if (ndNode.offsetParent)
		{
			nTop = ndNode.offsetTop;
			nLeft = ndNode.offsetLeft;

			while (ndNode.offsetParent)
			{
				ndNode = ndNode.offsetParent;

				nTop += ndNode.offsetTop;
				nLeft += ndNode.offsetLeft;
			}
		}

		return ({'top' : nTop, 'left' : nLeft});
	};

	this.displayPosition = function()
	{
		var sPositionX = (arguments.length > 0) ? arguments[0] : 'auto';
		var sPositionY = (arguments.length > 1) ? arguments[1] : 'auto';

		return DisplayDateChooser(sPositionX, sPositionY);
	};

	this.display = function(e)
	{
		e = e || window.event;

		var ndClicked = e.target || e.srcElement;
		if (ndClicked.nodeName == '#text') ndClicked = ndClicked.parentNode;

		var objPosition = GetPosition(ndClicked);

		DisplayDateChooser(objPosition.left + nXOffset + 'px', objPosition.top + nYOffset + 'px');

		return false;
	};

	this.setXOffset = function()
	{
		nXOffset = ((arguments.length > 0) && (typeof(arguments[0]) == 'number')) ? parseInt(arguments[0], 10) : nXOffset;

		return true;
	};

	this.setYOffset = function()
	{
		nYOffset = ((arguments.length > 0) && (typeof(arguments[0]) == 'number')) ? parseInt(arguments[0], 10) : nYOffset;

		return true;
	};

	this.setCloseTime = function()
	{
		nTimeout = ((arguments.length > 0) && (typeof(arguments[0]) == 'number') && (arguments[0] >= 0)) ? arguments[0] : nTimeout;

		return true;
	};

	this.setUpdateFunction = function()
	{
		if ((arguments.length > 0) && (typeof(arguments[0]) == 'function')) fnUpdate = arguments[0];

		return true;
	};

	this.setUpdateField = function()
	{
		objUpdateFields = {};
		if ((typeof(arguments[0]) == 'string') && (typeof(arguments[1]) == 'string') && document.getElementById(arguments[0]))
		{
			objUpdateFields[arguments[0]] = arguments[1];
		}
		else if ((typeof(arguments[0]) == 'object') && (typeof(arguments[1]) == 'object'))
		{
			for (var nField = 0; nField < arguments[0].length; ++nField)
			{
				if (nField >= arguments[1].length) break;
				objUpdateFields[arguments[0][nField]] = arguments[1][nField];
			}
		}
		else if (typeof(arguments[0]) == 'object')
		{
			objUpdateFields = arguments[0];
		}

		return true;
	};

	this.setLink = function()
	{
		var sLinkText = ((arguments.length > 0) && (typeof(arguments[0]) == 'string')) ? arguments[0] : 'Choose a date';
		var ndNode = ((arguments.length > 1) && (typeof(arguments[1]) == 'string')) ? document.getElementById(arguments[1]) : null;
		var bPlaceRight = ((arguments.length <= 2) || arguments[2]);
		var sTitleText = ((arguments.length > 3) && (typeof(arguments[3]) == 'string')) ? arguments[3] : 'Click to choose a date';

		if (!ndNode) return false;

		var ndAnchor = xb.createElement('a');
		ndAnchor.className = 'calendarlink';
		ndAnchor.href = '#';

		if (sTitleText.length > 0) ndAnchor.setAttribute('title', sTitleText);
		ndAnchor.appendChild(document.createTextNode(sLinkText));

		if (bPlaceRight)
		{
			if (ndNode.nextSibling)
			{
				ndNode.parentNode.insertBefore(ndAnchor, ndNode.nextSibling);
			}
			else
			{
				ndNode.parentNode.appendChild(ndAnchor);
			}
		}
		else
		{
			ndNode.parentNode.insertBefore(ndAnchor, ndNode);
		}

		events.add(ndAnchor, 'click', this.display);

		return true;
	};

	this.setIcon = function()
	{
		var sIconFile = ((arguments.length > 0) && (typeof(arguments[0]) == 'string')) ? arguments[0] : sDefaultIcon;
		var ndNode = ((arguments.length > 1) && (typeof(arguments[1]) == 'string')) ? document.getElementById(arguments[1]) : null;
		var bPlaceRight = ((arguments.length <= 2) || arguments[2]);
		var sTitleText = ((arguments.length > 3) && (typeof(arguments[3]) == 'string')) ? arguments[3] : 'Click to choose a date';

		if (!ndNode || !sIconFile) return false;

		var ndIcon = xb.createElement('img');
		ndIcon.className = 'calendaricon';
		ndIcon.src = sIconFile;
		ndIcon.setAttribute('alt', 'DateChooser Icon ' + (nDateChooserID + 1));
		if (sTitleText.length > 0) ndIcon.setAttribute('title', sTitleText);

		if (bPlaceRight)
		{
			if (ndNode.nextSibling)
			{
				ndNode.parentNode.insertBefore(ndIcon, ndNode.nextSibling);
			}
			else
			{
				ndNode.parentNode.appendChild(ndIcon);
			}
		}
		else
		{
			ndNode.parentNode.insertBefore(ndIcon, ndNode);
		}

		events.add(ndIcon, 'click', this.display);

		return true;
	};

	this.setStartDate = function()
	{
		if (!arguments.length || !(typeof(arguments[0]) == 'object') || !arguments[0].getTime) return false;

		objStartDate.setTime(arguments[0].getTime());
		objStartDate.setHours(0);
		objStartDate.setMinutes(0);
		objStartDate.setSeconds(0);
		objStartDate.setMilliseconds(0);

		if (objEarliestDate && objEarliestDate.getTime() > objStartDate.getTime())
		{
			objStartDate.setTime(objEarliestDate.getTime());
		}
		else if (objLatestDate && objLatestDate.getTime() < objStartDate.getTime())
		{
			objStartDate.setTime(objLatestDate.getTime());
		}

		objMonthYear.setMonth(objStartDate.getMonth());
		objMonthYear.setFullYear(objStartDate.getFullYear());

		if (!objSelectedDate) objSelectedDate = new Date(objStartDate);
		objSelectedDate.setTime(objStartDate);

		return true;
	};

	this.setEarliestDate = function()
	{
		if (!arguments.length || (typeof(arguments[0]) != 'object') || !arguments[0].getTime) return false;

		objEarliestDate = new Date();
		objEarliestDate.setTime(arguments[0].getTime());
		objEarliestDate.setHours(0);
		objEarliestDate.setMinutes(0);
		objEarliestDate.setSeconds(0);
		objEarliestDate.setMilliseconds(0);

		if (objEarliestDate.getTime() > objStartDate.getTime())
		{
			objStartDate.setTime(objEarliestDate.getTime());
			objMonthYear.setMonth(objEarliestDate.getMonth());
			objMonthYear.setFullYear(objEarliestDate.getFullYear());
		}

		if (objSelectedDate && (objEarliestDate.getTime() > objSelectedDate.getTime()))
		{
			objSelectedDate.setTime(objEarliestDate.getTime());
			objMonthYear.setMonth(objEarliestDate.getMonth());
			objMonthYear.setFullYear(objEarliestDate.getFullYear());
		}

		return true;
	};

	this.setLatestDate = function()
	{
		if (!arguments.length || !(typeof(arguments[0]) == 'object') || !arguments[0].getTime) return false;

		objLatestDate = new Date();
		objLatestDate.setTime(arguments[0].getTime());
		objLatestDate.setHours(0);
		objLatestDate.setMinutes(0);
		objLatestDate.setSeconds(0);
		objLatestDate.setMilliseconds(0);

		if (objLatestDate.getTime() < objStartDate.getTime())
		{
			objStartDate.setTime(objLatestDate.getTime());
			objMonthYear.setMonth(objLatestDate.getMonth());
			objMonthYear.setFullYear(objLatestDate.getFullYear());
		}

		if (objSelectedDate && (objLatestDate.getTime() < objSelectedDate.getTime()))
		{
			objSelectedDate.setTime(objLatestDate.getTime());
			objMonthYear.setMonth(objLatestDate.getMonth());
			objMonthYear.setFullYear(objLatestDate.getFullYear());
		}

		return true;
	};

	this.setAllowedDays = function()
	{
		if (!arguments.length || !(typeof(arguments[0]) == 'object')) return false;

		var nCount;
		for (nCount = 0; nCount < 7; ++nCount)
		{
			objAllowedDays[nCount + ''] = false;
		}

		for (nCount = 0; nCount < arguments[0].length; ++nCount)
		{
			objAllowedDays[arguments[0][nCount] + ''] = true;
		}

		return true;
	};

	this.setWeekStartDay = function()
	{
		if (!arguments.length || !(typeof(arguments[0]) == 'number')) return false;

		var nNewStartDay = parseInt(arguments[0], 10);
		if ((nNewStartDay < 0) || (nNewStartDay > 6)) return false;

		nWeekStartDay = nNewStartDay;

		return true;
	};

	this.getSelectedDate = function()
	{
		return objSelectedDate;
	};

	this.setSelectedDate = function(objDate)
	{
		objSelectedDate.setTime(objDate.getTime());
		UpdateFields();

		return true;
	};

	this.updateFields = function()
	{
		return UpdateFields();
	};

	var clickWindow = function(e)
	{
		e = e || window.event;
		var ndTarget = e.target || e.srcElement;
		if (ndTarget.nodeName == '#text') ndTarget = ndTarget.parentNode;

		while (ndTarget && (ndTarget != document))
		{
			if (ndTarget.className == 'calendar') return true;
			ndTarget = ndTarget.parentNode;
		}

		for (var nCount = 0; nCount <= nDateChooserID; ++nCount)
		{
			if (ndFrame) ndFrame.style.display = 'none';
			document.getElementById('calendar' + nCount).style.visibility = 'hidden';
		}

		return true;
	};

	var mouseoverDateChooser = function()
	{
		if (objTimeout) clearTimeout(objTimeout);
		return true;
	};

	var mouseoutDateChooser = function()
	{
		if (nTimeout > 0) objTimeout = setTimeout('document.getElementById("' + sDateChooserID + '").style.visibility = "hidden"; if (document.getElementById("iframehack")) document.getElementById("iframehack").style.display = "none";', nTimeout);

		return true;
	};

	events.add(ndDateChooser, 'mouseover', mouseoverDateChooser);
	events.add(ndDateChooser, 'mouseout', mouseoutDateChooser);
	events.add(document, 'mousedown', clickWindow);

	return true;
}

if (typeof(Array.prototype.push) == 'undefined')
{
	Array.prototype.push = function()
	{
		for (var nCount = 0; nCount < arguments.length; nCount++)
		{
			this[this.length] = arguments[nCount];
		}

		return this.length;
	};
}

if (typeof(xb) == 'undefined')
{
	var xb =
	{
		createElement: function(sElement)
		{
			if (typeof(document.createElement) != 'undefined') return document.createElement(sElement);
			if (typeof(document.createElementNS) != 'undefined') return document.createElementNS('http://www.w3.org/1999/xhtml', sElement);

			return null;
		},

		getElementsByAttribute: function(ndNode, sAttributeName, sAttributeValue)
		{
			var aReturnElements = [];

			if (!ndNode.all && !ndNode.getElementsByTagName) return aReturnElements;

			var rAttributeValue = RegExp('(^|\\s)' + sAttributeValue + '(\\s|$)');
			var sValue, aElements = ndNode.all || ndNode.getElementsByTagName('*');

			for (var nIndex = 0; nIndex < aElements.length; ++nIndex)
			{
				if (!aElements[nIndex].getAttribute) continue;
				sValue = (sAttributeName == 'class') ? aElements[nIndex].className : aElements[nIndex].getAttribute(sAttributeName);
				if ((typeof(sValue) != 'string') || (sValue.length == 0)) continue;

				if (rAttributeValue.test(sValue)) aReturnElements.push(aElements[nIndex]);
			}

			return aReturnElements;
		}
	};
}

// This is a variation of the addEvent script written by Dean Edwards (dean.edwards.name).
if (typeof(events) == 'undefined')
{
	var events =
	{
		nEventID: 1,

		add: function(ndElement, sType, fnHandler)
		{
			if (!fnHandler.$$nEventID) fnHandler.$$nEventID = this.nEventID++;
			if (typeof(ndElement.objEvents) == 'undefined') ndElement.objEvents = {};

			var aHandlers = ndElement.objEvents[sType];
			if (!aHandlers)
			{
				aHandlers = ndElement.objEvents[sType] = {};
				if (ndElement['on' + sType]) aHandlers[0] = ndElement['on' + sType];
			}

			aHandlers[fnHandler.$$nEventID] = fnHandler;
			ndElement['on' + sType] = this.handle;

			return true;
		},

		remove: function(ndElement, sType, fnHandler)
		{
			if (ndElement.objEvents && ndElement.objEvents[sType]) delete ndElement.objEvents[sType][fnHandler.$$nEventID];

			return true;
		},

		exists: function(ndElement, sType, fnHandler)
		{
			return (ndElement.objEvents && ndElement.objEvents[sType] && ndElement.objEvents[sType][fnHandler.$$nEventID]);
		},

		handle: function(e)
		{
			e = e || events.fix(event);

			var bReturn = true, aHandlers = this.objEvents[e.type];
			for (var nIndex in aHandlers)
			{
				this.$$handle = aHandlers[nIndex];
				if (this.$$handle(e) === false) bReturn = false;
			}

			return bReturn;
		},

		fix: function(e)
		{
			e.preventDefault = this.fix.preventDefault;
			e.stopPropagation = this.fix.stopPropagation;

			return e;
		},

		cancel: function(e)
		{
			e.preventDefault();
			e.stopPropagation();

			return false;
		}
	};

	events.fix.preventDefault = function()
	{
		this.returnValue = false;

		return true;
	}

	events.fix.stopPropagation = function()
	{
		this.cancelBubble = true;

		return true;
	}
}

events.add(window, 'load', function()
{
	var ndDateChooser, ndElement, sClass, aMatch, sLastID, sLinkID, sLinkPosition, objUpdateField, objDate, aDateFormatNodes;
	var sDateFormat, sIcon, sText, sXOffset, sYOffset, sCloseTime, sOnUpdate, sStartDate, sEarliestDate, sLatestDate, sAllowedDays, sWeekStartDay;
	var aDateChoosers = [];
	var nFieldID = 0;

	objDate = new Date();
	objDate.setHours(0);
	objDate.setMinutes(0);
	objDate.setMilliseconds(0);

	var aElements = xb.getElementsByAttribute(document, 'class', 'datechooser');
	for (var nIndex = 0; nIndex < aElements.length; ++nIndex)
	{
		ndDateChooser = aElements[nIndex];
		sClass = ndDateChooser.className;
		if (!ndDateChooser.id) ndDateChooser.id = 'dc-id-' + (++nFieldID);
		sLastID = ndDateChooser.id;

		sDateFormat = ndDateChooser.getAttribute('dc-dateformat');
		if (!sDateFormat)
		{
			aMatch = sClass.match(/(?:^|\s)dc-dateformat=\'([^\']+)(?:\'|$)/);
			sDateFormat = aMatch ? aMatch[1] : false;
		}

		sIcon = ndDateChooser.getAttribute('dc-iconlink');
		if (!sIcon)
		{
			aMatch = sClass.match(/(?:^|\s)dc-iconlink=\'([^\']+)(?:\'|$)/);
			sIcon = aMatch ? aMatch[1] : false;
		}

		sText = ndDateChooser.getAttribute('dc-textlink');
		if (!sText)
		{
			aMatch = sClass.match(/(?:^|\s)dc-textlink=\'([^\']+)(?:\'|$)/);
			sText = aMatch ? aMatch[1] : false;
		}

		sXOffset = ndDateChooser.getAttribute('dc-offset-x');
		if (!sXOffset)
		{
			aMatch = sClass.match(/(?:^|\s)dc-offset-x=\'([^\']+)(?:\'|$)/);
			sXOffset = aMatch ? aMatch[1] : false;
		}

		sYOffset = ndDateChooser.getAttribute('dc-offset-y');
		if (!sYOffset)
		{
			aMatch = sClass.match(/(?:^|\s)dc-offset-y=\'([^\']+)(?:\'|$)/);
			sYOffset = aMatch ? aMatch[1] : false;
		}

		sCloseTime = ndDateChooser.getAttribute('dc-closetime');
		if (!sCloseTime)
		{
			aMatch = sClass.match(/(?:^|\s)dc-closetime=\'([^\']+)(?:\'|$)/);
			sCloseTime = aMatch ? aMatch[1] : false;
		}

		sOnUpdate = ndDateChooser.getAttribute('dc-onupdate');
		if (!sOnUpdate)
		{
			aMatch = sClass.match(/(?:^|\s)dc-onupdate=\'([^\']+)(?:\'|$)/);
			sOnUpdate = aMatch ? aMatch[1] : false;
		}

		sStartDate = ndDateChooser.getAttribute('dc-startdate');
		if (!sStartDate)
		{
			aMatch = sClass.match(/(?:^|\s)dc-startdate=\'([^\']+)(?:\'|$)/);
			sStartDate = aMatch ? aMatch[1] : false;
		}

		sEarliestDate = ndDateChooser.getAttribute('dc-earliestdate');
		if (!sEarliestDate)
		{
			aMatch = sClass.match(/(?:^|\s)dc-earliestdate=\'([^\']+)(?:\'|$)/);
			sEarliestDate = aMatch ? aMatch[1] : false;
		}

		sLatestDate = ndDateChooser.getAttribute('dc-latestdate');
		if (!sLatestDate)
		{
			aMatch = sClass.match(/(?:^|\s)dc-latestdate=\'([^\']+)(?:\'|$)/);
			sLatestDate = aMatch ? aMatch[1] : false;
		}

		sAllowedDays = ndDateChooser.getAttribute('dc-alloweddays');
		if (!sAllowedDays)
		{
			aMatch = sClass.match(/(?:^|\s)dc-alloweddays=\'([^\']+)(?:\'|$)/);
			sAllowedDays = aMatch ? aMatch[1] : false;
		}

		sWeekStartDay = ndDateChooser.getAttribute('dc-weekstartday');
		if (!sWeekStartDay)
		{
			aMatch = sClass.match(/(?:^|\s)dc-weekstartday=\'([^\']+)(?:\'|$)/);
			sWeekStartDay = aMatch ? aMatch[1] : false;
		}

		sLinkPosition = ndDateChooser.getAttribute('dc-linkposition');
		if (!sLinkPosition)
		{
			aMatch = sClass.match(/(?:^|\s)dc-linkposition=\'([^\']+)(?:\'|$)/);
			sLinkPosition = aMatch ? aMatch[1].toLowerCase() : false;
			if (sLinkPosition) sLinkID = ndDateChooser.id;
		}

		objUpdateField = {};
		if (sDateFormat) objUpdateField[ndDateChooser.id] = sDateFormat;

		aDateFormatNodes = ndDateChooser.all || ndDateChooser.getElementsByTagName('*');
		for (var nDateFormat = 0; nDateFormat < aDateFormatNodes.length; ++nDateFormat)
		{
			ndElement = aDateFormatNodes[nDateFormat];
			sClass = ndElement.className;

			sDateFormat = ndElement.getAttribute('dc-dateformat');
			if (!sDateFormat)
			{
				aMatch = sClass.match(/(?:^|\s)dc-dateformat=\'([^\']+)(?:\'|$)/);
				sDateFormat = aMatch ? aMatch[1] : false;
			}

			if (!sDateFormat) continue;

			if (!ndElement.id) ndElement.id = 'dc-id-' + (++nFieldID);
			objUpdateField[ndElement.id] = sDateFormat;
			sLastID = ndElement.id;

			if (!sLinkPosition) sLinkPosition = ndElement.getAttribute('dc-linkposition');
			if (!sLinkPosition)
			{
				aMatch = sClass.match(/(?:^|\s)dc-linkposition=\'([^\']+)(?:\'|$)/);
				sLinkPosition = aMatch ? aMatch[1].toLowerCase() : false;
				if (sLinkPosition) sLinkID = ndElement.id;
			}
		}

		if (!sLinkPosition)
		{
			sLinkID = sLastID;
			sLinkPosition = 'right';
		}

		ndDateChooser.datechooser = new DateChooser();
		if (sXOffset) ndDateChooser.datechooser.setXOffset(sXOffset);
		if (sYOffset) ndDateChooser.datechooser.setYOffset(sYOffset);
		if (sCloseTime) ndDateChooser.datechooser.setCloseTime(sCloseTime);
		if (sOnUpdate) ndDateChooser.datechooser.setUpdateFunction(eval(sOnUpdate));

		if (sStartDate)
		{
			objDate = new Date();
			objDate.setFullYear(parseInt(sStartDate.substring(4), 10));
			objDate.setMonth(parseInt(sStartDate.substring(0, 2), 10) - 1);
			objDate.setDate(parseInt(sStartDate.substring(2, 4), 10));

			ndDateChooser.datechooser.setStartDate(objDate);
		}

		if (sEarliestDate)
		{
			objDate = new Date();
			objDate.setFullYear(parseInt(sEarliestDate.substring(4), 10));
			objDate.setMonth(parseInt(sEarliestDate.substring(0, 2), 10) - 1);
			objDate.setDate(parseInt(sEarliestDate.substring(2, 4), 10));

			ndDateChooser.datechooser.setEarliestDate(objDate);
		}

		if (sLatestDate)
		{
			objDate = new Date();
			objDate.setFullYear(parseInt(sLatestDate.substring(4), 10));
			objDate.setMonth(parseInt(sLatestDate.substring(0, 2), 10) - 1);
			objDate.setDate(parseInt(sLatestDate.substring(2, 4), 10));

			ndDateChooser.datechooser.setLatestDate(objDate);
		}

		if (sAllowedDays) ndDateChooser.datechooser.setAllowedDays(sAllowedDays.split(','));
		if (sWeekStartDay) ndDateChooser.datechooser.setWeekStartDay(parseInt(sWeekStartDay, 10));
		if (sIcon) ndDateChooser.datechooser.setIcon(sIcon, sLinkID, (sLinkPosition != 'left'));
		if (sText) ndDateChooser.datechooser.setLink(sText, sLinkID, (sLinkPosition != 'left'));
		ndDateChooser.datechooser.setUpdateField(objUpdateField);
	}

	delete objDate;
	return true;
});