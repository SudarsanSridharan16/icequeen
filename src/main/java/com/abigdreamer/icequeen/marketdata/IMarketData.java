﻿package com.abigdreamer.icequeen.marketdata;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface IMarketData {
	
	Map<String, Map<LocalDateTime, Bar>> getBars();

	List<LocalDateTime> getTimeLine();

	List<String> getSymbols();
}
