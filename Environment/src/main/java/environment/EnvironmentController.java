package environment;


import java.util.ArrayList;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import model.Element;
import model.Project;


/** handles environmental criterias concerning the project  {@link Project}s.<br>
 * @author Richard Lorenz
 *
 */
@Controller 
public class EnvironmentController{
	private final EnvironmentAnalyzer ea = new EnvironmentAnalyzer();
	
	@GetMapping("/environment-test")
	public ArrayList<Element> analyzeEnvironment(		Model model,HttpSession session, ArrayList<Element> elements){		
			
			Project project = (Project) session.getAttribute("project");
			if (project != null) {
				ea.getAnalysis(elements, project);
			}
	return elements;
	}
	
	/*TODO:
	 * Postmapping umbauen für Weiterleitung oder Antwort auf Auftrag vom MainController?*/
	@PostMapping("/welcome")
	public Model addUser(@ModelAttribute("form")Model model) {

	return model;
	}
	
}
