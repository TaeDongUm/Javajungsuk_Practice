// main 메서드가 있는 클래스의 이름이 소스파일과 이름이 같아야 한다.
// 에러는 나지 않지만 실행이 안될 것(이클립스가 main메서드가 어디 있는지 알아야 실행을 하기 때문)
class Ex6_1 { 
	public static void main(String args[]) { 
		Tv t;                 // Tv인스턴스를 참조하기 위한 변수 t를 선언       
		t = new Tv();         // Tv인스턴스를 생성한다. 
		t.channel = 7;        // Tv인스턴스의 멤버변수 channel의 값을 7로 한다. 
		t.channelDown();      // Tv인스턴스의 메서드 channelDown()을 호출한다. 
		System.out.println("현재 채널은 " + t.channel + " 입니다."); 
	} 
}

class Tv { 
	// Tv의 속성(멤버변수)   
	String color;           // 색상 
	boolean power;         	// 전원상태(on/off) 
	int channel;           	// 채널 

	// Tv의 기능(메서드) 
	void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드  
	void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드 
	void channelDown() { --channel; }   // TV의 채널을 낮추는 기능을 하는 메서드  
}