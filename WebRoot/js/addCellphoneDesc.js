var items = 0;

function add() {
	var div = document.getElementById("item");
	var tr = document.createElement("tr");
	var td1 = document.createElement("td");
	var td2 = document.createElement("td");
	var td3 = document.createElement("td");
	var td4 = document.createElement("td");
	var td5 = document.createElement("td");
	var input1 = document.createElement("input");
	var input2 = document.createElement("input");
	var btn = document.createElement("a");

	tr.setAttribute("id", "item" + items);
	td1.innerHTML = "网络类型";
	input1.setAttribute("type", "text");
	input1.setAttribute("name", "netType");
	td3.innerHTML = "支持频段";
	input2.setAttribute("type", "text");
	input2.setAttribute("name", "support");
	btn.innerHTML = "-";
	btn.setAttribute("href", "javascript:dell('item" + items + "')");
	btn.setAttribute("class", "am-btn am-btn-default");

	td2.appendChild(input1);
	td4.appendChild(input2);
	td5.appendChild(btn);

	tr.appendChild(td1);
	tr.appendChild(td2);
	tr.appendChild(td3);
	tr.appendChild(td4);
	tr.appendChild(td5);
	div.appendChild(tr);
	items++;
}
function dell(str) {
	var tr = document.getElementById(str);
	var div = document.getElementById("item");
	div.removeChild(tr);
}

function getDiv(d)
{
	
	var str=["screen","internet","diy","camera","support","picture"];
	for(var i=0;i<str.length;i++)
	{
		if(d==i)
		{
			var a=document.getElementById("tag"+i);
			a.style.backgroundColor="#ddffff";
			var div=document.getElementById(str[i]);
			div.style.display="block";
		}else
		{
			var a=document.getElementById("tag"+i);
			a.style.backgroundColor="#06ffff";
			var div=document.getElementById(str[i]);
			div.style.display="none";
		}
	}
}
function addPicture()
{
	var div=document.getElementById("img_item");
	var tr=document.createElement("tr");
	var td=document.createElement("td");
	var input=document.createElement("input");
	var td1=document.createElement("td");
	var a=document.createElement("a");
	
	tr.setAttribute("id", "img" + items);
	input.setAttribute("type", "file");
	a.setAttribute("href", "javascript:dellImg('img" + items + "')");
	a.setAttribute("class", "am-btn am-btn-default");
	a.innerHTML="-";
	
	td.appendChild(input);
	td1.appendChild(a);
	tr.appendChild(td);
	tr.appendChild(td1);
	div.appendChild(tr);
}

function dellImg(str)
{
	var tr = document.getElementById(str);
	var div = document.getElementById("img_item");
	div.removeChild(tr);
}