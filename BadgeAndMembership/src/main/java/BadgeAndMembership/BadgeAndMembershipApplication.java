package BadgeAndMembership;

import BadgeAndMembership.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BadgeAndMembershipApplication implements CommandLineRunner {

	@Autowired
	private MemberService memberService;

	public static void main(String[] args) {
		SpringApplication.run(BadgeAndMembershipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		memberService.add("Harry", "Potter", "hpotter@miu.edu");
		memberService.add("Bipul", "Ranjitkar", "branjitkar@miu.edu");
		memberService.findAll().forEach(System.out::println);
	}
}
