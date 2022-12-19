package com.akhm.pms.service.impl;

import org.springframework.beans.factory.annotation.Autowired;




import com.akhm.pms.exception.AdminDataCustomException;
import com.akhm.pms.service.AdminService;
import com.akhm.pms.service.vo.AdminVO;
import com.akhm.pms.util.DateUtil;
import com.akhm.repository.AdminRepository;
import com.akhm.repository.entity.AdminTl;

public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private DateUtil dateUtil;

	@Override
	public AdminVO saveAdmin(AdminVO adminVO) {
		try {
			if(adminVO!=null)
			{
				AdminTl adminTl=new AdminTl();
				adminTl.setFirstName(adminVO.getFirstName());
				adminTl.setLastName(adminVO.getLastName());
				adminTl.setEmailId(adminVO.getEmailId());
				adminTl.setPassword(adminVO.getPassword());
				adminTl.setMobileNumber(adminVO.getMobileNumber());
				adminTl.setStatus(adminVO.getStatus());
				adminTl.setCreatedOn(adminVO.getCreatedOn());
				adminTl.setUpdatedOn(adminVO.getUpdatedOn());
				AdminTl admin=adminRepository.save(adminTl);
				AdminVO admi=new AdminVO();
				admi.setAdminId(admin.getAdminId());
				admi.setFirstName(admin.getFirstName());
				admi.setLastName(admin.getLastName());
				admi.setEmailId(admin.getEmailId());
				admi.setPassword(admin.getPassword());
				admi.setMobileNumber(admin.getMobileNumber());
				admi.setStatus(admin.getStatus());
				admi.setCreatedOn(admin.getCreatedOn());
				admi.setUpdatedOn(admin.getUpdatedOn());
				return admi;
			}
			else
			{
				return null;
			}
			
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}
		
	}

	@Override
	public AdminVO getAdmin(String emailId, String password) {
		try {
			AdminTl admin = adminRepository.findByEmailIdAndPassword(emailId, password);
			if (admin != null) {
				AdminVO adminVO = new AdminVO();
				adminVO.setAdminId(admin.getAdminId());
				adminVO.setFirstName(admin.getFirstName());
				adminVO.setLastName(adminVO.getLastName());
				adminVO.setEmailId(adminVO.getEmailId());
				adminVO.setPassword(adminVO.getPassword());
				adminVO.setMobileNumber(adminVO.getMobileNumber());
				adminVO.setStatus(adminVO.getStatus());
				adminVO.setCreatedOn(adminVO.getCreatedOn());
				adminVO.setUpdatedOn(adminVO.getUpdatedOn());
				
				
				return adminVO;
			} else {
				return null;
			}
		} catch (Exception e) {
			throw new AdminDataCustomException(e.getMessage());
		}

		
		
	}

}
