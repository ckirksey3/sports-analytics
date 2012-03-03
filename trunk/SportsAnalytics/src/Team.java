import javax.swing.Icon;


public class Team {
	
	private String name;		// team name
	private Icon pic;		 	// the team logo
	private double overallScore;// the score that they are ranked by
	private int seed;		  	// seed in the tournament
	private int rebounds;		// rebounds per game
	
	public Team(String name, Icon pic, int seed, int rebs){
		this.name = name;
		this.pic = pic;
		this.seed = seed;
		this.rebounds = rebs;
	}
	
	/**
	 * ranks the teams
	 * @param teams
	 */
	public static void rankTeams(Team[] teams){
		for (int i=0; i < teams.length; i++){
			//teams[i].setOverallScore(.5*(Global.maxSeed - teams[i].getSeed()) + .5*teams[i].getRebounds());
			teams[i].setOverallScore(Global.maxSeed - teams[i].getSeed());
		}
	}
	
	
	public String toString(){
		return (this.name + " \tS:" +seed + " R:" + rebounds);
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Icon getPic() {
		return pic;
	}
	
	public void setPic(Icon pic) {
		this.pic = pic;
	}
	
	public int getSeed() {
		return seed;
	}
	
	public void setSeed(int seed) {
		this.seed = seed;
	}

	public int getRebounds() {
		return rebounds;
	}

	public void setRebounds(int rebounds) {
		this.rebounds = rebounds;
	}

	public double getOverallScore() {
		return overallScore;
	}

	public void setOverallScore(double d) {
		this.overallScore = d;
	}

}
