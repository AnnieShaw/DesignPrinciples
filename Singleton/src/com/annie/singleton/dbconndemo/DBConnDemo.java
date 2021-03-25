package com.annie.singleton.dbconndemo;

import com.annie.singleton.dbconn.DBConn;

public class DBConnDemo {

	public static void main(String[] args) {
		DBConn object = DBConn.getInstance();

		object.showMessage();
	}
}
