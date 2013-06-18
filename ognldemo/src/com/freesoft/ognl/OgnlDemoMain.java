package com.freesoft.ognl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

public class OgnlDemoMain {

	/**
	 * @param args
	 * @throws OgnlException 
	 */
	public static void main(String[] args) throws OgnlException {
		Person p = new Person();
		p.setName("zhangsan");
		Map<String, String> addr = new HashMap<String, String>(); 
		addr.put("address1", "beijing");
		addr.put("address2", "shanghai");
		addr.put("address3", "guangzhou");
		addr.put("address4", "shenzhen");
		p.setAddress(addr);
		
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("zhangsan"));
		persons.add(new Person("lisi"));
		persons.add(new Person("wangwu"));
		persons.add(new Person("zhaoliu"));
		persons.add(new Person("chenqi"));
		persons.add(new Person("wuba"));
		
		Dog d = new Dog();
		d.setName("wangcai");
		List<String> friends = new ArrayList<String>();
		friends.add("zhangsan");
		friends.add("lisi");
		friends.add("wangwu");
		d.setFriends(friends);
		String nickname[] = new String[]{"wangcai", "afu"};
		d.setNickname(nickname);
		
		Dog d2 = new Dog();
		d2.setName("hello");		
		p.setDog(d2);
		
		OgnlContext context = new OgnlContext();
		// 上下文中放入两个对象
		context.put("person", p);
		context.put("dog", d);
		context.put("persons", persons);
		// 设定根对象
		context.setRoot(p);
		
		// 寻找属性对应的对象是根，不用#，如果找不到该属性，会抛出异常
		Object object = Ognl.parseExpression("name");
		System.out.println(object);
		Object value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("#person.name");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// 寻找属性对应的对象不是根，需要使用#
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("#dog.name");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// 寻找Person中的dog2
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("dog.name");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);

		// 操作对象特定方法，这里操作person对象
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("name.toUpperCase()");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);		
		object = Ognl.parseExpression("name.toUpperCase().length()");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// 操作类的静态方法，注意包名
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("@java.lang.Integer@toBinaryString(10)");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);		
		
		// 对于java.lang.Math类不需要包名和类名
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("@@min(10, 4)");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// 访问public的static变量
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("@@E");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		object = Ognl.parseExpression("@@PI");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// 创建一个对象，标准java格式
		System.out.println("---------------I'm the seperator.-----------------------------");
		object = Ognl.parseExpression("new java.util.LinkedList()");
		System.out.println(object);
		value = Ognl.getValue(object, context, context.getRoot());
		System.out.println(value);
		
		// OGNL自己生成对象的方式，生成List
		System.out.println("---------------I'm the seperator.-----------------------------");
		value = Ognl.getValue("{'aa', 'bb', 'cc', 'dd'}", context, context.getRoot());
		System.out.println(value);
		
		// 获取集合中元素
		System.out.println("---------------I'm the seperator.-----------------------------");
		value = Ognl.getValue("{'aa', 'bb', 'cc', 'dd'}[2]", context, context.getRoot());
		System.out.println(value);
		
		// 获取对象中的list类型元素
		System.out.println("---------------I'm the seperator.-----------------------------");
		value = Ognl.getValue("#dog.friends", context, context.getRoot());
		System.out.println(value);
		value = Ognl.getValue("#dog.nickname", context, context.getRoot());
		System.out.println(value);
		value = Ognl.getValue("#dog.friends[1]", context, context.getRoot());
		System.out.println(value);
		value = Ognl.getValue("#dog.nickname[1]", context, context.getRoot());
		System.out.println(value);
		
		// 获取Map元素使用：   #{'key':'value1', 'key2':'value2', 'key3':'value3'}
		System.out.println("---------------I'm the seperator.-----------------------------");
		System.out.println(Ognl.getValue("#person.address", context, context.getRoot()));
		System.out.println(Ognl.getValue("#person.address['address1']", context, context.getRoot()));
		
		// OGNL运算之一：过滤(filtering)，对集合操作，语法格式：  collection.{? expression}
		System.out.println("---------------I'm the seperator.-----------------------------");
		System.out.println(Ognl.getValue("#dog.friends.{? #this.length() > 4}", context, context.getRoot()));
		System.out.println(Ognl.getValue("#dog.friends.{? #this.length() > 4}.size()", context, context.getRoot()));
		// 集合的伪属性
		System.out.println(Ognl.getValue("#dog.friends.{? #this.length() > 4}.size", context, context.getRoot()));
		System.out.println(Ognl.getValue("#dog.friends.{? #this.length() > 4}.isEmpty", context, context.getRoot()));
		// 获取集合中第一个元素 collection.{^ expression}，注意输出还是集合(尽管可能只有一个元素或者没有元素)
		System.out.println(Ognl.getValue("#dog.friends.{^ #this.length() > 4}", context, context.getRoot()));
		System.out.println(Ognl.getValue("#dog.friends.{^ #this.length() > 40}", context, context.getRoot()));
		// 获取集合中最后一个元素 collection.{$ expression}，注意输出还是集合(尽管可能只有一个元素或者没有元素)
		System.out.println(Ognl.getValue("#dog.friends.{$ #this.length() > 4}", context, context.getRoot()));
	
		// OGNL运算之二：投影(projection)，对集合操作，语法格式：  collection.{expression}
		System.out.println("---------------I'm the seperator.-----------------------------");
		System.out.println(Ognl.getValue("#persons.{name}", context, context.getRoot()));
		
		// 三元表达式
		System.out.println("---------------I'm the seperator.-----------------------------");
		System.out.println(Ognl.getValue("#persons.{#this.name.length()>5?#this.name:'helloworld'}", context, context.getRoot()));

	}
}
