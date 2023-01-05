package com.xworkz.collectionsapp.equalsMethodDTO;

public class PlaceDTO {
	private String name;
	private String state;
	private String famous;
	public PlaceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlaceDTO(String name, String state, String famous) {
		super();
		this.name = name;
		this.state = state;
		this.famous = famous;
	}
	@Override
	public String toString() {
		return "PlaceDTO [name=" + name + ", state=" + state + ", famous=" + famous + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFamous() {
		return famous;
	}
	public void setFamous(String famous) {
		this.famous = famous;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean rtn=false;
		if(obj!=null)
		{
			if(obj instanceof PlaceDTO)
			{
				PlaceDTO dto=(PlaceDTO)obj;
				if(dto.name.equals(this.name))
				{
					System.out.println("Name Matched: "+dto.name);
					rtn=true;
				}
				if(dto.state.equals(this.state))
				{
					System.out.println("Place  Matched: "+dto.state);
					rtn=true;
					
				}
				if(dto.famous.equals(this.famous))
				{
					System.out.println("famouse for : "+dto.famous);
					rtn=true;
					
				}
				
			}
			
			
		}
		return rtn;
	}
	
	}
