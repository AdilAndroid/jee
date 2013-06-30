package com.freesoft.console;

import org.hibernate.tool.hbm2ddl.SchemaExport;

public class ConsoleTest {

	public static void main(String[] args) {
		SchemaExport export = new SchemaExport(new org.hibernate.cfg.Configuration().configure());
		
		export.create(true, true);
	}

}
