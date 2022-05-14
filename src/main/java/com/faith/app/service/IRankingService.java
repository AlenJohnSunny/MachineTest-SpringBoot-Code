package com.faith.app.service;

import java.util.List;
import java.util.Optional;

import com.faith.app.dto.RankStudentDto;
import com.faith.app.entity.Ranking;

public interface IRankingService {
	
	//List
	public List<Ranking> getRanking();
			
	//Insert
	public void saveRanking(Ranking ranking);
			
	//update by id
	public Optional <Ranking> getRanking(int id);
	
	//Delete
	public void deleteRanking(int id);
	
	//Find By Ranking
	public List<Ranking> getRankingByCourseName(String name);
		
	//Get all Rank using viewModel -- inner join
	public List<RankStudentDto> findAllDTORankings();

}
