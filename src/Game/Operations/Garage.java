package Game.Operations;

import Game.OperationData;

public class Garage extends Operation {
	
	public Garage() {
		super("Box");
		setPrice(OperationData.Garage.getPrice());
		setCapacity(OperationData.Garage.getSpace());
		setCellCost(OperationData.Garage.getCellCost());
		setMoneyCost(OperationData.Garage.getMoneyCost());
	}
}
