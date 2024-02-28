package test;

public class BuildingTest {

	public static void main(String[] args) {
		 Building build = new Building();
		 build.setBuilding(5, 5000);
		 build.show(); 
	
		 House house = new House();
		 house.setHouse(6,6000,120,60);
		 house.show();
		 
		 OfficeBuilding office = new OfficeBuilding();
		 office.setOffice(10, 15000, 50, 200);
		 office.show();

	}

}
//楼房类：描述一座楼房的层数、总平方米数
class Building {
	int layers;   //层数
	int area;    //面积（平方米数）
	
	//设置楼房信息
	public void setBuilding(int layers, int area) {
		this.layers = layers;
        this.area = area;	
	}
	//显示楼房信息
	public void show() {
		System.out.printf("层数:%d,总面积:%d",layers,area);
	}
}
//住宅除了具有楼房的属性(层数、总面积)外，还有卧室数、浴室数
class House extends Building{
	int bedRooms;
	int bathRooms;
	
	public void setHouse(int layers, int area, int bedRooms,int bathRooms) {
		super.layers = layers;
		super.area = area;
		this.bedRooms = bedRooms;
		this.bathRooms = bathRooms;
	}
	@Override
	public void show() {
		System.out.print("\n住宅:");
		super.show();
		System.out.print("卧室数:" + bedRooms + ",浴室数:"+ bathRooms);
	}
}

//写字楼除了具有楼房的属性（层数、面积）外，还有房间数和灭火器的数量
class OfficeBuilding extends Building {
	int  rooms;         //房间数
	int extinguishers;  //灭火器数量
	
	public void setOffice(int layers, int area, int rooms,int extinguishers) {
		super.layers = layers;
		super.area = area;
		this.rooms = rooms;
		this.extinguishers = extinguishers;
	}
	@Override
	public void show() {
		System.out.print("\n写字楼:");
		super.show();
		System.out.println("房间数:" + rooms + ",灭火器数:" + extinguishers);
	}
}
