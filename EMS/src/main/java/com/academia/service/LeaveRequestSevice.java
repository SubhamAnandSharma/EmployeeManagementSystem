package com.academia.service;

import java.util.List;

import com.academia.entities.LeaveRequest;

public interface LeaveRequestSevice {

	 	LeaveRequest createLeaveRequest(LeaveRequest leaveRequest);
	    LeaveRequest getLeaveRequestById(Integer id);
	    List<LeaveRequest> getAllLeaveRequests();
	    void updateLeaveRequest(Integer id, LeaveRequest updatedLeaveRequest);
	    void deleteLeaveRequest(Integer id);
}
