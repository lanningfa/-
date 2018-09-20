package com.lnf.DP.Prototype;


import java.util.ArrayList;

class Prototype implements Cloneable {
    /*浅拷贝*/
    public Prototype clone(){
        Prototype prototype = null;

        try{

            prototype = (Prototype)super.clone();

        }catch(CloneNotSupportedException e){

            e.printStackTrace();
        }
        return prototype;
    }
    /*Object类的clone方法只会拷贝对象中的基本的数据类型 这就是浅拷贝。
     如果要实现深拷贝，除了 拷贝对象中的基本的数据类型 还要把 原型模式中的数组、容器对象、引用对象等另行拷贝。*/
    /*深拷贝
    * private ArrayList list = new ArrayList();
	public Prototype clone(){
		Prototype prototype = null;
		try{
			prototype = (Prototype)super.clone();
			prototype.list = (ArrayList) this.list.clone();
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return prototype;
	}

    * */
}