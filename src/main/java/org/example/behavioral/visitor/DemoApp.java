package org.example.behavioral.visitor;

public class DemoApp {

	public static void main(String[] args) {
		var industrialBuilding = new IndustrialBuilding();
		var park = new Park();
		var privateBuilding = new PrivateBuilding();
		var shoppingCenter = new ShoppingCenter();
		
		ExportVisitor visitor = new XMLExportVisitor();
		visitor.export(industrialBuilding,
					park,
					privateBuilding,
					shoppingCenter);
		
		System.out.println("=======================================");
		
		visitor = new JSONExportVisitor();
		visitor.export(industrialBuilding,
				park,
				privateBuilding,
				shoppingCenter);
		
		
		
	}
	
}
