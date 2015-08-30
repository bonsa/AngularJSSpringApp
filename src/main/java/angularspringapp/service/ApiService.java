package angularspringapp.service;

import angularspringapp.model.DayResponse;

public interface ApiService {

	DayResponse getFactAboutDay(String day, String month);
}
