package fr.univrouen.cv21server.controllers;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Optional;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.JacksonXmlModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import fr.univrouen.cv21server.model.CV;
import fr.univrouen.cv21server.model.ResumeCV;
import fr.univrouen.cv21server.repositories.CVRepository;
import fr.univrouen.cv21server.exceptions.CVExistingException;
import fr.univrouen.cv21server.exceptions.CVNotFoundException;

@RestController
public class CVController {
	
	@Autowired
	private CVRepository cvRepository;

	/**
	 *  GET Requests
	 */
	
	@GetMapping("/")
	public ModelAndView index() {
		 ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("index");
		 return modelAndView;
	}
	
	@GetMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		 modelAndView.setViewName("help");
		 return modelAndView;
	}
	
	
	@RequestMapping(value = "/resume", method = RequestMethod.GET, produces="application/xml")
	@ResponseBody
	public List<ResumeCV> getResumeCV() throws JsonProcessingException {
		List<CV> cvList = cvRepository.findAll();
		List<ResumeCV> cvResumeList = new ArrayList<ResumeCV>();
		for (CV cv : cvList) {
			ResumeCV resumeCV = new ResumeCV(cv.getId(), cv.getIdentite(), cv.getObjectif());
			cvResumeList.add(resumeCV);
		}
		return cvResumeList;
	}
	
	
	@GetMapping(value = "/cv/{id}", produces="application/xml")
	public String getCV(@PathVariable long id) throws JsonProcessingException {
		Optional<CV> cv = cvRepository.findById(id);
		JSONObject obj = new JSONObject();
		if (cv.isPresent()) {
			CV returnCV = cv.get();
			obj.append("cv21", new JSONObject(returnCV));
			
		} else {
			JSONObject errorObj = new JSONObject();
			errorObj.append("id", id);
			errorObj.append("status", "ERROR");
			obj.append("error", errorObj);
		}
		String xml_data = XML.toString(obj);
		return xml_data;
	}
	
	/**
	 *  POST Requests
	 */
	
	@PostMapping("/insert")
	public CV insertCV(@RequestBody CV cv) {
		if (cvRepository.findById(cv.getId()).isPresent()) {
		throw new CVExistingException("Un CV avec cet id existe déjà.");
		}
		CV insertedCV = cvRepository.insert(cv);
		return insertedCV;
	}
	
	/**
	 *  PUT Requests
	 */
	
	@PutMapping("/update/{id}")
	public String insertCV(@PathVariable long id, @RequestBody CV newCV) {
		Optional<CV> cv = cvRepository.findById(id);
		JSONObject obj = new JSONObject();
		if (cv.isPresent()) {
			CV updatedCV = cvRepository.save(newCV);
			obj.append("id", Long.toString(id));
			obj.append("status", "UPDATED");
		} else {
			obj.append("status","ERROR");
		}
		String xml_data = XML.toString(obj);
		return xml_data;
	}

	/**
	 *  DELETE Requests
	 */
	
	@DeleteMapping("/delete/{id}")
	public String deleteCV(@PathVariable long id) {
		Optional<CV> cv = cvRepository.findById(id);
		JSONObject obj = new JSONObject();
		if (cv.isPresent()) {
			CV cvDelete = cv.get();
			cvRepository.delete(cvDelete);
			obj.append("id", Long.toString(id));
			obj.append("status", "DELETED");
		} else {
			obj.append("status","ERROR");
		}
		String xml_data = XML.toString(obj);
		return xml_data;
	}
	

	
}