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
		aList.forEach(h -> { System.out.println(h.getCity());});
		
		model.addAttribute("nothingspecific", aList);
		return "home";
	}
	
	@PostMapping("/search")
	public String displayResults(Model model, @RequestParam String city) {
		
		List<Hotel> hotelList = new ArrayList<>();
		
		if (city.equals("Jackson")) {
			hotelList = repo.findByCity(city, Sort.by("pricePerNight"));
			model.addAttribute("displayCity", city);
		} else if (city.equals("Ann Arbor")) {
			hotelList = repo.findByCity(city, Sort.by("pricePerNight"));
			model.addAttribute("displayCity", city);
			
		} else if (city.equals("Detroit")) {
			hotelList = repo.findByCity(city, Sort.by("pricePerNight"));
			model.addAttribute("displayCity", city);
			
		} else if (city.equals("Allentown")) {
			hotelList = repo.findByCity(city, Sort.by("pricePerNight"));
			model.addAttribute("displayCity", city);
			
		} else {
			return "display-results";
		}
		
		hotelList.forEach(h -> { System.out.println(h.getCity());});
		
		model.addAttribute("hotelList", hotelList);
		return "display-results";
	}
	
	
	@PostMapping("/max")
	public String showMax(Model model, @RequestParam int maxPrice) {
		List<Hotel> maxList = new ArrayList<>();
		maxList = repo.findByPricePerNightLessThanEqual(maxPrice, Sort.by("pricePerNight"));
		
		//maxList.forEach(h -> { System.out.println(h.getName());});
		model.addAttribute("maxList", maxList);
		model.addAttribute("displayMax", maxPrice);
		return "display-max";
	}
	
	@RequestMapping("/add")
	public String addToRepo(Model model, 
							@RequestParam String id,
							@RequestParam String name,
							@RequestParam String city, 
							@RequestParam int pricePerNight) {
		
		Hotel hotel = new Hotel();
		
		if(id.equals(null) || id.equals("")) {
			hotel = new Hotel(name, city, pricePerNight);
		} else {
			hotel = new Hotel(id, name, city, pricePerNight);
		}
		
		String newId = id;
		String newName = name;
		String newCity = city;
		int newPrice = pricePerNight;
		
		model.addAttribute("newId", newId);
		model.addAttribute("newName", newName);
		model.addAttribute("newCity", newCity);
		model.addAttribute("newPrice", newPrice);
		
		repo.save(hotel);
		
		
		return "add";
	}
	

	


}
