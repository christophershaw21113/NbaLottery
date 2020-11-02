package lottery;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LotteryPicks {

private static Random random = new Random();

	public static void main(String[] args) {
		
		Random lottery = new Random();
		int x = lottery.nextInt(14) +1;
		
	List<String> team = new ArrayList<>();
		
		team.add("Atlanta Hawks");
		team.add("Charlotte Hornets");
		team.add("Chicago Bulls");
		team.add("Cleveland Cavaliers");
		team.add("Detroit Pistons");
		team.add("Golden State Warriors");
		team.add("Memphis Grizzlies");
		team.add("Minnesota Timberwolves");
		team.add("New Orleans Pelicans");
		team.add("New York Knicks");
		team.add("Phoenix Suns");
		team.add("Sacramento Kings");
		team.add("San Antonio Spurs");
		team.add("Washington Wizards");
		
		
		for(int i = 0; i < 1; i++) {
			getRandomTeam(team);
			
		int index = random.nextInt(team.size());
			
		System.out.println("2020 NBA Draft Lottery: Pick #"+ x +" in this year's NBA draft goes to the "+ team.get(index));

	}
}

	private static Object getRandomTeam(List<String> team) {
		return null;
		

	}
}
