package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDao;
import com.javaex.vo.PersonVo;

@Service
public class PhonebookService {
	
	@Autowired
	private PhonebookDao phonebookDao;
	
	//리스트
	public List<PersonVo> exelist() {
		System.out.println("phonebookService.exelist()");
		
		List<PersonVo> pList=phonebookDao.personSelect();
		
		return pList;
	}
	
	//삭제
	public int exeDelete(int no) {
		System.out.println("phonebookService.exeDelete()");
		
		int count=phonebookDao.personDelete(no);
		
		return count;
	}
	
	//수정폼
	public PersonVo exeModifyForm(int no) {
		System.out.println("phonebookService.exeModifyForm()");
		
		PersonVo personVo=phonebookDao.personSelectOne(no);
		
		return personVo;
	}
	
	//수정
	public int exeModify(PersonVo personVo) {
		System.out.println("phonebookService.exeModify()");
		
		int count=phonebookDao.personUpdate(personVo);
		
		return count;
	}
	
	//등록
	public int exeWrite(PersonVo personVo) {
		System.out.println("phonebookService.exeWrite()");
		
		int count=phonebookDao.personInsert(personVo);
		
		return count;
	}

}
