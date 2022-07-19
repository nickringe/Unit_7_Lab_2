package grandcircus.co.hotelApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String displayHome(Model model) {
		List<Hotel> aList = repo.findAll();
		
		//printing out each item in aList (via hotel name) to the console to verify that the data is 
		//getting recognized from the DB
		aList.forEach(h -> { System.out.println(h.getName());});
		
		model.addAttribute("nothingspecific", aList);
		return "home";
	}
	
	@PostMapping("/search")
	public String displayResults(Model model, @RequestParam String city) {
		
		List<Hotel> hotelList = new ArrayList<>();
		
		if (city.equals("Jackson")) {
			hotelList = repo.findByCity(city);
			model.addAttribute("displayCity", city);
		} else if (city.equals("Ann Arbor")) {
			hotelList = repo.findByCity(city);
			model.addAttribute("displayCity", city);
			
		} else if (city.equals("Detroit")) {
			hotelList = repo.findByCity(city);
			model.addAttribute("displayCity", city);
			
		} else if (city.equals("Allentown")) {
			hotelList = repo.findByCity(city);
			model.addAttribute("displayCity", city);
			
		} else {
			return "/";
		}
		
		hotelList.forEach(h -> { System.out.println(h.getCity());});
		
		model.addAttribute("hotelList", hotelList);
		return "display-results";
	}
	
//	@RequestMapping("/display-results")
//	public String showResults(Model model) {
//		return "";
//	}
	

	


}
