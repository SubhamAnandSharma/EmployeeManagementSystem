package com.academia.service;

import java.util.List;

import com.academia.repository.Attendance;

public interface AttendanceService {

	Attendance createAttendance(Attendance attendance);
    Attendance getAttendanceById(Long id);
    List<Attendance> getAllAttendances();
    void updateAttendance(Long id, Attendance updatedAttendance);
    void deleteAttendance(Long id);
}
