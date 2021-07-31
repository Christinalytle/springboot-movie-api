package com.christinalytle.movieDatabaseApi.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christinalytle.movieDatabaseApi.entity.Auditorium;
import com.christinalytle.movieDatabaseApi.repository.AuditoriumRepo;

@Service
public class AuditoriumService {
	 private static final Logger Logger = LogManager.getLogger(AuditoriumService.class); 
	 
	 @Autowired
	 private AuditoriumRepo repo; 
	 
	 //Get all auditoriums
	 public Iterable<Auditorium> getAuditoriums() {
		 return repo.findAll(); 
	 }
	 
	 //Post
	 public Auditorium createAuditorium (Auditorium auditorium) {
		 return repo.save(auditorium); 
	 }
	 
	 //Update
	 public Auditorium updateAuditorium (Auditorium auditorium, Long id) throws Exception {
		 try {
			 Auditorium oldAuditorium = repo.findById(id).orElseThrow(); 
			 oldAuditorium.setAuditoriumNumber(auditorium.getAuditoriumNumber());
			 return repo.save(oldAuditorium); 
		 } catch (Exception e) {
			 Logger.error("Error occured while trying to update auditorium " + id, e); 
			 throw new Exception ("Unable to update auditorium"); 
		 }
	 }
	 
	 //Delete
	 public void deleteAuditorium(Long id) throws Exception {
		 try {
			 repo.deleteById(id);
		 } catch (Exception e) {
			 Logger.error("Error occured while trying to delete auditorium " + id, e); 
			 throw new Exception ("Unable to delete auditorium");
		 }
	 }
	 
	 

}
