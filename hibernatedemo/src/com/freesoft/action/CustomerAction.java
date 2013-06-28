package com.freesoft.action;

import java.util.HashSet;
import java.util.Set;

import com.freesoft.bean.Customer;
import com.freesoft.bean.Order;
import com.freesoft.service.CustomerService;
import com.freesoft.service.impl.CustomerServiceImpl;
import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5345774487796156735L;
	
	public String find() throws Exception {
		CustomerService service = new CustomerServiceImpl();
		Customer c = service.find(1);
		System.out.println(c.getOrders());
		return SUCCESS;
	}

	public String insert() throws Exception {

		CustomerService service = new CustomerServiceImpl();
		Customer customer = new Customer();
		
		Order o1 = new Order();
		o1.setOrderNumber("Apple");
		o1.setCustomer(customer);
		
		Order o2 = new Order();
		o2.setOrderNumber("Banana");
		o2.setCustomer(customer);
		
		Order o3 = new Order();
		o3.setOrderNumber("Pear");
		o3.setCustomer(customer);
		
		Order o4 = new Order();
		o4.setOrderNumber("Peach");
		o4.setCustomer(customer);
		
		customer.setName("zhangsan");
		Set<Order> orders = new HashSet<Order>();
		orders.add(o1);
		orders.add(o2);
		orders.add(o3);
		orders.add(o4);
		customer.setOrders(orders);
		
		service.insert(customer );
		
		return SUCCESS;
	}
	
//	public String list() throws Exception {
//		PeopleService service = new PeopleServiceImpl();
//		List<People> list = service.list();
//		Map<String, Object> request = ActionContext.getContext().getContextMap();
//		request.put("peoples", list);
//		
//		return SUCCESS;
//	}

}
