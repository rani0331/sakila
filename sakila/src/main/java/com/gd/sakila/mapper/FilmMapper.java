package com.gd.sakila.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.gd.sakila.vo.Film;

@Mapper
public interface FilmMapper {
	int insertFilmCategory(Map<String, Object> map);
	
	int insertFilm(Film film);
	
	List<Integer> selectStoreForCount();
	List<Integer> selectFilmInStock(int FID, int storeId, int count);

	int selectStaffListForCount(Map<String, Object> map);

	List<Map<String, Object>> selectFilmList(Map<String, Object> map);
	
	Map<String, Object> selectFilmOne(int FID); //4

	List<Map<String, Object>> selectFilmActorListByFilm(int filmId); //6
	int deleteFilmActor(int filmId);
	int insertFilmActor(Map<String, Object> parmMap);
}