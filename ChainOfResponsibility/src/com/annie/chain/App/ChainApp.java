package com.annie.chain.App;

import com.annie.chain.DAO.ILeaveRequestHandler;
import com.annie.chain.DAOImpl.LeaveRequest;
import com.annie.chain.DAOImpl.Supervisor;

public class ChainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LeaveRequest leaveRequest = new LeaveRequest();
		leaveRequest.setEmployeeName("Annie");
		leaveRequest.setLeaveDays(4);
		ILeaveRequestHandler supervisor = new Supervisor();
		supervisor.handleRequest(leaveRequest);
	}

}
