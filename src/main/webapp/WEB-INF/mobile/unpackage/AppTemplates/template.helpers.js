/** 
 * 对日期进行格式化， 
 * @param date 要格式化的日期 
 * @param format 进行格式化的模式字符串
 *     支持的模式字母有： 
 *     y:年, 
 *     M:年中的月份(1-12), 
 *     d:月份中的天(1-31), 
 *     h:小时(0-23), 
 *     m:分(0-59), 
 *     s:秒(0-59), 
 *     S:毫秒(0-999),
 *     q:季度(1-4)
 * @return String
 * @author yanis.wang
 * @see	http://yaniswang.com/frontend/2013/02/16/dateformat-performance/
 */
template.helper('dateFormat', function(date, format) {
	if(!date) {
		return '';
	}
	//if (typeof date === "string") {
	//    var mts = date.match(/(\/Date\((\d+)\)\/)/);
	//    if (mts && mts.length >= 3) {
	//        date = parseInt(mts[2]);
	//    }
	//}
	var str = date;
	date = new Date(date);
	if(!date || date.toUTCString() == "Invalid Date") {
		date = new Date(date.replace(/-/g, "/"));
	}
	if(!date || date.toUTCString() == "Invalid Date") {
		return '';
	}
	var map = {
		"M": date.getMonth() + 1, //月份 
		"d": date.getDate(), //日 
		"h": date.getHours(), //小时 
		"m": date.getMinutes(), //分 
		"s": date.getSeconds(), //秒 
		"q": Math.floor((date.getMonth() + 3) / 3), //季度 
		"S": date.getMilliseconds() //毫秒 
	};

	format = format.replace(/([yMdhmsqS])+/g, function(all, t) {
		var v = map[t];
		if(v !== undefined) {
			if(all.length > 1) {
				v = '0' + v;
				v = v.substr(v.length - 2);
			}
			return v;
		} else if(t === 'y') {
			return(date.getFullYear() + '').substr(4 - all.length);
		}
		return all;
	});
	return format;
});

template.helper('toReadTime', function(time) {
	//将字符串转换成时间格式
	var timePublish = new Date(time);
	var timeNow = new Date();
	var minute = 1000 * 60;
	var hour = minute * 60;
	var day = hour * 24;
	var month = day * 30;
	var year = month * 12;
	var diffValue = timeNow - timePublish;
	var diffMonth = diffValue / month;
	var diffWeek = diffValue / (7 * day);
	var diffDay = diffValue / day;
	var diffHour = diffValue / hour;
	var diffMinute = diffValue / minute;
	var diffYear = diffValue / year;

	if(diffValue < 0) {
		return("错误时间");
	} else if(diffYear > 1) {
		result = parseInt(diffYear) + "年前";
	} else if(diffMonth > 1) {
		result = parseInt(diffMonth) + "月前";
	} else if(diffWeek > 1) {
		result = parseInt(diffWeek) + "周前";
	} else if(diffDay > 1) {
		result = parseInt(diffDay) + "天前";
	} else if(diffHour > 1) {
		result = parseInt(diffHour) + "小时前";
	} else if(diffMinute > 1) {
		result = parseInt(diffMinute) + "分钟前";
	} else {
		result = "刚刚";
	}
	return result;
});

template.helper('auditFormat', function(isAudit) {
	if(isAudit === false) {
		return '<span class="mui-badge mui-badge-danger">未通过审核</span>';
	} else if(isAudit === null) {
		return '<span class="mui-badge mui-badge-warning">未审核</span>';
	}
	return '';
});

template.helper('getLastStr', function(str, split) {
	if(str == undefined) {
		return "";
	}
	var arr = str.split(split);
	return arr[arr.length - 1];
});

template.helper("distanceFormat", function(distance) {
	if(distance <= 100) {
		return "<100m";

	} else if(distance <= 200) {
		return "<200m";
	} else if(distance <= 500) {
		return "<500m";
	} else if(distance <= 1000) {
		return "<1km";
	} else if(distance <= 5000) {
		return "<5km";
	} else if(distance <= 10000) {
		return "<10km";
	} else if(distance <= 50000) {
		return "<50km";
	} else if(distance <= 100000) {
		return "<100km";
	} else {
		return ">100km";
	}
});

template.helper('showDistance', function(distance, near) {
	if(!near) {
		return '';
	}
	if(distance == null || distance == undefined) {
		return '距离未知';
	}
	return(distance * 1000 / 1609.344).toFixed(1) + ' mi';
});

template.helper('topFormat', function(isTop) {
	if(isTop) {
		return ' <span class="list-badge list-badge-green">置顶</span>';
	}
	return '';
});

template.helper('verifiedFormat', function(isCompanyVerified) {
	if(isCompanyVerified) {
		return ' <span class="list-badge list-badge-blue">验</span>';
	}
	return '';
});

template.helper('companyTypeFormat', function(type) {
	if(type == '1') return '餐馆';
	return '未知';
});

template.helper('priceFormat', function(price, ex) {
	if(price == null || price == 0) {
		return '面议';
	}
	return "$ " + price + (ex || '');
});

template.helper('qualityFormat', function(value) {
	if(value == null) {
		return '未填写';
	}
	return value + '成新';
});

template.helper('arrayFormat', function(arr, str) {
	if(arr == null) {
		return "";
	}
	return arr.join(str || '/');
});

template.helper('boolFormat', function(value, trueText, falseText, nullText) {
	if(value == null || value == undefined) {
		return nullText || '未知';
	}
	if(value) {
		return trueText || '是';
	}
	return falseText || '否';
});
template.helper('ageYearFormat', function(value) {
	if(value) {
		return new Date().getFullYear() - value;
	}
	return "-";
});

template.helper('recruitmentStatusFormat', function(value) {
	switch(value) {
		case 1:
			return '绑定';
			break;
		case 2:
			return '已确认';
			break;
		case 3:
			return '放鸽子';
			break;
		case 0:
			return '推荐';
			break;
	}
});


template.helper('getChar', function (i) {
    return String.fromCharCode(65 + i);
});