package com.annie.chain.DAOImpl;

import com.annie.chain.DAO.ILeaveRequestHandler;

public class HR implements ILeaveRequestHandler {

	@Override
	public void handleRequest(LeaveRequest leaveRequest) {
		// TODO Auto-generated method stub
		int leaveDays = leaveRequest.getLeaveDays();

		if (leaveDays > 5) {
			System.out.println("Meet HR for getting your Leave Request");
		} 
	}

}
