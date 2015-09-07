package angularspringapp.service;

import angularspringapp.model.DayResponse;
import angularspringapp.model.MathResponse;

public interface ApiService {

	DayResponse getFactAboutDay(String day, String month);
	
	MathResponse getMathPropertyAboutNumber(String number);
}
