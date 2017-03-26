var Screen={
	createNew:function(){
		var screen={};
		screen.Type=new Array("电阻屏","电容屏","非触摸屏");
		screen.resolution=new Array("240x320","480x320","800x480","176x220","800x600","1280x800");
		screen.size=new Array("3.5","4.0","4.5","4.8","5.0","5.5","7.0");
		screen.caizhi=new Array("TPS硬屏","TFT屏幕","TFD屏幕","UFB屏幕","OLED屏幕","SLCD液晶屏");
		screen.color=new Array("63336色","26万色","1600万色");
		return screen;
	}
};
var Intener={
	createNew:function(){
		var internet={};
		internet.G4=new Array("移动TD-LTE","联通TD-LTE","电信TD-LTE","电信FDD-LTE");
		internet.SIM=new Array("单卡","双卡");
		internet.G3=new Array("移动TD-SCDMA","联通WCDMA","电信CDMA2000");
		return internet;
	}
};
var DIY={
	createNew:function(){
		var diy={};
		diy.systems=new Array("安卓","苹果");
		diy.core=new Array("单核","双核","三核","四核","八核");
		diy.RAM=new Array("32M","512M","1G","2G","3G","4G");
		diy.Rom=new Array("1G","2G","4G","8G","16G","32G","64G","128G");
		diy.kuozhan=new Array("无法扩展","16G","32G","64G","128G");
		return diy;
	}
};
var Camera={
	createNew:function(){
		var camera={};
		camera.type=new Array("无摄像头","单摄像头","双摄像头");
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
    /** 存放键的数组(遍历用到) */    
    this.keys = new Array();     
    /** 存放数据 */    
    this.data = new Object();     
         
    /**   
     * 放入一个键值对   
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
     * 获取某键对应的值   
     * @param {String} key   
     * @return {Object} value   
     */    
    this.get = function(key) {     
        return this.data[key];     
    };     
         
    /**   
     * 删除一个键值对   
     * @param {String} key   
     */    
    this.remove = function(key) {     
        this.keys.remove(key);     
        this.data[key] = null;     
    };     
         
    /**   
     * 遍历Map,执行处理函数   
     *    
     * @param {Function} 回调函数 function(key,value,index){..}   
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
     * 获取键值数组(类似<a href="http://lib.csdn.net/base/javase" class='replace_word' title="Java SE知识库"       target='_blank' style='color:#df3434; font-weight:bold;'>Java</a>的entrySet())   
     * @return 键值对象{key,value}的数组   
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
     * 判断Map是否为空   
     */    
    this.isEmpty = function() {     
        return this.keys.length == 0;     
    };     
         
    /**   
     * 获取键值对数量   
     */    
    this.size = function(){     
        return this.keys.length;     
    };     
         
    /**   
     * 重写toString    
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