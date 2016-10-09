package check;
import java.util.ArrayList;


public class Issue {
	private String id;
	private String owner;
	private String status;
	private String reviewer;
	private String researchStatus;
//	private IssueModule[] modules;
	private IssueFunction[] functions;
	private ArrayList<IssueModule> arrModules;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public Issue(){
		arrModules = new ArrayList<IssueModule>();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getReviewer() {
		return reviewer;
	}

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	public String getResearchStatus() {
		return researchStatus;
	}

	public void setResearchStatus(String researchStatus) {
		this.researchStatus = researchStatus;
	}

	public IssueModule[] getModules() {
		IssueModule[] modules = new IssueModule[arrModules.size()];
		arrModules.toArray(modules);
		return modules;
	}

	public void setModules(IssueModule[] modules) {
		for(IssueModule module:modules){
			arrModules.add(module);
		}
	}

	public IssueFunction[] getFunctions() {
		return functions;
	}

	public void setFunctions(IssueFunction[] functions) {
		this.functions = functions;
	}
	
	public void addIssueModule(IssueModule module){
		if(arrModules == null){
			arrModules = new ArrayList<IssueModule>();
		}
		arrModules.add(module);
	}

}