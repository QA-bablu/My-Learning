package objectorientedconcepts;

// Bouquet class
class Bouquet {
	Flower[] flowers;

	Bouquet(Flower[] flowers) {
		this.flowers = flowers;
	}

	int calculateCost() {
		int totalCost = 0;
		for (Flower flower : flowers) {
			totalCost += flower.cost;
		}
		return totalCost;
	}
}
