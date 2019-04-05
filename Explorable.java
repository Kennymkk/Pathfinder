public interface Explorable {

	public Elements GetStart();
	public Elements GetNextStep(Elements origin);
	public Elements GetGoal();
	public void MarkElement(Elements el);

}
