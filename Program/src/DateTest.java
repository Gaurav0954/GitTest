class Date{
	int month;
	int day;
	int year;

	Date(){
		month=2;
		day=20;
		year=19;
	}
	Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
}
class DateTest{
	public static void main(String[] args){
		//Date d=new Date();
		Date d=new Date(2,4,19);
		System.out.println(d.day+"/"+d.month+"/"+d.year);
	}
}