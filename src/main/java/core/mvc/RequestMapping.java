package core.mvc;

import java.util.HashMap;
import java.util.Map;

import next.controller.AddAnswerController;
import next.controller.ApiDeleteController;
import next.controller.ApiListController;
import next.controller.DeleteController;
import next.controller.ListController;
import next.controller.SaveController;
import next.controller.ShowController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RequestMapping {
	private static final Logger logger = LoggerFactory.getLogger(RequestMapping.class);
	
	private Map<String, Controller> mappings = new HashMap<String, Controller>();
	
	public void initMapping() {
		mappings.put("/list.next", new ListController());
		mappings.put("/show.next", new ShowController());
		mappings.put("/save.next", new SaveController());
		mappings.put("/form.next", new ForwardController("form.jsp"));
		mappings.put("/save.next", new SaveController());
		mappings.put("/delete.next", new DeleteController());
		mappings.put("/api/addanswer.next", new AddAnswerController());
		mappings.put("/api/delete.next", new ApiDeleteController());
		mappings.put("/api/list.next", new ApiListController());
		
		logger.info("Initialized Mapping Completed!");
	}

	public Controller findController(String url) {
		return mappings.get(url);
	}

	void put(String url, Controller controller) {
		mappings.put(url, controller);
	}

}
