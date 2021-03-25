package com.annie.chain.DAO;

import com.annie.chain.DAOImpl.LeaveRequest;

public interface ILeaveRequestHandler {

	ILeaveRequestHandler nextHandler = null;
	public void handleRequest(LeaveRequest leaveRequest);
}
