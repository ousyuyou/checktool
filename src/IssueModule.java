/**
 * changed modules
 * @author 
 *
 */
public class IssueModule {
	private String issueID;
	private String moduleID;
	/**
	 * the mapping key,when blank set moduleid
	 */
	private String modulePath;
	/**
	 * fms-core,fms-if,surittokei
	 */
	private String projectID;
	private String functionName;
	
	public IssueModule(){
		
	}
	public String getIssueID() {
		return issueID;
	}
	public void setIssueID(String issueID) {
		this.issueID = issueID;
	}
	public String getModuleID() {
		return moduleID;
	}
	public void setModuleID(String moduleID) {
		this.moduleID = moduleID;
	}
	public String getModulePath() {
		return modulePath;
	}
	public void setModulePath(String modulePath) {
		this.modulePath = modulePath;
	}
	public String getProjectID() {
		return projectID;
	}
	public void setProjectID(String projectID) {
		this.projectID = projectID;
	}
	public String getFunctionName() {
		return functionName;
	}
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}
}
