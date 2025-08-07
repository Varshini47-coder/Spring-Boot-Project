package com.example.RpDatabase.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.RpDatabase.Entity.Empdata;
import com.example.RpDatabase.Service.serviceex;

//import jakarta.persistence.Column;

@RequestMapping("/welcome")
@RestController("/rpcollege")
public class ControllerRp {
	@Autowired
	serviceex sr;
	
	@PostMapping("/posts")
	public Empdata method1(@RequestBody Empdata ed) {
		return sr.methodService1(ed);
		}
	@GetMapping("/gets")
	public List<Empdata>method2(){
		return sr.method2();	
	}
	@GetMapping("/get/{sno}")
	public Optional<Empdata> getDataById(@PathVariable("sno")int id){
		return sr.method3(id);
	}
	@PutMapping ("/updates/{data}")
	public Empdata method4(@RequestBody Empdata edd,@PathVariable(value="data")int sno) {
		return sr.method4(edd, sno);
	}
	@DeleteMapping("/delete/{del}")
	public String method5(@PathVariable(value="del")int id) {
		return sr.method5(id);
	}
}
