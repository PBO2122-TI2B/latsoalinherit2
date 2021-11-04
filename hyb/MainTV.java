class MainTV{
	public static void main(String args[]){
	TvPlasma tp = new TvPlasma();
	TVLEDDirect tld = new TVLEDDirect();
	TVLED tl = new TVLED();
	
	tp.statusOn();
	tp.tambahKecerahan();
	tp.gantiChanel();
	tp.kurangiKecerahan();
	tp.statusOff();
	
	tl.statusOn();
	tl.gantiResolusi();
	tl.gantiChanel();
	tl.gantiResolusi();
	tl.gantiResolusi();
	
	tld.gantiResolusi();
	tld.pengaturanColor();
	tld.pengaturanContras();
   }
}