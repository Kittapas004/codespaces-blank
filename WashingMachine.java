// Enumeration for the different types of wash cycles
enum WashCycle {
    NORMAL, DELICATE, HEAVY_DUTY
}

// Class for the washing machine
class WashingMachine {
    private int money;  // Amount of money inserted into the machine
    private boolean running;  // Flag to indicate whether the machine is running or not
    private WashCycle washCycle;  // The selected wash cycle
    private int waterTemperature;  // The selected water temperature

    public WashingMachine() {
        money = 0;
        running = false;
        washCycle = WashCycle.NORMAL;
        waterTemperature = 0;
    }

    // Method to insert coins into the machine
    public void insertCoins(int amount) {
        money += amount;
    }

    // Method to select the wash cycle
    public void selectWashCycle(WashCycle washCycle) {
        this.washCycle = washCycle;
    }

    // Method to select the water temperature
    public void selectWaterTemperature(int waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    // Method to start the washing cycle
    public void start() {
        // Check if enough money has been inserted
        if (money < 50) {
            System.out.println("Please insert at least 50 cents to start the washing cycle.");
            return;
        }

        running = true;
        System.out.println("Starting the washing cycle with " + money + " cents.");
        money -= 50;
        System.out.println("Selected wash cycle: " + washCycle + ".");
        System.out.println("Selected water temperature: " + waterTemperature + ".");
        System.out.println("Washing...");
        try {
            Thread.sleep(5000);  // Simulate the washing cycle taking 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Washing cycle complete.");
        System.out.println("Dispensing change: " + money + " cents.");
        money = 0;
        running = false;
    }

    // Method to cancel the washing cycle and refund the money
    public void cancel() {
        if (running) {
            System.out.println("Canceling the washing cycle...");
            System.out.println("Refunding " + money + " cents.");
            money = 0;
            running = false;
        } else {
            System.out.println("No washing cycle is currently running.");
        }
    }

	public int getMoney() {
		// TODO Auto-generated method stub
		return money;
	}
}