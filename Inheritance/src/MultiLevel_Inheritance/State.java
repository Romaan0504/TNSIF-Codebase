package MultiLevel_Inheritance;

public class State extends Country {
	
	//data members
		private String stateName;
		private String language;
		
		//getter and setter 
		public String getStateName() {
			return stateName;
		}
		public void setStateName(String stateName) {
			this.stateName = stateName;
		}
		public String getLanguage() {
			return language;
		}
		public void setLangyage(String language) {
			this.language = language;
		}
		@Override
		public String toString() {
			return "State [stateName=" + stateName + ", language=" + language + ", getCountryname()=" + getCountryname()
					+ ", getCapital()=" + getCapital() + "]";
		}

}
