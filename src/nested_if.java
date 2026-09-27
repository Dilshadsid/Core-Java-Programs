
public class nested_if {

	public static void main(String[] args) {
		String team = "Mumbai indens";
		if (team.endsWith("inden")) {
			if (team.contains("kolkhatta knightrider")) {
				System.out.println("team is kkr");
			} else {
				System.out.println(team);
			}
		} else {
			System.out.println(team);
		}
	}

}
