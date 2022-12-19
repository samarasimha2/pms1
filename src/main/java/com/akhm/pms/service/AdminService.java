package com.akhm.pms.service;

import com.akhm.pms.service.vo.AdminVO;

public interface AdminService {
	public AdminVO saveAdmin(AdminVO adminVO);
	public AdminVO getAdmin(String emailId,String password);

}
