/*TMODJS:{"version":1,"md5":"21492ad6079dd4b9b15466468048bc94"}*/
template('Index/test',function($data,$filename
/*``*/) {
'use strict';var $utils=this,$helpers=$utils.$helpers,$escape=$utils.$escape,title=$data.title,$out='';$out+='<h1>';
$out+=$escape(title);
$out+='</h1> ';
return new String($out);
});