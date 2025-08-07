package com.example.RpDatabase.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RpDatabase.Entity.Empdata;
import com.example.RpDatabase.Repository.jpaRepos;
@Service
public class serviceex {
	
	@Autowired
	jpaRepos rp;
	
	public Empdata methodService1(Empdata ed) {
		return this.rp.save(ed);
	}
	public List<Empdata>method2(){
		return rp.findAll();
		
	}
	public Optional<Empdata>method3(int sno){
		return rp.findById(sno);		
	}
	public Empdata method4(Empdata newdata,int id) {
		Empdata OldData=rp.findById(id).orElseThrow(()-> new NullPointerException("Id not found"));
		OldData.setName(newdata.getName());
		OldData.setRole(newdata.getRole());
		OldData.setLocation(newdata.getLocation());
		return rp.save(OldData);		
	}
	public String method5(int id) {
		if(rp.existsById(id)) {
			rp.deleteById(id);
			return "Deleted Succesfully";
		}
		else {
			return "Id is not Found";
		}
	}
}
