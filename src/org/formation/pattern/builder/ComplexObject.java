package org.formation.pattern.builder;

public class ComplexObject {

	private String name;
	private String codeName;
	private boolean isAuto;
	private boolean isBig;
	private int number;
	
	public String getName() {
		return name;
	}
	public String getCodeName() {
		return codeName;
	}
	public boolean isAuto() {
		return isAuto;
	}
	public boolean isBig() {
		return isBig;
	}
	public int getNumber() {
		return number;
	}
	
	/**
	 * Constructor is private
	 * @param complexObjectBuilder
	 */
	private ComplexObject(ComplexObjectBuilder complexObjectBuilder){
		this.name = complexObjectBuilder.name;
		this.codeName = complexObjectBuilder.codeName;
		this.isAuto = complexObjectBuilder.isAuto;
		this.isBig = complexObjectBuilder.isBig;
		this.number = complexObjectBuilder.number;
	}
	
	@Override
	public String toString() {
		return "name " + this.name + "\ncodename " + this.codeName + "\nauto " + this.isAuto + "\nbig " + this.isBig + "\nnumber " + this.number;
	}
	
	public static class ComplexObjectBuilder {
		private String name;
		private String codeName;
		private boolean isAuto;
		private boolean isBig;
		private int number;
		
		public ComplexObjectBuilder(String name, String codeName){
			this.name = name;
			this.codeName = codeName;
		}
		
		public ComplexObjectBuilder setName(String name) {
			this.name = name;
			return this;
		}
		public ComplexObjectBuilder setCodeName(String codeName) {
			this.codeName = codeName;
			return this;
		}
		public ComplexObjectBuilder setAuto(boolean isAuto) {
			this.isAuto = isAuto;
			return this;
		}
		public ComplexObjectBuilder setBig(boolean isBig) {
			this.isBig = isBig;
			return this;
		}
		public ComplexObjectBuilder setNumber(int number) {
			this.number = number;
			return this;
		}
		
		public ComplexObject build(){
			return new ComplexObject(this);
		}

	}
	
}
	
