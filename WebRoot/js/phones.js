var Screen={
	createNew:function(){
		var screen={};
		screen.Type=new Array("������","������","�Ǵ�����");
		screen.resolution=new Array("240x320","480x320","800x480","176x220","800x600","1280x800");
		screen.size=new Array("3.5","4.0","4.5","4.8","5.0","5.5","7.0");
		screen.caizhi=new Array("TPSӲ��","TFT��Ļ","TFD��Ļ","UFB��Ļ","OLED��Ļ","SLCDҺ����");
		screen.color=new Array("63336ɫ","26��ɫ","1600��ɫ");
		return screen;
	}
};
var Intener={
	createNew:function(){
		var internet={};
		internet.G4=new Array("�ƶ�TD-LTE","��ͨTD-LTE","����TD-LTE","����FDD-LTE");
		internet.SIM=new Array("����","˫��");
		internet.G3=new Array("�ƶ�TD-SCDMA","��ͨWCDMA","����CDMA2000");
		return internet;
	}
};
var DIY={
	createNew:function(){
		var diy={};
		diy.systems=new Array("��׿","ƻ��");
		diy.core=new Array("����","˫��","����","�ĺ�","�˺�");
		diy.RAM=new Array("32M","512M","1G","2G","3G","4G");
		diy.Rom=new Array("1G","2G","4G","8G","16G","32G","64G","128G");
		diy.kuozhan=new Array("�޷���չ","16G","32G","64G","128G");
		return diy;
	}
};
var Camera={
	createNew:function(){
		var camera={};
		camera.type=new Array("������ͷ","������ͷ","˫����ͷ");
		return camera;
	}
};
/**   
 * Simple Map   
 *    
 *    
 * var m = new Map();   
 * m.put('key','value');   
 * ...   
 * var s = "";   
 * m.each(function(key,value,index){   
 *      s += index+":"+ key+"="+value+"/n";   
 * });   
 * alert(s);   
 *    
 * @author dewitt   
 * @date 2008-05-24   
 */    
function Map() {     
    /** ��ż�������(�����õ�) */    
    this.keys = new Array();     
    /** ������� */    
    this.data = new Object();     
         
    /**   
     * ����һ����ֵ��   
     * @param {String} key   
     * @param {Object} value   
     */    
    this.put = function(key, value) {     
        if(this.data[key] == null){     
            this.keys.push(key);     
        }     
        this.data[key] = value;     
    };     
         
    /**   
     * ��ȡĳ����Ӧ��ֵ   
     * @param {String} key   
     * @return {Object} value   
     */    
    this.get = function(key) {     
        return this.data[key];     
    };     
         
    /**   
     * ɾ��һ����ֵ��   
     * @param {String} key   
     */    
    this.remove = function(key) {     
        this.keys.remove(key);     
        this.data[key] = null;     
    };     
         
    /**   
     * ����Map,ִ�д�����   
     *    
     * @param {Function} �ص����� function(key,value,index){..}   
     */    
    this.each = function(fn){     
        if(typeof fn != 'function'){     
            return;     
        }     
        var len = this.keys.length;     
        for(var i=0;i<len;i++){     
            var k = this.keys[i];     
            fn(k,this.data[k],i);     
        }     
    };     
         
    /**   
     * ��ȡ��ֵ����(����<a href="http://lib.csdn.net/base/javase" class='replace_word' title="Java SE֪ʶ��"       target='_blank' style='color:#df3434; font-weight:bold;'>Java</a>��entrySet())   
     * @return ��ֵ����{key,value}������   
     */    
    this.entrys = function() {     
        var len = this.keys.length;     
        var entrys = new Array(len);     
        for (var i = 0; i < len; i++) {     
            entrys[i] = {     
                key : this.keys[i],     
                value : this.data[i]     
            };     
        }     
        return entrys;     
    };     
         
    /**   
     * �ж�Map�Ƿ�Ϊ��   
     */    
    this.isEmpty = function() {     
        return this.keys.length == 0;     
    };     
         
    /**   
     * ��ȡ��ֵ������   
     */    
    this.size = function(){     
        return this.keys.length;     
    };     
         
    /**   
     * ��дtoString    
     */    
    this.toString = function(){     
        var s = "{";     
        for(var i=0;i<this.keys.length;i++,s+=','){     
            var k = this.keys[i];     
            s += k+"="+this.data[k];     
        }     
        s+="}";     
        return s;     
    };     
}     