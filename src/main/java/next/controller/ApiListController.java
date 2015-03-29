package next.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import next.dao.QuestionDao;
import next.dao.JdbcQuestionDao;
import core.mvc.AbstractController;
import core.mvc.ModelAndView;

public class ApiListController extends AbstractController {
	private QuestionDao questionDao = JdbcQuestionDao.getInstance();

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mav = jsonView();
		mav.addObject("questions", questionDao.findAll());
		return mav;
	}
}
