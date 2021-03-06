package com.blastfurnace.otr.episode.adapter;

import java.util.List;
import java.util.Map;

import com.blastfurnace.otr.api.response.GenericResponse;
import com.blastfurnace.otr.data.episode.service.model.EpisodeDataWrapper;
import com.blastfurnace.otr.service.request.QueryData;

public interface EpisodeDataAdapter {

	GenericResponse<EpisodeDataWrapper> get(Long id);
	
	GenericResponse<List<EpisodeDataWrapper>> getSeriesEpisodes(Long seriesId);

	GenericResponse<List<Map<String, Object>>> query(QueryData qry);

	GenericResponse<Long> getResultsCount(QueryData qry);

	GenericResponse<String> delete(Long id);

	GenericResponse<EpisodeDataWrapper> save(EpisodeDataWrapper episode);

}