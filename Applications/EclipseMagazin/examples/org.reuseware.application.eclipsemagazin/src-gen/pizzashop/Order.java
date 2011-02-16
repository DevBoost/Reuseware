package pizzashop;

public class Order {

	private String customer;

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCustomer() {
		return customer;
	}

	private boolean active;

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return active;
	}

	private boolean processed;

	public void setProcessed(boolean processed) {
		this.processed = processed;
	}

	public boolean getProcessed() {
		return processed;
	}

	private int timeToDeliver;

	public void setTimeToDeliver(int timeToDeliver) {
		this.timeToDeliver = timeToDeliver;
	}

	public int getTimeToDeliver() {
		return timeToDeliver;
	}

	private Pizza pizzas;

	public void setPizzas(Pizza pizzas) {
		this.pizzas = pizzas;
	}

	public Pizza getPizzas() {
		return pizzas;
	}

}
